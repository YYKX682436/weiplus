package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ea extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dz {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f130760a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f130761b;

    /* loaded from: classes13.dex */
    public static class a extends com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde {

        /* renamed from: a, reason: collision with root package name */
        private java.io.File f130762a;

        public a(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde, java.lang.String str, java.lang.String str2) {
            m36018x5a5dd5d(c4330xdd3bdcde);
            if (c4330xdd3bdcde.mo36017xd4418ac9()) {
                this.f130762a = new java.io.File(str, str2);
                java.io.File file = new java.io.File(str, str2 + ".tmp");
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file);
                if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, c4330xdd3bdcde.f16977x2eefaa) && com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.a(file, this.f130762a)) {
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ks.b(file);
                }
            }
        }

        private java.io.File a() {
            return this.f130762a;
        }

        @Override // com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde
        /* renamed from: available */
        public final boolean mo36017xd4418ac9() {
            java.io.File file;
            return super.mo36017xd4418ac9() && (file = this.f130762a) != null && file.exists();
        }
    }

    public ea(java.lang.String str) {
        this.f130760a = str;
    }

    private com.tencent.mapsdk.internal.ea.a b(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
        return new com.tencent.mapsdk.internal.ea.a(c4330xdd3bdcde, this.f130761b, this.f130760a);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dz, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ed
    public final java.lang.Object[] a(int[] iArr, java.lang.Object[] objArr) {
        if (objArr != null && iArr != null && iArr.length == 1 && objArr.length > 0) {
            java.lang.Object obj = objArr[iArr[0]];
            if (obj instanceof java.lang.String) {
                this.f130761b = java.lang.String.valueOf(obj);
            }
        }
        return super.a(iArr, objArr);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dz, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ed
    public final /* synthetic */ com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde a(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
        return new com.tencent.mapsdk.internal.ea.a(c4330xdd3bdcde, this.f130761b, this.f130760a);
    }
}
