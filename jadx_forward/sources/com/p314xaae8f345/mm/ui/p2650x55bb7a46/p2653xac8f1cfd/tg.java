package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class tg implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 f281531d;

    public tg(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f2) {
        this.f281531d = c21668xed8974f2;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public final boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f2 = this.f281531d;
        int dotCounter = c21668xed8974f2.getDotCounter() % 3;
        c21668xed8974f2.m79442x81199a75(c21668xed8974f2.getDotCounter() + 1);
        if (dotCounter == 0) {
            c21668xed8974f2.m79443x943272a("·");
        } else if (dotCounter == 1) {
            c21668xed8974f2.m79443x943272a("··");
        } else if (dotCounter == 2) {
            c21668xed8974f2.m79443x943272a("···");
        }
        if (c21668xed8974f2.isLoading) {
            c21668xed8974f2.setText(c21668xed8974f2.f280092n + c21668xed8974f2.dotStr);
        } else {
            c21668xed8974f2.setText(c21668xed8974f2.f280092n);
        }
        return true;
    }
}
