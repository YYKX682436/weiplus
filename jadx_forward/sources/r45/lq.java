package r45;

/* loaded from: classes4.dex */
public class lq extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: f, reason: collision with root package name */
    public boolean f461247f;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f461245d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f461246e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f461248g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.lq)) {
            return false;
        }
        r45.lq lqVar = (r45.lq) fVar;
        return n51.f.a(this.f461245d, lqVar.f461245d) && n51.f.a(this.f461246e, lqVar.f461246e) && n51.f.a(java.lang.Boolean.valueOf(this.f461247f), java.lang.Boolean.valueOf(lqVar.f461247f)) && n51.f.a(this.f461248g, lqVar.f461248g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f461248g;
        java.util.LinkedList linkedList2 = this.f461246e;
        java.util.LinkedList linkedList3 = this.f461245d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 2, linkedList3);
            fVar.g(2, 6, linkedList2);
            fVar.a(3, this.f461247f);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 2, linkedList3) + 0 + b36.f.g(2, 6, linkedList2) + b36.f.a(3, this.f461247f) + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList3.clear();
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
        r45.lq lqVar = (r45.lq) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            lqVar.f461245d.add(java.lang.Integer.valueOf(aVar2.g(intValue)));
            return 0;
        }
        if (intValue == 2) {
            lqVar.f461246e.add(aVar2.d(intValue));
            return 0;
        }
        if (intValue == 3) {
            lqVar.f461247f = aVar2.c(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.tr trVar = new r45.tr();
            if (bArr2 != null && bArr2.length > 0) {
                trVar.mo11468x92b714fd(bArr2);
            }
            lqVar.f461248g.add(trVar);
        }
        return 0;
    }
}
