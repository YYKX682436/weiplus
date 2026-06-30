package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.ConnRecords */
/* loaded from: classes4.dex */
public class C4475xdf9b8556 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556 f18566xb3e828f3 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556();

    /* renamed from: records */
    private java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70> f18568x40871e42 = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f18567xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556 m38521xaf65a0fc() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556 m38522x7c90cfc0() {
        return f18566xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556 m38523x3136c9db() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556();
    }

    /* renamed from: addAllElementRecords */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556 m38524x2bc65906(java.util.Collection<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70> collection) {
        this.f18568x40871e42.addAll(collection);
        this.f18567xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementRecords */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556 m38525x81bb1aa7(com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 c4474x73101b70) {
        this.f18568x40871e42.add(c4474x73101b70);
        this.f18567xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556 m38526x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556) && n51.f.a(this.f18568x40871e42, ((com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556) fVar).f18568x40871e42);
    }

    /* renamed from: getRecords */
    public java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70> m38527x7e545a0c() {
        return this.f18568x40871e42;
    }

    /* renamed from: hasFieldNumber */
    public boolean m38528x6e095e9(int i17) {
        return this.f18567xcb94b041[i17];
    }

    /* renamed from: hasRecords */
    public boolean m38529xb9aae248() {
        return m38528x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556 m38530x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f18568x40871e42);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f18568x40871e42) + 0;
        }
        if (i17 == 2) {
            this.f18568x40871e42.clear();
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
            com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70 c4474x73101b70 = new com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70();
            if (bArr != null && bArr.length > 0) {
                c4474x73101b70.mo11468x92b714fd(bArr);
            }
            this.f18568x40871e42.add(c4474x73101b70);
        }
        this.f18567xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setRecords */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556 m38532xf1c5a780(java.util.LinkedList<com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4474x73101b70> linkedList) {
        this.f18568x40871e42 = linkedList;
        this.f18567xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556 m38531x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.C4475xdf9b8556) super.mo11468x92b714fd(bArr);
    }
}
