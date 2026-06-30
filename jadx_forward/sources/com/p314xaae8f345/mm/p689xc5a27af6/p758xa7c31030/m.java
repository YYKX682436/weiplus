package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes3.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f149137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f149138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.Long l17, long j17) {
        super(1);
        this.f149137d = l17;
        this.f149138e = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Map it = (java.util.Map) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        it.put("uid-collect-ratio", java.lang.Long.valueOf(a06.d.c((((float) this.f149137d.longValue()) * 100.0f) / ((float) this.f149138e))));
        return jz5.f0.f384359a;
    }
}
