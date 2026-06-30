package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class f implements zy2.ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102153b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f102154c;

    public f(com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, r45.qt2 qt2Var) {
        this.f102152a = i0Var;
        this.f102153b = context;
        this.f102154c = qt2Var;
    }

    @Override // zy2.ya
    public void a(java.lang.String sessionId, boolean z17, int i17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        pm0.v.X(new com.tencent.mm.plugin.finder.assist.e(this.f102152a, this.f102153b, i17, i18, str, sessionId, this.f102154c, z17));
    }
}
