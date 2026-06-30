package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class v implements zy2.ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102609c;

    public v(com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, r45.qt2 qt2Var) {
        this.f102607a = i0Var;
        this.f102608b = context;
        this.f102609c = qt2Var;
    }

    @Override // zy2.ya
    public void a(java.lang.String sessionId, boolean z17, int i17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        pm0.v.X(new com.tencent.mm.plugin.finder.assist.u(this.f102607a, this.f102608b, i17, i18, str, sessionId, this.f102609c, z17));
    }
}
