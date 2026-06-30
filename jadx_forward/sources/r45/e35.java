package r45;

/* loaded from: classes11.dex */
public class e35 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f454501d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f454502e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f454503f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f454504g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.e35)) {
            return false;
        }
        r45.e35 e35Var = (r45.e35) fVar;
        return n51.f.a(this.f454501d, e35Var.f454501d) && n51.f.a(this.f454502e, e35Var.f454502e) && n51.f.a(this.f454503f, e35Var.f454503f) && n51.f.a(this.f454504g, e35Var.f454504g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f454504g;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f454501d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f454502e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f454503f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            fVar.g(4, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str4 = this.f454501d;
            int j17 = str4 != null ? 0 + b36.f.j(1, str4) : 0;
            java.lang.String str5 = this.f454502e;
            if (str5 != null) {
                j17 += b36.f.j(2, str5);
            }
            java.lang.String str6 = this.f454503f;
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
        r45.e35 e35Var = (r45.e35) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            e35Var.f454501d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            e35Var.f454502e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            e35Var.f454503f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        e35Var.f454504g.add(aVar2.k(intValue));
        return 0;
    }
}
