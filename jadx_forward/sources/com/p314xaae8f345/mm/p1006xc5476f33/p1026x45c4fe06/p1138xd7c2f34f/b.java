package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class b implements java.util.function.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12320xd8d30665 f166040a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f166041b;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12320xd8d30665 c12320xd8d30665, boolean z17) {
        this.f166040a = c12320xd8d30665;
        this.f166041b = z17;
    }

    @Override // java.util.function.Function
    public java.lang.Object apply(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j.f166211a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12320xd8d30665 c12320xd8d30665 = this.f166040a;
        k91.r a17 = jVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.e(c12320xd8d30665.f165861e, c12320xd8d30665.f165862f, this.f166041b, c12320xd8d30665.f165864h));
        if (a17 == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAppConfigParserHelper.AheadParsedConfigsCache", "computeIfAbsent(" + c12320xd8d30665.f165860d + ") offer config cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime) + "ms");
        return a17;
    }
}
