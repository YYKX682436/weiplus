package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public class d1 implements com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.C16801xcc3e7637 f234571d;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.C16801xcc3e7637 c16801xcc3e7637) {
        this.f234571d = c16801xcc3e7637;
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public double A4() {
        long Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_diagnostic_pthread_hook_sensitive_rate, 2);
        if (Ni == 0) {
            Ni = -1;
        }
        return 1.0d / Ni;
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public void Sg(double d17) {
        this.f234571d.f37736xca0c184f = true;
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public long V3() {
        return 0L;
    }

    @Override // com.p314xaae8f345.mm.p849xbf8d97c1.p853x2f0ba7.a
    public java.lang.String key() {
        return "MicroMsg.ThreadWatchDog-sensitive";
    }
}
