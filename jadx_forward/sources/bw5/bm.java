package bw5;

/* loaded from: classes2.dex */
public class bm extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f107276e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f107277f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f107278g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f107279h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f107280i;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f107275d = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f107281m = new boolean[7];

    static {
        new bw5.bm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.bm mo11468x92b714fd(byte[] bArr) {
        return (bw5.bm) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.bm)) {
            return false;
        }
        bw5.bm bmVar = (bw5.bm) fVar;
        return n51.f.a(this.f107275d, bmVar.f107275d) && n51.f.a(this.f107276e, bmVar.f107276e) && n51.f.a(this.f107277f, bmVar.f107277f) && n51.f.a(this.f107278g, bmVar.f107278g) && n51.f.a(java.lang.Boolean.valueOf(this.f107279h), java.lang.Boolean.valueOf(bmVar.f107279h)) && n51.f.a(this.f107280i, bmVar.f107280i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.bm();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f107275d;
        boolean[] zArr = this.f107281m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            java.lang.String str = this.f107276e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f107277f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f107278g;
            if (str3 != null && zArr[4]) {
                fVar.j(4, str3);
            }
            if (zArr[5]) {
                fVar.a(5, this.f107279h);
            }
            java.lang.String str4 = this.f107280i;
            if (str4 != null && zArr[6]) {
                fVar.j(6, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            java.lang.String str5 = this.f107276e;
            if (str5 != null && zArr[2]) {
                g17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f107277f;
            if (str6 != null && zArr[3]) {
                g17 += b36.f.j(3, str6);
            }
            java.lang.String str7 = this.f107278g;
            if (str7 != null && zArr[4]) {
                g17 += b36.f.j(4, str7);
            }
            if (zArr[5]) {
                g17 += b36.f.a(5, this.f107279h);
            }
            java.lang.String str8 = this.f107280i;
            return (str8 == null || !zArr[6]) ? g17 : g17 + b36.f.j(6, str8);
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
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.cm cmVar = new bw5.cm();
                    if (bArr != null && bArr.length > 0) {
                        cmVar.mo11468x92b714fd(bArr);
                    }
                    linkedList.add(cmVar);
                }
                zArr[1] = true;
                return 0;
            case 2:
                this.f107276e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f107277f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f107278g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f107279h = aVar2.c(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f107280i = aVar2.k(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
