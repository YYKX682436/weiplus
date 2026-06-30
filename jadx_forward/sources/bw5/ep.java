package bw5;

/* loaded from: classes2.dex */
public class ep extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.dp f108515d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.gp f108516e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f108517f = new boolean[3];

    static {
        new bw5.ep();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ep mo11468x92b714fd(byte[] bArr) {
        return (bw5.ep) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ep)) {
            return false;
        }
        bw5.ep epVar = (bw5.ep) fVar;
        return n51.f.a(this.f108515d, epVar.f108515d) && n51.f.a(this.f108516e, epVar.f108516e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ep();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f108517f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.dp dpVar = this.f108515d;
            if (dpVar != null && zArr[1]) {
                fVar.i(1, dpVar.mo75928xcd1e8d8());
                this.f108515d.mo75956x3d5d1f78(fVar);
            }
            bw5.gp gpVar = this.f108516e;
            if (gpVar != null && zArr[2]) {
                fVar.i(2, gpVar.mo75928xcd1e8d8());
                this.f108516e.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.dp dpVar2 = this.f108515d;
            if (dpVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, dpVar2.mo75928xcd1e8d8());
            }
            bw5.gp gpVar2 = this.f108516e;
            return (gpVar2 == null || !zArr[2]) ? i18 : i18 + b36.f.i(2, gpVar2.mo75928xcd1e8d8());
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
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.dp dpVar3 = new bw5.dp();
                if (bArr != null && bArr.length > 0) {
                    dpVar3.mo11468x92b714fd(bArr);
                }
                this.f108515d = dpVar3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.gp gpVar3 = new bw5.gp();
            if (bArr2 != null && bArr2.length > 0) {
                gpVar3.mo11468x92b714fd(bArr2);
            }
            this.f108516e = gpVar3;
        }
        zArr[2] = true;
        return 0;
    }
}
