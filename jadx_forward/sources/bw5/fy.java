package bw5;

/* loaded from: classes8.dex */
public class fy extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f109092d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.vx f109093e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.yx f109094f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.ux f109095g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f109096h = new boolean[5];

    static {
        new bw5.fy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.fy mo11468x92b714fd(byte[] bArr) {
        return (bw5.fy) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.fy)) {
            return false;
        }
        bw5.fy fyVar = (bw5.fy) fVar;
        return n51.f.a(this.f109092d, fyVar.f109092d) && n51.f.a(this.f109093e, fyVar.f109093e) && n51.f.a(this.f109094f, fyVar.f109094f) && n51.f.a(this.f109095g, fyVar.f109095g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.fy();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109096h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f109092d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            bw5.vx vxVar = this.f109093e;
            if (vxVar != null && zArr[2]) {
                fVar.i(2, vxVar.mo75928xcd1e8d8());
                this.f109093e.mo75956x3d5d1f78(fVar);
            }
            bw5.yx yxVar = this.f109094f;
            if (yxVar != null && zArr[3]) {
                fVar.i(3, yxVar.mo75928xcd1e8d8());
                this.f109094f.mo75956x3d5d1f78(fVar);
            }
            bw5.ux uxVar = this.f109095g;
            if (uxVar != null && zArr[4]) {
                fVar.i(4, uxVar.mo75928xcd1e8d8());
                this.f109095g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f109092d;
            if (str2 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str2);
            }
            bw5.vx vxVar2 = this.f109093e;
            if (vxVar2 != null && zArr[2]) {
                i18 += b36.f.i(2, vxVar2.mo75928xcd1e8d8());
            }
            bw5.yx yxVar2 = this.f109094f;
            if (yxVar2 != null && zArr[3]) {
                i18 += b36.f.i(3, yxVar2.mo75928xcd1e8d8());
            }
            bw5.ux uxVar2 = this.f109095g;
            return (uxVar2 == null || !zArr[4]) ? i18 : i18 + b36.f.i(4, uxVar2.mo75928xcd1e8d8());
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
            this.f109092d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.vx vxVar3 = new bw5.vx();
                if (bArr != null && bArr.length > 0) {
                    vxVar3.mo11468x92b714fd(bArr);
                }
                this.f109093e = vxVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i27 = 0; i27 < size2; i27++) {
                byte[] bArr2 = (byte[]) j18.get(i27);
                bw5.yx yxVar3 = new bw5.yx();
                if (bArr2 != null && bArr2.length > 0) {
                    yxVar3.mo11468x92b714fd(bArr2);
                }
                this.f109094f = yxVar3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i28 = 0; i28 < size3; i28++) {
            byte[] bArr3 = (byte[]) j19.get(i28);
            bw5.ux uxVar3 = new bw5.ux();
            if (bArr3 != null && bArr3.length > 0) {
                uxVar3.mo11468x92b714fd(bArr3);
            }
            this.f109095g = uxVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
