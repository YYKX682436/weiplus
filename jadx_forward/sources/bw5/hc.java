package bw5;

/* loaded from: classes2.dex */
public class hc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f109678d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.wz f109679e;

    /* renamed from: f, reason: collision with root package name */
    public bw5.wq f109680f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.qj f109681g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f109682h = new boolean[5];

    static {
        new bw5.hc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hc mo11468x92b714fd(byte[] bArr) {
        return (bw5.hc) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hc)) {
            return false;
        }
        bw5.hc hcVar = (bw5.hc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f109678d), java.lang.Integer.valueOf(hcVar.f109678d)) && n51.f.a(this.f109679e, hcVar.f109679e) && n51.f.a(this.f109680f, hcVar.f109680f) && n51.f.a(this.f109681g, hcVar.f109681g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.hc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f109682h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f109678d);
            }
            bw5.wz wzVar = this.f109679e;
            if (wzVar != null && zArr[2]) {
                fVar.i(2, wzVar.mo75928xcd1e8d8());
                this.f109679e.mo75956x3d5d1f78(fVar);
            }
            bw5.wq wqVar = this.f109680f;
            if (wqVar != null && zArr[3]) {
                fVar.i(3, wqVar.mo75928xcd1e8d8());
                this.f109680f.mo75956x3d5d1f78(fVar);
            }
            bw5.qj qjVar = this.f109681g;
            if (qjVar != null && zArr[4]) {
                fVar.i(4, qjVar.mo75928xcd1e8d8());
                this.f109681g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f109678d) : 0;
            bw5.wz wzVar2 = this.f109679e;
            if (wzVar2 != null && zArr[2]) {
                e17 += b36.f.i(2, wzVar2.mo75928xcd1e8d8());
            }
            bw5.wq wqVar2 = this.f109680f;
            if (wqVar2 != null && zArr[3]) {
                e17 += b36.f.i(3, wqVar2.mo75928xcd1e8d8());
            }
            bw5.qj qjVar2 = this.f109681g;
            return (qjVar2 == null || !zArr[4]) ? e17 : e17 + b36.f.i(4, qjVar2.mo75928xcd1e8d8());
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
            this.f109678d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.wz wzVar3 = new bw5.wz();
                if (bArr != null && bArr.length > 0) {
                    wzVar3.mo11468x92b714fd(bArr);
                }
                this.f109679e = wzVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.wq wqVar3 = new bw5.wq();
                if (bArr2 != null && bArr2.length > 0) {
                    wqVar3.mo11468x92b714fd(bArr2);
                }
                this.f109680f = wqVar3;
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            bw5.qj qjVar3 = new bw5.qj();
            if (bArr3 != null && bArr3.length > 0) {
                qjVar3.mo11468x92b714fd(bArr3);
            }
            this.f109681g = qjVar3;
        }
        zArr[4] = true;
        return 0;
    }
}
