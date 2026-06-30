package tc5;

/* loaded from: classes10.dex */
public final class w extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 f499111d;

    public w(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3) {
        this.f499111d = activityC21814x1938a8b3;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        int u07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/MsgHistoryGalleryUI$timelineRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3 = this.f499111d;
        activityC21814x1938a8b3.F = i17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.h7(activityC21814x1938a8b3);
        boolean z17 = i17 != 0;
        xm3.t0 b17 = xm3.u0.b(activityC21814x1938a8b3.m7());
        if (b17 != null) {
            int mo1894x7e414b06 = b17.mo1894x7e414b06();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            int childCount = activityC21814x1938a8b3.m7().getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = activityC21814x1938a8b3.m7().getChildAt(i18);
                if (childAt != null && (u07 = activityC21814x1938a8b3.m7().u0(childAt)) != -1 && u07 < mo1894x7e414b06) {
                    int mo863xcdaf1228 = b17.mo863xcdaf1228(u07);
                    if (!linkedHashSet.contains(java.lang.Integer.valueOf(mo863xcdaf1228))) {
                        linkedHashSet.add(java.lang.Integer.valueOf(mo863xcdaf1228));
                        in5.r w07 = b17.w0(mo863xcdaf1228);
                        uc5.n nVar = w07 instanceof uc5.n ? (uc5.n) w07 : null;
                        if (nVar != null) {
                            nVar.f508067m = z17;
                        }
                    }
                }
            }
        }
        int[] iArr = activityC21814x1938a8b3.M;
        if (i17 == 0) {
            int length = iArr.length;
            for (int i19 = 0; i19 < length; i19++) {
                iArr[i19] = 0;
            }
            activityC21814x1938a8b3.N = 0;
            activityC21814x1938a8b3.E = 0;
            if (activityC21814x1938a8b3.P) {
                activityC21814x1938a8b3.P = false;
                activityC21814x1938a8b3.x7(false);
                ed5.t tVar = activityC21814x1938a8b3.I;
                if (tVar != null) {
                    tVar.f332919f = true;
                }
                recyclerView.D0();
                activityC21814x1938a8b3.z7();
            }
        } else if (i17 == 1) {
            int length2 = iArr.length;
            for (int i27 = 0; i27 < length2; i27++) {
                iArr[i27] = 0;
            }
            activityC21814x1938a8b3.N = 0;
            activityC21814x1938a8b3.E = 0;
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/MsgHistoryGalleryUI$timelineRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17, int i18) {
        int height;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/MsgHistoryGalleryUI$timelineRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3 = this.f499111d;
        int[] iArr = activityC21814x1938a8b3.M;
        int i19 = activityC21814x1938a8b3.N;
        iArr[i19] = i18;
        activityC21814x1938a8b3.N = (i19 + 1) % 3;
        activityC21814x1938a8b3.getClass();
        if (recyclerView.mo7958x54496c8e() == 2 && (height = recyclerView.getHeight()) > 0) {
            int i27 = 0;
            for (int i28 : activityC21814x1938a8b3.M) {
                i27 += java.lang.Math.abs(i28);
            }
            boolean z17 = i27 / 3 >= ((int) (((float) height) * 0.25f));
            if (z17 && !activityC21814x1938a8b3.P) {
                activityC21814x1938a8b3.P = true;
                activityC21814x1938a8b3.x7(true);
                ed5.t tVar = activityC21814x1938a8b3.I;
                if (tVar != null) {
                    tVar.f332919f = false;
                }
                recyclerView.D0();
            } else if (!z17 && activityC21814x1938a8b3.P) {
                activityC21814x1938a8b3.P = false;
                activityC21814x1938a8b3.x7(false);
                ed5.t tVar2 = activityC21814x1938a8b3.I;
                if (tVar2 != null) {
                    tVar2.f332919f = true;
                }
                recyclerView.D0();
                activityC21814x1938a8b3.z7();
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3.h7(activityC21814x1938a8b3);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/MsgHistoryGalleryUI$timelineRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
