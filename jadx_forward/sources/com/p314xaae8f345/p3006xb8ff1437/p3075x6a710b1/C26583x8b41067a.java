package com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1;

/* renamed from: com.tencent.thumbplayer.utils.TPThreadSwitch */
/* loaded from: classes13.dex */
public class C26583x8b41067a {

    /* renamed from: API_CALL_TIME_OUT_MS */
    private static final int f55381xecdcb14d = 500;

    /* renamed from: ENV_DEBUG */
    private static final boolean f55382x8608041 = false;

    /* renamed from: mClass */
    private java.lang.Class<?> f55383xbde2f50b;

    /* renamed from: mEventHandler */
    private com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26583x8b41067a.EventHandler f55384xf703545d;

    /* renamed from: mHandleListener */
    private java.lang.Object f55385x822ff8c9;

    /* renamed from: mLock */
    private com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26579x7b4fc798 f55386x6243b38 = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26579x7b4fc798();

    /* renamed from: mLogTag */
    private java.lang.String f55387xe03d483;

    /* renamed from: mLooper */
    private android.os.Looper f55388xe07e11e;

    /* renamed from: com.tencent.thumbplayer.utils.TPThreadSwitch$EventHandler */
    /* loaded from: classes13.dex */
    public class EventHandler extends android.os.Handler {
        @Override // android.os.Handler
        public void handleMessage(android.os.Message message) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26583x8b41067a.this.m104422x4e1faa55(message);
        }

