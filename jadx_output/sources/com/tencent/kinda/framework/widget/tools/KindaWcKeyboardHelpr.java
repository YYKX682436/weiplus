package com.tencent.kinda.framework.widget.tools;

/* loaded from: classes9.dex */
public class KindaWcKeyboardHelpr {
    private static java.lang.String TAG = "MicroMsg.KindaWcKeyboardHelper";

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.wallet_core.keyboard.WcPayKeyboard bind(final com.tencent.mm.framework.app.UIPageFragmentActivity r10, final com.tencent.kinda.framework.widget.base.MMKEditText r11, java.lang.String r12, final com.tencent.kinda.framework.widget.base.BaseFrActivity.IWalletTenpayKBStateCallBackListener r13) {
        /*
            java.lang.String r0 = ""
            com.tenpay.android.wechat.TenpaySecureEditText r9 = r11.getEditText()
            r1 = 0
            r2 = 0
            androidx.fragment.app.Fragment r3 = androidx.fragment.app.FragmentManager.findFragment(r9)     // Catch: java.lang.IllegalStateException -> L13
            boolean r4 = r3 instanceof com.tencent.kinda.framework.widget.base.BaseFragment     // Catch: java.lang.IllegalStateException -> L13
            if (r4 == 0) goto L22
            com.tencent.kinda.framework.widget.base.BaseFragment r3 = (com.tencent.kinda.framework.widget.base.BaseFragment) r3     // Catch: java.lang.IllegalStateException -> L13
            goto L23
        L13:
            r3 = move-exception
            java.lang.String r4 = com.tencent.kinda.framework.widget.tools.KindaWcKeyboardHelpr.TAG
            java.lang.String r5 = "error"
            com.tencent.mars.xlog.Log.e(r4, r5)
            java.lang.String r4 = com.tencent.kinda.framework.widget.tools.KindaWcKeyboardHelpr.TAG
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.tencent.mars.xlog.Log.printErrStackTrace(r4, r3, r0, r5)
        L22:
            r3 = r2
        L23:
            if (r3 != 0) goto L2b
            com.tencent.kinda.framework.widget.base.FrLifeController r3 = r10.f68153f
            com.tencent.kinda.framework.widget.base.BaseFragment r3 = r3.getCurrent()
        L2b:
            r7 = r3
            int r3 = com.tencent.kinda.framework.R.id.wc_pay_keyboard
            android.view.View r3 = r7.findViewById(r3)
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard r3 = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) r3
            if (r3 == 0) goto L3f
            java.lang.String r0 = com.tencent.kinda.framework.widget.tools.KindaWcKeyboardHelpr.TAG
            java.lang.String r1 = "has exist keyboard"
            com.tencent.mars.xlog.Log.i(r0, r1)
        L3d:
            r0 = r3
            goto L7c
        L3f:
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L4b
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard r0 = new com.tencent.mm.wallet_core.keyboard.WcPayKeyboard
            r0.<init>(r10, r1)
            goto L50
        L4b:
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard r0 = new com.tencent.mm.wallet_core.keyboard.WcPayKeyboard
            r0.<init>(r10)
        L50:
            r3 = r0
            int r0 = com.tencent.kinda.framework.R.id.wc_pay_keyboard
            r3.setId(r0)
            int r0 = com.tencent.kinda.framework.R.id.container_layout
            android.view.View r0 = r7.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            if (r0 != 0) goto L68
            java.lang.String r10 = com.tencent.kinda.framework.widget.tools.KindaWcKeyboardHelpr.TAG
            java.lang.String r11 = "can not find content layout"
            com.tencent.mars.xlog.Log.w(r10, r11)
            return r2
        L68:
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r4 = -2
            r1.<init>(r2, r4)
            r2 = 80
            r1.gravity = r2
            r0.addView(r3, r1)
            r0 = 8
            r3.setVisibility(r0)
            goto L3d
        L7c:
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r12)
            if (r1 != 0) goto L85
            r0.setActionText(r12)
        L85:
            com.tencent.mm.wallet_core.ui.r1.v0(r9)
            com.tencent.kinda.framework.widget.tools.KindaWcKeyboardHelpr$1 r12 = new com.tencent.kinda.framework.widget.tools.KindaWcKeyboardHelpr$1
            r1 = r12
            r2 = r10
            r3 = r0
            r4 = r13
            r5 = r7
            r6 = r9
            r8 = r11
            r1.<init>()
            r9.setOnFocusChangeListener(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.tools.KindaWcKeyboardHelpr.bind(com.tencent.mm.framework.app.UIPageFragmentActivity, com.tencent.kinda.framework.widget.base.MMKEditText, java.lang.String, com.tencent.kinda.framework.widget.base.BaseFrActivity$IWalletTenpayKBStateCallBackListener):com.tencent.mm.wallet_core.keyboard.WcPayKeyboard");
    }
}
