package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class ec<OUT extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48> extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dz {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.Class<OUT> f130767a;

    public ec(java.lang.Class<OUT> cls) {
        this.f130767a = cls;
    }

    private com.tencent.mapsdk.internal.ec.a<OUT> b(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
        return new com.tencent.mapsdk.internal.ec.a<>(c4330xdd3bdcde, this.f130767a);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dz, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ed
    public final /* synthetic */ com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde a(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
        return new com.tencent.mapsdk.internal.ec.a(c4330xdd3bdcde, this.f130767a);
    }

    /* loaded from: classes13.dex */
    public static class a<OUT extends com.p314xaae8f345.map.p511x696c9db.p512x31ece8.AbstractC4317x9d76fe48> extends com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f130768a;

        /* renamed from: b, reason: collision with root package name */
        public OUT f130769b;

        public a(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
            m36018x5a5dd5d(c4330xdd3bdcde);
            if (c4330xdd3bdcde.mo36017xd4418ac9()) {
                try {
                    this.f130768a = new java.lang.String(c4330xdd3bdcde.f16977x2eefaa, c4330xdd3bdcde.f16974x2c0d614c);
                } catch (java.io.UnsupportedEncodingException unused) {
                }
            }
        }

        private java.lang.String a() {
            return this.f130768a;
        }

        private OUT b() {
            return this.f130769b;
        }

        @Override // com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde
        /* renamed from: available */
        public final boolean mo36017xd4418ac9() {
            java.lang.String str;
            return (!super.mo36017xd4418ac9() || (str = this.f130768a) == null || android.text.TextUtils.isEmpty(str)) ? false : true;
        }

        public a(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde, java.lang.Class<OUT> cls) {
            m36018x5a5dd5d(c4330xdd3bdcde);
            if (c4330xdd3bdcde.mo36017xd4418ac9()) {
                try {
                    java.lang.String str = new java.lang.String(c4330xdd3bdcde.f16977x2eefaa, c4330xdd3bdcde.f16974x2c0d614c);
                    this.f130768a = str;
                    this.f130769b = (OUT) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35881x450f6f3b(str, cls, new java.lang.Object[0]);
                } catch (java.io.UnsupportedEncodingException unused) {
                }
            }
        }
    }
}
