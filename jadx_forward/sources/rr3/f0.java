package rr3;

/* loaded from: classes4.dex */
public final class f0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.p1962x2ddda8.ActivityC16887xd4079ac4 f480718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f480719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f480720f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.ProgressBar f480721g;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.p1961xba7262a1.p1962x2ddda8.ActivityC16887xd4079ac4 activityC16887xd4079ac4, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, android.widget.TextView textView, android.widget.ProgressBar progressBar) {
        this.f480718d = activityC16887xd4079ac4;
        this.f480719e = c1163xf1deaba4;
        this.f480720f = textView;
        this.f480721g = progressBar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        ym3.p pVar = ((ym3.o) obj).f544710a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = this.f480718d.f235728e;
        if (c16718x7059cefe == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveList");
            throw null;
        }
        java.util.ArrayList arrayList = c16718x7059cefe.f233598o;
        boolean z17 = true;
        if (!arrayList.isEmpty() && ((rr3.d) arrayList.get(0)).f480715e != 1) {
            z17 = false;
        }
        ym3.p pVar2 = ym3.p.f544714f;
        rr3.d0 d0Var = rr3.b0.f480710a;
        rr3.d0 d0Var2 = rr3.a0.f480705a;
        rr3.d0 d0Var3 = rr3.c0.f480713a;
        rr3.d0 d0Var4 = (pVar == pVar2 && z17) ? d0Var3 : ((pVar == ym3.p.f544713e || pVar == ym3.p.f544712d) && z17) ? d0Var : d0Var2;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView = this.f480719e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(recyclerView, "$recyclerView");
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d0Var4, d0Var2) ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(recyclerView, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        recyclerView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(recyclerView, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView noDataTips = this.f480720f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(noDataTips, "$noDataTips");
        int i18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d0Var4, d0Var3) ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(noDataTips, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        noDataTips.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(noDataTips, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ProgressBar initialProgressBar = this.f480721g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(initialProgressBar, "$initialProgressBar");
        int i19 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d0Var4, d0Var) ? 0 : 8;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(initialProgressBar, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        initialProgressBar.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(initialProgressBar, "com/tencent/mm/plugin/profile/ui/newbizinfo/auth/NewBizInfoRecordingUI$onCreate$3", "onChanged", "(Lcom/tencent/mm/plugin/mvvmlist/datasource/MvvmListLoadData;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