        private EventHandler(android.os.Looper looper) {
            super(looper);
        }
    }

    /* renamed from: com.tencent.thumbplayer.utils.TPThreadSwitch$MessageParams */
    /* loaded from: classes13.dex */
    public static class MessageParams {

        /* renamed from: params */
        java.lang.Object f55390xc4aaf986;

        /* renamed from: result */
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26569xf42d285c f55391xc84dc81d;

        private MessageParams() {
        }
    }

    public C26583x8b41067a(java.lang.String str, android.os.Looper looper, java.lang.Object obj) {
        this.f55387xe03d483 = str;
        this.f55388xe07e11e = looper;
        this.f55384xf703545d = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26583x8b41067a.EventHandler(this.f55388xe07e11e);
        this.f55385x822ff8c9 = obj;
        java.lang.Class<?> cls = obj.getClass();
        this.f55383xbde2f50b = cls;
        if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.m104400xd6dc2ea3(cls, 0)) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f55387xe03d483, "Register " + this.f55383xbde2f50b.getName() + " @ThreadSwitch method failed, version: 2.33.0.1206");
        throw new java.lang.RuntimeException("register @ThreadSwitch method failed, player can not work");
    }

    /* renamed from: dealResult */
    private java.lang.Object m104420x2ad5afa9(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        if (obj != null) {
            return obj;
        }
        java.lang.String name = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.m104392x24dcf3d7(this.f55383xbde2f50b, str, m104421x95865c3d(obj2)).getReturnType().getName();
        if (name.equals(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26669x527e6c88.f56125x52684c03)) {
            return java.lang.Boolean.FALSE;
        }
        if (name.equals("int")) {
            return 0;
        }
        if (name.equals("long")) {
            return 0L;
        }
        if (name.equals("float")) {
            return java.lang.Float.valueOf(0.0f);
        }
        return null;
    }

    /* renamed from: getMethodParams */
    private java.lang.Object[] m104421x95865c3d(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26583x8b41067a.MessageParams)) {
            return (java.lang.Object[]) obj;
        }
        java.lang.Object obj2 = ((com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26583x8b41067a.MessageParams) obj).f55390xc4aaf986;
        if (obj2 == null) {
            return null;
        }
        return (java.lang.Object[]) obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: handleEventMessage */
    public void m104422x4e1faa55(android.os.Message message) {
        if (this.f55385x822ff8c9 == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f55387xe03d483, "handle listener is null, return");
        } else {
            m104426xd8c5c779(message.what, message.obj);
        }
    }

    /* renamed from: internalMessage */
    private boolean m104424xe737328a(int i17, java.lang.Object obj) {
        return m104423xe737328a(i17, 0, 0, obj, false, false, 0L);
    }

    /* renamed from: internalMessageLock */
    private java.lang.Object m104425x3c0b16d5(int i17, int i18, int i19, java.lang.Object obj, boolean z17, boolean z18, long j17) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26569xf42d285c c26569xf42d285c = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26569xf42d285c();
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26583x8b41067a.MessageParams messageParams = new com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26583x8b41067a.MessageParams();
        messageParams.f55390xc4aaf986 = obj;
        messageParams.f55391xc84dc81d = c26569xf42d285c;
        m104423xe737328a(i17, i18, i19, messageParams, z17, z18, j17);
        return c26569xf42d285c.m104299x2d64eb13(500L);
    }

    /* renamed from: invokeMethod */
    private void m104426xd8c5c779(int i17, java.lang.Object obj) {
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26569xf42d285c c26569xf42d285c = obj instanceof com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26583x8b41067a.MessageParams ? ((com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26583x8b41067a.MessageParams) obj).f55391xc84dc81d : null;
        java.lang.reflect.Method m104393x5da0ea8e = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.m104393x5da0ea8e(this.f55383xbde2f50b, i17);
        if (m104393x5da0ea8e == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f55387xe03d483, "invokeMethod, handle method name is empty, msg:" + i17);
            if (c26569xf42d285c != null) {
                c26569xf42d285c.m104300xb411020d(new java.lang.RuntimeException("invokeMethod, handle method name is empty"));
                return;
            }
            return;
        }
        try {
            java.lang.Object invoke = m104393x5da0ea8e.getParameterTypes().length == 0 ? m104393x5da0ea8e.invoke(this.f55385x822ff8c9, new java.lang.Object[0]) : m104393x5da0ea8e.invoke(this.f55385x822ff8c9, m104421x95865c3d(obj));
            if (c26569xf42d285c != null) {
                c26569xf42d285c.m104301x209a1f1f(invoke);
            }
        } catch (java.lang.reflect.InvocationTargetException e17) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f55387xe03d483, "invokeMethod " + m104393x5da0ea8e.getName() + " has excecption: " + e17.getTargetException().toString());
            if (c26569xf42d285c == null) {
                return;
            }
            if (e17.getTargetException() instanceof java.lang.IllegalArgumentException) {
                c26569xf42d285c.m104300xb411020d(new java.lang.IllegalArgumentException("invokeMethod " + m104393x5da0ea8e.getName() + " failed, params invalid", e17.getCause()));
                return;
            }
            if (!(e17.getTargetException() instanceof java.lang.IllegalStateException)) {
                c26569xf42d285c.m104300xb411020d(e17.getTargetException());
                return;
            }
            c26569xf42d285c.m104300xb411020d(new java.lang.IllegalStateException("invokeMethod " + m104393x5da0ea8e.getName() + " failed, state invalid", e17.getCause()));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f55387xe03d483, "invokeMethod " + m104393x5da0ea8e.getName() + " has excecption: " + e18.toString());
            if (c26569xf42d285c != null) {
                c26569xf42d285c.m104300xb411020d(e18);
            }
        }
    }

    /* renamed from: isSameLooper */
    private boolean m104427xe0cff21() {
        return android.os.Looper.myLooper() == this.f55388xe07e11e;
    }

    /* renamed from: messageToCommand */
    private java.lang.String m104428x9a6c7009(int i17) {
        java.lang.String m104391xb5882ae4 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.m104391xb5882ae4(this.f55383xbde2f50b, i17);
        if (!android.text.TextUtils.isEmpty(m104391xb5882ae4) && !m104391xb5882ae4.equals(com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a)) {
            return m104391xb5882ae4;
        }
        return i17 + " not find";
    }

    /* renamed from: recycle */
    private void m104429x408b7293() {
        this.f55384xf703545d.removeCallbacksAndMessages(null);
    }

    /* renamed from: dealThreadSwitch */
    public java.lang.Object m104430xaa64906a(java.lang.String str, java.lang.Object obj) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f55387xe03d483, "dealThreadSwitch failed , methodName is null");
            throw new java.lang.RuntimeException("dealThreadSwitch failed , methodName is null");
        }
        int m104394xa197bee5 = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.m104394xa197bee5(this.f55383xbde2f50b, str, m104421x95865c3d(obj));
        if (m104394xa197bee5 >= 0) {
            boolean m104401xca989f3f = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.m104401xca989f3f(this.f55383xbde2f50b, m104394xa197bee5);
            boolean m104390x5b9ad2cf = com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.m104390x5b9ad2cf(this.f55383xbde2f50b, m104394xa197bee5);
            if (com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26580xafd4c79e.m104397x451fa75(this.f55383xbde2f50b, m104394xa197bee5)) {
                return m104425x3c0b16d5(m104394xa197bee5, 0, 0, obj, m104390x5b9ad2cf, m104401xca989f3f, 0L);
            }
            m104423xe737328a(m104394xa197bee5, 0, 0, obj, m104390x5b9ad2cf, m104401xca989f3f, 0L);
            return null;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f55387xe03d483, "dealThreadSwitch failed , not match method:" + str);
        throw new java.lang.RuntimeException("dealThreadSwitch failed , not match method:" + str);
    }

    /* renamed from: dealThreadSwitchWithResult */
    public java.lang.Object m104431x3eeca88d(java.lang.String str, java.lang.Object obj) {
        return m104420x2ad5afa9(str, m104430xaa64906a(str, obj), obj);
    }

    /* renamed from: internalMessage */
    private boolean m104423xe737328a(int i17, int i18, int i19, java.lang.Object obj, boolean z17, boolean z18, long j17) {
        if (this.f55384xf703545d == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f55387xe03d483, m104428x9a6c7009(i17) + " , send failed , handler null");
            return false;
        }
        if (z17 && obj == null) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f55387xe03d483, m104428x9a6c7009(i17) + ", send failed , params null");
            return false;
        }
        if (!this.f55388xe07e11e.getThread().isAlive()) {
            com.p314xaae8f345.p3006xb8ff1437.p3075x6a710b1.C26572x9469cf4a.e(this.f55387xe03d483, m104428x9a6c7009(i17) + ", send failed , thread had dead");
            return false;
        }
        if (!m104427xe0cff21()) {
            this.f55386x6243b38.readLock().lock();
        }
        if (z18) {
            this.f55384xf703545d.removeMessages(i17);
        }
        android.os.Message obtainMessage = this.f55384xf703545d.obtainMessage();
        obtainMessage.what = i17;
        obtainMessage.arg1 = i18;
        obtainMessage.arg2 = i19;
        obtainMessage.obj = obj;
        if (m104427xe0cff21()) {
            m104422x4e1faa55(obtainMessage);
            return true;
        }
        this.f55384xf703545d.sendMessageDelayed(obtainMessage, j17);
        this.f55386x6243b38.readLock().unlock();
        return true;
    }
}
