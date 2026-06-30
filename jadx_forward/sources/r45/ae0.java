package r45;

/* loaded from: classes4.dex */
public class ae0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451496d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451497e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zd0 f451498f;

    static {
        new r45.ae0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.ae0 mo11468x92b714fd(byte[] bArr) {
        return (r45.ae0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ae0)) {
            return false;
        }
        r45.ae0 ae0Var = (r45.ae0) fVar;
        return n51.f.a(this.f451496d, ae0Var.f451496d) && n51.f.a(this.f451497e, ae0Var.f451497e) && n51.f.a(this.f451498f, ae0Var.f451498f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.ae0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f451496d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f451497e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            r45.zd0 zd0Var = this.f451498f;
            if (zd0Var != null) {
                fVar.i(3, zd0Var.mo75928xcd1e8d8());
                this.f451498f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f451496d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f451497e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            r45.zd0 zd0Var2 = this.f451498f;
            return zd0Var2 != null ? j17 + b36.f.i(3, zd0Var2.mo75928xcd1e8d8()) : j17;
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
            this.f451496d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f451497e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            r45.zd0 zd0Var3 = new r45.zd0();
            if (bArr != null && bArr.length > 0) {
                zd0Var3.mo11468x92b714fd(bArr);
            }
            this.f451498f = zd0Var3;
        }
        return 0;
    }
}
