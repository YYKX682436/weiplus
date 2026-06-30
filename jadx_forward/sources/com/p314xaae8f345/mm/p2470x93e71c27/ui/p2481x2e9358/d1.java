package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class d1 implements z21.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271790a;

    public d1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271790a = c19666xfd6e2f33;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271790a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.c cVar = c19666xfd6e2f33.f271571o6;
        db5.d5 d5Var = c19666xfd6e2f33.X3;
        if (d5Var != null && !d5Var.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatFooter", "newVoice2txt onRes return, newVoice2txtWindow is not showing.");
            return;
        }
        ((java.util.ArrayList) c19666xfd6e2f33.f271591r6).clear();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            ((java.util.ArrayList) c19666xfd6e2f33.f271591r6).addAll(list);
        }
        if (!c19666xfd6e2f33.f271609u6) {
            c19666xfd6e2f33.f271609u6 = true;
            c19666xfd6e2f33.f271494b4.setFocusable(true);
            c19666xfd6e2f33.f271494b4.setFocusableInTouchMode(true);
            c19666xfd6e2f33.f271494b4.requestFocus();
            c19666xfd6e2f33.f271494b4.setCursorVisible(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.c cVar2 = c19666xfd6e2f33.f271571o6;
        if (cVar2 != null && !cVar2.f256907m) {
            c19666xfd6e2f33.f271603t6.mo50303x856b99f0(5000);
            c19666xfd6e2f33.f271603t6.mo50307xb9e94560(5000, 5000L);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr[0])) {
            return;
        }
        ((java.util.HashMap) c19666xfd6e2f33.f271513e6).put(java.lang.Integer.valueOf(c19666xfd6e2f33.f271615v6), strArr[0]);
        if (c19666xfd6e2f33.f271513e6 != null) {
            c19666xfd6e2f33.N3.f256928s = strArr[0].length();
        }
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1  */
    @Override // z21.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(int r7) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.d1.d(int):void");
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271790a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.p2318x633fb29.e eVar = c19666xfd6e2f33.N3;
        eVar.f256931v = 0;
        eVar.f256927r = java.lang.System.currentTimeMillis();
        c19666xfd6e2f33.f271559m6 = false;
        c19666xfd6e2f33.f271494b4.setImportantForAccessibility(0);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
    }
}
