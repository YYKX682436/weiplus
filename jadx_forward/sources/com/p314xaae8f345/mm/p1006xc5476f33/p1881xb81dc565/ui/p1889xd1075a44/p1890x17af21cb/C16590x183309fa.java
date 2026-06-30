package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1890x17af21cb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\r\u001a\n \u0003*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/avatar_view/MultitalkStatusIconLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "kotlin.jvm.PlatformType", "d", "Ljz5/g;", "getIconBg", "()Landroid/view/View;", "iconBg", "Landroid/widget/ImageView;", "e", "getIcon", "()Landroid/widget/ImageView;", "icon", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.multitalk.ui.widget.avatar_view.MultitalkStatusIconLayout */
/* loaded from: classes8.dex */
public final class C16590x183309fa extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g iconBg;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g icon;

    public /* synthetic */ C16590x183309fa(android.content.Context context, android.util.AttributeSet attributeSet, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i17 & 2) != 0 ? null : attributeSet);
    }

    /* renamed from: getIcon */
    private final android.widget.ImageView m67100xfb80a4ef() {
        return (android.widget.ImageView) ((jz5.n) this.icon).mo141623x754a37bb();
    }

    /* renamed from: getIconBg */
    private final android.view.View m67101x1deb2d94() {
        return (android.view.View) ((jz5.n) this.iconBg).mo141623x754a37bb();
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t memberInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberInfo, "memberInfo");
        setVisibility(0);
        if (!memberInfo.f231834f) {
            setVisibility(8);
        } else {
            m67100xfb80a4ef().setVisibility(8);
            m67101x1deb2d94().setBackgroundResource(com.p314xaae8f345.mm.R.raw.f80676x691de2d8);
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t memberInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(memberInfo, "memberInfo");
        setVisibility(0);
        if (memberInfo.a()) {
            m67101x1deb2d94().setBackground(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.aqf, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560029g)));
            m67100xfb80a4ef().setVisibility(0);
            m67100xfb80a4ef().setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79651x41395ece, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
        } else if (memberInfo.f231835g) {
            m67101x1deb2d94().setBackground(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.aqf, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
            m67100xfb80a4ef().setVisibility(0);
            m67100xfb80a4ef().setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79533x4d32081d, -65536));
        } else if (!memberInfo.f231833e) {
            setVisibility(8);
        } else {
            m67100xfb80a4ef().setVisibility(8);
            m67101x1deb2d94().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cbq);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16590x183309fa(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570841c30, (android.view.ViewGroup) this, true);
        this.iconBg = jz5.h.b(new tj3.k0(this));
        this.icon = jz5.h.b(new tj3.j0(this));
    }
}
