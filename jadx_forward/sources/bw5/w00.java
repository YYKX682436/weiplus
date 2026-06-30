package bw5;

/* loaded from: classes2.dex */
public class w00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f116081d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f116083f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.pj f116084g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f116085h;

    /* renamed from: i, reason: collision with root package name */
    public bw5.x7 f116086i;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f116082e = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f116087m = new boolean[7];

    static {
        new bw5.w00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.w00 mo11468x92b714fd(byte[] bArr) {
        return (bw5.w00) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.w00)) {
            return false;
        }
        bw5.w00 w00Var = (bw5.w00) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f116081d), java.lang.Integer.valueOf(w00Var.f116081d)) && n51.f.a(this.f116082e, w00Var.f116082e) && n51.f.a(this.f116083f, w00Var.f116083f) && n51.f.a(this.f116084g, w00Var.f116084g) && n51.f.a(this.f116085h, w00Var.f116085h) && n51.f.a(this.f116086i, w00Var.f116086i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.w00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116082e;
        boolean[] zArr = this.f116087m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f116081d);
            }
            fVar.g(2, 1, linkedList);
            java.lang.String str = this.f116083f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            bw5.pj pjVar = this.f116084g;
            if (pjVar != null && zArr[4]) {
                fVar.i(4, pjVar.mo75928xcd1e8d8());
                this.f116084g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str2 = this.f116085h;
            if (str2 != null && zArr[5]) {
                fVar.j(5, str2);
            }
            bw5.x7 x7Var = this.f116086i;
            if (x7Var != null && zArr[6]) {
                fVar.i(6, x7Var.mo75928xcd1e8d8());
                this.f116086i.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = (zArr[1] ? 0 + b36.f.e(1, this.f116081d) : 0) + b36.f.g(2, 1, linkedList);
            java.lang.String str3 = this.f116083f;
            if (str3 != null && zArr[3]) {
                e17 += b36.f.j(3, str3);
            }
            bw5.pj pjVar2 = this.f116084g;
            if (pjVar2 != null && zArr[4]) {
                e17 += b36.f.i(4, pjVar2.mo75928xcd1e8d8());
            }
            java.lang.String str4 = this.f116085h;
            if (str4 != null && zArr[5]) {
                e17 += b36.f.j(5, str4);
            }
            bw5.x7 x7Var2 = this.f116086i;
            return (x7Var2 == null || !zArr[6]) ? e17 : e17 + b36.f.i(6, x7Var2.mo75928xcd1e8d8());
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
        switch (intValue) {
            case 1:
                this.f116081d = aVar2.g(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                linkedList.add(aVar2.k(intValue));
                zArr[2] = true;
                return 0;
            case 3:
                this.f116083f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.pj pjVar3 = new bw5.pj();
                    if (bArr != null && bArr.length > 0) {
                        pjVar3.mo11468x92b714fd(bArr);
                    }
                    this.f116084g = pjVar3;
                }
                zArr[4] = true;
                return 0;
            case 5:
                this.f116085h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr2 = (byte[]) j18.get(i19);
                    bw5.x7 x7Var3 = new bw5.x7();
                    if (bArr2 != null && bArr2.length > 0) {
                        x7Var3.mo11468x92b714fd(bArr2);
                    }
                    this.f116086i = x7Var3;
                }
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
