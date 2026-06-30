package gd4;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n74.z f352220a;

    /* renamed from: b, reason: collision with root package name */
    public final n74.a0 f352221b;

    /* renamed from: c, reason: collision with root package name */
    public final n74.a0 f352222c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup.LayoutParams f352223d;

    /* renamed from: e, reason: collision with root package name */
    public final gd4.e f352224e;

    public f(n74.z thumb, n74.a0 sight, n74.a0 breakSight, android.view.ViewGroup.LayoutParams layoutParams, gd4.e playState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumb, "thumb");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sight, "sight");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(breakSight, "breakSight");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playState, "playState");
        this.f352220a = thumb;
        this.f352221b = sight;
        this.f352222c = breakSight;
        this.f352223d = layoutParams;
        this.f352224e = playState;
    }

    /* renamed from: equals */
    public boolean m131298xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return true;
        }
        if (!(obj instanceof gd4.f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return false;
        }
        gd4.f fVar = (gd4.f) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352220a, fVar.f352220a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352221b, fVar.f352221b)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352222c, fVar.f352222c)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return false;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f352223d, fVar.f352223d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
            return false;
        }
        gd4.e eVar = this.f352224e;
        gd4.e eVar2 = fVar.f352224e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
        return eVar == eVar2;
    }

    /* renamed from: hashCode */
    public int m131299x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
        int m149195x8cdac1b = ((((this.f352220a.m149195x8cdac1b() * 31) + this.f352221b.m149174x8cdac1b()) * 31) + this.f352222c.m149174x8cdac1b()) * 31;
        android.view.ViewGroup.LayoutParams layoutParams = this.f352223d;
        int hashCode = ((m149195x8cdac1b + (layoutParams == null ? 0 : layoutParams.hashCode())) * 31) + this.f352224e.hashCode();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m131300x9616526c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
        java.lang.String str = "UIModel(thumb=" + this.f352220a + ", sight=" + this.f352221b + ", breakSight=" + this.f352222c + ", uiLayoutParams=" + this.f352223d + ", playState=" + this.f352224e + ')';
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.BaseBreakFrameCardAdController$UIModel");
        return str;
    }
}
