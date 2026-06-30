package hd2;

/* loaded from: classes10.dex */
public final class t implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f362063a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f362064b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f362065c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f362066d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 f362067e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f362068f;

    public t(android.view.ViewGroup viewGroup, so2.y0 y0Var, android.view.View view, android.view.View view2, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665, android.widget.ImageView imageView) {
        this.f362063a = viewGroup;
        this.f362064b = y0Var;
        this.f362065c = view;
        this.f362066d = view2;
        this.f362067e = c15276x168ec665;
        this.f362068f = imageView;
    }

    @Override // sr.b
    public void a(int i17) {
        android.view.ViewGroup viewGroup = this.f362063a;
        so2.y0 y0Var = this.f362064b;
        if (i17 == 1) {
            viewGroup.setVisibility(8);
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = y0Var.f492247r;
            if (interfaceC4987x84e327cb != null) {
                com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5 w5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.w5.class);
                hd2.s sVar = new hd2.s(this.f362067e, this.f362068f);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.m0) w5Var).getClass();
                zq.h.f556505a.c((com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4) interfaceC4987x84e327cb, sVar);
                return;
            }
            return;
        }
        if (i17 != 0 && i17 != -1) {
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = y0Var.f492247r;
            if ((interfaceC4987x84e327cb2 == null || interfaceC4987x84e327cb2.E0()) ? false : true) {
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = pm0.v.u(y0Var.f492236d.t0());
                objArr[1] = java.lang.Integer.valueOf(i17);
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb3 = y0Var.f492247r;
                java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb3 != null ? interfaceC4987x84e327cb3.mo42933xb5885648() : null;
                objArr[2] = mo42933xb5885648 != null ? mo42933xb5885648 : "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentShareDialogFragment", "commendId %s emojiStatus %d md5 %s not Exist", objArr);
                return;
            }
            return;
        }
        viewGroup.setVisibility(0);
        android.view.View view = this.f362065c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$setCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$setCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f362066d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$setCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderCommentShareDialogFragment$setCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = pm0.v.u(y0Var.f492236d.t0());
        objArr2[1] = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb4 = y0Var.f492247r;
        java.lang.String mo42933xb58856482 = interfaceC4987x84e327cb4 != null ? interfaceC4987x84e327cb4.mo42933xb5885648() : null;
        objArr2[2] = mo42933xb58856482 != null ? mo42933xb58856482 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommentShareDialogFragment", "commendId %s emojiStatus %d md5 %s", objArr2);
    }
}
