package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B!\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013R*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFeedBubbleTipsLayout;", "Lcom/tencent/mm/plugin/finder/view/SimpleTouchableLayout;", "Lkotlin/Function0;", "Ljz5/f0;", p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2968x9376332f, "Lyz5/a;", "getTouchCallback", "()Lyz5/a;", "setTouchCallback", "(Lyz5/a;)V", "touchCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFeedBubbleTipsLayout */
/* loaded from: classes2.dex */
public class C15285xe7032952 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 {

    /* renamed from: A, reason: from kotlin metadata */
    public yz5.a touchCallback;

    /* renamed from: y, reason: collision with root package name */
    public final int[] f212607y;

    /* renamed from: z, reason: collision with root package name */
    public final int[] f212608z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15285xe7032952(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f212607y = new int[2];
        this.f212608z = new int[2];
    }

    public final android.view.View b(int i17) {
        android.view.View findViewById = findViewById(i17);
        if (findViewById != null) {
            return findViewById;
        }
        return null;
    }

    public final void c(android.view.View view, android.view.View view2, boolean z17) {
        if (view != null) {
            if (!(view.getVisibility() == 0)) {
                view = null;
            }
            if (view == null || view2 == null) {
                return;
            }
            int[] iArr = this.f212607y;
            view2.getLocationInWindow(iArr);
            int[] iArr2 = this.f212608z;
            getLocationInWindow(iArr2);
            int i17 = iArr[1] - iArr2[1];
            int measuredWidth = iArr[0] + (view2.getMeasuredWidth() / 2);
            int measuredWidth2 = measuredWidth - (view.getMeasuredWidth() / 2);
            int measuredWidth3 = measuredWidth + (view.getMeasuredWidth() / 2);
            if (i17 > 0) {
                if (z17) {
                    view.layout(measuredWidth2, i17 - view.getHeight(), measuredWidth3, i17);
                } else {
                    view.layout(view.getLeft(), i17 - view.getHeight(), view.getRight(), i17);
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        yz5.a aVar = this.touchCallback;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final yz5.a getTouchCallback() {
        return this.touchCallback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r3 != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if ((r7.getVisibility() == 0) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0087, code lost:
    
        if ((r0.getVisibility() == 0) != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
    
        if ((r0.getVisibility() == 0) != false) goto L59;
     */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View child) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        super.onViewRemoved(child);
        if (android.os.Looper.getMainLooper().getThread().getId() != java.lang.Thread.currentThread().getId()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FeedBubbleTipsLayout", "[onViewRemoved] in other thread. child=" + child + ' ' + lj.f.c() + ' ');
            return;
        }
        if (isInLayout()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FeedBubbleTipsLayout", "[onViewRemoved] isInLayout child=" + child + ' ' + lj.f.c() + ' ');
        }
    }

    /* renamed from: setTouchCallback */
    public final void m62061x73ebd762(yz5.a aVar) {
        this.touchCallback = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15285xe7032952(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f212607y = new int[2];
        this.f212608z = new int[2];
    }
}
