package bw5;

/* loaded from: classes2.dex */
public class ck extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f107654e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f107653d = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f107655f = new boolean[3];

    static {
        new bw5.ck();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ck mo11468x92b714fd(byte[] bArr) {
        return (bw5.ck) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ck)) {
            return false;
        }
        bw5.ck ckVar = (bw5.ck) fVar;
        return n51.f.a(this.f107653d, ckVar.f107653d) && n51.f.a(this.f107654e, ckVar.f107654e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ck();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f107655f;
        java.util.LinkedList linkedList = this.f107653d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList);
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f107654e;
            if (gVar != null && zArr[2]) {
                fVar.b(2, gVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList) + 0;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f107654e;
            return (gVar2 == null || !zArr[2]) ? g17 : g17 + b36.f.b(2, gVar2);
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
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            this.f107654e = aVar2.d(intValue);
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            bw5.bk bkVar = new bw5.bk();
            if (bArr != null && bArr.length > 0) {
                bkVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(bkVar);
        }
        zArr[1] = true;
        return 0;
    }
}
