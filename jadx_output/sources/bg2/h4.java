package bg2;

/* loaded from: classes2.dex */
public final class h4 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f20135e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f20136f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20137g;

    /* renamed from: h, reason: collision with root package name */
    public kotlinx.coroutines.r2 f20138h;

    /* renamed from: i, reason: collision with root package name */
    public kotlinx.coroutines.flow.j2 f20139i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    @Override // tc2.c
    public void P6() {
        in5.s0 s0Var = this.f417141d.f417149i;
        android.view.ViewGroup viewGroup = s0Var != null ? (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.f484249rk0) : null;
        this.f20135e = viewGroup;
        this.f20136f = viewGroup != null ? viewGroup.findViewById(com.tencent.mm.R.id.t8x) : null;
    }

    @Override // tc2.c
    public void Q6() {
        java.lang.CharSequence charSequence;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        java.lang.CharSequence descriptionSpan;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        this.f20139i = kotlinx.coroutines.flow.i3.a(null);
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        if (!(d2Var != null ? d2Var.f20017p : false)) {
            android.view.ViewGroup viewGroup = this.f20135e;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        android.view.ViewGroup viewGroup2 = this.f20135e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        android.view.View view = this.f20136f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingRecommendController", "onFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertShoppingRecommendController", "onFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.ViewGroup viewGroup3 = this.f20135e;
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = viewGroup3 != null ? (com.tencent.mm.ui.widget.MMNeat7extView) viewGroup3.findViewById(com.tencent.mm.R.id.rjz) : null;
        tc2.g gVar = this.f417141d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        java.lang.CharSequence charSequence2 = "";
        if (baseFinderFeed == null || (feedObject2 = baseFinderFeed.getFeedObject()) == null || (charSequence = feedObject2.getDescriptionSpan()) == null) {
            charSequence = "";
        }
        com.tencent.mm.plugin.finder.feed.ui.sq b17 = com.tencent.mm.plugin.finder.feed.ui.h2.f110102a.b(mMNeat7extView != null ? mMNeat7extView.getContext() : null, gVar.f417148h);
        if ((charSequence.length() == 0) && b17 == null) {
            if (mMNeat7extView == null) {
                return;
            }
            mMNeat7extView.setVisibility(8);
        } else if (mMNeat7extView != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar.f417148h;
            if (baseFinderFeed2 != null && (feedObject = baseFinderFeed2.getFeedObject()) != null && (descriptionSpan = feedObject.getDescriptionSpan()) != null) {
                charSequence2 = descriptionSpan;
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(charSequence2);
            if (b17 != null) {
                spannableStringBuilder.insert(0, (java.lang.CharSequence) " ");
                spannableStringBuilder.setSpan(b17, 0, 1, 17);
            }
            mMNeat7extView.b(new android.text.SpannableString(spannableStringBuilder));
            mMNeat7extView.setVisibility(0);
        }
    }

    @Override // tc2.c
    public void U6() {
        this.f20135e = null;
        kotlinx.coroutines.r2 r2Var = this.f20137g;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f20137g = null;
        kotlinx.coroutines.r2 r2Var2 = this.f20138h;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        this.f20138h = null;
        this.f20139i = null;
    }

    @Override // tc2.h
    public void onLiveStart(r45.hc1 hc1Var) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.kr0 styleInfo;
        kotlinx.coroutines.y0 y0Var;
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        boolean z17 = d2Var != null ? d2Var.f20017p : false;
        bg2.d2 d2Var2 = (bg2.d2) N6(bg2.d2.class);
        boolean z18 = d2Var2 != null ? d2Var2.f20018q : false;
        bg2.d2 d2Var3 = (bg2.d2) N6(bg2.d2.class);
        boolean z19 = d2Var3 != null ? d2Var3.f20019r : false;
        tc2.g gVar = this.f417141d;
        if (z17 || z18 || z19) {
            r45.ac2 ac2Var = new r45.ac2();
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
            ac2Var.set(1, pm0.b0.h((baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null || (styleInfo = feedObject.getStyleInfo()) == null) ? null : styleInfo.getData()));
            bg2.g2 g2Var = (bg2.g2) N6(bg2.g2.class);
            if (g2Var != null) {
                g2Var.Y6(40, ac2Var, false, new bg2.e4(this, r45.bc2.class));
            }
        }
        if (!z17 || (y0Var = gVar.f417147g) == null) {
            return;
        }
        kotlinx.coroutines.l.d(y0Var, null, null, new bg2.b4(this, null), 3, null);
    }
}
