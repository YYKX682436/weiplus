package com.p314xaae8f345.mm.p2776x373aa5;

/* loaded from: classes10.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ym5.s3 f295119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f295120e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ym5.s3 s3Var, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00) {
        super(0);
        this.f295119d = s3Var;
        this.f295120e = c22801x87cbdc00;
    }

    public static final int a(com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, ym5.s3 s3Var) {
        int[] iArr = new int[2];
        android.view.View view = c22801x87cbdc00.f294968x;
        if (view == null) {
            return 0;
        }
        view.getLocationInWindow(iArr);
        int i17 = iArr[1];
        boolean z17 = s3Var.f545058j;
        android.graphics.Rect rect = new android.graphics.Rect();
        return c22801x87cbdc00.getGlobalVisibleRect(rect) ? rect.bottom - i17 : (int) (c22801x87cbdc00.getTranslationY() - (-c22801x87cbdc00.A));
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View findViewById;
        android.widget.TextView textView;
        jz5.f0 f0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onFinishRefresh2] reason=");
        ym5.s3 s3Var = this.f295119d;
        sb6.append(s3Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RLMoreLayout", sb6.toString());
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = this.f295120e;
        c22801x87cbdc00.m82703x9365929(false);
        ym5.m4 m4Var = new ym5.m4(c22801x87cbdc00, s3Var);
        int i17 = s3Var.f545056h;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (i17 <= 0) {
            boolean z17 = true;
            s3Var.f545057i = a(c22801x87cbdc00, s3Var) > 0;
            java.lang.CharSequence charSequence = s3Var.f545051c;
            if (charSequence != null && charSequence.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                c22801x87cbdc00.isHasTopMore = false;
                android.view.View view = c22801x87cbdc00.refreshHeader;
                if (view != null && (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.lr6)) != null) {
                    java.lang.CharSequence charSequence2 = s3Var.f545051c;
                    if (charSequence2 != null) {
                        textView.setVisibility(0);
                        textView.setText(charSequence2);
                        f0Var = f0Var2;
                    } else {
                        f0Var = null;
                    }
                    if (f0Var == null) {
                        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.huw);
                    }
                }
                android.view.View view2 = c22801x87cbdc00.refreshHeader;
                if (view2 != null && (findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.m6l)) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout", "noRefreshMore", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(findViewById, "com/tencent/mm/view/RefreshLoadMoreLayout", "noRefreshMore", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            ym5.q3 actionCallback = c22801x87cbdc00.getActionCallback();
            if (actionCallback != null) {
                actionCallback.e(s3Var);
            }
            ym5.q3 reportCallback = c22801x87cbdc00.getReportCallback();
            if (reportCallback != null) {
                reportCallback.e(s3Var);
            }
        } else if (s3Var.f545055g) {
            c22801x87cbdc00.s(new ym5.l4(m4Var, c22801x87cbdc00, s3Var));
        } else {
            m4Var.mo152xb9724478();
            ym5.q3 actionCallback2 = c22801x87cbdc00.getActionCallback();
            if (actionCallback2 != null) {
                actionCallback2.e(s3Var);
            }
            ym5.q3 reportCallback2 = c22801x87cbdc00.getReportCallback();
            if (reportCallback2 != null) {
                reportCallback2.e(s3Var);
            }
        }
        c22801x87cbdc00.Q = false;
        com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00.StickTopLoadingLayout stickTopLoadingLayout = c22801x87cbdc00.getStickTopLoadingLayout();
        if (stickTopLoadingLayout != null) {
            stickTopLoadingLayout.f294976f = false;
            stickTopLoadingLayout.b();
            ym5.q3 q3Var = stickTopLoadingLayout.actionCallback;
            if (q3Var != null) {
                q3Var.e(s3Var);
            }
        }
        return f0Var2;
    }
}
