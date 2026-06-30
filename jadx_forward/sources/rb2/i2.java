package rb2;

/* loaded from: classes2.dex */
public final class i2 implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f475184b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475185c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475186d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f475187e;

    public i2(so2.y0 y0Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3) {
        this.f475183a = y0Var;
        this.f475184b = viewGroup;
        this.f475185c = view;
        this.f475186d = view2;
        this.f475187e = view3;
    }

    @Override // sr.b
    public void a(int i17) {
        so2.y0 y0Var = this.f475183a;
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = y0Var.f492247r;
        boolean z17 = interfaceC4987x84e327cb != null && interfaceC4987x84e327cb.E0();
        android.view.ViewGroup viewGroup = this.f475184b;
        if (z17 || i17 == 1) {
            viewGroup.setVisibility(8);
            return;
        }
        if (i17 == 0) {
            viewGroup.setVisibility(0);
            android.view.View view = this.f475185c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f475186d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f475187e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = pm0.v.u(y0Var.f492236d.t0());
            objArr[1] = java.lang.Integer.valueOf(i17);
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb2 = y0Var.f492247r;
            java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb2 != null ? interfaceC4987x84e327cb2.mo42933xb5885648() : null;
            objArr[2] = mo42933xb5885648 != null ? mo42933xb5885648 : "";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", "commendId %s emojiStatus %d md5 %s", objArr);
            return;
        }
        if (i17 != -1) {
            com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb3 = y0Var.f492247r;
            if ((interfaceC4987x84e327cb3 == null || interfaceC4987x84e327cb3.E0()) ? false : true) {
                java.lang.Object[] objArr2 = new java.lang.Object[3];
                objArr2[0] = pm0.v.u(y0Var.f492236d.t0());
                objArr2[1] = java.lang.Integer.valueOf(i17);
                com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb4 = y0Var.f492247r;
                java.lang.String mo42933xb58856482 = interfaceC4987x84e327cb4 != null ? interfaceC4987x84e327cb4.mo42933xb5885648() : null;
                objArr2[2] = mo42933xb58856482 != null ? mo42933xb58856482 : "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", "commendId %s emojiStatus %d md5 %s not Exist", objArr2);
                return;
            }
            return;
        }
        viewGroup.setVisibility(0);
        android.view.View view4 = this.f475185c;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f475186d;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view6 = this.f475187e;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$2", "onStatus", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Object[] objArr3 = new java.lang.Object[3];
        objArr3[0] = pm0.v.u(y0Var.f492236d.t0());
        objArr3[1] = java.lang.Integer.valueOf(i17);
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb5 = y0Var.f492247r;
        java.lang.String mo42933xb58856483 = interfaceC4987x84e327cb5 != null ? interfaceC4987x84e327cb5.mo42933xb5885648() : null;
        objArr3[2] = mo42933xb58856483 != null ? mo42933xb58856483 : "";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", "commendId %s emojiStatus %d md5 %s", objArr3);
    }
}
