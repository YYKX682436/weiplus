package com.tencent.mars.app;

/* loaded from: classes12.dex */
public class Context {
    protected static final java.lang.String TAG = "MicroMsg.MMContext";
    protected long nativeHandle = 0;
    protected com.tencent.mars.app.BridgeMap interfaceMap = new com.tencent.mars.app.BridgeMap();

    public Context(java.lang.String str) {
        OnJniCreateContext(str);
    }

    public native void OnJniAddManager(java.lang.String str, java.lang.Object obj);

    public native void OnJniCreateContext(java.lang.String str);

    public native void OnJniCreateContextFromHandle(long j17);

    public native void OnJniDestroyContext();

    public native java.lang.String OnJniGetContextId();

    public native long OnJniGetManager(java.lang.String str);

    public native int OnJniInit();

    public native void OnJniRemoveManager(java.lang.String str, java.lang.Object obj);

    public native int OnJniUnInit();

    public <T> void addManager(java.lang.Class<T> cls, com.tencent.mars.app.BaseManager baseManager) {
        if (baseManager == null) {
            com.tencent.mars.xlog.Log.e(TAG, "mars2 addManager fail. empty manager. clazz:%s", cls.getName());
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "mars2 addManager clazz:%s", cls.getName());
        OnJniAddManager(cls.getName(), baseManager);
        this.interfaceMap.put(baseManager.getNativeHandle(), baseManager);
    }

    public java.lang.String getContextId() {
        return OnJniGetContextId();
    }

    public <T extends com.tencent.mars.app.BaseManager> T getManager(java.lang.Class<T> cls) {
        cls.getName();
        java.lang.Object transfer = this.interfaceMap.transfer(OnJniGetManager(cls.getName()), cls.getName());
        if (transfer != null) {
            return (T) transfer;
        }
        return null;
    }

    public long getNativeHandle() {
        return this.nativeHandle;
    }

    public int init() {
        return OnJniInit();
    }

    public void onDestroy() {
        OnJniDestroyContext();
        this.nativeHandle = -1L;
    }

    public <T> void removeManager(java.lang.Class<T> cls, com.tencent.mars.app.BaseManager baseManager) {
        if (baseManager == null) {
            com.tencent.mars.xlog.Log.e(TAG, "mars2 removeManager fail. empty manager. clazz:%s", cls.getName());
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "mars2 removeManager clazz:%s", cls.getName());
        OnJniRemoveManager(cls.getName(), baseManager);
        this.interfaceMap.delete(baseManager);
    }

    public int unInit() {
        return OnJniUnInit();
    }

    public Context(long j17) {
        OnJniCreateContextFromHandle(j17);
    }
}
