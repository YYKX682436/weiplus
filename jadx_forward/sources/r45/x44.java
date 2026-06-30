package r45;

/* loaded from: classes4.dex */
public class x44 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f471302d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f471303e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f471304f;

    static {
        new r45.x44();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.x44)) {
            return false;
        }
        r45.x44 x44Var = (r45.x44) fVar;
        return n51.f.a(this.f471302d, x44Var.f471302d) && n51.f.a(this.f471303e, x44Var.f471303e) && n51.f.a(this.f471304f, x44Var.f471304f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.x44();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f471302d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f471303e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f471304f;
            if (gVar != null) {
                fVar.b(3, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f471302d;
            int j17 = str3 != null ? 0 + b36.f.j(1, str3) : 0;
            java.lang.String str4 = this.f471303e;
            if (str4 != null) {
                j17 += b36.f.j(2, str4);
            }
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f471304f;
            return gVar2 != null ? j17 + b36.f.b(3, gVar2) : j17;
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
            this.f471302d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f471303e = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f471304f = aVar2.d(intValue);
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.x44) super.mo11468x92b714fd(bArr);
    }
}
