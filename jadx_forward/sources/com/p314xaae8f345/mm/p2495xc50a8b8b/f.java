package com.p314xaae8f345.mm.p2495xc50a8b8b;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: OPCODE_COMPUTESIZE */
    protected static final int f38875x5257b927 = 1;

    /* renamed from: OPCODE_PARSEFROM */
    protected static final int f38876x7502390c = 2;

    /* renamed from: OPCODE_POPULATEBUILDERWITHFIELD */
    protected static final int f38877x2762ff74 = 3;

    /* renamed from: OPCODE_WRITEFIELDS */
    protected static final int f38878xb96f77c7 = 0;

    /* renamed from: unknownTagHandler */
    protected static d36.b f38879xd1e823a = new d36.a();

    /* renamed from: __includeUnKnownField */
    protected boolean f38880x64ce93d8 = false;

    /* renamed from: __initialProtobufBytes */
    protected byte[] f38881x23d0e69c;

    /* renamed from: getNextFieldNumber */
    public static int m75958x5767edba(c36.a aVar) {
        return aVar.a();
    }

    /* renamed from: mmPbUnSerialize */
    public static <T extends com.p314xaae8f345.mm.p2495xc50a8b8b.f> T m75959xa58fe935(T t17, byte[] bArr) {
        try {
            return (T) t17.mo11467x6bff0255().mo11468x92b714fd(bArr);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return equals(fVar);
    }

    /* renamed from: computeSize */
    public int mo75928xcd1e8d8() {
        int i17 = 0;
        try {
            i17 = op(1, new java.lang.Object[0]);
            com.p314xaae8f345.mm.p2495xc50a8b8b.n.c(this.f38881x23d0e69c, java.lang.Integer.valueOf(i17));
            return i17;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.n.a("computeSize error", e17);
            return i17;
        }
    }

    /* renamed from: fromJson */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75930xb5cb93b2(java.lang.String str) {
        return this;
    }

    @java.lang.Deprecated
    /* renamed from: getData */
    public byte[] m75960xfb7e5820() {
        return this.f38881x23d0e69c;
    }

    /* renamed from: includeUnKnownField */
    public boolean m75961xc2fcebb8() {
        return this.f38880x64ce93d8;
    }

    /* renamed from: initialProtobufBytes */
    public byte[] m75962x8b6d8abc() {
        return this.f38881x23d0e69c;
    }

    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return null;
    }

    public int op(int i17, java.lang.Object... objArr) {
        throw new java.lang.Error("Cannot use this method");
    }

    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        this.f38881x23d0e69c = bArr;
        com.p314xaae8f345.mm.p2495xc50a8b8b.n.c(bArr, -2);
        op(2, bArr);
        return this;
    }

    /* renamed from: populateBuilderWithField */
    public boolean mo75949x4476b383(c36.a aVar, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, int i17) {
        int op6 = op(3, aVar, fVar, java.lang.Integer.valueOf(i17));
        boolean z17 = true;
        boolean z18 = op6 == 0;
        if (!this.f38880x64ce93d8 && z18) {
            z17 = false;
        }
        this.f38880x64ce93d8 = z17;
        return z18;
    }

    /* renamed from: toByteArray */
    public byte[] mo14344x5f01b1f6() {
        mo75964xab491916();
        g36.f fVar = new g36.f(new byte[mo75928xcd1e8d8()]);
        mo75956x3d5d1f78(fVar);
        f36.a aVar = fVar.f349725b;
        int i17 = aVar.f340907b;
        int i18 = aVar.f340908c;
        int i19 = i17 - i18;
        byte[] bArr = fVar.f349724a;
        if (i19 == 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[i18];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i18);
        return bArr2;
    }

    /* renamed from: toByteArrayOrNull */
    public byte[] m75963xebb06ba0() {
        try {
            return mo14344x5f01b1f6();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* renamed from: toJSON */
    public java.lang.Object mo12245xcc313de3() {
        return "";
    }

    /* renamed from: validate */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo75964xab491916() {
        return this;
    }

    /* renamed from: writeFields */
    public void mo75956x3d5d1f78(g36.f fVar) {
        op(0, fVar);
    }
}
