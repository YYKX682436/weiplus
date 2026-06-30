package r45;

/* loaded from: classes4.dex */
public class ca0 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f452924d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f452925e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f452926f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f452927g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.ca0)) {
            return false;
        }
        r45.ca0 ca0Var = (r45.ca0) fVar;
        return n51.f.a(this.f76492x92037252, ca0Var.f76492x92037252) && n51.f.a(this.f452924d, ca0Var.f452924d) && n51.f.a(this.f452925e, ca0Var.f452925e) && n51.f.a(this.f452926f, ca0Var.f452926f) && n51.f.a(this.f452927g, ca0Var.f452927g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f452925e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f452924d;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            java.lang.String str2 = this.f452926f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f452927g;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f452924d;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            java.lang.String str5 = this.f452926f;
            if (str5 != null) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f452927g;
            return str6 != null ? g17 + b36.f.j(5, str6) : g17;
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
        r45.ca0 ca0Var = (r45.ca0) objArr[1];
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
                ca0Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            ca0Var.f452924d = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 3) {
            if (intValue == 4) {
                ca0Var.f452926f = aVar2.k(intValue);
                return 0;
            }
            if (intValue != 5) {
                return -1;
            }
            ca0Var.f452927g = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr3 = (byte[]) j18.get(i27);
            r45.yz4 yz4Var = new r45.yz4();
            if (bArr3 != null && bArr3.length > 0) {
                yz4Var.mo11468x92b714fd(bArr3);
            }
            ca0Var.f452925e.add(yz4Var);
        }
        return 0;
    }
}
