package aa4;

/* loaded from: classes4.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe f84210d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v94.g f84211e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe c17860x8fb775fe, v94.g gVar) {
        super(1);
        this.f84210d = c17860x8fb775fe;
        this.f84211e = gVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        v94.i mo69716xc4dd7296;
        v94.i mo69716xc4dd72962;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1");
        android.graphics.Bitmap it = (android.graphics.Bitmap) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        pc4.d dVar = pc4.d.f434943a;
        boolean y17 = dVar.y();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe c17860x8fb775fe = this.f84210d;
        if (y17) {
            android.view.ViewGroup.LayoutParams layoutParams = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe.m69735xdc9087de(c17860x8fb775fe).getLayoutParams();
            layoutParams.height = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe.m69736x9bc9fa8a(c17860x8fb775fe);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe.m69735xdc9087de(c17860x8fb775fe).setLayoutParams(layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe.m69735xdc9087de(c17860x8fb775fe).setImageBitmap(it);
        boolean y18 = dVar.y();
        v94.g gVar = this.f84211e;
        if (y18) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe.m69735xdc9087de(c17860x8fb775fe).post(new aa4.o(c17860x8fb775fe, gVar));
        }
        v94.k m69738x98fbc184 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe.m69738x98fbc184(c17860x8fb775fe);
        if (m69738x98fbc184 != null && (mo69716xc4dd72962 = m69738x98fbc184.mo69716xc4dd7296()) != null) {
            ((ba4.a) mo69716xc4dd72962).d();
        }
        v94.k m69738x98fbc1842 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17860x8fb775fe.m69738x98fbc184(c17860x8fb775fe);
        if (m69738x98fbc1842 != null && (mo69716xc4dd7296 = m69738x98fbc1842.mo69716xc4dd7296()) != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 x1Var = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1) gVar;
            java.lang.Long u07 = x1Var.u0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u07, "getSnsObjId(...)");
            jSONObject.put("snsid", u07.longValue());
            jSONObject.put("url", x1Var.t0());
            jSONObject.put("width", it.getWidth());
            jSONObject.put("height", it.getHeight());
            ((ba4.a) mo69716xc4dd7296).b(jSONObject.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsImageBackPreview$loadCover$1");
        return f0Var;
    }
}
