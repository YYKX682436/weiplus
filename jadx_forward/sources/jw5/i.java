package jw5;

/* loaded from: classes11.dex */
public final class i implements com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.h {

    /* renamed from: c, reason: collision with root package name */
    public static boolean f383888c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f383889d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f383890e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.HashMap f383891f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f383892g;

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.g f383893a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f383894b = "";

    static {
        new jw5.h(null);
        f383889d = new java.lang.Object();
        f383890e = new java.util.HashMap();
        f383891f = new java.util.HashMap();
        f383892g = jz5.h.b(jw5.e.f383886d);
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.h
    public void a(com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.g callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f383893a = callback;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.h
    public boolean b(java.lang.String jsonStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonStr, "jsonStr");
        try {
            this.f383894b = new org.json.JSONObject(jsonStr).getString("bizName");
            java.lang.String msg = "listen: bizName " + this.f383894b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            if (iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AidlZChannelServerFactory", msg);
            }
            if (this.f383894b.length() == 0) {
                return false;
            }
            java.lang.String bizName = this.f383894b;
            com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.g gVar = this.f383893a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
            synchronized (f383889d) {
                java.util.HashMap hashMap = f383890e;
                if (hashMap.containsKey(bizName)) {
                    java.lang.String msg2 = "awaitChannel bizName " + bizName + " has exist";
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg2, "msg");
                    if (iw5.o.f376808a != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AidlZChannelServerFactory", msg2);
                    }
                } else {
                    java.lang.String msg3 = "awaitChannel " + bizName + " add";
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg3, "msg");
                    if (iw5.o.f376808a != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AidlZChannelServerFactory", msg3);
                    }
                    hashMap.put(bizName, gVar);
                    jz5.o oVar = (jz5.o) f383891f.remove(bizName);
                    if (oVar != null) {
                        java.lang.String msg4 = "awaitChannel bizName " + bizName + " matched with waiting channel";
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg4, "msg");
                        if (iw5.o.f376808a != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AidlZChannelServerFactory", msg4);
                        }
                        ((android.os.Handler) ((jz5.n) f383892g).mo141623x754a37bb()).removeCallbacks((java.lang.Runnable) oVar.f384375e);
                        gVar.O0(new com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.b((com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.d) oVar.f384374d));
                        ((yz5.l) oVar.f384376f).mo146xb9724478(java.lang.Boolean.TRUE);
                    }
                }
            }
            return true;
        } catch (java.lang.Exception e17) {
            java.lang.String msg5 = "listen: parse json error " + e17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg5, "msg");
            if (iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AidlZChannelServerFactory", msg5);
            }
            return false;
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.h
    public void j() {
        if (iw5.o.f376808a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AidlZChannelServerFactory", "unInit");
        }
        java.lang.String bizName = this.f383894b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        synchronized (f383889d) {
            java.lang.String msg = "cancelAwaitChannel " + bizName + " remove";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            if (iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AidlZChannelServerFactory", msg);
            }
        }
    }
}
