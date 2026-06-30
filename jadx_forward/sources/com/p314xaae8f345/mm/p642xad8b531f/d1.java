package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes10.dex */
public final class d1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f144854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f144855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f144856f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(int i17, long j17, java.lang.String str) {
        super(1);
        this.f144854d = i17;
        this.f144855e = j17;
        this.f144856f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        com.p314xaae8f345.mm.p642xad8b531f.a1 it = (com.p314xaae8f345.mm.p642xad8b531f.a1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int i17 = this.f144854d;
        int i18 = it.f144833c;
        if (i18 == i17) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("disorderFixUp late report: syncNum=");
            sb6.append(this.f144855e);
            sb6.append(", from=");
            java.lang.String str = this.f144856f;
            sb6.append(str);
            sb6.append(", fixUp=");
            sb6.append(it);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PushToMain.NotifyReceiver", sb6.toString());
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("bgn", java.lang.Integer.valueOf(i18));
            long j17 = it.f144831a;
            linkedHashMap.put("bgn", java.lang.Long.valueOf(j17));
            long j18 = it.f144832b;
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
