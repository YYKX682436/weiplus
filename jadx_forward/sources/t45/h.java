package t45;

/* loaded from: classes2.dex */
public class h extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f497113d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f497114e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f497115f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f497116g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof t45.h)) {
            return false;
        }
        t45.h hVar = (t45.h) fVar;
        return n51.f.a(this.f497113d, hVar.f497113d) && n51.f.a(this.f497114e, hVar.f497114e) && n51.f.a(this.f497115f, hVar.f497115f) && n51.f.a(this.f497116g, hVar.f497116g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f497116g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f497113d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f497114e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f497115f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f497113d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f497114e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f497115f;
            if (str6 != null) {
                j17 += b36.f.j(3, str6);
            }
            return j17 + b36.f.g(4, 1, linkedList);
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
        t45.h hVar = (t45.h) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            hVar.f497113d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            hVar.f497114e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            hVar.f497115f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        hVar.f497116g.add(aVar2.k(intValue));
        return 0;
    }
}
