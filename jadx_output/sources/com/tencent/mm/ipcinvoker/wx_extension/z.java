package com.tencent.mm.ipcinvoker.wx_extension;

/* loaded from: classes7.dex */
public class z implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.wx_extension.v f68465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.o f68466e;

    public z(com.tencent.mm.ipcinvoker.wx_extension.v vVar, com.tencent.mm.modelbase.o oVar) {
        this.f68465d = vVar;
        this.f68466e = oVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.ipcinvoker.wx_extension.v vVar;
        if (3 == i17 && !m1Var.hasCallBackToQueue() && (vVar = this.f68465d) != null) {
            vVar.a(i17, i18, str, this.f68466e);
        }
        try {
            ((gm0.n) com.tencent.mm.modelbase.z2.f70847b).f273260a.f273288b.q(m1Var.getType(), this);
        } catch (java.lang.Exception unused) {
        }
    }
}
