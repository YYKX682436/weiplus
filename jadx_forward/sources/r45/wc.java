package r45;

/* loaded from: classes8.dex */
public class wc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f470590d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f470591e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public int f470592f;

    /* renamed from: g, reason: collision with root package name */
    public int f470593g;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.wc)) {
            return false;
        }
        r45.wc wcVar = (r45.wc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f470590d), java.lang.Integer.valueOf(wcVar.f470590d)) && n51.f.a(this.f470591e, wcVar.f470591e) && n51.f.a(java.lang.Integer.valueOf(this.f470592f), java.lang.Integer.valueOf(wcVar.f470592f)) && n51.f.a(java.lang.Integer.valueOf(this.f470593g), java.lang.Integer.valueOf(wcVar.f470593g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f470591e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f470590d);
            fVar.g(2, 8, linkedList);
            fVar.e(3, this.f470592f);
            fVar.e(4, this.f470593g);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f470590d) + 0 + b36.f.g(2, 8, linkedList) + b36.f.e(3, this.f470592f) + b36.f.e(4, this.f470593g);
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
        r45.wc wcVar = (r45.wc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            wcVar.f470590d = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 2) {
            if (intValue == 3) {
                wcVar.f470592f = aVar2.g(intValue);
                return 0;
            }
            if (intValue != 4) {
                return -1;
            }
            wcVar.f470593g = aVar2.g(intValue);
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr2 = (byte[]) j17.get(i18);
            r45.vc vcVar = new r45.vc();
            if (bArr2 != null && bArr2.length > 0) {
                vcVar.mo11468x92b714fd(bArr2);
            }
            wcVar.f470591e.add(vcVar);
        }
        return 0;
    }
}
