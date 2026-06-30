package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class t0 implements z21.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 f257003a;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var) {
        this.f257003a = v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // z21.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String[] r5, java.util.List r6) {
        /*
            r4 = this;
            java.lang.String r0 = "MicroMsg.TransVoiceDialog"
            java.lang.String r1 = "onRes."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            com.tencent.mm.plugin.transvoice.ui.v0 r0 = r4.f257003a
            r0.Z = r6
            com.tencent.mm.sdk.platformtools.n3 r6 = r0.L
            r1 = 5000(0x1388, float:7.006E-42)
            if (r6 == 0) goto L15
            r6.mo50303x856b99f0(r1)
        L15:
            com.tencent.mm.sdk.platformtools.n3 r6 = r0.L
            if (r6 == 0) goto L1e
            r2 = 5000(0x1388, double:2.4703E-320)
            r6.mo50307xb9e94560(r1, r2)
        L1e:
            r6 = 0
            r1 = 1
            if (r5 == 0) goto L33
            r2 = r5[r6]
            if (r2 == 0) goto L33
            int r2 = r2.length()
            if (r2 <= 0) goto L2e
            r2 = r1
            goto L2f
        L2e:
            r2 = r6
        L2f:
            if (r2 != r1) goto L33
            r2 = r1
            goto L34
        L33:
            r2 = r6
        L34:
            if (r2 == 0) goto L64
            r5 = r5[r6]
            java.lang.String r6 = "<set-?>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r6)
            r0.f257029x0 = r5
            com.tencent.mm.plugin.transvoice.model.e r6 = r0.f257012f
            int r5 = r5.length()
            r6.f256928s = r5
            boolean r5 = r0.I
            if (r5 != 0) goto L64
            r0.I = r1
            com.tencent.mm.ui.widget.MMEditText r5 = r0.f257017n
            if (r5 != 0) goto L52
            goto L55
        L52:
            r5.setFocusable(r1)
        L55:
            com.tencent.mm.ui.widget.MMEditText r5 = r0.f257017n
            if (r5 != 0) goto L5a
            goto L5d
        L5a:
            r5.setFocusableInTouchMode(r1)
        L5d:
            com.tencent.mm.ui.widget.MMEditText r5 = r0.f257017n
            if (r5 == 0) goto L64
            r5.requestFocus()
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.t0.a(java.lang.String[], java.util.List):void");
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransVoiceDialog", "onRecognizeFinish.");
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.v0 v0Var = this.f257003a;
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
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$startTrans$1", "onRecognizeFinish", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/transvoice/ui/TransVoiceDialog$startTrans$1", "onRecognizeFinish", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TransVoiceDialog", "onError, errType: %d, errCode: %d, localCode: %d, voiceid: %d.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e eVar = this.f257003a.f257012f;
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
