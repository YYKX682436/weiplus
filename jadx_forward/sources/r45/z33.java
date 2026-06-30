package r45;

/* loaded from: classes8.dex */
public class z33 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.x33 f473205d;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        return fVar != null && (fVar instanceof r45.z33) && n51.f.a(this.f473205d, ((r45.z33) fVar).f473205d);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.x33 x33Var = this.f473205d;
            if (x33Var != null) {
                fVar.i(1, x33Var.mo75928xcd1e8d8());
                this.f473205d.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.x33 x33Var2 = this.f473205d;
            if (x33Var2 != null) {
                return 0 + b36.f.i(1, x33Var2.mo75928xcd1e8d8());
            }
            return 0;
        }
        if (i17 == 2) {
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
        r45.z33 z33Var = (r45.z33) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            r45.x33 x33Var3 = new r45.x33();
            if (bArr != null && bArr.length > 0) {
                x33Var3.mo11468x92b714fd(bArr);
            }
            z33Var.f473205d = x33Var3;
        }
        return 0;
    }
}
