package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/wish/FinderLiveWishBannerView;", "Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveLoopBannerView;", "Lr45/aa4;", "Lkn2/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.wish.FinderLiveWishBannerView */
/* loaded from: classes3.dex */
public final class C14425xa7a42aea extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.AbstractC14403x128da8a7<r45.aa4, kn2.a> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14425xa7a42aea(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.AbstractC14403x128da8a7
    public void d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        kn2.a holder = (kn2.a) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        r45.aa4 aa4Var = m57915xe6796cde().get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(aa4Var, "get(...)");
        r45.aa4 aa4Var2 = aa4Var;
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
        dk2.u7 u7Var = dk2.u7.f315714a;
        r45.kv1 kv1Var = (r45.kv1) aa4Var2.m75936x14adae67(0);
        ce2.i e17 = u7Var.e(kv1Var != null ? kv1Var.m75945x2fec8307(0) : null);
        wo0.c a17 = d1Var.a(new mn2.q3(e17 != null ? e17.f67819x7194d06c : null, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        fg2.z1 z1Var = holder.f391195d;
        android.widget.ImageView wishIcon = z1Var.f343954c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(wishIcon, "wishIcon");
        ((wo0.b) a17).c(wishIcon);
        long m75942xfb822ef2 = aa4Var2.m75942xfb822ef2(2);
        long m75942xfb822ef22 = aa4Var2.m75942xfb822ef2(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a60 = z1Var.f343956e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a602 = z1Var.f343960i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14296xe95b9a60 c14296xe95b9a603 = z1Var.f343958g;
        if (m75942xfb822ef2 >= m75942xfb822ef22) {
            c14296xe95b9a603.setVisibility(8);
            c14296xe95b9a602.setVisibility(8);
            c14296xe95b9a60.setVisibility(0);
            return;
        }
        c14296xe95b9a603.setVisibility(0);
        c14296xe95b9a602.setVisibility(0);
        c14296xe95b9a60.setVisibility(8);
        c14296xe95b9a603.setText(java.lang.String.valueOf(aa4Var2.m75942xfb822ef2(2)));
        c14296xe95b9a602.setText("/" + aa4Var2.m75942xfb822ef2(1));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.AbstractC14403x128da8a7
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 e(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        return new kn2.a(fg2.z1.a(com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570556b23, (android.view.ViewGroup) null, false)));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14425xa7a42aea(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
