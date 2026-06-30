package bw5;

/* loaded from: classes8.dex */
public class t9 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.r9 f114848d;

    /* renamed from: e, reason: collision with root package name */
    public long f114849e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f114850f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f114851g = new boolean[5];

    static {
        new bw5.t9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.t9 mo11468x92b714fd(byte[] bArr) {
        return (bw5.t9) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.t9)) {
            return false;
        }
        bw5.t9 t9Var = (bw5.t9) fVar;
        return n51.f.a(this.f114848d, t9Var.f114848d) && n51.f.a(java.lang.Long.valueOf(this.f114849e), java.lang.Long.valueOf(t9Var.f114849e)) && n51.f.a(this.f114850f, t9Var.f114850f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.t9();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f114850f;
        boolean[] zArr = this.f114851g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.r9 r9Var = this.f114848d;
            if (r9Var != null && zArr[1]) {
                fVar.i(1, r9Var.mo75928xcd1e8d8());
                this.f114848d.mo75956x3d5d1f78(fVar);
            }
            if (zArr[2]) {
                fVar.h(2, this.f114849e);
            }
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.r9 r9Var2 = this.f114848d;
            if (r9Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, r9Var2.mo75928xcd1e8d8());
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f114849e);
            }
            return i18 + b36.f.g(4, 8, linkedList);
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
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.r9 r9Var3 = new bw5.r9();
                if (bArr != null && bArr.length > 0) {
                    r9Var3.mo11468x92b714fd(bArr);
                }
                this.f114848d = r9Var3;
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f114849e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.s9 s9Var = new bw5.s9();
            if (bArr2 != null && bArr2.length > 0) {
                s9Var.mo11468x92b714fd(bArr2);
            }
            linkedList.add(s9Var);
        }
        zArr[4] = true;
        return 0;
    }
}
