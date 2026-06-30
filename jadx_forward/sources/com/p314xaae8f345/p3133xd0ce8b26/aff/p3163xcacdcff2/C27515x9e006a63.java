package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.PStatusClusterPresent */
/* loaded from: classes8.dex */
public class C27515x9e006a63 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 f60377xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63();

    /* renamed from: iconId */
    public java.lang.String f60383xb8d40b74 = "";

    /* renamed from: iconActions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211> f60382x949a5a44 = new java.util.LinkedList<>();

    /* renamed from: character_set_type */
    public int f60378x744eed4d = 0;

    /* renamed from: cluster_id */
    public java.lang.String f60379xe526580 = "";

    /* renamed from: cluster_present_type */
    public java.lang.String f60380x54edea63 = "";

    /* renamed from: cluster_present_version */
    public int f60381x9a4e850f = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116908xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116909x7c90cfc0() {
        return f60377xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116910x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63();
    }

    /* renamed from: addAllElementIconActions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116911x4769308(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211> collection) {
        this.f60382x949a5a44.addAll(collection);
        return this;
    }

    /* renamed from: addElementIconActions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116912xe8ff9c29(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 c27520x57ae3211) {
        this.f60382x949a5a44.add(c27520x57ae3211);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116913x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 c27515x9e006a63 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63) fVar;
        return n51.f.a(this.f60383xb8d40b74, c27515x9e006a63.f60383xb8d40b74) && n51.f.a(this.f60382x949a5a44, c27515x9e006a63.f60382x949a5a44) && n51.f.a(java.lang.Integer.valueOf(this.f60378x744eed4d), java.lang.Integer.valueOf(c27515x9e006a63.f60378x744eed4d)) && n51.f.a(this.f60379xe526580, c27515x9e006a63.f60379xe526580) && n51.f.a(this.f60380x54edea63, c27515x9e006a63.f60380x54edea63) && n51.f.a(java.lang.Integer.valueOf(this.f60381x9a4e850f), java.lang.Integer.valueOf(c27515x9e006a63.f60381x9a4e850f));
    }

    /* renamed from: getCharacterSetType */
    public int m116914xfa9dd2c9() {
        return this.f60378x744eed4d;
    }

    /* renamed from: getCharacter_set_type */
    public int m116915x87ab4f43() {
        return this.f60378x744eed4d;
    }

    /* renamed from: getClusterId */
    public java.lang.String m116916x20ebf5ff() {
        return this.f60379xe526580;
    }

    /* renamed from: getClusterPresentType */
    public java.lang.String m116917x8e607e31() {
        return this.f60380x54edea63;
    }

    /* renamed from: getClusterPresentVersion */
    public int m116918xd6ccb681() {
        return this.f60381x9a4e850f;
    }

    /* renamed from: getCluster_id */
    public java.lang.String m116919xfc931d76() {
        return this.f60379xe526580;
    }

    /* renamed from: getCluster_present_type */
    public java.lang.String m116920x2b9a6d9() {
        return this.f60380x54edea63;
    }

    /* renamed from: getCluster_present_version */
    public int m116921x6a4eecd9() {
        return this.f60381x9a4e850f;
    }

    /* renamed from: getIconActions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211> m116922x6e70a10e() {
        return this.f60382x949a5a44;
    }

    /* renamed from: getIconId */
    public java.lang.String m116923x1deb2e6a() {
        return this.f60383xb8d40b74;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116924x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f60383xb8d40b74;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 8, this.f60382x949a5a44);
            fVar.e(3, this.f60378x744eed4d);
            java.lang.String str2 = this.f60379xe526580;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f60380x54edea63;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.e(6, this.f60381x9a4e850f);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f60383xb8d40b74;
            int j17 = (str4 != null ? 0 + b36.f.j(1, str4) : 0) + b36.f.g(2, 8, this.f60382x949a5a44) + b36.f.e(3, this.f60378x744eed4d);
            java.lang.String str5 = this.f60379xe526580;
            if (str5 != null) {
                j17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f60380x54edea63;
            if (str6 != null) {
                j17 += b36.f.j(5, str6);
            }
            return j17 + b36.f.e(6, this.f60381x9a4e850f);
        }
        if (i17 == 2) {
            this.f60382x949a5a44.clear();
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
        switch (intValue) {
            case 1:
                this.f60383xb8d40b74 = aVar2.k(intValue);
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 c27520x57ae3211 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211();
                    if (bArr != null && bArr.length > 0) {
                        c27520x57ae3211.mo11468x92b714fd(bArr);
                    }
                    this.f60382x949a5a44.add(c27520x57ae3211);
                }
                return 0;
            case 3:
                this.f60378x744eed4d = aVar2.g(intValue);
                return 0;
            case 4:
                this.f60379xe526580 = aVar2.k(intValue);
                return 0;
            case 5:
                this.f60380x54edea63 = aVar2.k(intValue);
                return 0;
            case 6:
                this.f60381x9a4e850f = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setCharacterSetType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116926x9e9a67d5(int i17) {
        this.f60378x744eed4d = i17;
        return this;
    }

    /* renamed from: setCharacter_set_type */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116927x1ed6d14f(int i17) {
        this.f60378x744eed4d = i17;
        return this;
    }

    /* renamed from: setClusterId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116928x7d3fb673(java.lang.String str) {
        this.f60379xe526580 = str;
        return this;
    }

    /* renamed from: setClusterPresentType */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116929x258c003d(java.lang.String str) {
        this.f60380x54edea63 = str;
        return this;
    }

    /* renamed from: setClusterPresentVersion */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116930xa6df68f5(int i17) {
        this.f60381x9a4e850f = i17;
        return this;
    }

    /* renamed from: setCluster_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116931x2ab76b82(java.lang.String str) {
        this.f60379xe526580 = str;
        return this;
    }

    /* renamed from: setCluster_present_type */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116932x7d0cd5e5(java.lang.String str) {
        this.f60380x54edea63 = str;
        return this;
    }

    /* renamed from: setCluster_present_version */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116933x807ed24d(int i17) {
        this.f60381x9a4e850f = i17;
        return this;
    }

    /* renamed from: setIconActions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116934x4d61482(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211> linkedList) {
        this.f60382x949a5a44 = linkedList;
        return this;
    }

    /* renamed from: setIconId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116935x11206276(java.lang.String str) {
        this.f60383xb8d40b74 = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 m116925x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27515x9e006a63) super.mo11468x92b714fd(bArr);
    }
}
