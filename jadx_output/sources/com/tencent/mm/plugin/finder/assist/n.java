package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class n implements zy2.ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102393c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f102394d;

    public n(com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, r45.qt2 qt2Var, int i17) {
        this.f102391a = i0Var;
        this.f102392b = context;
        this.f102393c = qt2Var;
        this.f102394d = i17;
    }

    @Override // zy2.ya
    public void a(java.lang.String sessionId, boolean z17, int i17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        pm0.v.X(new com.tencent.mm.plugin.finder.assist.m(this.f102391a, this.f102392b, i17, i18, str, sessionId, this.f102393c, this.f102394d, z17));
    }
}
