package bw5;

/* loaded from: classes2.dex */
public class mm0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f111852d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f111853e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f111854f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f111855g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f111856h = new boolean[5];

    static {
        new bw5.mm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.mm0 mo11468x92b714fd(byte[] bArr) {
        return (bw5.mm0) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.mm0)) {
            return false;
        }
        bw5.mm0 mm0Var = (bw5.mm0) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f111852d), java.lang.Long.valueOf(mm0Var.f111852d)) && n51.f.a(this.f111853e, mm0Var.f111853e) && n51.f.a(this.f111854f, mm0Var.f111854f) && n51.f.a(this.f111855g, mm0Var.f111855g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.mm0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f111855g;
        java.util.LinkedList linkedList2 = this.f111854f;
        boolean[] zArr = this.f111856h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.h(1, this.f111852d);
            }
            java.lang.String str = this.f111853e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList2);
            fVar.g(4, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            int h17 = zArr[1] ? 0 + b36.f.h(1, this.f111852d) : 0;
            java.lang.String str2 = this.f111853e;
            if (str2 != null && zArr[2]) {
                h17 += b36.f.j(2, str2);
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
            this.f111852d = aVar2.i(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f111853e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.om0 om0Var = new bw5.om0();
                if (bArr != null && bArr.length > 0) {
                    om0Var.mo11468x92b714fd(bArr);
                }
                linkedList2.add(om0Var);
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i19 = 0; i19 < size2; i19++) {
            byte[] bArr2 = (byte[]) j18.get(i19);
            bw5.jm0 jm0Var = new bw5.jm0();
            if (bArr2 != null && bArr2.length > 0) {
                jm0Var.mo11468x92b714fd(bArr2);
            }
            linkedList.add(jm0Var);
        }
        zArr[4] = true;
        return 0;
    }
}
