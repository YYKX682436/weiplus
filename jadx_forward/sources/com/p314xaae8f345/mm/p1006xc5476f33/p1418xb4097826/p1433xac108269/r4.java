package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class r4 extends uo2.m0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184038c;

    public r4(java.lang.String str) {
        this.f184038c = str;
    }

    @Override // uo2.m0
    public boolean b(long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = this.f511167a;
        java.lang.String url = this.f184038c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        int i18 = url.length() == 0 ? -1 : 0;
        if (sVar != null) {
            sVar.c(j17, i17, "{\"errCode\": " + i18 + ",\"audioUrl\": \"" + url + "\"}");
        }
        return false;
    }
}
