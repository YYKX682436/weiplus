package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class lc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17423x715c600d f242824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f242825e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17423x715c600d c17423x715c600d, int i17) {
        super(0);
        this.f242824d = c17423x715c600d;
        this.f242825e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17423x715c600d c17423x715c600d = this.f242824d;
        ((android.widget.LinearLayout) c17423x715c600d.f241946i.get(c17423x715c600d.f241944g)).setVisibility(8);
        int i17 = this.f242825e;
        c17423x715c600d.f241944g = i17;
        c17423x715c600d.f241945h = false;
        if (c17423x715c600d.isAutoPlay) {
            c17423x715c600d.f241943f = true;
            java.lang.Object obj = c17423x715c600d.f241946i.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            java.lang.Object k17 = q26.h0.k(new n3.r1((android.view.ViewGroup) obj));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k17, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView");
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780.f241925v;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17422xce8bd780) k17).a(false);
        }
        return jz5.f0.f384359a;
    }
}
