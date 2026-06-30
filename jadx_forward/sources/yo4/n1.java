package yo4;

/* loaded from: classes10.dex */
public final class n1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f f545806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 f545807e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f, com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        super(0);
        this.f545806d = c18795x62fd7c3f;
        this.f545807e = abstractC15633xee433078;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = this.f545807e;
        java.lang.String str = abstractC15633xee433078.f219963e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getOriginalPath(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18795x62fd7c3f c18795x62fd7c3f = this.f545806d;
        c18795x62fd7c3f.C = str;
        if (c18795x62fd7c3f.K1) {
            java.util.HashMap hashMap = so4.g.f492315g;
            if (hashMap.containsKey(abstractC15633xee433078.f219963e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiVideoPluginLayout", "update select image path to image enhancement result path: " + ((java.lang.String) hashMap.get(abstractC15633xee433078.f219963e)));
                str = (java.lang.String) hashMap.get(abstractC15633xee433078.f219963e);
                if (str == null) {
                    str = abstractC15633xee433078.f219963e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getOriginalPath(...)");
                }
            }
        }
        ym5.x2 F = c18795x62fd7c3f.f257409s.F(str);
        dw3.g0 g0Var = c18795x62fd7c3f.R;
        g0Var.a("start", "get photo view");
        java.lang.String str2 = abstractC15633xee433078.f219963e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getOriginalPath(...)");
        gp4.j jVar = c18795x62fd7c3f.f257408r;
        jVar.getClass();
        jVar.f355945f.t(str2);
        bp4.k0 m72543x67c60a58 = c18795x62fd7c3f.m72543x67c60a58();
        java.lang.String str3 = abstractC15633xee433078.f219963e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getOriginalPath(...)");
        m72543x67c60a58.H(F, str3, true);
        android.content.Context context = c18795x62fd7c3f.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView().findViewById(android.R.id.content)).setAlpha(1.0f);
        c18795x62fd7c3f.A.z();
        c18795x62fd7c3f.J();
        c18795x62fd7c3f.setBackgroundColor(c18795x62fd7c3f.J1);
        c18795x62fd7c3f.m72544xee20813a(c18795x62fd7c3f.m72543x67c60a58().f104744g.getStyle());
        g0Var.a("start", "load first image");
        c18795x62fd7c3f.f257415x0.z(true);
        return jz5.f0.f384359a;
    }
}
