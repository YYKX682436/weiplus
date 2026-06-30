package com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae;

/* loaded from: classes12.dex */
public class i0 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f175292h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f175293i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f175294j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.C12937x3f78629e f175295k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.C12937x3f78629e c12937x3f78629e, long j17, java.lang.Integer num, android.net.Uri uri, int i17, java.lang.String[] strArr) {
        super(j17, num);
        this.f175295k = c12937x3f78629e;
        this.f175292h = uri;
        this.f175293i = i17;
        this.f175294j = strArr;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.d8
    public java.lang.Object b() {
        this.f175292h.toString();
        int i17 = this.f175293i;
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WXCommProvider", "delete fail, invalid code = %d", java.lang.Integer.valueOf(i17));
            return null;
        }
        int i18 = 0;
        for (java.lang.String str : this.f175294j) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1277x2e06d1.p1279x3608ae.C12937x3f78629e c12937x3f78629e = this.f175295k;
                if (c12937x3f78629e.f175206e.contains(str) && c12937x3f78629e.f175206e.edit().remove(str).commit()) {
                    i18++;
                }
            }
        }
        return java.lang.Integer.valueOf(i18);
    }
}
