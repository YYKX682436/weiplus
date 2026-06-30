package bw5;

/* loaded from: classes2.dex */
public class y4 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f116895d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f116896e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f116897f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f116898g = new boolean[4];

    static {
        new bw5.y4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.y4 mo11468x92b714fd(byte[] bArr) {
        return (bw5.y4) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.y4)) {
            return false;
        }
        bw5.y4 y4Var = (bw5.y4) fVar;
        return n51.f.a(this.f116895d, y4Var.f116895d) && n51.f.a(this.f116896e, y4Var.f116896e) && n51.f.a(this.f116897f, y4Var.f116897f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.y4();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f116897f;
        java.util.LinkedList linkedList2 = this.f116896e;
        java.util.LinkedList linkedList3 = this.f116895d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList3);
            fVar.g(2, 8, linkedList2);
            fVar.g(3, 8, linkedList);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 8, linkedList3) + 0 + b36.f.g(2, 8, linkedList2) + b36.f.g(3, 8, linkedList);
        }
        if (i17 == 2) {
            linkedList3.clear();
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
        boolean[] zArr = this.f116898g;
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                bw5.sd sdVar = new bw5.sd();
                if (bArr != null && bArr.length > 0) {
                    sdVar.mo11468x92b714fd(bArr);
                }
                linkedList3.add(sdVar);
            }
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                bw5.sd sdVar2 = new bw5.sd();
                if (bArr2 != null && bArr2.length > 0) {
                    sdVar2.mo11468x92b714fd(bArr2);
                }
                linkedList2.add(sdVar2);
            }
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            bw5.sd sdVar3 = new bw5.sd();
            if (bArr3 != null && bArr3.length > 0) {
                sdVar3.mo11468x92b714fd(bArr3);
            }
            linkedList.add(sdVar3);
        }
        zArr[3] = true;
        return 0;
    }
}
