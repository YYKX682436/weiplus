package r45;

/* loaded from: classes4.dex */
public class vd0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: h, reason: collision with root package name */
    public static final r45.vd0 f469666h = new r45.vd0();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f469667d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469668e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469669f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469670g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.vd0 mo11468x92b714fd(byte[] bArr) {
        return (r45.vd0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.vd0)) {
            return false;
        }
        r45.vd0 vd0Var = (r45.vd0) fVar;
        return n51.f.a(this.f469667d, vd0Var.f469667d) && n51.f.a(this.f469668e, vd0Var.f469668e) && n51.f.a(this.f469669f, vd0Var.f469669f) && n51.f.a(this.f469670g, vd0Var.f469670g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.vd0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f469667d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f469668e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f469669f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            java.lang.String str4 = this.f469670g;
            if (str4 != null) {
                fVar.j(4, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f469667d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f469668e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f469669f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            java.lang.String str8 = this.f469670g;
            return str8 != null ? j17 + b36.f.j(4, str8) : j17;
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
            this.f469667d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            this.f469668e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            this.f469669f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f469670g = aVar2.k(intValue);
        return 0;
    }
}
