package bw5;

/* loaded from: classes2.dex */
public class vk0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ro f115920d;

    /* renamed from: e, reason: collision with root package name */
    public int f115921e;

    /* renamed from: f, reason: collision with root package name */
    public int f115922f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f115923g = new boolean[4];

    static {
        new bw5.vk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.vk0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.vk0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.vk0)) {
            return false;
        }
        bw5.vk0 vk0Var = (bw5.vk0) fVar;
        return n51.f.a(this.f115920d, vk0Var.f115920d) && n51.f.a(java.lang.Integer.valueOf(this.f115921e), java.lang.Integer.valueOf(vk0Var.f115921e)) && n51.f.a(java.lang.Integer.valueOf(this.f115922f), java.lang.Integer.valueOf(vk0Var.f115922f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.vk0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f115923g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ro roVar = this.f115920d;
            if (roVar != null && zArr[1]) {
                fVar.i(1, roVar.mo75928xcd1e8d8());
                this.f115920d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.e(2, this.f115921e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f115922f);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.ro roVar2 = this.f115920d;
            if (roVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, roVar2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f115921e);
            }
            return zArr[3] ? i18 + b36.f.e(3, this.f115922f) : i18;
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
        if (intValue != 1) {
            if (intValue == 2) {
                this.f115921e = aVar2.g(intValue);
                zArr[2] = true;
                return 0;
            }
            if (intValue != 3) {
                return -1;
            }
            this.f115922f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ro roVar3 = new bw5.ro();
            if (bArr != null && bArr.length > 0) {
                roVar3.mo11468x92b714fd(bArr);
            }
            this.f115920d = roVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
