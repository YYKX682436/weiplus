package bw5;

/* loaded from: classes2.dex */
public class yt extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.ds f117231d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f117232e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f117233f = new boolean[3];

    static {
        new bw5.yt();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.yt mo11468x92b714fd(byte[] bArr) {
        return (bw5.yt) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.yt)) {
            return false;
        }
        bw5.yt ytVar = (bw5.yt) fVar;
        return n51.f.a(this.f117231d, ytVar.f117231d) && n51.f.a(this.f117232e, ytVar.f117232e);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.yt();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f117233f;
        java.util.LinkedList linkedList = this.f117232e;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.ds dsVar = this.f117231d;
            if (dsVar != null && zArr[1]) {
                fVar.i(1, dsVar.mo75928xcd1e8d8());
                this.f117231d.mo75956x3d5d1f78(fVar);
            }
            fVar.g(2, 1, linkedList);
            return 0;
        }
        if (i17 == 1) {
            bw5.ds dsVar2 = this.f117231d;
            if (dsVar2 != null && zArr[1]) {
                i18 = 0 + b36.f.i(1, dsVar2.mo75928xcd1e8d8());
            }
            return i18 + b36.f.g(2, 1, linkedList);
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
            linkedList.add(aVar2.k(intValue));
            zArr[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i19 = 0; i19 < size; i19++) {
            byte[] bArr = (byte[]) j17.get(i19);
            bw5.ds dsVar3 = new bw5.ds();
            if (bArr != null && bArr.length > 0) {
                dsVar3.mo11468x92b714fd(bArr);
            }
            this.f117231d = dsVar3;
        }
        zArr[1] = true;
        return 0;
    }
}
