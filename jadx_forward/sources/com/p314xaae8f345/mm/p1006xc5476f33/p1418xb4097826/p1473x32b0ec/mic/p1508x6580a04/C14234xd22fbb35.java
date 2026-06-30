package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1508x6580a04;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/mic/panel/FinderLiveMicGiftMemberPanelTabView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "d", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "getContributorRv", "()Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "contributorRv", "Lyh2/h;", "n", "Lyh2/h;", "getMemberAdapter", "()Lyh2/h;", "setMemberAdapter", "(Lyh2/h;)V", "memberAdapter", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.mic.panel.FinderLiveMicGiftMemberPanelTabView */
/* loaded from: classes3.dex */
public final class C14234xd22fbb35 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 contributorRv;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f193235e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ProgressBar f193236f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f193237g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f193238h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f193239i;

    /* renamed from: m, reason: collision with root package name */
    public final yh2.e f193240m;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yh2.h memberAdapter;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l f193242o;

    /* renamed from: p, reason: collision with root package name */
    public ni2.v2 f193243p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14234xd22fbb35(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final boolean a(km2.q qVar) {
        boolean z17;
        zl2.r4 r4Var = zl2.r4.f555483a;
        if (!r4Var.w1()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar = this.f193242o;
            if (lVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("basePlugin");
                throw null;
            }
            if (!((mm2.c1) lVar.P0(mm2.c1.class)).T) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar2 = this.f193242o;
                if (lVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("basePlugin");
                    throw null;
                }
                if (!(((mm2.n0) lVar2.P0(mm2.n0.class)).f410806r)) {
                    z17 = false;
                    return (z17 || r4Var.c2(qVar.f390705c)) ? false : true;
                }
            }
        }
        z17 = true;
        if (z17) {
            return false;
        }
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 getContributorRv() {
        return this.contributorRv;
    }

    public final yh2.h getMemberAdapter() {
        return this.memberAdapter;
    }

    /* renamed from: setMemberAdapter */
    public final void m56841xb07e9213(yh2.h hVar) {
        this.memberAdapter = hVar;
    }

    public /* synthetic */ C14234xd22fbb35(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14234xd22fbb35(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dmi, (android.view.ViewGroup) this, true);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.qyz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.contributorRv = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.dhl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f193237g = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.imn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f193236f = (android.widget.ProgressBar) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qgx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f193235e = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.r0p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f193238h = findViewById5;
        android.view.View findViewById6 = inflate.findViewById(com.p314xaae8f345.mm.R.id.l67);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f193239i = findViewById6;
        android.view.View findViewById7 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f566919qz2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f193240m = new yh2.e(findViewById7);
    }
}
