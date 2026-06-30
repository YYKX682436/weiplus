package bw5;

/* loaded from: classes2.dex */
public class ea extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f108335d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f108336e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f108337f = false;

    static {
        new bw5.ea();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ea mo11468x92b714fd(byte[] bArr) {
        return (bw5.ea) super.mo11468x92b714fd(bArr);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ea)) {
            return false;
        }
        bw5.ea eaVar = (bw5.ea) fVar;
        return n51.f.a(this.f108335d, eaVar.f108335d) && n51.f.a(this.f108336e, eaVar.f108336e) && n51.f.a(java.lang.Boolean.valueOf(this.f108337f), java.lang.Boolean.valueOf(eaVar.f108337f));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.ea();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f108336e;
        java.util.LinkedList linkedList2 = this.f108335d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 1, linkedList2);
            fVar.g(2, 1, linkedList);
            fVar.a(3, this.f108337f);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.g(1, 1, linkedList2) + 0 + b36.f.g(2, 1, linkedList) + b36.f.a(3, this.f108337f);
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
            linkedList2.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue == 2) {
            linkedList.add(aVar2.k(intValue));
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f108337f = aVar2.c(intValue);
        return 0;
    }
}
