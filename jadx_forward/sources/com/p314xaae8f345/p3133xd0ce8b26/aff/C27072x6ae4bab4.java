package com.p314xaae8f345.p3133xd0ce8b26.aff;

/* renamed from: com.tencent.wechat.aff.IlinkBypassMsgList */
/* loaded from: classes4.dex */
public class C27072x6ae4bab4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4 f58763xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4();

    /* renamed from: msgitems */
    private java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529> f58765xb40dc8df = new java.util.LinkedList<>();

    /* renamed from: hasSetFields */
    private final boolean[] f58764xcb94b041 = new boolean[2];

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4 m109204xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4 m109205x7c90cfc0() {
        return f58763xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4 m109206x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4();
    }

    /* renamed from: addAllElementMsgitems */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4 m109207x30b5e69b(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529> collection) {
        this.f58765xb40dc8df.addAll(collection);
        this.f58764xcb94b041[1] = true;
        return this;
    }

    /* renamed from: addElementMsgitems */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4 m109208x9959591a(com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 c27071x6ae38529) {
        this.f58765xb40dc8df.add(c27071x6ae38529);
        this.f58764xcb94b041[1] = true;
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4 m109209x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4) && n51.f.a(this.f58765xb40dc8df, ((com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4) fVar).f58765xb40dc8df);
    }

    /* renamed from: getMsgitems */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529> m109210x2fe80655() {
        return this.f58765xb40dc8df;
    }

    /* renamed from: hasFieldNumber */
    public boolean m109211x6e095e9(int i17) {
        return this.f58764xcb94b041[i17];
    }

    /* renamed from: hasMsgitems */
    public boolean m109212x5f628599() {
        return m109211x6e095e9(1);
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4 m109213x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            ((g36.f) objArr[0]).g(1, 8, this.f58765xb40dc8df);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, this.f58765xb40dc8df) + 0;
        }
        if (i17 == 2) {
            this.f58765xb40dc8df.clear();
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
            com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529 c27071x6ae38529 = new com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529();
            if (bArr != null && bArr.length > 0) {
                c27071x6ae38529.mo11468x92b714fd(bArr);
            }
            this.f58765xb40dc8df.add(c27071x6ae38529);
        }
        this.f58764xcb94b041[1] = true;
        return 0;
    }

    /* renamed from: setMsgitems */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4 m109215x2aa06761(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.C27071x6ae38529> linkedList) {
        this.f58765xb40dc8df = linkedList;
        this.f58764xcb94b041[1] = true;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4 m109214x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.C27072x6ae4bab4) super.mo11468x92b714fd(bArr);
    }
}
