package pd4;

/* loaded from: classes4.dex */
public final class b extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public int f435094d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f435095e;

    /* renamed from: f, reason: collision with root package name */
    public final int f435096f;

    /* renamed from: g, reason: collision with root package name */
    public final int f435097g;

    /* renamed from: h, reason: collision with root package name */
    public final int f435098h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f435099i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f435095e = new android.graphics.drawable.ColorDrawable(i65.a.d(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f560025d));
        int b17 = i65.a.b(context, 1);
        this.f435096f = b17;
        this.f435097g = i65.a.b(context, 3);
        this.f435098h = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.nj();
        this.f435099i = new java.util.ArrayList();
        setPadding(b17, b17, b17, b17);
    }

    public final void a(int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lineLayout", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        int i27 = this.f435097g;
        int i28 = this.f435098h;
        int i29 = i27 + i28;
        int i37 = i19 + i18;
        int i38 = 0;
        while (i18 < i37) {
            android.view.View childAt = getChildAt(i18);
            int i39 = i38 + 1;
            int i47 = this.f435096f;
            int i48 = (i38 * i29) + i47;
            int i49 = (i29 * i17) + i47;
            childAt.layout(i48, i49, i48 + i28, i49 + i28);
            i18++;
            i38 = i39;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lineLayout", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
    }

    public final void b(int i17) {
        java.util.ArrayList arrayList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateMediaList", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        this.f435094d = i17;
        while (true) {
            int i18 = this.f435094d;
            int childCount = getChildCount();
            arrayList = this.f435099i;
            if (i18 <= childCount) {
                break;
            }
            nd4.e eVar = nd4.e.f418009a;
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e c17973x67e3e70e = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e) eVar.a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e.class, context);
            c17973x67e3e70e.m70599xcb16a3ea().m81429xebd28962(al5.q2.CENTER_CROP);
            c17973x67e3e70e.m70599xcb16a3ea().mo46895x706225d7(this.f435095e);
            android.view.View m70600xf31bd94f = c17973x67e3e70e.m70600xf31bd94f();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(m70600xf31bd94f, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/item/improve/view/ImproveMultiPhotoLayout", "updateMediaList", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m70600xf31bd94f.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            boolean z17 = false;
            yj0.a.f(m70600xf31bd94f, "com/tencent/mm/plugin/sns/ui/item/improve/view/ImproveMultiPhotoLayout", "updateMediaList", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (pc4.d.f434943a.x()) {
                float b17 = i65.a.b(c17973x67e3e70e.getContext(), 1);
                boolean z18 = (12 & 4) != 0;
                if ((12 & 8) != 0) {
                    z17 = true;
                }
                c17973x67e3e70e.setOutlineProvider(new zl5.a(z18, z17, b17));
                c17973x67e3e70e.setClipToOutline(true);
            }
            arrayList.add(c17973x67e3e70e);
            int i19 = this.f435098h;
            addView(c17973x67e3e70e, i19, i19);
        }
        while (this.f435094d < getChildCount()) {
            int childCount2 = getChildCount() - 1;
            removeViewAt(childCount2);
            java.lang.Object remove = arrayList.remove(childCount2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove, "removeAt(...)");
            nd4.e.f418009a.b((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17973x67e3e70e) remove);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveMultiPhotoLayout", "updateMediaList media size:" + i17 + " child count:" + getChildCount());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateMediaList", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
    }

    /* renamed from: getChildList */
    public final java.util.List<android.view.View> m158270xf9bd9d24() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getChildList", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        java.util.ArrayList arrayList = this.f435099i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getChildList", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        return arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        int childCount = getChildCount();
        if (childCount >= 0 && childCount < 4) {
            a(0, 0, getChildCount());
        } else if (childCount == 4) {
            a(0, 0, 2);
            a(1, 2, 2);
        } else {
            if (5 <= childCount && childCount < 7) {
                a(0, 0, 3);
                a(1, 3, getChildCount() - 3);
            } else {
                if (7 <= childCount && childCount < 10) {
                    a(0, 0, 3);
                    a(1, 3, 3);
                    a(2, 6, getChildCount() - 6);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
        super.onMeasure(i17, i18);
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt = getChildAt(i19);
            measureChild(childAt, 1073741824, 1073741824);
            childAt.getMeasuredWidth();
            childAt.getMeasuredHeight();
        }
        setMeasuredDimension(i17, (((getChildCount() / 3) + (getChildCount() % 3 > 0 ? 1 : 0)) * (this.f435098h + this.f435097g)) + (this.f435096f * 2));
        getMeasuredWidth();
        getMeasuredHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.item.improve.view.ImproveMultiPhotoLayout");
    }
}
