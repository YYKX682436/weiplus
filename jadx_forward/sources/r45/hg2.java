package r45;

/* loaded from: classes2.dex */
public class hg2 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ig2 f457666d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f457667e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public r45.lg2 f457668f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.hg2)) {
            return false;
        }
        r45.hg2 hg2Var = (r45.hg2) fVar;
        return n51.f.a(this.f76492x92037252, hg2Var.f76492x92037252) && n51.f.a(this.f457666d, hg2Var.f457666d) && n51.f.a(this.f457667e, hg2Var.f457667e) && n51.f.a(this.f457668f, hg2Var.f457668f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f457667e;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            r45.ig2 ig2Var = this.f457666d;
            if (ig2Var != null) {
                fVar.i(2, ig2Var.mo75928xcd1e8d8());
                this.f457666d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList);
            r45.lg2 lg2Var = this.f457668f;
            if (lg2Var != null) {
                fVar.i(4, lg2Var.mo75928xcd1e8d8());
                this.f457668f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0;
            r45.ig2 ig2Var2 = this.f457666d;
            if (ig2Var2 != null) {
                i18 += b36.f.i(2, ig2Var2.mo75928xcd1e8d8());
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            r45.lg2 lg2Var2 = this.f457668f;
            return lg2Var2 != null ? g17 + b36.f.i(4, lg2Var2.mo75928xcd1e8d8()) : g17;
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
        r45.hg2 hg2Var = (r45.hg2) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr2 = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr2 != null && bArr2.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr2);
                }
                hg2Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr3 = (byte[]) j18.get(i27);
                r45.ig2 ig2Var3 = new r45.ig2();
                if (bArr3 != null && bArr3.length > 0) {
                    ig2Var3.mo11468x92b714fd(bArr3);
                }
                hg2Var.f457666d = ig2Var3;
            }
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j19 = aVar2.j(intValue);
            int size3 = j19.size();
            for (int i28 = 0; i28 < size3; i28++) {
                byte[] bArr4 = (byte[]) j19.get(i28);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                if (bArr4 != null && bArr4.length > 0) {
                    c19792x256d2725.mo11468x92b714fd(bArr4);
                }
                hg2Var.f457667e.add(c19792x256d2725);
            }
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j27 = aVar2.j(intValue);
        int size4 = j27.size();
        for (int i29 = 0; i29 < size4; i29++) {
            byte[] bArr5 = (byte[]) j27.get(i29);
            r45.lg2 lg2Var3 = new r45.lg2();
            if (bArr5 != null && bArr5.length > 0) {
                lg2Var3.mo11468x92b714fd(bArr5);
            }
            hg2Var.f457668f = lg2Var3;
        }
        return 0;
    }
}
