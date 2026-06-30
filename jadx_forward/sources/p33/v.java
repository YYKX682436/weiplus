package p33;

/* loaded from: classes2.dex */
public class v extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public p33.r f433189e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f433188d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f433190f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f433191g = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof p33.v)) {
            return false;
        }
        p33.v vVar = (p33.v) fVar;
        return n51.f.a(this.f433188d, vVar.f433188d) && n51.f.a(this.f433189e, vVar.f433189e) && n51.f.a(this.f433190f, vVar.f433190f) && n51.f.a(this.f433191g, vVar.f433191g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f433191g;
        java.util.LinkedList linkedList2 = this.f433190f;
        java.util.LinkedList linkedList3 = this.f433188d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList3);
            p33.r rVar = this.f433189e;
            if (rVar != null) {
                fVar.i(2, rVar.mo75928xcd1e8d8());
                this.f433189e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList3) + 0;
            p33.r rVar2 = this.f433189e;
            if (rVar2 != null) {
                g17 += b36.f.i(2, rVar2.mo75928xcd1e8d8());
            }
            return g17 + b36.f.g(3, 8, linkedList2) + b36.f.g(4, 8, linkedList);
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
        p33.v vVar = (p33.v) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr2 = (byte[]) j17.get(i18);
                p33.i0 i0Var = new p33.i0();
                if (bArr2 != null && bArr2.length > 0) {
                    i0Var.mo11468x92b714fd(bArr2);
                }
                vVar.f433188d.add(i0Var);
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr3 = (byte[]) j18.get(i19);
                p33.r rVar3 = new p33.r();
                if (bArr3 != null && bArr3.length > 0) {
                    rVar3.mo11468x92b714fd(bArr3);
                }
                vVar.f433189e = rVar3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i27 = 0; i27 < size3; i27++) {
                byte[] bArr4 = (byte[]) j19.get(i27);
                p33.f fVar2 = new p33.f();
                if (bArr4 != null && bArr4.length > 0) {
                    fVar2.mo11468x92b714fd(bArr4);
                }
                vVar.f433190f.add(fVar2);
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
            p33.h0 h0Var = new p33.h0();
            if (bArr5 != null && bArr5.length > 0) {
                h0Var.mo11468x92b714fd(bArr5);
            }
            vVar.f433191g.add(h0Var);
        }
        return 0;
    }
}
