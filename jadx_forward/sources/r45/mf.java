package r45;

/* loaded from: classes9.dex */
public class mf extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f461968d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f461969e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f461970f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.mf)) {
            return false;
        }
        r45.mf mfVar = (r45.mf) fVar;
        return n51.f.a(this.f76492x92037252, mfVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f461968d), java.lang.Integer.valueOf(mfVar.f461968d)) && n51.f.a(this.f461969e, mfVar.f461969e) && n51.f.a(this.f461970f, mfVar.f461970f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461969e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f461968d);
            fVar.g(3, 8, linkedList);
            r45.cu5 cu5Var = this.f461970f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.mo75928xcd1e8d8());
                this.f461970f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f461968d) + b36.f.g(3, 8, linkedList);
            r45.cu5 cu5Var2 = this.f461970f;
            return cu5Var2 != null ? i18 + b36.f.i(4, cu5Var2.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        r45.mf mfVar = (r45.mf) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                mfVar.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            mfVar.f461968d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.tp0 tp0Var = new r45.tp0();
                if (bArr3 != null && bArr3.length > 0) {
                    tp0Var.mo11468x92b714fd(bArr3);
                }
                mfVar.f461969e.add(tp0Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr4 = (byte[]) j19.get(i28);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr4 != null && bArr4.length > 0) {
                cu5Var3.b(bArr4);
            }
            mfVar.f461970f = cu5Var3;
        }
        return 0;
    }
}
