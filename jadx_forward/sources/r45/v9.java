package r45;

/* loaded from: classes7.dex */
public class v9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f469527d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f469528e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f469529f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f469530g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f469531h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.v9)) {
            return false;
        }
        r45.v9 v9Var = (r45.v9) fVar;
        return n51.f.a(this.f469527d, v9Var.f469527d) && n51.f.a(this.f469528e, v9Var.f469528e) && n51.f.a(this.f469529f, v9Var.f469529f) && n51.f.a(this.f469530g, v9Var.f469530g) && n51.f.a(this.f469531h, v9Var.f469531h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f469527d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f469528e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f469529f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f469530g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f469531h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str5 = this.f469528e;
            if (str5 != null) {
                g17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f469529f;
            if (str6 != null) {
                g17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f469530g;
            if (str7 != null) {
                g17 += b36.f.j(4, str7);
            }
            java.lang.String str8 = this.f469531h;
            return str8 != null ? g17 + b36.f.j(5, str8) : g17;
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
        r45.v9 v9Var = (r45.v9) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.w9 w9Var = new r45.w9();
                if (bArr2 != null && bArr2.length > 0) {
                    w9Var.mo11468x92b714fd(bArr2);
                }
                v9Var.f469527d.add(w9Var);
            }
            return 0;
        }
        if (intValue == 2) {
            v9Var.f469528e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            v9Var.f469529f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            v9Var.f469530g = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        v9Var.f469531h = aVar2.k(intValue);
        return 0;
    }
}
