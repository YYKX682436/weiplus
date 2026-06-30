package com.tencent.mm.magicbrush.plugin.scl.jsapi.touch;

/* loaded from: classes.dex */
public final class e implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.f f68673d;

    public e(com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.f fVar) {
        this.f68673d = fVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCCallback mBJsApiSetGestureRects$IPCCallback = (com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.MBJsApiSetGestureRects$IPCCallback) obj;
        long j17 = mBJsApiSetGestureRects$IPCCallback.f68667d;
        com.tencent.mm.magicbrush.plugin.scl.jsapi.touch.f fVar = this.f68673d;
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiSetGestureRects", "ipc ret ok");
            fVar.s().invoke(fVar.k());
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ipc ret: errCode ");
        long j18 = mBJsApiSetGestureRects$IPCCallback.f68667d;
        sb6.append(j18);
        sb6.append(", errMsg ");
        java.lang.String str = mBJsApiSetGestureRects$IPCCallback.f68668e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiSetGestureRects", sb6.toString());
        fVar.s().invoke(fVar.h((int) j18, str));
    }
}
