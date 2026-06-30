package r45;

/* loaded from: classes8.dex */
public class tu extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public int f468337d;

    /* renamed from: e, reason: collision with root package name */
    public r45.cu5 f468338e;

    /* renamed from: f, reason: collision with root package name */
    public r45.w54 f468339f;

    /* renamed from: g, reason: collision with root package name */
    public int f468340g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.tu)) {
            return false;
        }
        r45.tu tuVar = (r45.tu) fVar;
        return n51.f.a(this.f76494x2de60e5e, tuVar.f76494x2de60e5e) && n51.f.a(java.lang.Integer.valueOf(this.f468337d), java.lang.Integer.valueOf(tuVar.f468337d)) && n51.f.a(this.f468338e, tuVar.f468338e) && n51.f.a(this.f468339f, tuVar.f468339f) && n51.f.a(java.lang.Integer.valueOf(this.f468340g), java.lang.Integer.valueOf(tuVar.f468340g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.he heVar = this.f76494x2de60e5e;
            if (heVar != null) {
                fVar.i(1, heVar.mo75928xcd1e8d8());
                this.f76494x2de60e5e.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f468337d);
            r45.cu5 cu5Var = this.f468338e;
            if (cu5Var != null) {
                fVar.i(3, cu5Var.mo75928xcd1e8d8());
                this.f468338e.mo75956x3d5d1f78(fVar);
            }
            r45.w54 w54Var = this.f468339f;
            if (w54Var != null) {
                fVar.i(4, w54Var.mo75928xcd1e8d8());
                this.f468339f.mo75956x3d5d1f78(fVar);
            }
            fVar.e(5, this.f468340g);
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = (heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f468337d);
            r45.cu5 cu5Var2 = this.f468338e;
            if (cu5Var2 != null) {
                i18 += b36.f.i(3, cu5Var2.mo75928xcd1e8d8());
            }
            r45.w54 w54Var2 = this.f468339f;
            if (w54Var2 != null) {
                i18 += b36.f.i(4, w54Var2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.e(5, this.f468340g);
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
        r45.tu tuVar = (r45.tu) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr != null && bArr.length > 0) {
                    heVar3.mo11468x92b714fd(bArr);
                }
                tuVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            tuVar.f468337d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.cu5 cu5Var3 = new r45.cu5();
                if (bArr2 != null && bArr2.length > 0) {
                    cu5Var3.b(bArr2);
                }
                tuVar.f468338e = cu5Var3;
            }
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            tuVar.f468340g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.w54 w54Var3 = new r45.w54();
            if (bArr3 != null && bArr3.length > 0) {
                w54Var3.mo11468x92b714fd(bArr3);
            }
            tuVar.f468339f = w54Var3;
        }
        return 0;
    }
}
