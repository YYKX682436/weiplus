package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.VideoTsRange */
/* loaded from: classes2.dex */
public class C4541xc2475923 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923 f19192xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923();

    /* renamed from: ts, reason: collision with root package name */
    private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6> f134064ts = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f19193xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923 m39897xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923 m39898x7c90cfc0() {
        return f19192xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923 m39899x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923();
    }

    /* renamed from: addAllElementTs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923 m39900xad90293b(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6> collection) {
        this.f134064ts.addAll(collection);
        this.f19193xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementTs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923 m39901xe85f26fa(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 c4542x2f02fed6) {
        this.f134064ts.add(c4542x2f02fed6);
        this.f19193xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923 m39902x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923) && n51.f.a(this.f134064ts, ((com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923) fVar).f134064ts);
    }

    /* renamed from: getTs */
    public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6> m39903x5db1c75() {
        return this.f134064ts;
    }

    /* renamed from: hasFieldNumber */
    public boolean m39904x6e095e9(int i17) {
        return this.f19193xcb94b041[i17];
    }

    /* renamed from: hasTs */
    public boolean m39905x5e75eb9() {
        return m39904x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923 m39906x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f134064ts);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f134064ts) + 0;
        }
        if (i17 == 2) {
            this.f134064ts.clear();
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
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6 c4542x2f02fed6 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6();
            if (bArr != null && bArr.length > 0) {
                c4542x2f02fed6.mo11468x92b714fd(bArr);
            }
            this.f134064ts.add(c4542x2f02fed6);
        }
        this.f19193xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setTs */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923 m39908x6843681(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4542x2f02fed6> linkedList) {
        this.f134064ts = linkedList;
        this.f19193xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923 m39907x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4541xc2475923) super.mo11468x92b714fd(bArr);
    }
}
