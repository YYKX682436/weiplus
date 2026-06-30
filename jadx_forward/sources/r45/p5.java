package r45;

/* loaded from: classes8.dex */
public class p5 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.l5 f464286d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.LinkedList f464287e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f464288f;

    static {
        new r45.p5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r45.p5 mo11468x92b714fd(byte[] bArr) {
        return (r45.p5) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.p5)) {
            return false;
        }
        r45.p5 p5Var = (r45.p5) fVar;
        return n51.f.a(this.f464286d, p5Var.f464286d) && n51.f.a(this.f464287e, p5Var.f464287e) && n51.f.a(this.f464288f, p5Var.f464288f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.p5();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.l5 l5Var = this.f464286d;
            if (l5Var != null) {
                fVar.i(1, l5Var.mo75928xcd1e8d8());
                this.f464286d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 8, this.f464287e);
            java.lang.String str = this.f464288f;
            if (str != null) {
                fVar.j(6, str);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.l5 l5Var2 = this.f464286d;
            int i18 = (l5Var2 != null ? 0 + b36.f.i(1, l5Var2.mo75928xcd1e8d8()) : 0) + b36.f.g(2, 8, this.f464287e);
            java.lang.String str2 = this.f464288f;
            return str2 != null ? i18 + b36.f.j(6, str2) : i18;
        }
        if (i17 == 2) {
            this.f464287e.clear();
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.l5 l5Var3 = new r45.l5();
                if (bArr != null && bArr.length > 0) {
                    l5Var3.mo11468x92b714fd(bArr);
                }
                this.f464286d = l5Var3;
            }
            return 0;
        }
        if (intValue != 2) {
            if (intValue != 6) {
                return -1;
            }
            this.f464288f = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.o5 o5Var = new r45.o5();
            if (bArr2 != null && bArr2.length > 0) {
                o5Var.mo11468x92b714fd(bArr2);
            }
            this.f464287e.add(o5Var);
        }
        return 0;
    }
}
