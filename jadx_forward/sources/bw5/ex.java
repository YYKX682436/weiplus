package bw5;

/* loaded from: classes2.dex */
public class ex extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.bx f108622d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108623e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f108624f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f108625g = new boolean[4];

    static {
        new bw5.ex();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ex mo11468x92b714fd(byte[] bArr) {
        return (bw5.ex) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ex)) {
            return false;
        }
        bw5.ex exVar = (bw5.ex) fVar;
        return n51.f.a(this.f108622d, exVar.f108622d) && n51.f.a(this.f108623e, exVar.f108623e) && n51.f.a(this.f108624f, exVar.f108624f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ex();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108624f;
        boolean[] zArr = this.f108625g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.bx bxVar = this.f108622d;
            if (bxVar != null && zArr[1]) {
                fVar.e(1, bxVar.f107393d);
            }
            java.lang.String str = this.f108623e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.bx bxVar2 = this.f108622d;
            if (bxVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, bxVar2.f107393d);
            }
            java.lang.String str2 = this.f108623e;
            if (str2 != null && zArr[2]) {
                i18 += b36.f.j(2, str2);
            }
            return i18 + b36.f.g(3, 8, linkedList);
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
            int g17 = aVar2.g(intValue);
            this.f108622d = g17 != 0 ? g17 != 1 ? g17 != 2 ? g17 != 30000 ? null : bw5.bx.Invalid : bw5.bx.Origin : bw5.bx.English : bw5.bx.Chinese;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f108623e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.fx fxVar = new bw5.fx();
            if (bArr != null && bArr.length > 0) {
                fxVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(fxVar);
        }
        zArr[3] = true;
        return 0;
    }
}
