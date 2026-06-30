package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95;

/* renamed from: com.tencent.mm.plugin.report.kvdata.TableInfo */
/* loaded from: classes8.dex */
public class C17188xe69d7c extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: count_ */
    public long f37843xaf42d130;

    /* renamed from: name_ */
    public java.lang.String f37844x63bd734;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17188xe69d7c)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17188xe69d7c c17188xe69d7c = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17188xe69d7c) fVar;
        return n51.f.a(this.f37844x63bd734, c17188xe69d7c.f37844x63bd734) && n51.f.a(java.lang.Long.valueOf(this.f37843xaf42d130), java.lang.Long.valueOf(c17188xe69d7c.f37843xaf42d130));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f37844x63bd734;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.h(2, this.f37843xaf42d130);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f37844x63bd734;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.h(2, this.f37843xaf42d130);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17188xe69d7c c17188xe69d7c = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17188xe69d7c) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c17188xe69d7c.f37844x63bd734 = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        c17188xe69d7c.f37843xaf42d130 = aVar2.i(intValue);
        return 0;
    }
}
