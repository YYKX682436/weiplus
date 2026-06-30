package sw2;

/* loaded from: classes3.dex */
public final class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f494980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f494981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 f494982f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f494983g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout.LayoutParams f494984h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout.LayoutParams f494985i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout.LayoutParams f494986m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f494987n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f494988o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f494989p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ android.view.View f494990q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ android.view.View f494991r;

    public a(android.view.View view, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 c15186x26928e14, int i18, android.widget.RelativeLayout.LayoutParams layoutParams, android.widget.RelativeLayout.LayoutParams layoutParams2, android.widget.RelativeLayout.LayoutParams layoutParams3, android.view.View view2, android.graphics.Rect rect, android.view.View view3, android.view.View view4, android.view.View view5) {
        this.f494980d = view;
        this.f494981e = i17;
        this.f494982f = c15186x26928e14;
        this.f494983g = i18;
        this.f494984h = layoutParams;
        this.f494985i = layoutParams2;
        this.f494986m = layoutParams3;
        this.f494987n = view2;
        this.f494988o = rect;
        this.f494989p = view3;
        this.f494990q = view4;
        this.f494991r = view5;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.view.View view = this.f494980d;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int height = (this.f494981e - view.getHeight()) / 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderRecordLayoutUtil", "blackHeight " + height);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15186x26928e14 c15186x26928e14 = this.f494982f;
        int h17 = i65.a.h(c15186x26928e14.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        android.view.View view2 = this.f494989p;
        android.view.View view3 = this.f494987n;
        android.widget.RelativeLayout.LayoutParams layoutParams = this.f494986m;
        android.widget.RelativeLayout.LayoutParams layoutParams2 = this.f494985i;
        android.widget.RelativeLayout.LayoutParams layoutParams3 = this.f494984h;
        if (height < h17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderRecordLayoutUtil", "blackHeight <3A");
        } else {
            int h18 = i65.a.h(c15186x26928e14.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
            int i17 = this.f494983g;
            if (height < h18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderRecordLayoutUtil", "blackHeight 3A - 6A");
                layoutParams3.bottomMargin = i65.a.h(c15186x26928e14.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                layoutParams2.bottomMargin = (height - i17) + i65.a.h(c15186x26928e14.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
                layoutParams.topMargin = height;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderRecordLayoutUtil", "blackHeight  >6A");
                int h19 = (height - i65.a.h(c15186x26928e14.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9)) - view3.getHeight();
                if (h19 - this.f494988o.top > 0) {
                    layoutParams.topMargin = h19;
                } else {
                    layoutParams.topMargin = i65.a.h(c15186x26928e14.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9) + height;
                }
                if (height - i17 >= i65.a.h(c15186x26928e14.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df)) {
                    layoutParams3.bottomMargin = i65.a.h(c15186x26928e14.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
                    layoutParams2.bottomMargin = (height - view2.getHeight()) - i17;
                } else {
                    layoutParams3.bottomMargin = i65.a.h(c15186x26928e14.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                    layoutParams2.bottomMargin = (height - i17) + i65.a.h(c15186x26928e14.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
                }
            }
        }
        view3.setLayoutParams(layoutParams);
        this.f494990q.setLayoutParams(layoutParams3);
        view2.setLayoutParams(layoutParams2);
        android.view.View view4 = this.f494991r;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/util/FinderRecordLayoutUtilKt$reLayoutPluginOnce$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/video/util/FinderRecordLayoutUtilKt$reLayoutPluginOnce$1", "onGlobalLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setFillAfter(true);
        this.f494991r.startAnimation(alphaAnimation);
    }
}
