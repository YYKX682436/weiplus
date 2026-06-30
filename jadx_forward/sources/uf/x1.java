package uf;

/* loaded from: classes7.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f508657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f508658e;

    public x1(uf.c2 c2Var, android.content.Context context) {
        this.f508657d = c2Var;
        this.f508658e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("https://");
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fy9));
        sb6.append("/mp/readtemplate?t=weapp/airplay_intro_tmpl&appid=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f508657d.f508527d;
        sb6.append(c11510xdd90c2f2 != null ? c11510xdd90c2f2.f156336n : null);
        java.lang.String url = sb6.toString();
        if (((gg1.f) nd.f.a(gg1.f.class)) != null) {
            android.content.Context context = this.f508658e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 r1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1.class);
            if (r1Var != null) {
                r1Var.N(context, url, "", null);
            }
        }
        yz5.a aVar = this.f508657d.f508542v;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
