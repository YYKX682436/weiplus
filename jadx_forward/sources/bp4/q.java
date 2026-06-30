package bp4;

/* loaded from: classes5.dex */
public final class q extends eb5.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bp4.x f104884g;

    public q(bp4.x xVar) {
        this.f104884g = xVar;
        mo8164xbbdced85(true);
    }

    @Override // eb5.d
    public android.view.View B(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new bp4.u(this.f104884g, context);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) x(i17)).f219967i;
    }

    @Override // eb5.d
    /* renamed from: y */
    public void mo864xe5e2e48d(eb5.e viewWrapper, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewWrapper, "viewWrapper");
        super.mo864xe5e2e48d(viewWrapper, i17);
        bp4.u uVar = (bp4.u) viewWrapper.f332457n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) x(i17);
        i95.m c17 = i95.n0.c(e42.e0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (((h62.d) ((e42.e0) c17)).Ni(e42.c0.clicfg_finder_post_edit_thumb_load_use_finder_api, 1) == 1) {
            i95.m c18 = i95.n0.c(zy2.b6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            ya2.l.f542035a.h(abstractC15633xee433078.o(), uVar.m11003xcb16a3ea(), mn2.f1.B);
        } else {
            e33.m6.b(uVar.m11003xcb16a3ea(), abstractC15633xee433078.mo63659xfb85f7b0(), abstractC15633xee433078.o(), abstractC15633xee433078.f219963e, abstractC15633xee433078.f219967i, -1, null, abstractC15633xee433078.f219968m);
        }
        long j17 = abstractC15633xee433078.f219967i;
        bp4.x xVar = this.f104884g;
        uVar.setSelected(j17 == xVar.f104952i);
        uVar.setFocusable(abstractC15633xee433078.f219967i == xVar.f104952i);
    }

    @Override // eb5.d, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: z */
    public void mo8157xe5e2e48d(eb5.e holder, int i17, java.util.List payloads) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            mo864xe5e2e48d(holder, i17);
        }
    }
}
