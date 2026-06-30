package b0;

/* loaded from: classes16.dex */
public final class g4 implements ke2.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f97833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v65.n f97834b;

    public g4(pk2.o9 o9Var, v65.n nVar) {
        this.f97833a = o9Var;
        this.f97834b = nVar;
    }

    @Override // ke2.f
    public void a(int i17, int i18, java.lang.String str, long j17, r45.cv2 cv2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f97833a.f437605a, "switchVisitorAnonymous-callBack-onFail anchorStatus" + j17 + ", errType=" + i17 + " errCode=" + i18 + " errMsg=" + str);
        this.f97834b.a(java.lang.Boolean.FALSE);
    }

    @Override // ke2.f
    public void b(long j17, long j18, r45.cv2 cv2Var) {
        java.lang.String string;
        pk2.o9 o9Var = this.f97833a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o9Var.f437605a, "switchVisitorAnonymous-callBack-onSuccess anchorStatus" + j17);
        if (pm0.v.z((int) j17, 8192)) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.T8((zy2.zb) c17, ml2.t1.Y, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
            string = o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dws);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.T8((zy2.zb) c18, ml2.t1.Z, ((ml2.j0) i95.n0.c(ml2.j0.class)).bj(ml2.s1.f409449f), null, null, null, null, false, 124, null);
            string = o9Var.f437611d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dwk);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        this.f97834b.a(java.lang.Boolean.TRUE);
    }
}
