package bw5;

/* loaded from: classes10.dex */
public class ab extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ub f106649d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f106650e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f106651f = new boolean[3];

    static {
        new bw5.ab();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ab)) {
            return false;
        }
        bw5.ab abVar = (bw5.ab) fVar;
        return n51.f.a(this.f106649d, abVar.f106649d) && n51.f.a(this.f106650e, abVar.f106650e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ab();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f106650e;
        boolean[] zArr = this.f106651f;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ub ubVar = this.f106649d;
            if (ubVar != null && zArr[1]) {
                fVar.e(1, ubVar.f115367d);
            }
            fVar.g(2, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.ub ubVar2 = this.f106649d;
            if (ubVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, ubVar2.f115367d);
            }
            return i18 + b36.f.g(2, 8, linkedList);
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
            this.f106649d = g17 != 0 ? g17 != 1 ? g17 != 2 ? null : bw5.ub.LivePhoto : bw5.ub.Video : bw5.ub.Image;
            zArr[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.sb sbVar = new bw5.sb();
            if (bArr != null && bArr.length > 0) {
                sbVar.mo11468x92b714fd(bArr);
            }
            linkedList.add(sbVar);
        }
        zArr[2] = true;
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.ab) super.mo11468x92b714fd(bArr);
    }
}
