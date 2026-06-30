package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010!J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012\"\u0004\b\u0018\u0010\u0014¨\u0006\""}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderMultiPhotoLayout;", "Landroid/view/ViewGroup;", "", "getMultiThumbDisplaySize", "", "Landroid/view/View;", "getChildList", "", "h", "Z", "getAddMode", "()Z", "setAddMode", "(Z)V", "addMode", "i", "I", "getThumbDisplaySize", "()I", "setThumbDisplaySize", "(I)V", "thumbDisplaySize", "o", "getMULTI_THUMB_MAX_SIZE", "setMULTI_THUMB_MAX_SIZE", "MULTI_THUMB_MAX_SIZE", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderMultiPhotoLayout */
/* loaded from: classes3.dex */
public final class C15327x51a31969 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f212853d;

    /* renamed from: e, reason: collision with root package name */
    public final int f212854e;

    /* renamed from: f, reason: collision with root package name */
    public final int f212855f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f212856g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean addMode;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public int thumbDisplaySize;

    /* renamed from: m, reason: collision with root package name */
    public final int f212859m;

    /* renamed from: n, reason: collision with root package name */
    public final int f212860n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public int MULTI_THUMB_MAX_SIZE;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15327x51a31969(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212854e = i65.a.b(getContext(), 3);
        this.f212855f = m62269x3a2b29d0();
        this.f212856g = new java.util.ArrayList();
        this.f212859m = 150;
        this.f212860n = 37;
        this.MULTI_THUMB_MAX_SIZE = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 130.0f);
        this.f212855f = m62269x3a2b29d0();
    }

    /* renamed from: getMultiThumbDisplaySize */
    private final int m62269x3a2b29d0() {
        int i17;
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i18 = a17.f278668a;
        if (!z17 && i18 > (i17 = a17.f278669b)) {
            i18 = i17;
        }
        int b17 = ((i18 - i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f212860n)) / 3) - this.f212854e;
        this.thumbDisplaySize = b17;
        int i19 = this.MULTI_THUMB_MAX_SIZE;
        if (b17 > i19) {
            b17 = i19;
        } else if (b17 <= 10) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveMultiPhotoLayout", "can not get multiThumbDisplaySize or the multiThumbDisplaySize < 10");
            b17 = this.f212859m;
        }
        this.thumbDisplaySize = b17;
        return b17;
    }

    public final void a(int i17, int i18, int i19) {
        int i27 = this.f212854e;
        int i28 = this.f212855f;
        int i29 = i27 + i28;
        int i37 = i19 + i18;
        int i38 = 0;
        while (i18 < i37) {
            int i39 = i38 + 1;
            int i47 = i38 * i29;
            int i48 = i29 * i17;
            getChildAt(i18).layout(i47, i48, i47 + i28, i48 + i28);
            i18++;
            i38 = i39;
        }
    }

    public final void b(int i17) {
        java.util.ArrayList arrayList;
        this.f212853d = i17;
        while (true) {
            int i18 = this.f212853d;
            int childCount = getChildCount();
            arrayList = this.f212856g;
            if (i18 <= childCount) {
                break;
            }
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            frameLayout.setBackgroundColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77702x3cb0748));
            com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = new com.p314xaae8f345.mm.ui.C21405x85fc1ce0(getContext());
            c21405x85fc1ce0.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            frameLayout.addView(c21405x85fc1ce0);
            arrayList.add(c21405x85fc1ce0);
            int i19 = this.f212855f;
            addView(frameLayout, i19, i19);
        }
        while (this.f212853d < getChildCount()) {
            int childCount2 = getChildCount() - 1;
            removeViewAt(childCount2);
            arrayList.remove(childCount2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMultiPhotoLayout", "updateMediaList media size:" + i17 + " child count:" + getChildCount());
    }

    public final boolean getAddMode() {
        return this.addMode;
    }

    /* renamed from: getChildList */
    public final java.util.List<android.view.View> m62271xf9bd9d24() {
        return this.f212856g;
    }

    public final int getMULTI_THUMB_MAX_SIZE() {
        return this.MULTI_THUMB_MAX_SIZE;
    }

    public final int getThumbDisplaySize() {
        return this.thumbDisplaySize;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        if (this.addMode) {
            int childCount = getChildCount();
            if (childCount >= 0 && childCount < 4) {
                a(0, 0, getChildCount());
                return;
            }
            if (4 <= childCount && childCount < 7) {
                a(0, 0, 3);
                a(1, 3, getChildCount() - 3);
                return;
            } else {
                a(0, 0, 3);
                a(1, 3, 3);
                a(2, 6, getChildCount() - 6);
                return;
            }
        }
        int childCount2 = getChildCount();
        if (childCount2 >= 0 && childCount2 < 4) {
            a(0, 0, getChildCount());
            return;
        }
        if (childCount2 == 4) {
            a(0, 0, 2);
            a(1, 2, 2);
            return;
        }
        if (5 <= childCount2 && childCount2 < 7) {
            a(0, 0, 3);
            a(1, 3, getChildCount() - 3);
            return;
        }
        if (7 <= childCount2 && childCount2 < 10) {
            a(0, 0, 3);
            a(1, 3, 3);
            a(2, 6, getChildCount() - 6);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = getChildAt(i19);
            measureChild(childAt, 1073741824, 1073741824);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMultiPhotoLayout", "measure child size:" + childAt.getMeasuredWidth() + ' ' + childAt.getMeasuredHeight());
        }
        int childCount2 = (getChildCount() / 3) + (getChildCount() % 3 > 0 ? 1 : 0);
        int i27 = this.f212855f;
        int i28 = this.f212854e;
        int i29 = childCount2 * (i27 + i28);
        if (i29 > 0) {
            i29 -= i28;
        }
        setMeasuredDimension(i17, i29);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMultiPhotoLayout", "measure parent size:" + getMeasuredWidth() + ' ' + getMeasuredHeight());
    }

    /* renamed from: setAddMode */
    public final void m62274x6cc57722(boolean z17) {
        this.addMode = z17;
    }

    /* renamed from: setMULTI_THUMB_MAX_SIZE */
    public final void m62275x611fe9cd(int i17) {
        this.MULTI_THUMB_MAX_SIZE = i17;
    }

    /* renamed from: setThumbDisplaySize */
    public final void m62276x86d0ccaf(int i17) {
        this.thumbDisplaySize = i17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15327x51a31969(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212854e = i65.a.b(getContext(), 3);
        this.f212855f = m62269x3a2b29d0();
        this.f212856g = new java.util.ArrayList();
        this.f212859m = 150;
        this.f212860n = 37;
        this.MULTI_THUMB_MAX_SIZE = ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 130.0f);
        this.f212855f = m62269x3a2b29d0();
    }
}
