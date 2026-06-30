package hy;

/* loaded from: classes14.dex */
public final class a0 implements wx.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f367254a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w f367255b;

    /* renamed from: c, reason: collision with root package name */
    public final hy.b0 f367256c;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f367257d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f367258e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f367259f;

    public a0(java.lang.String voipSessionID, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w wVar, hy.b0 mgr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voipSessionID, "voipSessionID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mgr, "mgr");
        this.f367254a = voipSessionID;
        this.f367255b = wVar;
        this.f367256c = mgr;
        this.f367257d = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f367258e = new java.util.concurrent.CopyOnWriteArrayList();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = hy.b0.f367262b;
        concurrentHashMap.put(voipSessionID, this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotVoIPSessionMgr", "registerSession id=" + voipSessionID + " mapSize=" + concurrentHashMap.size());
    }

    public static final java.util.List a(hy.a0 a0Var) {
        a0Var.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = a0Var.f367258e;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            wx.g1 g1Var = (wx.g1) weakReference.get();
            if (g1Var != null) {
                arrayList.add(g1Var);
            } else {
                arrayList2.add(weakReference);
            }
        }
        if (!arrayList2.isEmpty()) {
            copyOnWriteArrayList.removeAll(kz5.n0.X0(arrayList2));
        }
        return arrayList;
    }

    public void b(wx.g1 g1Var) {
        if (g1Var == null) {
            return;
        }
        synchronized (this.f367258e) {
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f367258e;
            boolean z17 = false;
            if (!(copyOnWriteArrayList instanceof java.util.Collection) || !copyOnWriteArrayList.isEmpty()) {
                java.util.Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (((java.lang.ref.WeakReference) it.next()).get() == g1Var) {
                        z17 = true;
                        break;
                    }
                }
            }
            if (!z17) {
                this.f367258e.add(new java.lang.ref.WeakReference(g1Var));
            }
        }
        if (this.f367259f) {
            this.f367257d.post(new hy.a(g1Var));
        }
    }

    public void c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d3 d3Var, yz5.l lVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("destroySession reason=");
        sb6.append(d3Var);
        sb6.append(" voipSessionID=");
        java.lang.String str = this.f367254a;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBotVoIPSession", sb6.toString());
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w0.f298051b.b(d3Var, this.f367255b, str, new hy.b(lVar));
        this.f367256c.c(this);
    }

    public void d(wx.g1 g1Var) {
        if (g1Var == null) {
            return;
        }
        synchronized (this.f367258e) {
            kz5.h0.B(this.f367258e, new hy.y(g1Var));
        }
    }

    public void e(java.lang.String str, boolean z17, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n0 roomScene, int i17, boolean z18, boolean z19, byte[] transferCtx, boolean z27, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.x1 responseState, java.util.ArrayList imagePaths, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(roomScene, "roomScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transferCtx, "transferCtx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(responseState, "responseState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imagePaths, "imagePaths");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.k0.f297850b.a(str, z17, roomScene, i17, z18, z19, transferCtx, z27, responseState.f298078d, imagePaths, arrayList, arrayList, this.f367254a, new hy.z(aVar));
    }

    /* renamed from: toString */
    public java.lang.String m134244x9616526c() {
        return "ChatBotVoIPSession(voipSessionID='" + this.f367254a + "', openScene=" + this.f367255b + ", delegateCount=" + this.f367258e.size() + ')';
    }
}
