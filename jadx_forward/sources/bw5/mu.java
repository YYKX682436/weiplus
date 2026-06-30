package bw5;

/* loaded from: classes2.dex */
public class mu extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f111918d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.lu f111919e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f111920f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f111921g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f111922h = new boolean[5];

    static {
        new bw5.mu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mu mo11468x92b714fd(byte[] bArr) {
        return (bw5.mu) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mu)) {
            return false;
        }
        bw5.mu muVar = (bw5.mu) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f111918d), java.lang.Long.valueOf(muVar.f111918d)) && n51.f.a(this.f111919e, muVar.f111919e) && n51.f.a(this.f111920f, muVar.f111920f) && n51.f.a(this.f111921g, muVar.f111921g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.mu();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111921g;
        java.util.LinkedList linkedList2 = this.f111920f;
        boolean[] zArr = this.f111922h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f111918d);
            }
            bw5.lu luVar = this.f111919e;
            if (luVar != null && zArr[2]) {
                fVar.i(2, luVar.mo75928xcd1e8d8());
                this.f111919e.mo75956x3d5d1f78(fVar);
            }
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f111918d) : 0;
            bw5.lu luVar2 = this.f111919e;
            if (luVar2 != null && zArr[2]) {
                h17 += b36.f.i(2, luVar2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.g(3, 8, linkedList2) + b36.f.g(4, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList2.clear();
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
            this.f111918d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.lu luVar3 = new bw5.lu();
                if (bArr != null && bArr.length > 0) {
                    luVar3.mo11468x92b714fd(bArr);
                }
                this.f111919e = luVar3;
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.nu nuVar = new bw5.nu();
                if (bArr2 != null && bArr2.length > 0) {
                    nuVar.mo11468x92b714fd(bArr2);
                }
                linkedList2.add(nuVar);
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
            bw5.cd0 cd0Var = new bw5.cd0();
            if (bArr3 != null && bArr3.length > 0) {
                cd0Var.mo11468x92b714fd(bArr3);
            }
            linkedList.add(cd0Var);
        }
        zArr[4] = true;
        return 0;
    }
}
