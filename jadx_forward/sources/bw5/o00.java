package bw5;

/* loaded from: classes2.dex */
public class o00 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f112403e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f112402d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f112404f = new boolean[3];

    static {
        new bw5.o00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.o00 mo11468x92b714fd(byte[] bArr) {
        return (bw5.o00) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.o00)) {
            return false;
        }
        bw5.o00 o00Var = (bw5.o00) fVar;
        return n51.f.a(this.f112402d, o00Var.f112402d) && n51.f.a(this.f112403e, o00Var.f112403e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.o00();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f112404f;
        java.util.LinkedList linkedList = this.f112402d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList);
            java.lang.String str = this.f112403e;
            if (str != null && zArr[2]) {
                fVar.j(2, str);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 1, linkedList) + 0;
            java.lang.String str2 = this.f112403e;
            return (str2 == null || !zArr[2]) ? g17 : g17 + b36.f.j(2, str2);
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
            linkedList.add(aVar2.k(intValue));
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f112403e = aVar2.k(intValue);
        zArr[2] = true;
        return 0;
    }
}
