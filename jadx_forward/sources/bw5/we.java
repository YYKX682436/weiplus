package bw5;

/* loaded from: classes2.dex */
public class we extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f116201d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ri0 f116202e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f116203f = new boolean[3];

    static {
        new bw5.we();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.we mo11468x92b714fd(byte[] bArr) {
        return (bw5.we) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.we)) {
            return false;
        }
        bw5.we weVar = (bw5.we) fVar;
        return n51.f.a(this.f116201d, weVar.f116201d) && n51.f.a(this.f116202e, weVar.f116202e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.we();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f116203f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f116201d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            r45.ri0 ri0Var = this.f116202e;
            if (ri0Var != null && zArr[2]) {
                fVar.i(2, ri0Var.mo75928xcd1e8d8());
                this.f116202e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f116201d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            r45.ri0 ri0Var2 = this.f116202e;
            return (ri0Var2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, ri0Var2.mo75928xcd1e8d8());
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
            this.f116201d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            r45.ri0 ri0Var3 = new r45.ri0();
            if (bArr != null && bArr.length > 0) {
                ri0Var3.mo11468x92b714fd(bArr);
            }
            this.f116202e = ri0Var3;
        }
        zArr[2] = true;
        return 0;
    }
}
