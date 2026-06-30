package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad;

@j95.b
/* loaded from: classes7.dex */
public final class b6 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p4 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f229413d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a6.f229378d);

    public jc3.j0 wi(java.lang.String bizName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        pc3.m mVar = (pc3.m) ((jz5.n) this.f229413d).mo141623x754a37bb();
        mVar.getClass();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (jc3.u0.f380529a.a(bizName)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushClientMgr", "create Biz with dynamic bizName: ".concat(bizName));
        }
        java.lang.String str2 = bizName + '-' + ((java.lang.Number) ((jz5.n) mVar.f434920f).mo141623x754a37bb()).intValue() + '.' + android.os.SystemClock.uptimeMillis();
        int i17 = pu5.i.f440006b;
        android.os.HandlerThread a17 = pu5.f.a("MagicBrush_" + str2, 5);
        a17.start();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicBrushClientMgr", "createBiz " + str2);
        rc3.w0 w0Var = new rc3.w0(mVar.f434915a, str2, a17, new pc3.i(mVar), new pc3.j(mVar));
        mVar.f434916b.put(str2, w0Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5 a5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229369a;
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229375g;
        synchronized (set) {
            set.add(str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.a5.f229374f = a5Var.a(set);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.n4 n4Var = mVar.f434918d;
        if (n4Var != null) {
            w0Var.T(new rc3.f0(w0Var, n4Var));
        }
        return w0Var;
    }
}
