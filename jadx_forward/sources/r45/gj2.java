package r45;

/* loaded from: classes2.dex */
public class gj2 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public r45.dg4 f456828e;

    /* renamed from: g, reason: collision with root package name */
    public r45.qb1 f456830g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f456827d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f456829f = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.gj2)) {
            return false;
        }
        r45.gj2 gj2Var = (r45.gj2) fVar;
        return n51.f.a(this.f456827d, gj2Var.f456827d) && n51.f.a(this.f456828e, gj2Var.f456828e) && n51.f.a(this.f456829f, gj2Var.f456829f) && n51.f.a(this.f456830g, gj2Var.f456830g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f456829f;
        java.util.LinkedList linkedList2 = this.f456827d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList2);
            r45.dg4 dg4Var = this.f456828e;
            if (dg4Var != null) {
                fVar.i(2, dg4Var.mo75928xcd1e8d8());
                this.f456828e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            r45.qb1 qb1Var = this.f456830g;
            if (qb1Var != null) {
                fVar.i(4, qb1Var.mo75928xcd1e8d8());
                this.f456830g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList2) + 0;
            r45.dg4 dg4Var2 = this.f456828e;
            if (dg4Var2 != null) {
                g17 += b36.f.i(2, dg4Var2.mo75928xcd1e8d8());
            }
            int g18 = g17 + b36.f.g(3, 8, linkedList);
            r45.qb1 qb1Var2 = this.f456830g;
            return qb1Var2 != null ? g18 + b36.f.i(4, qb1Var2.mo75928xcd1e8d8()) : g18;
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
        r45.gj2 gj2Var = (r45.gj2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                r45.ig4 ig4Var = new r45.ig4();
                if (bArr2 != null && bArr2.length > 0) {
                    ig4Var.mo11468x92b714fd(bArr2);
                }
                gj2Var.f456827d.add(ig4Var);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                r45.dg4 dg4Var3 = new r45.dg4();
                if (bArr3 != null && bArr3.length > 0) {
                    dg4Var3.mo11468x92b714fd(bArr3);
                }
                gj2Var.f456828e = dg4Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr4 = (byte[]) j19.get(i27);
                r45.dg4 dg4Var4 = new r45.dg4();
                if (bArr4 != null && bArr4.length > 0) {
                    dg4Var4.mo11468x92b714fd(bArr4);
                }
                gj2Var.f456829f.add(dg4Var4);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i28 = 0; i28 < size4; i28++) {
            byte[] bArr5 = (byte[]) j27.get(i28);
            r45.qb1 qb1Var3 = new r45.qb1();
            if (bArr5 != null && bArr5.length > 0) {
                qb1Var3.mo11468x92b714fd(bArr5);
            }
            gj2Var.f456830g = qb1Var3;
        }
        return 0;
    }
}
