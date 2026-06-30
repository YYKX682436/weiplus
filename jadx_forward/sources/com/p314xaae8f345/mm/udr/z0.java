package com.p314xaae8f345.mm.udr;

/* loaded from: classes5.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f278062d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f278063e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f278064f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f278065g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r f278066h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(java.lang.String str, java.lang.String str2, long j17, int i17, com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r rVar) {
        super(1);
        this.f278062d = str;
        this.f278063e = str2;
        this.f278064f = j17;
        this.f278065g = i17;
        this.f278066h = rVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ea5.k kVar = (ea5.k) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("crossProcessCallBack onSuccess projectId:");
        java.lang.String str = this.f278062d;
        sb6.append(str);
        sb6.append(", name:");
        sb6.append(this.f278063e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("UDRFeatureService", sb6.toString());
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.r type = this.f278066h;
        if (kVar != null) {
            long j17 = this.f278064f;
            java.lang.String str2 = this.f278062d;
            java.lang.String str3 = this.f278063e;
            int i17 = this.f278065g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(type, "$type");
            kVar.mo13582x5e6271bd(j17, str2, str3, i17, type);
        } else {
            ea5.l wi6 = ((com.p314xaae8f345.mm.udr.e1) ((com.p314xaae8f345.mm.udr.c0) i95.n0.c(com.p314xaae8f345.mm.udr.c0.class))).wi(str);
            if (wi6 != null) {
                long j18 = this.f278064f;
                java.lang.String str4 = this.f278062d;
                java.lang.String str5 = this.f278063e;
                int i18 = this.f278065g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(type, "$type");
                wi6.mo40418x5e6271bd(j18, str4, str5, i18, type);
            }
        }
        return jz5.f0.f384359a;
    }
}
