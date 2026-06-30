package com.p314xaae8f345.mm.p2802xd031a825.ui;

/* loaded from: classes9.dex */
public class f1 implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2802xd031a825.ui.q1[] f295673a;

    public f1(com.p314xaae8f345.mm.p2802xd031a825.ui.q1[] q1VarArr) {
        this.f295673a = q1VarArr;
    }

    @Override // c01.qa
    public void a(com.p314xaae8f345.mm.p971x6de15a2e.s sVar) {
        if (sVar == null || sVar.G() == null) {
            return;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.q1[] q1VarArr = this.f295673a;
        if (q1VarArr == null || q1VarArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletBaseUtil ", "hy: kvs is null or length is 0");
            return;
        }
        try {
            for (com.p314xaae8f345.mm.p2802xd031a825.ui.q1 q1Var : q1VarArr) {
                if (q1Var != null) {
                    java.lang.String str = q1Var.f295749a;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                        com.p314xaae8f345.mm.p971x6de15a2e.o G = sVar.G();
                        java.lang.Object obj = q1Var.f295750b;
                        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                        new java.io.ObjectOutputStream(byteArrayOutputStream).writeObject(obj);
                        G.l1(str, byteArrayOutputStream.toByteArray());
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletBaseUtil ", "hy: serialize failed: %s", e17.toString());
        }
    }
}
