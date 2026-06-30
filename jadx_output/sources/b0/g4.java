package b0;

/* loaded from: classes16.dex */
public final class g4 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f16300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v65.n f16301b;

    public g4(pk2.o9 o9Var, v65.n nVar) {
        this.f16300a = o9Var;
        this.f16301b = nVar;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.tencent.mars.xlog.Log.i(this.f16300a.f356072a, "switchVisitorAnonymous-callBack-onFail anchorStatus" + j17 + ", errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
        this.f16301b.a(java.lang.Boolean.FALSE);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        java.lang.String string;
        pk2.o9 o9Var = this.f16300a;
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "switchVisitorAnonymous-callBack-onSuccess anchorStatus" + j17);
        if (pm0.v.z((int) j17, 8192)) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.Y, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
            string = o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dws);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.Z, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f327916f), null, null, null, null, false, 124, null);
            string = o9Var.f356078d.getResources().getString(com.tencent.mm.R.string.dwk);
        }
        kotlin.jvm.internal.o.d(string);
        this.f16301b.a(java.lang.Boolean.TRUE);
    }
}
