package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderMemberInfo */
/* loaded from: classes8.dex */
public class C27409x3f26a74e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e f59940xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e();

    /* renamed from: can_join_member */
    public boolean f59941x12ac0d60 = false;

    /* renamed from: member_setting */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0> f59942xf5b205ab = new java.util.LinkedList<>();

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114788xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114789x7c90cfc0() {
        return f59940xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114790x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e();
    }

    /* renamed from: addAllElementMemberSetting */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114791x4ebf21a(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0> collection) {
        this.f59942xf5b205ab.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementMember_setting */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114792x4223e667(java.util.Collection<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0> collection) {
        this.f59942xf5b205ab.addAll(collection);
        return this;
    }

    /* renamed from: addElementMemberSetting */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114793xeb5736fb(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 c27410xf59347b0) {
        this.f59942xf5b205ab.add(c27410xf59347b0);
        return this;
    }

    /* renamed from: addElementMember_setting */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114794x29213da6(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 c27410xf59347b0) {
        this.f59942xf5b205ab.add(c27410xf59347b0);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114795x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e c27409x3f26a74e = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f59941x12ac0d60), java.lang.Boolean.valueOf(c27409x3f26a74e.f59941x12ac0d60)) && n51.f.a(this.f59942xf5b205ab, c27409x3f26a74e.f59942xf5b205ab);
    }

    /* renamed from: getCanJoinMember */
    public boolean m114796xa4f6e09e() {
        return this.f59941x12ac0d60;
    }

    /* renamed from: getCan_join_member */
    public boolean m114797xf70ddf2a() {
        return this.f59941x12ac0d60;
    }

    /* renamed from: getMemberSetting */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0> m114798xd89a96a0() {
        return this.f59942xf5b205ab;
    }

    /* renamed from: getMember_setting */
    public java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0> m114799xe449d2a1() {
        return this.f59942xf5b205ab;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114800x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f59941x12ac0d60);
            fVar.g(2, 8, this.f59942xf5b205ab);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.a(1, this.f59941x12ac0d60) + 0 + b36.f.g(2, 8, this.f59942xf5b205ab);
        }
        if (i17 == 2) {
            this.f59942xf5b205ab.clear();
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
            this.f59941x12ac0d60 = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0 c27410xf59347b0 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0();
            if (bArr != null && bArr.length > 0) {
                c27410xf59347b0.mo11468x92b714fd(bArr);
            }
            this.f59942xf5b205ab.add(c27410xf59347b0);
        }
        return 0;
    }

    /* renamed from: setCanJoinMember */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114802x37cd4712(boolean z17) {
        this.f59941x12ac0d60 = z17;
        return this;
    }

    /* renamed from: setCan_join_member */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114803x2de4789e(boolean z17) {
        this.f59941x12ac0d60 = z17;
        return this;
    }

    /* renamed from: setMemberSetting */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114804x6b70fd14(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0> linkedList) {
        this.f59942xf5b205ab = linkedList;
        return this;
    }

    /* renamed from: setMember_setting */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114805xac403aad(java.util.LinkedList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27410xf59347b0> linkedList) {
        this.f59942xf5b205ab = linkedList;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e m114801x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27409x3f26a74e) super.mo11468x92b714fd(bArr);
    }
}
