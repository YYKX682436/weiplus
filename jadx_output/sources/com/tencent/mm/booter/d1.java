package com.tencent.mm.booter;

/* loaded from: classes10.dex */
public final class d1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f63321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f63322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f63323f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(int i17, long j17, java.lang.String str) {
        super(1);
        this.f63321d = i17;
        this.f63322e = j17;
        this.f63323f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        com.tencent.mm.booter.a1 it = (com.tencent.mm.booter.a1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = this.f63321d;
        int i18 = it.f63300c;
        if (i18 == i17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("disorderFixUp late report: syncNum=");
            sb6.append(this.f63322e);
            sb6.append(", from=");
            java.lang.String str = this.f63323f;
            sb6.append(str);
            sb6.append(", fixUp=");
            sb6.append(it);
            com.tencent.mars.xlog.Log.w("MicroMsg.PushToMain.NotifyReceiver", sb6.toString());
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("bgn", java.lang.Integer.valueOf(i18));
            long j17 = it.f63298a;
            linkedHashMap.put("bgn", java.lang.Long.valueOf(j17));
            long j18 = it.f63299b;
            linkedHashMap.put("end", java.lang.Long.valueOf(j18));
            linkedHashMap.put("handledList", it.a());
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(j18);
            sb7.append('-');
            sb7.append(j17);
            java.lang.String[] strArr = {str, sb7.toString(), java.lang.String.valueOf(j18 - j17), java.lang.String.valueOf(i18)};
            z17 = true;
            ap.a.a(1, "notifyDisorderLate", null, linkedHashMap, strArr);
        } else {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
