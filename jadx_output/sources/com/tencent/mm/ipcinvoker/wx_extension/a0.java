package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes7.dex */
public class a0 implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.wx_extension.v f68417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.u0 f68418e;

    public a0(com.tencent.mm.ipcinvoker.wx_extension.v vVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f68417d = vVar;
        this.f68418e = u0Var;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ipcinvoker.wx_extension.v vVar = this.f68417d;
        if (vVar != null) {
            vVar.a(i17, i18, str, oVar);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f68418e;
        if (u0Var == null) {
            return 0;
        }
        try {
            ((gm0.n) com.tencent.mm.modelbase.z2.f70847b).f273260a.f273288b.q(m1Var.getType(), u0Var);
            return 0;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }
}
