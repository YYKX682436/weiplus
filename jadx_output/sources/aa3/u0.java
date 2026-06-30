package aa3;

/* loaded from: classes14.dex */
public class u0 extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2603a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2604b = false;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2605c;

    public u0(boolean z17) {
        this.f2603a = true;
        this.f2605c = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "password window init");
        if (z17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_pwd_accessibility_v2, false)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "revert shouldSpeakPassWord");
                this.f2603a = true;
                return;
            }
            this.f2603a = false;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_keyboard_tts_mode_v2, false)) {
                this.f2605c = true;
            } else {
                this.f2605c = false;
            }
        }
    }

    public final void a(android.view.View view, int i17) {
        if ((j62.e.g().i("clicfg_accessibility_strategy_android_r", 1, true, true) == 1) && fp.h.c(30) && la5.b.f317600a.g(true) && i17 == 32768) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "send event step 2");
            super.sendAccessibilityEvent(view, i17);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "send event step 3");
        if (view == null || i17 != 1) {
            super.sendAccessibilityEvent(view, i17);
        } else if (com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "send event step 4");
            la5.b.f317600a.e(view);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void addExtraDataToAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str, android.os.Bundle bundle) {
        try {
            super.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", e17.getMessage());
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!this.f2605c) {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        accessibilityEvent.getText().clear();
        accessibilityEvent.setContentDescription("");
        accessibilityEvent.setClassName("");
        return true;
    }

    @Override // android.view.View.AccessibilityDelegate
    public android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        return super.getAccessibilityNodeProvider(view);
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (this.f2605c) {
            accessibilityEvent.getText().clear();
            accessibilityEvent.setContentDescription("");
            accessibilityEvent.setClassName("");
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (this.f2605c) {
            accessibilityNodeInfo.setText("");
            accessibilityNodeInfo.setContentDescription("");
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                accessibilityNodeInfo.setHintText("");
            }
            accessibilityNodeInfo.setFocusable(true);
            accessibilityNodeInfo.setViewIdResourceName("");
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        if (this.f2605c) {
            accessibilityEvent.getText().clear();
            accessibilityEvent.setContentDescription("");
            accessibilityEvent.setClassName("");
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        return super.performAccessibilityAction(view, i17, bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (com.tencent.mm.sdk.platformtools.t8.K0(r4) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r2 == false) goto L34;
     */
    @Override // android.view.View.AccessibilityDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void sendAccessibilityEvent(android.view.View r7, int r8) {
        /*
            r6 = this;
            boolean r0 = r6.f2603a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "MicroMsg.LiteAppSafePasswordAccessibilityDelegate"
            java.lang.String r2 = "send event %s, event %d"
            com.tencent.mars.xlog.Log.i(r1, r2, r0)
            boolean r0 = r6.f2603a
            if (r0 == 0) goto L1e
            super.sendAccessibilityEvent(r7, r8)
            goto L9b
        L1e:
            r0 = 1
            if (r7 == 0) goto L2a
            if (r8 != r0) goto L2a
            java.lang.String r2 = "click event"
            com.tencent.mars.xlog.Log.i(r1, r2)
            r6.f2604b = r0
        L2a:
            boolean r2 = r6.f2605c
            r3 = 0
            if (r2 == 0) goto L83
            if (r7 == 0) goto L83
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r8 != r2) goto L83
            com.tencent.mm.accessibility.uitl.AccUtil r2 = com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE
            boolean r2 = r2.isAccessibilityEnabled()
            if (r2 == 0) goto L83
            boolean r2 = r7 instanceof android.widget.TextView
            if (r2 == 0) goto L54
            r4 = r7
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r5 != 0) goto L54
            goto L64
        L54:
            java.lang.CharSequence r4 = r7.getContentDescription()
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L63
            java.lang.String r4 = r4.toString()
            goto L64
        L63:
            r4 = 0
        L64:
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            if (r5 != 0) goto L83
            boolean r5 = r6.f2604b
            if (r5 == 0) goto L76
            java.lang.String r0 = "focus after click， ignore tts"
            com.tencent.mars.xlog.Log.i(r1, r0)
            r6.f2604b = r3
            goto L83
        L76:
            android.content.Context r1 = r7.getContext()
            com.tenpay.android.wechat.TenpayTTSUtil.checkInit(r1)
            com.tenpay.android.wechat.TenpayTTSUtil.speak(r4)
            if (r2 != 0) goto L83
            goto L84
        L83:
            r0 = r3
        L84:
            if (r0 == 0) goto L98
            ku5.u0 r0 = ku5.t0.f312615d
            aa3.t0 r1 = new aa3.t0
            r1.<init>(r6, r7, r8)
            ku5.t0 r0 = (ku5.t0) r0
            r0.getClass()
            r7 = 600(0x258, double:2.964E-321)
            r0.z(r1, r7, r3)
            goto L9b
        L98:
            r6.a(r7, r8)
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aa3.u0.sendAccessibilityEvent(android.view.View, int):void");
    }

    @Override // android.view.View.AccessibilityDelegate
    public void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        boolean z17 = this.f2603a;
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "send uncheck step 1 %s, event %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(accessibilityEvent.getEventType()));
        boolean z18 = true;
        if (accessibilityEvent.getEventType() != 1 && accessibilityEvent.getEventType() != 16 && accessibilityEvent.getEventType() != 2048) {
            z18 = false;
        }
        if (z17 || !z18) {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            return;
        }
        if (view == null || !com.tencent.mm.accessibility.uitl.AccUtil.INSTANCE.isAccessibilityEnabled()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "send uncheck step 4");
        la5.c cVar = la5.b.f317600a;
        if (cVar.f317606d == null) {
            cVar.f317606d = (android.os.Vibrator) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("vibrator");
        }
        android.os.Vibrator vibrator = cVar.f317606d;
        if (vibrator != null) {
            vibrator.vibrate(50L);
        }
    }
}
