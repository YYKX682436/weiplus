package bw5;

/* loaded from: classes10.dex */
public class ej0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f108468d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f108469e;

    /* renamed from: g, reason: collision with root package name */
    public bw5.e30 f108471g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f108470f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f108472h = new boolean[5];

    static {
        new bw5.ej0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ej0)) {
            return false;
        }
        bw5.ej0 ej0Var = (bw5.ej0) fVar;
        return n51.f.a(this.f108468d, ej0Var.f108468d) && n51.f.a(this.f108469e, ej0Var.f108469e) && n51.f.a(this.f108470f, ej0Var.f108470f) && n51.f.a(this.f108471g, ej0Var.f108471g);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ej0();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108470f;
        boolean[] zArr = this.f108472h;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f108468d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f108469e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            fVar.g(3, 8, linkedList);
            bw5.e30 e30Var = this.f108471g;
            if (e30Var != null && zArr[4]) {
                fVar.i(4, e30Var.mo75928xcd1e8d8());
                this.f108471g.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f108468d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            java.lang.String str4 = this.f108469e;
            if (str4 != null && zArr[2]) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 8, linkedList);
            bw5.e30 e30Var2 = this.f108471g;
            return (e30Var2 == null || !zArr[4]) ? g17 : g17 + b36.f.i(4, e30Var2.mo75928xcd1e8d8());
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
            this.f108468d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f108469e = aVar2.k(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                bw5.q3 q3Var = new bw5.q3();
                if (bArr != null && bArr.length > 0) {
                    q3Var.mo11468x92b714fd(bArr);
                }
                linkedList.add(q3Var);
            }
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size2 = j18.size();
        for (int i27 = 0; i27 < size2; i27++) {
            byte[] bArr2 = (byte[]) j18.get(i27);
            bw5.e30 e30Var3 = new bw5.e30();
            if (bArr2 != null && bArr2.length > 0) {
                e30Var3.mo11468x92b714fd(bArr2);
            }
            this.f108471g = e30Var3;
        }
        zArr[4] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.ej0) super.mo11468x92b714fd(bArr);
    }
}
