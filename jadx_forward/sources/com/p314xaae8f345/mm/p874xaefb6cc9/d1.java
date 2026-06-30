package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f150540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p874xaefb6cc9.C10915x95dcf60b f150541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f150542f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(long j17, com.p314xaae8f345.mm.p874xaefb6cc9.C10915x95dcf60b c10915x95dcf60b, int i17) {
        super(2);
        this.f150540d = j17;
        this.f150541e = c10915x95dcf60b;
        this.f150542f = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WVAModulePkgPathHelper", "fetchPatchSizeAsync: failed, errCode=" + ((java.lang.Number) obj).intValue() + ", errMsg=" + ((java.lang.String) obj2) + ", using fallbackSize=" + this.f150540d);
        com.p314xaae8f345.mm.p874xaefb6cc9.e1 e1Var = new com.p314xaae8f345.mm.p874xaefb6cc9.e1(false, null, this.f150542f, this.f150540d, true, 2, null);
        com.p314xaae8f345.mm.p874xaefb6cc9.C10915x95dcf60b c10915x95dcf60b = this.f150541e;
        c10915x95dcf60b.f150528q = e1Var;
        c10915x95dcf60b.c();
        return jz5.f0.f384359a;
    }
}
