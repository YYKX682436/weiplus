package al5;

/* loaded from: classes14.dex */
public class u1 extends android.view.View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 f87586a;

    public u1(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039) {
        this.f87586a = c22624x85d69039;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 8192) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = this.f87586a;
            accessibilityEvent.setFromIndex(android.text.Selection.getSelectionStart(c22624x85d69039.a()));
            accessibilityEvent.setToIndex(android.text.Selection.getSelectionEnd(c22624x85d69039.a()));
            accessibilityEvent.setItemCount(c22624x85d69039.a().length());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f A[Catch: Exception -> 0x006e, TryCatch #0 {Exception -> 0x006e, blocks: (B:3:0x0006, B:5:0x000e, B:6:0x0018, B:8:0x0029, B:9:0x003d, B:11:0x0047, B:19:0x005f, B:20:0x0064, B:22:0x006a), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a A[Catch: Exception -> 0x006e, TRY_LEAVE, TryCatch #0 {Exception -> 0x006e, blocks: (B:3:0x0006, B:5:0x000e, B:6:0x0018, B:8:0x0029, B:9:0x003d, B:11:0x0047, B:19:0x005f, B:20:0x0064, B:22:0x006a), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View.AccessibilityDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onInitializeAccessibilityNodeInfo(android.view.View r5, android.view.accessibility.AccessibilityNodeInfo r6) {
        /*
            r4 = this;
            com.tencent.mm.ui.widget.MMNeat7extView r0 = r4.f87586a
            super.onInitializeAccessibilityNodeInfo(r5, r6)
            r5 = 0
            java.lang.CharSequence r1 = r0.a()     // Catch: java.lang.Exception -> L6e
            boolean r2 = r1 instanceof android.text.Spannable     // Catch: java.lang.Exception -> L6e
            if (r2 == 0) goto L17
            android.text.SpannableString r2 = new android.text.SpannableString     // Catch: java.lang.Exception -> L6e
            r2.<init>(r1)     // Catch: java.lang.Exception -> L6e
            android.text.Selection.removeSelection(r2)     // Catch: java.lang.Exception -> L6e
            goto L18
        L17:
            r2 = r1
        L18:
            r6.setText(r2)     // Catch: java.lang.Exception -> L6e
            r2 = 0
            r6.setContentDescription(r2)     // Catch: java.lang.Exception -> L6e
            r2 = 1
            r6.setFocusable(r2)     // Catch: java.lang.Exception -> L6e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L6e
            if (r1 != 0) goto L3d
            r1 = 256(0x100, float:3.59E-43)
            r6.addAction(r1)     // Catch: java.lang.Exception -> L6e
            r1 = 512(0x200, float:7.17E-43)
            r6.addAction(r1)     // Catch: java.lang.Exception -> L6e
            r1 = 31
            r6.setMovementGranularities(r1)     // Catch: java.lang.Exception -> L6e
            r1 = 131072(0x20000, float:1.83671E-40)
            r6.addAction(r1)     // Catch: java.lang.Exception -> L6e
        L3d:
            java.lang.CharSequence r1 = r0.a()     // Catch: java.lang.Exception -> L6e
            int r1 = r1.length()     // Catch: java.lang.Exception -> L6e
            if (r1 <= 0) goto L5c
            int r1 = r0.m81368x6f2c472c()     // Catch: java.lang.Exception -> L6e
            int r3 = r0.m81367xffd93625()     // Catch: java.lang.Exception -> L6e
            if (r1 < 0) goto L57
            if (r3 <= 0) goto L57
            if (r1 == r3) goto L57
            r1 = r2
            goto L58
        L57:
            r1 = r5
        L58:
            if (r1 == 0) goto L5c
            r1 = r2
            goto L5d
        L5c:
            r1 = r5
        L5d:
            if (r1 == 0) goto L64
            r1 = 16384(0x4000, float:2.2959E-41)
            r6.addAction(r1)     // Catch: java.lang.Exception -> L6e
        L64:
            int r0 = r0.m84159x931cb571()     // Catch: java.lang.Exception -> L6e
            if (r0 < r2) goto L78
            r6.setMultiLine(r2)     // Catch: java.lang.Exception -> L6e
            goto L78
        L6e:
            r6 = move-exception
            java.lang.String r0 = "onInitializeAccessibilityNodeInfo exception"
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = "MicroMsg.MMNeat7extView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r6, r0, r5)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: al5.u1.onInitializeAccessibilityNodeInfo(android.view.View, android.view.accessibility.AccessibilityNodeInfo):void");
    }
}
