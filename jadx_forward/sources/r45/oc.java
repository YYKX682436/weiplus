package r45;

/* loaded from: classes12.dex */
public class oc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.pc f463674d;

    /* renamed from: e, reason: collision with root package name */
    public r45.mc f463675e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.oc)) {
            return false;
        }
        r45.oc ocVar = (r45.oc) fVar;
        return n51.f.a(this.f463674d, ocVar.f463674d) && n51.f.a(this.f463675e, ocVar.f463675e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.pc pcVar = this.f463674d;
            if (pcVar != null) {
                fVar.i(1, pcVar.mo75928xcd1e8d8());
                this.f463674d.mo75956x3d5d1f78(fVar);
            }
            r45.mc mcVar = this.f463675e;
            if (mcVar != null) {
                fVar.i(2, mcVar.mo75928xcd1e8d8());
                this.f463675e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            r45.pc pcVar2 = this.f463674d;
            int i18 = pcVar2 != null ? 0 + b36.f.i(1, pcVar2.mo75928xcd1e8d8()) : 0;
            r45.mc mcVar2 = this.f463675e;
            return mcVar2 != null ? i18 + b36.f.i(2, mcVar2.mo75928xcd1e8d8()) : i18;
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
        r45.oc ocVar = (r45.oc) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.pc pcVar3 = new r45.pc();
                if (bArr != null && bArr.length > 0) {
                    pcVar3.mo11468x92b714fd(bArr);
                }
                ocVar.f463674d = pcVar3;
            }
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            r45.mc mcVar3 = new r45.mc();
            if (bArr2 != null && bArr2.length > 0) {
                mcVar3.mo11468x92b714fd(bArr2);
            }
            ocVar.f463675e = mcVar3;
        }
        return 0;
    }
}
