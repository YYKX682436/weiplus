package v53;

/* loaded from: classes4.dex */
public class c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public long f514863d;

    /* renamed from: e, reason: collision with root package name */
    public long f514864e;

    /* renamed from: f, reason: collision with root package name */
    public v53.m f514865f;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof v53.c)) {
            return false;
        }
        v53.c cVar = (v53.c) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f514863d), java.lang.Long.valueOf(cVar.f514863d)) && n51.f.a(java.lang.Long.valueOf(this.f514864e), java.lang.Long.valueOf(cVar.f514864e)) && n51.f.a(this.f514865f, cVar.f514865f);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f514863d);
            fVar.h(2, this.f514864e);
            v53.m mVar = this.f514865f;
            if (mVar != null) {
                fVar.i(3, mVar.mo75928xcd1e8d8());
                this.f514865f.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int h17 = b36.f.h(1, this.f514863d) + 0 + b36.f.h(2, this.f514864e);
            v53.m mVar2 = this.f514865f;
            return mVar2 != null ? h17 + b36.f.i(3, mVar2.mo75928xcd1e8d8()) : h17;
        }
        if (i17 == 2) {
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
        v53.c cVar = (v53.c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            cVar.f514863d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 2) {
            cVar.f514864e = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            v53.m mVar3 = new v53.m();
            if (bArr != null && bArr.length > 0) {
                mVar3.mo11468x92b714fd(bArr);
            }
            cVar.f514865f = mVar3;
        }
        return 0;
    }
}
