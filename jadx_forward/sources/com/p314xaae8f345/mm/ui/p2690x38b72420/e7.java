package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes10.dex */
public class e7 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.f7 f288222d;

    public e7(com.p314xaae8f345.mm.ui.p2690x38b72420.f7 f7Var) {
        this.f288222d = f7Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.f7 f7Var = this.f288222d;
        java.lang.String obj = f7Var.f288240e.f288039h.getText().toString();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            f7Var.f288240e.f288038g.m80406xcd1079b0(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj));
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.j7 j7Var = f7Var.f288240e.f288036e;
        if (!j7Var.f288498q.equalsIgnoreCase(obj)) {
            j7Var.f288498q = obj;
        }
        j7Var.s();
        return false;
    }
}
