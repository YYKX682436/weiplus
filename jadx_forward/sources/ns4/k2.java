package ns4;

/* loaded from: classes8.dex */
public final class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de f421108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.kj5 f421109e;

    public k2(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de, r45.kj5 kj5Var) {
        this.f421108d = activityC19067xb53aa1de;
        this.f421109e = kj5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        r45.gs2 gs2Var;
        r45.gs2 gs2Var2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateClickButtonEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19067xb53aa1de activityC19067xb53aa1de = this.f421108d;
        ms4.t tVar = activityC19067xb53aa1de.f260709s;
        if (tVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        tVar.R6(2);
        r45.kj5 kj5Var = this.f421109e;
        if (kj5Var == null || kj5Var.f460299i != 1) {
            activityC19067xb53aa1de.V6();
            yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateClickButtonEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ms4.t tVar2 = activityC19067xb53aa1de.f260709s;
        if (tVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        tVar2.R6(11);
        ms4.t tVar3 = activityC19067xb53aa1de.f260709s;
        if (tVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        r45.v11 v11Var = tVar3.f412655t;
        int m75939xb282bd08 = (v11Var == null || (gs2Var2 = (r45.gs2) v11Var.m75936x14adae67(5)) == null) ? 0 : gs2Var2.m75939xb282bd08(6);
        if (m75939xb282bd08 == 2) {
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activityC19067xb53aa1de), null, null, new ns4.j2(activityC19067xb53aa1de, null), 3, null);
        } else if (m75939xb282bd08 == 1) {
            ms4.t tVar4 = activityC19067xb53aa1de.f260709s;
            if (tVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
            r45.v11 v11Var2 = tVar4.f412655t;
            if (v11Var2 == null || (gs2Var = (r45.gs2) v11Var2.m75936x14adae67(5)) == null || (str = gs2Var.m75945x2fec8307(7)) == null) {
                str = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeCoinIncomeDetailView", "#openRealNameNewAuth, verifyUrl:".concat(str));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("open_custom_style_url", true);
            intent.putExtra("forceHideShare", true);
            intent.putExtra("show_native_web_view", true);
            intent.putExtra("rawUrl", str);
            intent.putExtra("screen_orientation", 1);
            j45.l.n(activityC19067xb53aa1de, "webview", ".ui.tools.WebViewUI", intent, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54057xa587db98);
        } else {
            java.util.Objects.toString(kj5Var);
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(activityC19067xb53aa1de), null, null, new ns4.e2(activityC19067xb53aa1de, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinIncomeDetailView$updateClickButtonEvent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
