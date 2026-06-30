package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.HostInfo */
/* loaded from: classes4.dex */
public class C27061xf1eb1e96 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 f58683xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96();

    /* renamed from: origin */
    private java.lang.String f58686xc3e1af26;

    /* renamed from: substitute */
    private java.lang.String f58687xd3d4a49a;

    /* renamed from: ip_list */
    private java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675> f58685x76fa7cb6 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f58684xcb94b041 = new boolean[4];

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 m108963xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 m108964x7c90cfc0() {
        return f58683xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 m108965x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96();
    }

    /* renamed from: addAllElementIpList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 m108966x97c7a321(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675> collection) {
        this.f58685x76fa7cb6.addAll(collection);
        this.f58684xcb94b041[3] = true;
        return this;
    }

    /* renamed from: addElementIpList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 m108967xb353a960(com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 c27062x811bf675) {
        this.f58685x76fa7cb6.add(c27062x811bf675);
        this.f58684xcb94b041[3] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 m108968x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 c27061xf1eb1e96 = (com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96) fVar;
        return n51.f.a(this.f58686xc3e1af26, c27061xf1eb1e96.f58686xc3e1af26) && n51.f.a(this.f58687xd3d4a49a, c27061xf1eb1e96.f58687xd3d4a49a) && n51.f.a(this.f58685x76fa7cb6, c27061xf1eb1e96.f58685x76fa7cb6);
    }

    /* renamed from: getIpList */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675> m108969x1e92695b() {
        return this.f58685x76fa7cb6;
    }

    /* renamed from: getOrigin */
    public java.lang.String m108970x28f8d21c() {
        return this.f58684xcb94b041[1] ? this.f58686xc3e1af26 : "";
    }

    /* renamed from: getSubstitute */
    public java.lang.String m108971xc2155c90() {
        return this.f58684xcb94b041[2] ? this.f58687xd3d4a49a : "";
    }

    /* renamed from: hasFieldNumber */
    public boolean m108972x6e095e9(int i17) {
        return this.f58684xcb94b041[i17];
    }

    /* renamed from: hasIpList */
    public boolean m108973xde6be99f() {
        return m108972x6e095e9(3);
    }

    /* renamed from: hasOrigin */
    public boolean m108974xe8d25260() {
        return m108972x6e095e9(1);
    }

    /* renamed from: hasSubstitute */
    public boolean m108975xfced1ad4() {
        return m108972x6e095e9(2);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 m108976x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f58686xc3e1af26;
            if (str != null && this.f58684xcb94b041[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f58687xd3d4a49a;
            if (str2 != null && this.f58684xcb94b041[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, this.f58685x76fa7cb6);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f58686xc3e1af26;
            if (str3 != null && this.f58684xcb94b041[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f58687xd3d4a49a;
            if (str4 != null && this.f58684xcb94b041[2]) {
                i18 += b36.f.j(2, str4);
            }
            return i18 + b36.f.g(3, 8, this.f58685x76fa7cb6);
        }
        if (i17 == 2) {
            this.f58685x76fa7cb6.clear();
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
            this.f58686xc3e1af26 = aVar2.k(intValue);
            this.f58684xcb94b041[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f58687xd3d4a49a = aVar2.k(intValue);
            this.f58684xcb94b041[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675 c27062x811bf675 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675();
            if (bArr != null && bArr.length > 0) {
                c27062x811bf675.mo11468x92b714fd(bArr);
            }
            this.f58685x76fa7cb6.add(c27062x811bf675);
        }
        this.f58684xcb94b041[3] = true;
        return 0;
    }

    /* renamed from: setIpList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 m108978x11c79d67(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27062x811bf675> linkedList) {
        this.f58685x76fa7cb6 = linkedList;
        this.f58684xcb94b041[3] = true;
        return this;
    }

    /* renamed from: setOrigin */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 m108979x1c2e0628(java.lang.String str) {
        this.f58686xc3e1af26 = str;
        this.f58684xcb94b041[1] = true;
        return this;
    }

    /* renamed from: setSubstitute */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 m108980xf039aa9c(java.lang.String str) {
        this.f58687xd3d4a49a = str;
        this.f58684xcb94b041[2] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 m108977x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96) super.mo11468x92b714fd(bArr);
    }
}
