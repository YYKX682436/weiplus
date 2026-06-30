package bw5;

/* loaded from: classes2.dex */
public class mc extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f111693d;

    /* renamed from: e, reason: collision with root package name */
    public int f111694e;

    /* renamed from: g, reason: collision with root package name */
    public long f111696g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f111695f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f111697h = new boolean[21];

    static {
        new bw5.mc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mc mo11468x92b714fd(byte[] bArr) {
        return (bw5.mc) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mc)) {
            return false;
        }
        bw5.mc mcVar = (bw5.mc) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f111693d), java.lang.Integer.valueOf(mcVar.f111693d)) && n51.f.a(java.lang.Integer.valueOf(this.f111694e), java.lang.Integer.valueOf(mcVar.f111694e)) && n51.f.a(this.f111695f, mcVar.f111695f) && n51.f.a(java.lang.Long.valueOf(this.f111696g), java.lang.Long.valueOf(mcVar.f111696g));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.mc();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111695f;
        boolean[] zArr = this.f111697h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f111693d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f111694e);
            }
            fVar.g(3, 8, linkedList);
            if (zArr[20]) {
                fVar.h(20, this.f111696g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f111693d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f111694e);
            }
            int g17 = e17 + b36.f.g(3, 8, linkedList);
            return zArr[20] ? g17 + b36.f.h(20, this.f111696g) : g17;
        }
        if (i17 == 2) {
            linkedList.clear();
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
            this.f111693d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111694e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            if (intValue != 20) {
                return -1;
            }
            this.f111696g = aVar2.i(intValue);
            zArr[20] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.fh fhVar = new bw5.fh();
            if (bArr != null && bArr.length > 0) {
                fhVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(fhVar);
        }
        zArr[3] = true;
        return 0;
    }
}
