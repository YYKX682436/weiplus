package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class p implements zy2.ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102434b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102435c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f102436d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f102437e;

    public p(java.lang.String str, android.content.Context context, com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Intent intent, int i17) {
        this.f102433a = str;
        this.f102434b = context;
        this.f102435c = i0Var;
        this.f102436d = intent;
        this.f102437e = i17;
    }

    @Override // zy2.ya
    public void a(java.lang.String sessionId, boolean z17, int i17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "[enterChattingUI] ]username=" + this.f102433a + " sessionId=" + sessionId);
        pm0.v.X(new com.tencent.mm.plugin.finder.assist.o(this.f102434b, this.f102435c, i17, i18, str, sessionId, this.f102436d, this.f102433a, z17, this.f102437e));
    }
}
