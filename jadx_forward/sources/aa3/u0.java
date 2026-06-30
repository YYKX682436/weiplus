package aa3;

/* loaded from: classes14.dex */
public class u0 extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f84136a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f84137b = false;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f84138c;

    public u0(boolean z17) {
        this.f84136a = true;
        this.f84138c = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "password window init");
        if (z17) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_revert_pwd_accessibility_v2, false)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "revert shouldSpeakPassWord");
                this.f84136a = true;
                return;
            }
            this.f84136a = false;
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_keyboard_tts_mode_v2, false)) {
                this.f84138c = true;
            } else {
                this.f84138c = false;
            }
        }
    }

    public final void a(android.view.View view, int i17) {
        if ((j62.e.g().i("clicfg_accessibility_strategy_android_r", 1, true, true) == 1) && fp.h.c(30) && la5.b.f399133a.g(true) && i17 == 32768) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "send event step 2");
            super.sendAccessibilityEvent(view, i17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "send event step 3");
        if (view == null || i17 != 1) {
            super.sendAccessibilityEvent(view, i17);
        } else if (com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "send event step 4");
            la5.b.f399133a.e(view);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void addExtraDataToAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str, android.os.Bundle bundle) {
        try {
            super.addExtraDataToAccessibilityNodeInfo(view, accessibilityNodeInfo, str, bundle);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", e17.getMessage());
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!this.f84138c) {
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
        if (this.f84138c) {
            accessibilityEvent.getText().clear();
            accessibilityEvent.setContentDescription("");
            accessibilityEvent.setClassName("");
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (this.f84138c) {
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
        if (this.f84138c) {
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
    
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4) == false) goto L25;
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
            boolean r0 = r6.f84136a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r1 = "MicroMsg.LiteAppSafePasswordAccessibilityDelegate"
            java.lang.String r2 = "send event %s, event %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2, r0)
            boolean r0 = r6.f84136a
            if (r0 == 0) goto L1e
            super.sendAccessibilityEvent(r7, r8)
            goto L9b
        L1e:
            r0 = 1
            if (r7 == 0) goto L2a
            if (r8 != r0) goto L2a
            java.lang.String r2 = "click event"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r2)
            r6.f84137b = r0
        L2a:
            boolean r2 = r6.f84138c
            r3 = 0
            if (r2 == 0) goto L83
            if (r7 == 0) goto L83
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r8 != r2) goto L83
            com.tencent.mm.accessibility.uitl.AccUtil r2 = com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495
            boolean r2 = r2.m42840x2061f65d()
            if (r2 == 0) goto L83
            boolean r2 = r7 instanceof android.widget.TextView
            if (r2 == 0) goto L54
            r4 = r7
            android.widget.TextView r4 = (android.widget.TextView) r4
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
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
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r5 != 0) goto L83
            boolean r5 = r6.f84137b
            if (r5 == 0) goto L76
            java.lang.String r0 = "focus after click， ignore tts"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            r6.f84137b = r3
            goto L83
        L76:
            android.content.Context r1 = r7.getContext()
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28003x5d737a8a.m121653x17bcfa38(r1)
            com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28003x5d737a8a.m121658x688ffd2(r4)
            if (r2 != 0) goto L83
            goto L84
        L83:
            r0 = r3
        L84:
            if (r0 == 0) goto L98
            ku5.u0 r0 = ku5.t0.f394148d
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
        boolean z17 = this.f84136a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "send uncheck step 1 %s, event %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(accessibilityEvent.getEventType()));
        boolean z18 = true;
        if (accessibilityEvent.getEventType() != 1 && accessibilityEvent.getEventType() != 16 && accessibilityEvent.getEventType() != 2048) {
            z18 = false;
        }
        if (z17 || !z18) {
            super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            return;
        }
        if (view == null || !com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4966x1d004c03.f21354x4fbc8495.m42840x2061f65d()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppSafePasswordAccessibilityDelegate", "send uncheck step 4");
        la5.c cVar = la5.b.f399133a;
        if (cVar.f399139d == null) {
            cVar.f399139d = (android.os.Vibrator) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("vibrator");
        }
        android.os.Vibrator vibrator = cVar.f399139d;
        if (vibrator != null) {
            vibrator.vibrate(50L);
        }
    }
}
