package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveWrapContentViewPager;", "Landroidx/viewpager/widget/ViewPager;", "", "widthMeasureSpec", "heightMeasureSpec", "Ljz5/f0;", "onMeasure", "position", "reMeasureCurrentPage", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "com/tencent/mm/plugin/finder/live/view/pb", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveWrapContentViewPager */
/* loaded from: classes3.dex */
public class C14362xd06b9581 extends p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe {

    /* renamed from: Companion */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.pb f35844x233c02ec = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.pb(null);
    public static final java.lang.String TAG = "FinderLiveWrapContentViewPager";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14362xd06b9581(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe, android.view.View
    public void onMeasure(int i17, int i18) {
        jz5.f0 f0Var;
        android.view.View childAt = getChildAt(m8300xfda78ef6());
        if (childAt != null) {
            measureChild(childAt, i17, i18);
            super.onMeasure(i17, android.view.View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            super.onMeasure(i17, i18);
        }
    }

    /* renamed from: reMeasureCurrentPage */
    public void m57530x140f8efd(int i17) {
        m8316x940d026a(i17);
        requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14362xd06b9581(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
