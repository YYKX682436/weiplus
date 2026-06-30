package dr0;

/* loaded from: classes12.dex */
public final class r1 extends dr0.s1 {

    /* renamed from: e, reason: collision with root package name */
    public static final dr0.r1 f324052e = new dr0.r1();

    public r1() {
        super("BackOff", 100, 60000L, 3600000L);
    }

    public void a() {
        java.util.List<mm.b0> linkedList;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (wh.m.w(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "check charging: true");
            throw new dr0.q1("Charge", "abortByCharging");
        }
        java.lang.String str = "";
        mm.d0 d0Var = mm.d0.f410008a;
        synchronized (d0Var.a()) {
            linkedList = d0Var.a().isEmpty() ? kz5.p0.f395529d : new java.util.LinkedList(d0Var.a());
        }
        for (mm.b0 b0Var : linkedList) {
            if (b0Var.b()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(str);
                sb6.append(android.text.TextUtils.isEmpty(str) ? "" : ",");
                sb6.append(b0Var.a());
                str = sb6.toString();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "check appliers: " + str);
        if (str.length() > 0) {
            throw new dr0.q1("Apply", "abortByAppliers:".concat(str));
        }
        dr0.t0 t0Var = dr0.t0.f324073k;
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c i17 = t0Var.i();
        java.util.Map<java.lang.String, java.lang.Integer> a17 = kz5.t0.a(new hr0.e0(((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).Bi()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "collect RunningNetScenes: " + a17);
        java.lang.String concat = !a17.isEmpty() ? (android.text.TextUtils.isEmpty("") ? "" : ",").concat("run") : "";
        i17.m46685xbbd7e144(a17);
        com.p314xaae8f345.mm.p849xbf8d97c1.p850xec41ae0d.p851x3bc562.acc.C10875xc0cf956c i18 = t0Var.i();
        java.util.Map<java.lang.String, java.lang.Integer> a18 = kz5.t0.a(new hr0.f0(((hr0.k0) ((q01.q0) i95.n0.c(q01.q0.class))).Di()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.proc.Recycler", "collect WaitingNetScenes: " + a18);
        if (!a18.isEmpty()) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(concat);
            sb7.append(android.text.TextUtils.isEmpty(concat) ? "" : ",");
            sb7.append("wait");
            concat = sb7.toString();
        }
        i18.m46688x5d67f3d2(a18);
        if (concat.length() > 0) {
            throw new dr0.q1("Apply", "abortByNetScene:".concat(concat));
        }
    }
}
