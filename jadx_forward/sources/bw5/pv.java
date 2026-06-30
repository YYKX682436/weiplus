package bw5;

/* loaded from: classes2.dex */
public class pv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f113381d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f113382e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f113383f;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f113386i;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f113384g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f113385h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f113387m = new boolean[7];

    static {
        new bw5.pv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.pv mo11468x92b714fd(byte[] bArr) {
        return (bw5.pv) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.pv)) {
            return false;
        }
        bw5.pv pvVar = (bw5.pv) fVar;
        return n51.f.a(this.f113381d, pvVar.f113381d) && n51.f.a(this.f113382e, pvVar.f113382e) && n51.f.a(this.f113383f, pvVar.f113383f) && n51.f.a(this.f113384g, pvVar.f113384g) && n51.f.a(this.f113385h, pvVar.f113385h) && n51.f.a(this.f113386i, pvVar.f113386i);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.pv();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f113385h;
        java.util.LinkedList linkedList2 = this.f113384g;
        int i18 = 0;
        boolean[] zArr = this.f113387m;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f113381d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f113382e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f113383f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList2);
            fVar.g(5, 1, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f113386i;
            if (gVar != null && zArr[6]) {
                fVar.b(6, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f113381d;
            if (str4 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str4);
            }
            java.lang.String str5 = this.f113382e;
            if (str5 != null && zArr[2]) {
                i18 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f113383f;
            if (str6 != null && zArr[3]) {
                i18 += b36.f.j(3, str6);
            }
            int g17 = i18 + b36.f.g(4, 1, linkedList2) + b36.f.g(5, 1, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f113386i;
            return (gVar2 == null || !zArr[6]) ? g17 : g17 + b36.f.b(6, gVar2);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
                this.f113381d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f113382e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f113383f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                linkedList2.add(aVar2.k(intValue));
                zArr[4] = true;
                return 0;
            case 5:
                linkedList.add(aVar2.k(intValue));
                zArr[5] = true;
                return 0;
            case 6:
                this.f113386i = aVar2.d(intValue);
                zArr[6] = true;
                return 0;
            default:
                return -1;
        }
    }
}
