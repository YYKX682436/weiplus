package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes5.dex */
public final class p3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f102450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f102451e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f102452f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(long j17, long j18, int i17) {
        super(1);
        this.f102450d = j17;
        this.f102451e = j18;
        this.f102452f = i17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String json = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(json, "json");
        com.tencent.mm.plugin.lite.LiteAppCenter.storeSendResult(this.f102450d, this.f102451e, this.f102452f, "json", json);
        return jz5.f0.f302826a;
    }
}
