package r45;

/* loaded from: classes4.dex */
public class ue3 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f468829d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f468830e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.cu5 f468831f;

    static {
        new r45.ue3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ue3)) {
            return false;
        }
        r45.ue3 ue3Var = (r45.ue3) fVar;
        return n51.f.a(this.f76492x92037252, ue3Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f468829d), java.lang.Integer.valueOf(ue3Var.f468829d)) && n51.f.a(this.f468830e, ue3Var.f468830e) && n51.f.a(this.f468831f, ue3Var.f468831f);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: getBaseResponse */
    public r45.ie mo11484xe92ab0a8() {
        return this.f76492x92037252;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new r45.ue3();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f468830e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f468829d);
            fVar.g(3, 8, linkedList);
            r45.cu5 cu5Var = this.f468831f;
            if (cu5Var != null) {
                fVar.i(4, cu5Var.mo75928xcd1e8d8());
                this.f468831f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f468829d) + b36.f.g(3, 8, linkedList);
            r45.cu5 cu5Var2 = this.f468831f;
            return cu5Var2 != null ? i18 + b36.f.i(4, cu5Var2.mo75928xcd1e8d8()) : i18;
        }
        if (i17 == 2) {
            linkedList.clear();
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
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                this.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            this.f468829d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                r45.rj0 rj0Var = new r45.rj0();
                if (bArr2 != null && bArr2.length > 0) {
                    rj0Var.mo11468x92b714fd(bArr2);
                }
                linkedList.add(rj0Var);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            r45.cu5 cu5Var3 = new r45.cu5();
            if (bArr3 != null && bArr3.length > 0) {
                cu5Var3.b(bArr3);
            }
            this.f468831f = cu5Var3;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (r45.ue3) super.mo11468x92b714fd(bArr);
    }

    @Override // r45.js5, r45.ny3
    /* renamed from: setBaseResponse */
    public r45.ny3 mo11485x1f73abb4(r45.ie ieVar) {
        this.f76492x92037252 = ieVar;
        return this;
    }
}
