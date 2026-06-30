package gg1;

/* loaded from: classes7.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gg1.c1 f353148d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(gg1.c1 c1Var) {
        super(0);
        this.f353148d = c1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gg1.g gVar = this.f353148d.f353074g;
        if (gVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.j1) gVar).Ai(7);
        }
        java.lang.String url = "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9) + "/mp/readtemplate?t=weapp/airplay_intro_tmpl&appid=" + gg1.h.a(this.f353148d.f353068a).f156336n;
        if (((gg1.f) nd.f.a(gg1.f.class)) != null) {
            android.content.Context mo50272x76847179 = this.f353148d.f353068a.mo50272x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo50272x76847179, "getContext(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 r1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1.class);
            if (r1Var != null) {
                r1Var.N(mo50272x76847179, url, "", null);
            }
        }
        return jz5.f0.f384359a;
    }
}
