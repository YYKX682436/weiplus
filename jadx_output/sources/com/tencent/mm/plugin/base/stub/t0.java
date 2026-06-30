package com.tencent.mm.plugin.base.stub;

/* loaded from: classes.dex */
public class t0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f93795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.r1 f93796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.u0 f93797f;

    public t0(com.tencent.mm.modelbase.m1 m1Var, com.tencent.mm.modelbase.r1 r1Var, com.tencent.mm.modelbase.u0 u0Var) {
        this.f93795d = m1Var;
        this.f93796e = r1Var;
        this.f93797f = u0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mm.modelbase.m1 m1Var2 = this.f93795d;
        if (m1Var2 == m1Var) {
            this.f93796e.q(m1Var2.getType(), this);
            this.f93797f.onSceneEnd(i17, i18, str, m1Var);
        }
    }
}
