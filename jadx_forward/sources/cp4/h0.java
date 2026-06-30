package cp4;

/* loaded from: classes8.dex */
public final class h0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final int f302558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp4.g1 f302559e;

    public h0(cp4.g1 g1Var, int i17) {
        this.f302559e = g1Var;
        this.f302558d = i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        cp4.g1 g1Var = this.f302559e;
        if (i17 != 0) {
            if (i17 == 1) {
                g1Var.I = true;
                yz5.a m122410x53d8d605 = g1Var.m122410x53d8d605();
                if (m122410x53d8d605 != null) {
                    m122410x53d8d605.mo152xb9724478();
                }
            }
        } else if (g1Var.I) {
            java.util.List list = g1Var.A;
            int i18 = this.f302558d;
            long j17 = ((r45.is) ((cp4.k0) list.get(i18)).f302576f.get(((java.lang.Number) g1Var.H.get(i18)).intValue())).f458831e;
            yz5.l m122411x91d90eb1 = g1Var.m122411x91d90eb1();
            if (m122411x91d90eb1 != null) {
                if (j17 >= 2147483637) {
                    j17 = 0;
                }
                m122411x91d90eb1.mo146xb9724478(java.lang.Long.valueOf(j17));
            }
            g1Var.I = false;
            cp4.g1.g(g1Var, i18);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        java.util.List m122391x2042629e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        cp4.g1 g1Var = this.f302559e;
        if (!g1Var.I) {
            yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        java.util.List list = g1Var.H;
        int i19 = this.f302558d;
        int intValue = ((java.lang.Number) list.get(i19)).intValue();
        m122391x2042629e = g1Var.m122391x2042629e();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) m122391x2042629e.get(i19)).getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
        int w17 = (c1162x665295de.w() + c1162x665295de.y()) / 2;
        java.util.List list2 = g1Var.A;
        if (w17 == ((cp4.k0) list2.get(i19)).f302577g) {
            yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            return;
        }
        int i27 = w17 - 1;
        int i28 = w17 + 1;
        if (i27 <= i28) {
            while (true) {
                if (!cp4.g1.f(g1Var, i19, c1162x665295de.mo7935xa188593e(i27))) {
                    if (i27 == i28) {
                        break;
                    } else {
                        i27++;
                    }
                } else {
                    list.set(i19, java.lang.Integer.valueOf(i27));
                    ((cp4.k0) list2.get(i19)).f302577g = ((java.lang.Number) list.get(i19)).intValue();
                    ((cp4.k0) list2.get(i19)).y(c1162x665295de.mo7935xa188593e(intValue));
                    ((cp4.k0) list2.get(i19)).x(c1162x665295de.mo7935xa188593e(((java.lang.Number) list.get(i19)).intValue()), null);
                    java.util.Objects.toString(list);
                    break;
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/caption/EditorTextCaptionView$CaptionScrollListener", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
