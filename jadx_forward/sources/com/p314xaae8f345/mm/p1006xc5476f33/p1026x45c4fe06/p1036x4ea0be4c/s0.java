package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c;

/* loaded from: classes4.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f158425a = new android.util.SparseArray();

    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 a(java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839 c11725x4c3df839;
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        int hash = java.util.Objects.hash(str, java.lang.Integer.valueOf(i17));
        synchronized (this.f158425a) {
            c11725x4c3df839 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1036x4ea0be4c.C11725x4c3df839) this.f158425a.get(hash);
            if (c11725x4c3df839 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BackgroundFetchDataMemoryStorage", "get ok, username:%s, fetchType:%d, time:%d", str, java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(c11725x4c3df839.f158316m));
            }
        }
        return c11725x4c3df839;
    }
}
