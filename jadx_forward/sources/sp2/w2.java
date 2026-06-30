package sp2;

/* loaded from: classes3.dex */
public final class w2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f492789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f492790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yl2.y f492791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.x4 f492792g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f492793h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(sp2.d3 d3Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, yl2.y yVar, dk2.x4 x4Var, int i17) {
        super(2);
        this.f492789d = d3Var;
        this.f492790e = abstractActivityC21394xb3d2c0cf;
        this.f492791f = yVar;
        this.f492792g = x4Var;
        this.f492793h = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            r45.j01 j01Var = this.f492791f.f544616a;
            sp2.d3 d3Var = this.f492789d;
            d3Var.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_PARAMS_LIVE_FROM_NEARBY_CHAT", true);
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", d3Var.f492545f);
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", d3Var.f492544e);
            intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_PULL_SOURCE", this.f492793h);
            dk2.x4.C.c(intent, this.f492792g);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("KEY_PARAMS_LIVE_FROM_NEARBY_CHAT_INNER_INTENT", intent);
            android.os.Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new android.os.Bundle();
            }
            bundle.putAll(extras);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f492790e;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) abstractActivityC21394xb3d2c0cf.findViewById(com.p314xaae8f345.mm.R.id.sp9);
            if (frameLayout != null) {
                if (d3Var.f492547h != null) {
                    p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = abstractActivityC21394xb3d2c0cf.mo7595x9cdc264().m7630xb2c12e75();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a c14217x338c613a = d3Var.f492547h;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14217x338c613a);
                    m7630xb2c12e75.j(c14217x338c613a);
                    m7630xb2c12e75.e();
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a c14217x338c613a2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a();
                d3Var.f492547h = c14217x338c613a2;
                c14217x338c613a2.mo7562xe26dab14(bundle);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a c14217x338c613a3 = d3Var.f492547h;
                if (c14217x338c613a3 != null) {
                    c14217x338c613a3.f193185n = new sp2.u2(d3Var, abstractActivityC21394xb3d2c0cf, intent, j01Var);
                }
                p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e752 = abstractActivityC21394xb3d2c0cf.mo7595x9cdc264().m7630xb2c12e75();
                int id6 = frameLayout.getId();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a c14217x338c613a4 = d3Var.f492547h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14217x338c613a4);
                m7630xb2c12e752.h(id6, c14217x338c613a4, "chat_fragment", 1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14217x338c613a c14217x338c613a5 = d3Var.f492547h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c14217x338c613a5);
                m7630xb2c12e752.n(c14217x338c613a5);
                m7630xb2c12e752.e();
            }
        }
        return jz5.f0.f384359a;
    }
}
