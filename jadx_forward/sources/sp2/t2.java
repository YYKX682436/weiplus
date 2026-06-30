package sp2;

/* loaded from: classes3.dex */
public final class t2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f492751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f492752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f492753f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.j01 f492754g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, sp2.d3 d3Var, android.content.Intent intent, r45.j01 j01Var) {
        super(0);
        this.f492751d = abstractActivityC21394xb3d2c0cf;
        this.f492752e = d3Var;
        this.f492753f = intent;
        this.f492754g = j01Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sp2.d3 d3Var = this.f492752e;
        int i17 = d3Var.f492545f;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f492751d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a9.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.d9.f183626f, context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L, null, 8, null);
        android.content.Intent intent = this.f492753f;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", i17);
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", d3Var.f492544e);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Kj(context, this.f492754g, intent, false);
        return jz5.f0.f384359a;
    }
}
