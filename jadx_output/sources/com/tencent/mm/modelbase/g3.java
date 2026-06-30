package com.tencent.mm.modelbase;

/* loaded from: classes7.dex */
public final class g3 implements im5.a, com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.e3 f70640d;

    public g3(com.tencent.mm.modelbase.e3 e3Var) {
        this.f70640d = e3Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.e3 e3Var = this.f70640d;
        if (e3Var != null) {
            return e3Var.callback(i17, i18, str, oVar, m1Var);
        }
        return -100000;
    }

    @Override // im5.a
    public void dead() {
        this.f70640d = null;
    }
}
