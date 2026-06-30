package r45;

/* loaded from: classes4.dex */
public class ri extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.qi f466414d;

    /* renamed from: e, reason: collision with root package name */
    public int f466415e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f466416f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f466417g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f466418h = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ri)) {
            return false;
        }
        r45.ri riVar = (r45.ri) fVar;
        return n51.f.a(this.f466414d, riVar.f466414d) && n51.f.a(java.lang.Integer.valueOf(this.f466415e), java.lang.Integer.valueOf(riVar.f466415e)) && n51.f.a(this.f466416f, riVar.f466416f) && n51.f.a(this.f466417g, riVar.f466417g) && n51.f.a(this.f466418h, riVar.f466418h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f466418h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.qi qiVar = this.f466414d;
            if (qiVar != null) {
                fVar.i(1, qiVar.mo75928xcd1e8d8());
                this.f466414d.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f466415e);
            java.lang.String str = this.f466416f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f466417g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.g(5, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            r45.qi qiVar2 = this.f466414d;
            int i18 = (qiVar2 != null ? 0 + b36.f.i(1, qiVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f466415e);
            java.lang.String str3 = this.f466416f;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f466417g;
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
        r45.ri riVar = (r45.ri) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.qi qiVar3 = new r45.qi();
                if (bArr2 != null && bArr2.length > 0) {
                    qiVar3.mo11468x92b714fd(bArr2);
                }
                riVar.f466414d = qiVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            riVar.f466415e = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            riVar.f466416f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            riVar.f466417g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.qi qiVar4 = new r45.qi();
            if (bArr3 != null && bArr3.length > 0) {
                qiVar4.mo11468x92b714fd(bArr3);
            }
            riVar.f466418h.add(qiVar4);
        }
        return 0;
    }
}
