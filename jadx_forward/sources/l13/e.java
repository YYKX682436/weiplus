package l13;

/* loaded from: classes15.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.p1713x373aa5.C15566x578e2f9b f396525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f396526e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.p1713x373aa5.C15566x578e2f9b c15566x578e2f9b, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f396525d = c15566x578e2f9b;
        this.f396526e = c1163xf1deaba4;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.p1713x373aa5.C15566x578e2f9b c15566x578e2f9b = this.f396525d;
        if (i17 != 0) {
            if (i17 == 1) {
                c15566x578e2f9b.f218894n = false;
            }
        } else if (c15566x578e2f9b.f218894n) {
            c15566x578e2f9b.f218894n = false;
        } else {
            c15566x578e2f9b.f218894n = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.p1713x373aa5.C15566x578e2f9b.m(c15566x578e2f9b, this.f396526e, l13.b.f396521f);
        }
        if (i17 != 1) {
            c15566x578e2f9b.f218895o = false;
        } else if (!c15566x578e2f9b.f218895o) {
            c15566x578e2f9b.f218895o = true;
            c15566x578e2f9b.f218897q = (c15566x578e2f9b.f218893m / c15566x578e2f9b.m8018x1c4fb41d()) * c15566x578e2f9b.m8018x1c4fb41d();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/forcenotify/ui/view/StackLayoutManager$onAttachedToWindow$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
