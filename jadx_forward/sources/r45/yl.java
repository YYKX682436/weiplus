package r45;

/* loaded from: classes2.dex */
public class yl extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f472722d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f472723e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f472724f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f472725g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f472726h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f472727i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f472728m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.LinkedList f472729n = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.LinkedList f472730o = new java.util.LinkedList();

    /* renamed from: p, reason: collision with root package name */
    public int f472731p;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.yl)) {
            return false;
        }
        r45.yl ylVar = (r45.yl) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f472722d), java.lang.Integer.valueOf(ylVar.f472722d)) && n51.f.a(this.f472723e, ylVar.f472723e) && n51.f.a(this.f472724f, ylVar.f472724f) && n51.f.a(this.f472725g, ylVar.f472725g) && n51.f.a(this.f472726h, ylVar.f472726h) && n51.f.a(this.f472727i, ylVar.f472727i) && n51.f.a(this.f472728m, ylVar.f472728m) && n51.f.a(this.f472729n, ylVar.f472729n) && n51.f.a(this.f472730o, ylVar.f472730o) && n51.f.a(java.lang.Integer.valueOf(this.f472731p), java.lang.Integer.valueOf(ylVar.f472731p));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f472730o;
        java.util.LinkedList linkedList2 = this.f472729n;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f472722d);
            java.lang.String str = this.f472723e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f472724f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            java.lang.String str3 = this.f472725g;
            if (str3 != null) {
                fVar.j(4, str3);
            }
            java.lang.String str4 = this.f472726h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            java.lang.String str5 = this.f472727i;
            if (str5 != null) {
                fVar.j(6, str5);
            }
            java.lang.String str6 = this.f472728m;
            if (str6 != null) {
                fVar.j(7, str6);
            }
            fVar.g(8, 8, linkedList2);
            fVar.g(9, 1, linkedList);
            fVar.e(10, this.f472731p);
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f472722d) + 0;
            java.lang.String str7 = this.f472723e;
            if (str7 != null) {
                e17 += b36.f.j(2, str7);
            }
            java.lang.String str8 = this.f472724f;
            if (str8 != null) {
                e17 += b36.f.j(3, str8);
            }
            java.lang.String str9 = this.f472725g;
            if (str9 != null) {
                e17 += b36.f.j(4, str9);
            }
            java.lang.String str10 = this.f472726h;
            if (str10 != null) {
                e17 += b36.f.j(5, str10);
            }
            java.lang.String str11 = this.f472727i;
            if (str11 != null) {
                e17 += b36.f.j(6, str11);
            }
            java.lang.String str12 = this.f472728m;
            if (str12 != null) {
                e17 += b36.f.j(7, str12);
            }
            return e17 + b36.f.g(8, 8, linkedList2) + b36.f.g(9, 1, linkedList) + b36.f.e(10, this.f472731p);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList2.clear();
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
        r45.yl ylVar = (r45.yl) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                ylVar.f472722d = aVar2.g(intValue);
                return 0;
            case 2:
                ylVar.f472723e = aVar2.k(intValue);
                return 0;
            case 3:
                ylVar.f472724f = aVar2.k(intValue);
                return 0;
            case 4:
                ylVar.f472725g = aVar2.k(intValue);
                return 0;
            case 5:
                ylVar.f472726h = aVar2.k(intValue);
                return 0;
            case 6:
                ylVar.f472727i = aVar2.k(intValue);
                return 0;
            case 7:
                ylVar.f472728m = aVar2.k(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    r45.xl xlVar = new r45.xl();
                    if (bArr2 != null && bArr2.length > 0) {
                        xlVar.mo11468x92b714fd(bArr2);
                    }
                    ylVar.f472729n.add(xlVar);
                }
                return 0;
            case 9:
                ylVar.f472730o.add(aVar2.k(intValue));
                return 0;
            case 10:
                ylVar.f472731p = aVar2.g(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
