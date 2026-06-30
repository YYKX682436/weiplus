package com.tencent.mm.plugin.account.ui;

/* loaded from: classes13.dex */
public final class k3 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.account.ui.g3 f73973f = new com.tencent.mm.plugin.account.ui.g3(null);

    /* renamed from: g, reason: collision with root package name */
    public static java.lang.String f73974g = "";

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f73975d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f73976e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f73975d = jz5.h.b(new com.tencent.mm.plugin.account.ui.h3(this));
        this.f73976e = jz5.h.b(new com.tencent.mm.plugin.account.ui.i3(this));
    }

    public final void O6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "disableAgreeSyncMsgLL");
        R6().setClickable(false);
        Q6().setClickable(false);
    }

    public final void P6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "enableAgreeSyncMsgLL");
        R6().setClickable(true);
        Q6().setClickable(true);
    }

    public final android.widget.CheckBox Q6() {
        java.lang.Object value = ((jz5.n) this.f73975d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.CheckBox) value;
    }

    public final com.tencent.mm.ui.widget.CheckBoxTextLayout R6() {
        java.lang.Object value = ((jz5.n) this.f73976e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.ui.widget.CheckBoxTextLayout) value;
    }

    public final int S6() {
        try {
            return ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Di() ? 1 : 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LoginAgreeSyncMsgUIC", e17, "getHasSyncChatSelect failed: " + e17.getMessage(), new java.lang.Object[0]);
            return 0;
        }
    }

    public final void T6() {
        com.tencent.mm.ui.widget.CheckBoxTextLayout R6 = R6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(R6, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(intValue));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(R6, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/LoginAgreeSyncMsgUIC", "hideAgreeSyncMsgLLAndDisableSync", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(R6, "com/tencent/mm/plugin/account/ui/LoginAgreeSyncMsgUIC", "hideAgreeSyncMsgLLAndDisableSync", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(R6, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Ni(((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Di() ? 2 : 0);
    }

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "onNext [" + getActivity().getClass().getSimpleName() + "] checked: " + Q6().isChecked() + ", isAgreeSyncEnabled: " + ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Di());
        try {
            jz5.l[] lVarArr = new jz5.l[4];
            com.tencent.mm.plugin.account.ui.g3 g3Var = f73973f;
            lVarArr[0] = new jz5.l(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, g3Var.b());
            lVarArr[1] = new jz5.l("has_sync_chat_select", java.lang.Integer.valueOf(S6()));
            lVarArr[2] = new jz5.l("has_sync_chat_login", java.lang.Integer.valueOf(((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi() == 1 ? 1 : 0));
            lVarArr[3] = new jz5.l("login_page_sessionid", com.tencent.mm.plugin.account.ui.g3.a(g3Var));
            java.util.Map k17 = kz5.c1.k(lVarArr);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_account_sync_msg", "view_clk", k17, 34575);
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "reportLoginButtonClick success, params: " + k17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LoginAgreeSyncMsgUIC", e17, "reportLoginButtonClick failed", new java.lang.Object[0]);
        }
        if (((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Di()) {
            ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Ni(Q6().isChecked() ? 1 : 2);
        } else {
            ((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Ni(0);
        }
        O6();
    }

    public final void V6() {
        if (!((v61.f) ((zl.i) i95.n0.c(zl.i.class))).Di()) {
            com.tencent.mm.ui.widget.CheckBoxTextLayout R6 = R6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(R6, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(R6, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/LoginAgreeSyncMsgUIC", "showAgreeSyncMsgLL", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            R6.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(R6, "com/tencent/mm/plugin/account/ui/LoginAgreeSyncMsgUIC", "showAgreeSyncMsgLL", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(R6, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "showAgreeSyncMsgDialog[" + getActivity().getClass().getSimpleName() + ']');
        com.tencent.mm.ui.widget.CheckBoxTextLayout R62 = R6();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(R62, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(java.lang.Integer.valueOf(intValue2));
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(R62, arrayList4.toArray(), "com/tencent/mm/plugin/account/ui/LoginAgreeSyncMsgUIC", "showAgreeSyncMsgLL", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        R62.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(R62, "com/tencent/mm/plugin/account/ui/LoginAgreeSyncMsgUIC", "showAgreeSyncMsgLL", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.f(R62, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        try {
            ((cy1.a) ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(getActivity(), iy1.c.AccountLoginPage)).ik(getActivity(), 4, 34575)).fk(getActivity(), "has_sync_chat_select", java.lang.Integer.valueOf(S6()));
            com.tencent.mars.xlog.Log.i("MicroMsg.LoginAgreeSyncMsgUIC", "setupPageReport success, has_sync_chat_select: " + S6());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.LoginAgreeSyncMsgUIC", e17, "setupPageReport failed", new java.lang.Object[0]);
        }
        Q6().setOnCheckedChangeListener(new com.tencent.mm.plugin.account.ui.j3(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        Q6().setChecked(((v61.f) ((zl.i) i95.n0.c(zl.i.class))).wi() == 1);
    }
}
