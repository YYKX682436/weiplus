package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class y4 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f203584e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.a f203585f;

    public y4(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.a service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f203584e = i17;
        this.f203585f = service;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570514az5;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        android.view.ViewGroup.LayoutParams layoutParams;
        vp2.k0 item = (vp2.k0) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        int i19 = this.f203584e;
        if (i19 > 0 && (layoutParams = holder.f3639x46306858.getLayoutParams()) != null) {
            layoutParams.width = i19;
            layoutParams.height = i19;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f567974l74);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d f17 = g1Var.f();
        r45.y23 y23Var = item.f520466e;
        java.util.LinkedList m75941xfb821914 = y23Var.m75941xfb821914(2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getImg_urls(...)");
        mn2.q3 q3Var = new mn2.q3((java.lang.String) kz5.n0.Z(m75941xfb821914), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        f17.c(q3Var, imageView, g1Var.h(mn2.f1.f411500u));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.lcc);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.lcd);
        java.lang.String str = "productId: " + item.f520465d + " is_promoting: " + y23Var.m75939xb282bd08(10) + " isLiving: " + item.f520467f;
        wp2.b bVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1588xd1075a44.g) this.f203585f).f203604b;
        if (bVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("liveId: ");
            r45.nw1 m59258xd0557130 = bVar.getFeedObject().m59258xd0557130();
            sb6.append(m59258xd0557130 != null ? java.lang.Long.valueOf(m59258xd0557130.m75942xfb822ef2(0)) : null);
            sb6.append(" nickName: ");
            sb6.append(bVar.getFeedObject().m59273x80025a04());
            sb6.append(", ");
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShopProductItemConvert", sb6.toString());
            r3 = jz5.f0.f384359a;
        }
        if (r3 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ShopProductItemConvert", str);
        }
        if (y23Var.m75939xb282bd08(10) != 1 || !item.f520467f) {
            viewGroup.setVisibility(8);
            if (c15315xe70278e1 == null || (c22789xd23e9a9b = c15315xe70278e1.f212737i) == null) {
                return;
            }
            c22789xd23e9a9b.n();
            return;
        }
        viewGroup.setVisibility(0);
        viewGroup.setAlpha(1.0f);
        viewGroup.setTranslationY(0.0f);
        if (c15315xe70278e1 != null) {
            c15315xe70278e1.c();
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.lcc);
        if (c15315xe70278e1 == null || (c22789xd23e9a9b = c15315xe70278e1.f212737i) == null) {
            return;
        }
        c22789xd23e9a9b.n();
    }
}
