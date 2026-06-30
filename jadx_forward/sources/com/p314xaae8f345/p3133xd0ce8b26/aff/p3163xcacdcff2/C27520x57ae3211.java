package com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2;

/* renamed from: com.tencent.wechat.aff.status.PStatusIconAction */
/* loaded from: classes8.dex */
public class C27520x57ae3211 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 f60444xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211();
    public java.lang.String url = "";

    /* renamed from: extOption */
    public long f60451xb60f21f6 = 0;

    /* renamed from: iconDescriptions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> f60453x476b9f10 = new java.util.LinkedList<>();

    /* renamed from: clusterDescriptions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> f60447x4a243b11 = new java.util.LinkedList<>();

    /* renamed from: beginTime */
    public int f60445xc00dc316 = 0;

    /* renamed from: endTime */
    public int f60450xa0336a48 = 0;

    /* renamed from: groupId */
    public java.lang.String f60452x117d5bfa = "";

    /* renamed from: order */
    public int f60454x651874e = 0;

    /* renamed from: otherClusterDescriptions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> f60455x3cbc89e1 = new java.util.LinkedList<>();

    /* renamed from: bigIconUrl */
    public java.lang.String f60446xe4ae0d16 = "";

    /* renamed from: unreadTextColor */
    public java.lang.String f60456x6d688f47 = "";

    /* renamed from: cluster_with_me_descriptions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> f60449x9606d2ea = new java.util.LinkedList<>();

    /* renamed from: cluster_only_me_descriptions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> f60448x9404b5d0 = new java.util.LinkedList<>();

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117095xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117096x7c90cfc0() {
        return f60444xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117097x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211();
    }

    /* renamed from: addAllElementClusterDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117098x9aad6fd5(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> collection) {
        this.f60447x4a243b11.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementClusterOnlyMeDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117099x53225dd9(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> collection) {
        this.f60448x9404b5d0.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementClusterWithMeDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117100xf95cf973(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> collection) {
        this.f60449x9606d2ea.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementCluster_only_me_descriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117101xc0d09d8c(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> collection) {
        this.f60448x9404b5d0.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementCluster_with_me_descriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117102xc2d2baa6(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> collection) {
        this.f60449x9606d2ea.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementIconDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117103x3ee840cc(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> collection) {
        this.f60453x476b9f10.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementOtherClusterDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117104xe449af9d(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> collection) {
        this.f60455x3cbc89e1.addAll(collection);
        return this;
    }

    /* renamed from: addElementClusterDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117105x6aefc7f6(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0 c27519xd0c2da0) {
        this.f60447x4a243b11.add(c27519xd0c2da0);
        return this;
    }

    /* renamed from: addElementClusterOnlyMeDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117106x5ff0593a(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0 c27519xd0c2da0) {
        this.f60448x9404b5d0.add(c27519xd0c2da0);
        return this;
    }

    /* renamed from: addElementClusterWithMeDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117107x62af4d4(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0 c27519xd0c2da0) {
        this.f60449x9606d2ea.add(c27519xd0c2da0);
        return this;
    }

    /* renamed from: addElementCluster_only_me_descriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117108xd728da8b(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0 c27519xd0c2da0) {
        this.f60448x9404b5d0.add(c27519xd0c2da0);
        return this;
    }

    /* renamed from: addElementCluster_with_me_descriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117109xd92af7a5(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0 c27519xd0c2da0) {
        this.f60449x9606d2ea.add(c27519xd0c2da0);
        return this;
    }

    /* renamed from: addElementIconDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117110x5becc44b(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0 c27519xd0c2da0) {
        this.f60453x476b9f10.add(c27519xd0c2da0);
        return this;
    }

    /* renamed from: addElementOtherClusterDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117111x500e441c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0 c27519xd0c2da0) {
        this.f60455x3cbc89e1.add(c27519xd0c2da0);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117112x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 c27520x57ae3211 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211) fVar;
        return n51.f.a(this.url, c27520x57ae3211.url) && n51.f.a(java.lang.Long.valueOf(this.f60451xb60f21f6), java.lang.Long.valueOf(c27520x57ae3211.f60451xb60f21f6)) && n51.f.a(this.f60453x476b9f10, c27520x57ae3211.f60453x476b9f10) && n51.f.a(this.f60447x4a243b11, c27520x57ae3211.f60447x4a243b11) && n51.f.a(java.lang.Integer.valueOf(this.f60445xc00dc316), java.lang.Integer.valueOf(c27520x57ae3211.f60445xc00dc316)) && n51.f.a(java.lang.Integer.valueOf(this.f60450xa0336a48), java.lang.Integer.valueOf(c27520x57ae3211.f60450xa0336a48)) && n51.f.a(this.f60452x117d5bfa, c27520x57ae3211.f60452x117d5bfa) && n51.f.a(java.lang.Integer.valueOf(this.f60454x651874e), java.lang.Integer.valueOf(c27520x57ae3211.f60454x651874e)) && n51.f.a(this.f60455x3cbc89e1, c27520x57ae3211.f60455x3cbc89e1) && n51.f.a(this.f60446xe4ae0d16, c27520x57ae3211.f60446xe4ae0d16) && n51.f.a(this.f60456x6d688f47, c27520x57ae3211.f60456x6d688f47) && n51.f.a(this.f60449x9606d2ea, c27520x57ae3211.f60449x9606d2ea) && n51.f.a(this.f60448x9404b5d0, c27520x57ae3211.f60448x9404b5d0);
    }

    /* renamed from: getBeginTime */
    public int m117113xbf7b3460() {
        return this.f60445xc00dc316;
    }

    /* renamed from: getBigIconUrl */
    public java.lang.String m117114xd2eec50c() {
        return this.f60446xe4ae0d16;
    }

    /* renamed from: getClusterDescriptions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> m117115xa25417db() {
        return this.f60447x4a243b11;
    }

    /* renamed from: getClusterOnlyMeDescriptions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> m117116xda90695f() {
        return this.f60448x9404b5d0;
    }

    /* renamed from: getClusterWithMeDescriptions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> m117117x80cb04f9() {
        return this.f60449x9606d2ea;
    }

    /* renamed from: getCluster_only_me_descriptions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> m117118xdfdf9c46() {
        return this.f60448x9404b5d0;
    }

    /* renamed from: getCluster_with_me_descriptions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> m117119xe1e1b960() {
        return this.f60449x9606d2ea;
    }

    /* renamed from: getEndTime */
    public int m117120xde00a612() {
        return this.f60450xa0336a48;
    }

    /* renamed from: getExtOption */
    public long m117121xb57c9340() {
        return this.f60451xb60f21f6;
    }

    /* renamed from: getGroupId */
    public java.lang.String m117122x4f4a97c4() {
        return this.f60452x117d5bfa;
    }

    /* renamed from: getIconDescriptions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> m117123xef440686() {
        return this.f60453x476b9f10;
    }

    /* renamed from: getOrder */
    public int m117124x74ef2d98() {
        return this.f60454x651874e;
    }

    /* renamed from: getOtherClusterDescriptions */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> m117125x6cc91b57() {
        return this.f60455x3cbc89e1;
    }

    /* renamed from: getUnreadTextColor */
    public java.lang.String m117126x51ca6111() {
        return this.f60456x6d688f47;
    }

    /* renamed from: getUrl */
    public java.lang.String m117127xb5887639() {
        return this.url;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117128x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.url;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f60451xb60f21f6);
            fVar.g(3, 8, this.f60453x476b9f10);
            fVar.g(4, 8, this.f60447x4a243b11);
            fVar.e(5, this.f60445xc00dc316);
            fVar.e(6, this.f60450xa0336a48);
            java.lang.String str2 = this.f60452x117d5bfa;
            if (str2 != null) {
                fVar.j(7, str2);
            }
            fVar.e(8, this.f60454x651874e);
            fVar.g(9, 8, this.f60455x3cbc89e1);
            java.lang.String str3 = this.f60446xe4ae0d16;
            if (str3 != null) {
                fVar.j(10, str3);
            }
            java.lang.String str4 = this.f60456x6d688f47;
            if (str4 != null) {
                fVar.j(11, str4);
            }
            fVar.g(13, 8, this.f60449x9606d2ea);
            fVar.g(14, 8, this.f60448x9404b5d0);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.url;
            int j17 = (str5 != null ? b36.f.j(1, str5) + 0 : 0) + b36.f.h(2, this.f60451xb60f21f6) + b36.f.g(3, 8, this.f60453x476b9f10) + b36.f.g(4, 8, this.f60447x4a243b11) + b36.f.e(5, this.f60445xc00dc316) + b36.f.e(6, this.f60450xa0336a48);
            java.lang.String str6 = this.f60452x117d5bfa;
            if (str6 != null) {
                j17 += b36.f.j(7, str6);
            }
            int e17 = j17 + b36.f.e(8, this.f60454x651874e) + b36.f.g(9, 8, this.f60455x3cbc89e1);
            java.lang.String str7 = this.f60446xe4ae0d16;
            if (str7 != null) {
                e17 += b36.f.j(10, str7);
            }
            java.lang.String str8 = this.f60456x6d688f47;
            if (str8 != null) {
                e17 += b36.f.j(11, str8);
            }
            return e17 + b36.f.g(13, 8, this.f60449x9606d2ea) + b36.f.g(14, 8, this.f60448x9404b5d0);
        }
        if (i17 == 2) {
            this.f60453x476b9f10.clear();
            this.f60447x4a243b11.clear();
            this.f60455x3cbc89e1.clear();
            this.f60449x9606d2ea.clear();
            this.f60448x9404b5d0.clear();
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
                this.url = aVar2.k(intValue);
                return 0;
            case 2:
                this.f60451xb60f21f6 = aVar2.i(intValue);
                return 0;
            case 3:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0 c27519xd0c2da0 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0();
                    if (bArr != null && bArr.length > 0) {
                        c27519xd0c2da0.mo11468x92b714fd(bArr);
                    }
                    this.f60453x476b9f10.add(c27519xd0c2da0);
                }
                return 0;
            case 4:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size2 = j19.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j19.get(i19);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0 c27519xd0c2da02 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0();
                    if (bArr2 != null && bArr2.length > 0) {
                        c27519xd0c2da02.mo11468x92b714fd(bArr2);
                    }
                    this.f60447x4a243b11.add(c27519xd0c2da02);
                }
                return 0;
            case 5:
                this.f60445xc00dc316 = aVar2.g(intValue);
                return 0;
            case 6:
                this.f60450xa0336a48 = aVar2.g(intValue);
                return 0;
            case 7:
                this.f60452x117d5bfa = aVar2.k(intValue);
                return 0;
            case 8:
                this.f60454x651874e = aVar2.g(intValue);
                return 0;
            case 9:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size3 = j27.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr3 = (byte[]) j27.get(i27);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0 c27519xd0c2da03 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0();
                    if (bArr3 != null && bArr3.length > 0) {
                        c27519xd0c2da03.mo11468x92b714fd(bArr3);
                    }
                    this.f60455x3cbc89e1.add(c27519xd0c2da03);
                }
                return 0;
            case 10:
                this.f60446xe4ae0d16 = aVar2.k(intValue);
                return 0;
            case 11:
                this.f60456x6d688f47 = aVar2.k(intValue);
                return 0;
            case 12:
            default:
                return -1;
            case 13:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size4 = j28.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr4 = (byte[]) j28.get(i28);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0 c27519xd0c2da04 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0();
                    if (bArr4 != null && bArr4.length > 0) {
                        c27519xd0c2da04.mo11468x92b714fd(bArr4);
                    }
                    this.f60449x9606d2ea.add(c27519xd0c2da04);
                }
                return 0;
            case 14:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size5 = j29.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr5 = (byte[]) j29.get(i29);
                    com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0 c27519xd0c2da05 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0();
                    if (bArr5 != null && bArr5.length > 0) {
                        c27519xd0c2da05.mo11468x92b714fd(bArr5);
                    }
                    this.f60448x9404b5d0.add(c27519xd0c2da05);
                }
                return 0;
        }
    }

    /* renamed from: setBeginTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117130x1bcef4d4(int i17) {
        this.f60445xc00dc316 = i17;
        return this;
    }

    /* renamed from: setBigIconUrl */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117131x1131318(java.lang.String str) {
        this.f60446xe4ae0d16 = str;
        return this;
    }

    /* renamed from: setClusterDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117132xf098d74f(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> linkedList) {
        this.f60447x4a243b11 = linkedList;
        return this;
    }

    /* renamed from: setClusterOnlyMeDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117133x245cc1d3(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> linkedList) {
        this.f60448x9404b5d0 = linkedList;
        return this;
    }

    /* renamed from: setClusterWithMeDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117134xca975d6d(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> linkedList) {
        this.f60449x9606d2ea = linkedList;
        return this;
    }

    /* renamed from: setCluster_only_me_descriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117135xdac8ff52(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> linkedList) {
        this.f60448x9404b5d0 = linkedList;
        return this;
    }

    /* renamed from: setCluster_with_me_descriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117136xdccb1c6c(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> linkedList) {
        this.f60449x9606d2ea = linkedList;
        return this;
    }

    /* renamed from: setEndTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117137x5171f386(int i17) {
        this.f60450xa0336a48 = i17;
        return this;
    }

    /* renamed from: setExtOption */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117138x11d053b4(long j17) {
        this.f60451xb60f21f6 = j17;
        return this;
    }

    /* renamed from: setGroupId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117139xc2bbe538(java.lang.String str) {
        this.f60452x117d5bfa = str;
        return this;
    }

    /* renamed from: setIconDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117140x93409b92(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> linkedList) {
        this.f60453x476b9f10 = linkedList;
        return this;
    }

    /* renamed from: setOrder */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117141x537d480c(int i17) {
        this.f60454x651874e = i17;
        return this;
    }

    /* renamed from: setOtherClusterDescriptions */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117142x1c95e463(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27519xd0c2da0> linkedList) {
        this.f60455x3cbc89e1 = linkedList;
        return this;
    }

    /* renamed from: setUnreadTextColor */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117143x88a0fa85(java.lang.String str) {
        this.f60456x6d688f47 = str;
        return this;
    }

    /* renamed from: setUrl */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117144xca029dad(java.lang.String str) {
        this.url = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 m117129x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3163xcacdcff2.C27520x57ae3211) super.mo11468x92b714fd(bArr);
    }
}
