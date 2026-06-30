package com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/media/view/ShrinkParentLayout;", "Landroid/widget/RelativeLayout;", "", "getShrinkDetail", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.media.view.ShrinkParentLayout */
/* loaded from: classes12.dex */
public final class C16499xc885d93d extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f230113d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16499xc885d93d(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: getShrinkDetail */
    private final java.lang.String m66611x24397230() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int childCount = getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = getChildAt(i18);
            i17 += childAt.getMeasuredWidth();
            int id6 = childAt.getId();
            if (id6 != -1) {
                try {
                    str = getResources().getResourceEntryName(id6);
                } catch (android.content.res.Resources.NotFoundException unused) {
                    str = "no_name";
                }
            } else {
                str = "no_id";
            }
            sb6.append(childAt.getMeasuredWidth() + " (" + str + ')');
            if (i18 != getChildCount() - 1) {
                sb6.append(" + ");
            }
        }
        sb6.append(" = " + i17);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    public final void a() {
        java.util.List list = this.f230113d;
        ((java.util.ArrayList) list).clear();
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16498xbbb303ca) {
                ((java.util.ArrayList) list).add(childAt);
            }
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new kg3.q());
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        java.lang.String str;
        measureChildren(i17, i18);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f230113d;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16498xbbb303ca) it.next()).mo66607x2278ca17(false);
        }
        int size = android.view.View.MeasureSpec.getSize(i17);
        int childCount = getChildCount();
        int i19 = 0;
        for (int i27 = 0; i27 < childCount; i27++) {
            android.view.View childAt = getChildAt(i27);
            measureChild(childAt, i17, i18);
            i19 += childAt.getMeasuredWidth();
        }
        m66611x24397230();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16498xbbb303ca c16498xbbb303ca = (com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.C16498xbbb303ca) it6.next();
            while (!c16498xbbb303ca.getF230108f() && i19 >= size) {
                java.util.Iterator it7 = ((java.util.ArrayList) c16498xbbb303ca.f230110x).iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    kg3.e eVar = (kg3.e) it7.next();
                    c16498xbbb303ca.getResources().getResourceEntryName(eVar.getViewId());
                    if (!eVar.getF230108f()) {
                        eVar.mo66607x2278ca17(true);
                        break;
                    }
                }
                measureChild(c16498xbbb303ca, i17, i18);
                int childCount2 = getChildCount();
                i19 = 0;
                for (int i28 = 0; i28 < childCount2; i28++) {
                    android.view.View childAt2 = getChildAt(i28);
                    measureChild(childAt2, i17, i18);
                    i19 += childAt2.getMeasuredWidth();
                }
                if (c16498xbbb303ca.getId() != -1) {
                    try {
                        str = c16498xbbb303ca.getResources().getResourceEntryName(c16498xbbb303ca.getId());
                    } catch (android.content.res.Resources.NotFoundException unused) {
                        str = "no_name";
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                }
                m66611x24397230();
            }
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View child) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        super.onViewAdded(child);
        a();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View child) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        super.onViewRemoved(child);
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16499xc885d93d(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f230113d = new java.util.ArrayList();
    }
}
