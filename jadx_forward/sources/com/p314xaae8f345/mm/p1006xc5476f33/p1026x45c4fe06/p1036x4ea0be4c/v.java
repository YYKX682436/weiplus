package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class})
/* loaded from: classes4.dex */
public class v extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.k f158431d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s0 f158432e;

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.k Ai() {
        if (gm0.j1.a()) {
            m134976x2690a4ac();
        }
        return this.f158431d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1
    public long D4(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 E4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 a17 = wi().a(str, i17);
        if (a17 != null) {
            return a17.f158316m;
        }
        if (Ai() == null || (E4 = Ai().E4(str, i17)) == null) {
            return 0L;
        }
        return E4.f158316m;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 E4(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 E4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 a17 = wi() != null ? wi().a(str, i17) : null;
        if (a17 != null) {
            return a17;
        }
        if (Ai() == null || (E4 = Ai().E4(str, i17)) == null) {
            return null;
        }
        return E4;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1
    public boolean L3(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, long j17, int i19) {
        boolean z17 = false;
        if (1 != i19) {
            if (Ai() == null) {
                return false;
            }
            return Ai().y0(str, i17, str2, str3, str4, i18, j17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s0 wi6 = wi();
        wi6.getClass();
        if (!android.text.TextUtils.isEmpty(str)) {
            int hash = java.util.Objects.hash(str, java.lang.Integer.valueOf(i17));
            synchronized (wi6.f158425a) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 c11725x4c3df839 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839) wi6.f158425a.get(hash);
                if (c11725x4c3df839 != null && j17 <= c11725x4c3df839.f158316m) {
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 c11725x4c3df8392 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839();
                c11725x4c3df8392.f158310d = str;
                c11725x4c3df8392.f158311e = i17;
                c11725x4c3df8392.f158314h = str2;
                c11725x4c3df8392.f158312f = str3;
                c11725x4c3df8392.f158313g = str4;
                c11725x4c3df8392.f158315i = i18;
                c11725x4c3df8392.f158316m = j17;
                c11725x4c3df8392.f158317n = i19;
                wi6.f158425a.put(hash, c11725x4c3df8392);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BackgroundFetchDataMemoryStorage", "set ok, username:%s, fetchType:%d, time:%d", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(j17));
                z17 = true;
            }
        }
        if (z17 && Ai() != null) {
            Ai().z6(str, i17);
        }
        return z17;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        this.f158431d = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.k) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.k.class);
        this.f158432e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s0();
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        this.f158431d = null;
        this.f158432e = null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s0 wi() {
        if (gm0.j1.a()) {
            m134976x2690a4ac();
        }
        return this.f158432e;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s1
    public boolean z6(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.s0 wi6 = wi();
        wi6.getClass();
        boolean z17 = false;
        if (!android.text.TextUtils.isEmpty(str)) {
            int hash = java.util.Objects.hash(str, java.lang.Integer.valueOf(i17));
            synchronized (wi6.f158425a) {
                int indexOfKey = wi6.f158425a.indexOfKey(hash);
                if (indexOfKey >= 0) {
                    wi6.f158425a.removeAt(indexOfKey);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BackgroundFetchDataMemoryStorage", "delete ok, username:%s, fetchType:%d", str, java.lang.Integer.valueOf(i17));
                    z17 = true;
                }
            }
        }
        return Ai() != null ? z17 | Ai().z6(str, i17) : z17;
    }
}
