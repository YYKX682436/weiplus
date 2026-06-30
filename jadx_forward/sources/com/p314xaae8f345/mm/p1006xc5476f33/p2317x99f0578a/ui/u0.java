package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class u0 implements z21.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 f257005a;

    public u0(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var) {
        this.f257005a = v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // z21.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String[] r5, java.util.List r6) {
        /*
            r4 = this;
            com.tencent.mm.plugin.transvoice.ui.v0 r0 = r4.f257005a
            r0.Z = r6
            com.tencent.mm.sdk.platformtools.n3 r6 = r0.L
            r1 = 5000(0x1388, float:7.006E-42)
            if (r6 == 0) goto Ld
            r6.mo50303x856b99f0(r1)
        Ld:
            com.tencent.mm.sdk.platformtools.n3 r6 = r0.L
            if (r6 == 0) goto L16
            r2 = 5000(0x1388, double:2.4703E-320)
            r6.mo50307xb9e94560(r1, r2)
        L16:
            r6 = 0
            r1 = 1
            if (r5 == 0) goto L2b
            r2 = r5[r6]
            if (r2 == 0) goto L2b
            int r2 = r2.length()
            if (r2 <= 0) goto L26
            r2 = r1
            goto L27
        L26:
            r2 = r6
        L27:
            if (r2 != r1) goto L2b
            r2 = r1
            goto L2c
        L2b:
            r2 = r6
        L2c:
            if (r2 == 0) goto L5c
            r5 = r5[r6]
            java.lang.String r6 = "<set-?>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r6)
            r0.f257029x0 = r5
            com.tencent.mm.plugin.transvoice.model.e r6 = r0.f257012f
            int r5 = r5.length()
            r6.f256928s = r5
            boolean r5 = r0.I
            if (r5 != 0) goto L5c
            r0.I = r1
            com.tencent.mm.ui.widget.MMEditText r5 = r0.f257017n
            if (r5 != 0) goto L4a
            goto L4d
        L4a:
            r5.setFocusable(r1)
        L4d:
            com.tencent.mm.ui.widget.MMEditText r5 = r0.f257017n
            if (r5 != 0) goto L52
            goto L55
        L52:
            r5.setFocusableInTouchMode(r1)
        L55:
            com.tencent.mm.ui.widget.MMEditText r5 = r0.f257017n
            if (r5 == 0) goto L5c
            r5.requestFocus()
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.u0.a(java.lang.String[], java.util.List):void");
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f257005a;
        v0Var.I = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e eVar = v0Var.f257012f;
        eVar.f256931v = 1;
        eVar.f256927r = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = v0Var.L;
        if (n3Var != null) {
            n3Var.mo50303x856b99f0(5000);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = v0Var.H;
        if (b4Var != null) {
            b4Var.d();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0.D(v0Var);
        android.view.View view = v0Var.f257019p;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$startTrans$2", "onRecognizeFinish", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$startTrans$2", "onRecognizeFinish", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e eVar = this.f257005a.f257012f;
        eVar.f256931v = 0;
        eVar.f256927r = java.lang.System.currentTimeMillis();
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
    }
}
