package te2;

/* loaded from: classes5.dex */
public final class t3 implements te2.o3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f499960d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f499961e;

    /* renamed from: f, reason: collision with root package name */
    public final gk2.e f499962f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14319xdc54373f f499963g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f499964h;

    public t3(android.view.View root, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14319xdc54373f c14319xdc54373f, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, te2.n3 n3Var, gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f499960d = root;
        this.f499961e = activity;
        this.f499962f = buContext;
        this.f499963g = c14319xdc54373f;
        if (c14319xdc54373f != null) {
            c14319xdc54373f.setOnClickListener(new te2.s3(this));
        }
    }

    @Override // fs2.c
    /* renamed from: getActivity */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f mo978x19263085() {
        return this.f499961e;
    }
}
