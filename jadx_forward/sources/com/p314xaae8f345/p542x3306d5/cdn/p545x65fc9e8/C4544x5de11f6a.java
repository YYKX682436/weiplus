package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.WxUserIdcInfo */
/* loaded from: classes8.dex */
public class C4544x5de11f6a extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a f19206xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a();

    /* renamed from: ExtInfo */
    private com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 f19207x1559024f;

    /* renamed from: Uuid */
    private java.lang.String f19208x2867db;

    /* renamed from: hasSetFields */
    private final boolean[] f19209xcb94b041 = new boolean[3];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a m39950xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a m39951x7c90cfc0() {
        return f19206xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a m39952x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a m39953x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a c4544x5de11f6a = (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a) fVar;
        return n51.f.a(this.f19208x2867db, c4544x5de11f6a.f19208x2867db) && n51.f.a(this.f19207x1559024f, c4544x5de11f6a.f19207x1559024f);
    }

    /* renamed from: getExtInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 m39954xefeda639() {
        return this.f19209xcb94b041[2] ? this.f19207x1559024f : new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000();
    }

    /* renamed from: getUuid */
    public java.lang.String m39955xfb865c31() {
        return this.f19209xcb94b041[1] ? this.f19208x2867db : "";
    }

    /* renamed from: hasExtInfo */
    public boolean m39956x2b442e75() {
        return m39957x6e095e9(2);
    }

    /* renamed from: hasFieldNumber */
    public boolean m39957x6e095e9(int i17) {
        return this.f19209xcb94b041[i17];
    }

    /* renamed from: hasUuid */
    public boolean m39958x298b1d75() {
        return m39957x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a m39959x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f19208x2867db;
            if (str != null && this.f19209xcb94b041[1]) {
                fVar.j(1, str);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb70000 = this.f19207x1559024f;
            if (c4519xbcb70000 != null && this.f19209xcb94b041[2]) {
                fVar.i(2, c4519xbcb70000.mo75928xcd1e8d8());
                this.f19207x1559024f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f19208x2867db;
            if (str2 != null && this.f19209xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb700002 = this.f19207x1559024f;
            return (c4519xbcb700002 == null || !this.f19209xcb94b041[2]) ? i18 : i18 + b36.f.i(2, c4519xbcb700002.mo75928xcd1e8d8());
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f19208x2867db = aVar2.k(intValue);
            this.f19209xcb94b041[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb700003 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000();
            if (bArr != null && bArr.length > 0) {
                c4519xbcb700003.mo11468x92b714fd(bArr);
            }
            this.f19207x1559024f = c4519xbcb700003;
        }
        this.f19209xcb94b041[2] = true;
        return 0;
    }

    /* renamed from: setExtInfo */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a m39961x635ef3ad(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4519xbcb70000 c4519xbcb70000) {
        this.f19207x1559024f = c4519xbcb70000;
        this.f19209xcb94b041[2] = true;
        return this;
    }

    /* renamed from: setUuid */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a m39962x7651233d(java.lang.String str) {
        this.f19208x2867db = str;
        this.f19209xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a m39960x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4544x5de11f6a) super.mo11468x92b714fd(bArr);
    }
}
