package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class l implements zy2.ya {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102333a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102334b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102335c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f102336d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f102338f;

    public l(java.lang.String str, com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, yz5.a aVar, java.lang.String str2, int i17) {
        this.f102333a = str;
        this.f102334b = i0Var;
        this.f102335c = context;
        this.f102336d = aVar;
        this.f102337e = str2;
        this.f102338f = i17;
    }

    @Override // zy2.ya
    public void a(java.lang.String sessionId, boolean z17, int i17, int i18, java.lang.String str) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        com.tencent.mars.xlog.Log.i("Finder.ActivityRouter", "[enterChattingUIFromLive] toUsername=" + this.f102333a + " sessionId=" + sessionId);
        pm0.v.X(new com.tencent.mm.plugin.finder.assist.k(this.f102334b, this.f102335c, i17, i18, str, sessionId, this.f102336d, this.f102337e, this.f102338f, z17));
    }
}
