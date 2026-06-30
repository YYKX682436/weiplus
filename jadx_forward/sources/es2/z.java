package es2;

/* loaded from: classes2.dex */
public final class z implements ek4.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f337952a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cs2.p f337953b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f337954c;

    public z(es2.h0 h0Var, cs2.p pVar, so2.i3 i3Var) {
        this.f337952a = h0Var;
        this.f337953b = pVar;
        this.f337954c = i3Var;
    }

    @Override // ek4.w
    public void b(int i17, dn.o oVar) {
        es2.h0 h0Var = this.f337952a;
        java.lang.String str = h0Var.f337908h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preload task on Start ");
        cs2.p pVar = this.f337953b;
        sb6.append(pVar);
        sb6.append(' ');
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        if (i17 < 0 && ((cs2.p) h0Var.j("onPreloadCompleted", new es2.y(h0Var, pVar))) != null) {
            h0Var.f337909i.e(pVar.f303625i2, "onPreloadCompleted start ret=" + i17 + " error", pVar, h0Var.f337904d.size(), h0Var.f337905e.size());
        }
        if (i17 == 0) {
            h0Var.f337909i.f(pVar.f303625i2, pVar, h0Var.f337904d.size(), h0Var.f337905e.size());
            kw2.y Uj = ((c61.l7) i95.n0.c(c61.l7.class)).Uj();
            java.lang.String field_mediaId = pVar.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            Uj.h(field_mediaId, pVar, this.f337954c);
        }
    }
}
