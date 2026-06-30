package sc2;

/* loaded from: classes2.dex */
public final class s5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f487771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f487772e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487773f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f487774g;

    public s5(xc2.p0 p0Var, sc2.d6 d6Var, android.view.View view, yz5.a aVar) {
        this.f487771d = p0Var;
        this.f487772e = d6Var;
        this.f487773f = view;
        this.f487774g = aVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        if (menuItem.getItemId() == 4) {
            xc2.p0 p0Var = this.f487771d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = p0Var.f534777f;
            java.lang.String str = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.f66949xdec927b;
            java.lang.String str2 = str == null ? "" : str;
            r45.h32 O = this.f487772e.O(str2, p0Var);
            i95.m c17 = i95.n0.c(c50.c1.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c50.c1 c1Var = (c50.c1) c17;
            ml2.i5 i5Var = ml2.i5.f409105g;
            android.view.View view = this.f487773f;
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.String valueOf = java.lang.String.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n);
            java.lang.String m75945x2fec8307 = O.m75945x2fec8307(3);
            java.lang.String str3 = m75945x2fec8307 != null ? m75945x2fec8307 : "";
            java.lang.String m75945x2fec83072 = O.m75945x2fec8307(4);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = p0Var.f534777f;
            long mo2128x1ed62e84 = abstractC14490x69736cb52 != null ? abstractC14490x69736cb52.mo2128x1ed62e84() : 0L;
            android.content.Context context2 = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            c50.c1.l9(c1Var, i5Var, str2, 0L, 0, valueOf, null, null, null, null, str3, null, m75945x2fec83072, null, mo2128x1ed62e84, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6().m75939xb282bd08(5), null, 38368, null);
            this.f487774g.mo152xb9724478();
        }
    }
}
