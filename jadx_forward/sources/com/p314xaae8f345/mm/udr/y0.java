package com.p314xaae8f345.mm.udr;

/* loaded from: classes5.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f278055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f278056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f278057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f278058g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f278059h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r f278060i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String str, java.lang.String str2, android.os.Bundle bundle, long j17, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r rVar) {
        super(1);
        this.f278055d = str;
        this.f278056e = str2;
        this.f278057f = bundle;
        this.f278058g = j17;
        this.f278059h = i17;
        this.f278060i = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ea5.k kVar = (ea5.k) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("crossProcessCallBack onFailure projectId:");
        java.lang.String str = this.f278055d;
        sb6.append(str);
        sb6.append(", name:");
        sb6.append(this.f278056e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRFeatureService", sb6.toString());
        android.os.Bundle bundle = this.f278057f;
        int i17 = bundle.getInt("errNo");
        int i18 = bundle.getInt("errCode");
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type = this.f278060i;
        if (kVar != null) {
            long j17 = this.f278058g;
            java.lang.String str2 = this.f278055d;
            java.lang.String str3 = this.f278056e;
            int i19 = this.f278059h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(type, "$type");
            kVar.mo13581xd73276fa(j17, i17, i18, str2, str3, i19, type);
        } else {
            ea5.l wi6 = ((com.p314xaae8f345.mm.udr.e1) ((com.p314xaae8f345.mm.udr.c0) i95.n0.c(com.p314xaae8f345.mm.udr.c0.class))).wi(str);
            if (wi6 != null) {
                long j18 = this.f278058g;
                java.lang.String str4 = this.f278055d;
                java.lang.String str5 = this.f278056e;
                int i27 = this.f278059h;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(type, "$type");
                wi6.mo46983xd73276fa(j18, i17, i18, str4, str5, i27, type);
            }
        }
        return jz5.f0.f384359a;
    }
}
