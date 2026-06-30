package c54;

/* loaded from: classes4.dex */
public final class l implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c54.k f120244d;

    public l(c54.k kVar) {
        this.f120244d = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$adapterHalfScreenHeight$3");
        c54.k kVar = this.f120244d;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            kVar.k().getViewTreeObserver().removeOnPreDrawListener(this);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("catching_tag", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        if (kVar.i().getWidth() == kVar.j().getWidth()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$adapterHalfScreenHeight$3");
            return true;
        }
        if (kVar.i().getWidth() > kVar.j().getWidth()) {
            ca4.m0.l0(kVar.j(), kVar.i().getWidth());
        } else {
            ca4.m0.l0(kVar.i(), kVar.j().getWidth());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$adapterHalfScreenHeight$3");
        return true;
    }
}
