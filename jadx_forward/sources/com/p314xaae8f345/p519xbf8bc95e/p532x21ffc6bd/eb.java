package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class eb<IN extends com.qq.taf.jce.AbstractC2863x16243f65, OUT extends com.qq.taf.jce.AbstractC2863x16243f65> extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dz {

    /* renamed from: a, reason: collision with root package name */
    private java.lang.Class<IN> f130763a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.Class<OUT> f130764b;

    /* renamed from: c, reason: collision with root package name */
    private com.qq.taf.jce.AbstractC2863x16243f65 f130765c;

    /* loaded from: classes13.dex */
    public static class a<OUT extends com.qq.taf.jce.AbstractC2863x16243f65> extends com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde {

        /* renamed from: a, reason: collision with root package name */
        public OUT f130766a;

        public a(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde, java.lang.Class<OUT> cls) {
            m36018x5a5dd5d(c4330xdd3bdcde);
            byte[] bArr = c4330xdd3bdcde.f16977x2eefaa;
            if (bArr != null) {
                com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m mVar = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.m(bArr);
                OUT out = (OUT) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a(cls, new java.lang.Object[0]);
                this.f130766a = out;
                if (out != null) {
                    out.mo36074xcc442a60(mVar);
                }
            }
            com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131740h, "[JCE-RESP]:" + this.f130766a);
        }

        private OUT a() {
            return this.f130766a;
        }

        @Override // com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde
        /* renamed from: available */
        public final boolean mo36017xd4418ac9() {
            return super.mo36017xd4418ac9() && this.f130766a != null;
        }
    }

    public eb(java.lang.Class<IN> cls, java.lang.Class<OUT> cls2) {
        this.f130763a = cls;
        this.f130764b = cls2;
    }

    private com.tencent.mapsdk.internal.eb.a<OUT> b(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
        return new com.tencent.mapsdk.internal.eb.a<>(c4330xdd3bdcde, this.f130764b);
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dz, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ed
    public final java.lang.Object[] a(int[] iArr, java.lang.Object[] objArr) {
        if (objArr != null && iArr != null && iArr.length > 0 && objArr.length > 0) {
            java.util.List asList = java.util.Arrays.asList(objArr);
            int i17 = iArr[0];
            int i18 = iArr.length == 1 ? i17 : iArr[1];
            if (objArr.length - 1 >= i18 && i17 >= 0) {
                com.qq.taf.jce.AbstractC2863x16243f65 abstractC2863x16243f65 = (com.qq.taf.jce.AbstractC2863x16243f65) com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a(this.f130763a, java.util.Arrays.copyOfRange(objArr, i17, i18 + 1));
                this.f130765c = abstractC2863x16243f65;
                byte[] bArr = new byte[0];
                if (abstractC2863x16243f65 != null) {
                    bArr = abstractC2863x16243f65.m36885x5f01b1f6();
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i19 = 0; i19 < asList.size(); i19++) {
                    if (i19 < i17 || i19 > i18) {
                        arrayList.add(asList.get(i19));
                    } else if (i19 == i18) {
                        arrayList.add(bArr);
                    }
                }
                return arrayList.toArray();
            }
        }
        return super.a(iArr, objArr);
    }

    /* renamed from: toString */
    public final java.lang.String m36704x9616526c() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("JceResolver{inJce=");
        stringBuffer.append(this.f130765c);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.dz, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ed
    public final /* synthetic */ com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde a(com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde c4330xdd3bdcde) {
        return new com.tencent.mapsdk.internal.eb.a(c4330xdd3bdcde, this.f130764b);
    }
}
