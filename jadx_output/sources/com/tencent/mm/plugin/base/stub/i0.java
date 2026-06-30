package com.tencent.mm.plugin.base.stub;

/* loaded from: classes12.dex */
public class i0 extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.net.Uri f93759h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f93760i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f93761j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.base.stub.WXCommProvider f93762k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.base.stub.WXCommProvider wXCommProvider, long j17, java.lang.Integer num, android.net.Uri uri, int i17, java.lang.String[] strArr) {
        super(j17, num);
        this.f93762k = wXCommProvider;
        this.f93759h = uri;
        this.f93760i = i17;
        this.f93761j = strArr;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        this.f93759h.toString();
        int i17 = this.f93760i;
        if (i17 != 1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WXCommProvider", "delete fail, invalid code = %d", java.lang.Integer.valueOf(i17));
            return null;
        }
        int i18 = 0;
        for (java.lang.String str : this.f93761j) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.plugin.base.stub.WXCommProvider wXCommProvider = this.f93762k;
                if (wXCommProvider.f93673e.contains(str) && wXCommProvider.f93673e.edit().remove(str).commit()) {
                    i18++;
                }
            }
        }
        return java.lang.Integer.valueOf(i18);
    }
}
