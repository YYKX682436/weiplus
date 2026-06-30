package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkAppAuthClientInfo */
/* loaded from: classes4.dex */
public class C27064xbe47a9df extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df f58703xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df();

    /* renamed from: host_list */
    private java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96> f58705xd53bbcd5 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f58704xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df m109037xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df m109038x7c90cfc0() {
        return f58703xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df m109039x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df();
    }

    /* renamed from: addAllElementHostList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df m109040x6aba2422(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96> collection) {
        this.f58705xd53bbcd5.addAll(collection);
        this.f58704xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementHostList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df m109041xd35d96a1(com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 c27061xf1eb1e96) {
        this.f58705xd53bbcd5.add(c27061xf1eb1e96);
        this.f58704xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df m109042x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df) && n51.f.a(this.f58705xd53bbcd5, ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df) fVar).f58705xd53bbcd5);
    }

    /* renamed from: getHostList */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96> m109043x69ec43dc() {
        return this.f58705xd53bbcd5;
    }

    /* renamed from: hasFieldNumber */
    public boolean m109044x6e095e9(int i17) {
        return this.f58704xcb94b041[i17];
    }

    /* renamed from: hasHostList */
    public boolean m109045x9966c320() {
        return m109044x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df m109046x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f58705xd53bbcd5);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f58705xd53bbcd5) + 0;
        }
        if (i17 == 2) {
            this.f58705xd53bbcd5.clear();
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
            com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96 c27061xf1eb1e96 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96();
            if (bArr != null && bArr.length > 0) {
                c27061xf1eb1e96.mo11468x92b714fd(bArr);
            }
            this.f58705xd53bbcd5.add(c27061xf1eb1e96);
        }
        this.f58704xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setHostList */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df m109048x64a4a4e8(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27061xf1eb1e96> linkedList) {
        this.f58705xd53bbcd5 = linkedList;
        this.f58704xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df m109047x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27064xbe47a9df) super.mo11468x92b714fd(bArr);
    }
}
