package p33;

/* loaded from: classes4.dex */
public class o extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f433157d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f433158e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f433159f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f433160g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p33.o)) {
            return false;
        }
        p33.o oVar = (p33.o) fVar;
        return n51.f.a(this.f76492x92037252, oVar.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f433157d), java.lang.Integer.valueOf(oVar.f433157d)) && n51.f.a(this.f433158e, oVar.f433158e) && n51.f.a(this.f433159f, oVar.f433159f) && n51.f.a(this.f433160g, oVar.f433160g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f433160g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f433157d);
            java.lang.String str = this.f433158e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f433159f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f433157d);
            java.lang.String str3 = this.f433158e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f433159f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.g(5, 8, linkedList);
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
        p33.o oVar = (p33.o) objArr[1];
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
                oVar.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            oVar.f433157d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            oVar.f433158e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            oVar.f433159f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            p33.e0 e0Var = new p33.e0();
            if (bArr3 != null && bArr3.length > 0) {
                e0Var.mo11468x92b714fd(bArr3);
            }
            oVar.f433160g.add(e0Var);
        }
        return 0;
    }
}
