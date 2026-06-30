package r45;

/* loaded from: classes4.dex */
public class ag extends r45.mr5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f451518d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f451519e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f451520f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f451521g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ag)) {
            return false;
        }
        r45.ag agVar = (r45.ag) fVar;
        return n51.f.a(this.f76494x2de60e5e, agVar.f76494x2de60e5e) && n51.f.a(this.f451518d, agVar.f451518d) && n51.f.a(this.f451519e, agVar.f451519e) && n51.f.a(this.f451520f, agVar.f451520f) && n51.f.a(this.f451521g, agVar.f451521g);
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
            java.lang.String str = this.f451518d;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f451519e;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.g(4, 1, this.f451520f);
            java.lang.String str3 = this.f451521g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.he heVar2 = this.f76494x2de60e5e;
            int i18 = heVar2 != null ? 0 + b36.f.i(1, heVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f451518d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            java.lang.String str5 = this.f451519e;
            if (str5 != null) {
                i18 += b36.f.j(3, str5);
            }
            int g17 = i18 + b36.f.g(4, 1, this.f451520f);
            java.lang.String str6 = this.f451521g;
            return str6 != null ? g17 + b36.f.j(5, str6) : g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f451520f.clear();
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
        r45.ag agVar = (r45.ag) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.he heVar3 = new r45.he();
                if (bArr2 != null && bArr2.length > 0) {
                    heVar3.mo11468x92b714fd(bArr2);
                }
                agVar.f76494x2de60e5e = heVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            agVar.f451518d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            agVar.f451519e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            agVar.f451520f.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        agVar.f451521g = aVar2.k(intValue);
        return 0;
    }
}
