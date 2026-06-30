package bg2;

/* loaded from: classes2.dex */
public final class h4 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f101668e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f101669f;

    /* renamed from: g, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f101670g;

    /* renamed from: h, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f101671h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f101672i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    @Override // tc2.c
    public void P6() {
        in5.s0 s0Var = this.f498674d.f498682i;
        android.view.ViewGroup viewGroup = s0Var != null ? (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f565782rk0) : null;
        this.f101668e = viewGroup;
        this.f101669f = viewGroup != null ? viewGroup.findViewById(com.p314xaae8f345.mm.R.id.t8x) : null;
    }

    @Override // tc2.c
    public void Q6() {
        java.lang.CharSequence charSequence;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        java.lang.CharSequence descriptionSpan;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        this.f101672i = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(null);
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        if (!(d2Var != null ? d2Var.f101550p : false)) {
            android.view.ViewGroup viewGroup = this.f101668e;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        android.view.ViewGroup viewGroup2 = this.f101668e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        android.view.View view = this.f101669f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingRecommendController", "onFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingRecommendController", "onFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup3 = this.f101668e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = viewGroup3 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.rjz) : null;
        tc2.g gVar = this.f498674d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        java.lang.CharSequence charSequence2 = "";
        if (abstractC14490x69736cb5 == null || (feedObject2 = abstractC14490x69736cb5.getFeedObject()) == null || (charSequence = feedObject2.getDescriptionSpan()) == null) {
            charSequence = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.sq b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.h2.f191635a.b(c22624x85d69039 != null ? c22624x85d69039.getContext() : null, gVar.f498681h);
        if ((charSequence.length() == 0) && b17 == null) {
            if (c22624x85d69039 == null) {
                return;
            }
            c22624x85d69039.setVisibility(8);
        } else if (c22624x85d69039 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = gVar.f498681h;
            if (abstractC14490x69736cb52 != null && (feedObject = abstractC14490x69736cb52.getFeedObject()) != null && (descriptionSpan = feedObject.getDescriptionSpan()) != null) {
                charSequence2 = descriptionSpan;
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence2);
            if (b17 != null) {
                spannableStringBuilder.insert(0, (java.lang.CharSequence) " ");
                spannableStringBuilder.setSpan(b17, 0, 1, 17);
            }
            c22624x85d69039.b(new android.text.SpannableString(spannableStringBuilder));
            c22624x85d69039.setVisibility(0);
        }
    }

    @Override // tc2.c
    public void U6() {
        this.f101668e = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f101670g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f101670g = null;
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f101671h;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        this.f101671h = null;
        this.f101672i = null;
    }

    @Override // tc2.h
    /* renamed from: onLiveStart */
    public void mo10403x39a513b7(r45.hc1 hc1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.kr0 m59293x6b032749;
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        boolean z17 = d2Var != null ? d2Var.f101550p : false;
        bg2.d2 d2Var2 = (bg2.d2) N6(bg2.d2.class);
        boolean z18 = d2Var2 != null ? d2Var2.f101551q : false;
        bg2.d2 d2Var3 = (bg2.d2) N6(bg2.d2.class);
        boolean z19 = d2Var3 != null ? d2Var3.f101552r : false;
        tc2.g gVar = this.f498674d;
        if (z17 || z18 || z19) {
            r45.ac2 ac2Var = new r45.ac2();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
            ac2Var.set(1, pm0.b0.h((abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59293x6b032749 = feedObject.m59293x6b032749()) == null) ? null : m59293x6b032749.m75960xfb7e5820()));
            bg2.g2 g2Var = (bg2.g2) N6(bg2.g2.class);
            if (g2Var != null) {
                g2Var.Y6(40, ac2Var, false, new bg2.e4(this, r45.bc2.class));
            }
        }
        if (!z17 || (y0Var = gVar.f498680g) == null) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.b4(this, null), 3, null);
    }
}
