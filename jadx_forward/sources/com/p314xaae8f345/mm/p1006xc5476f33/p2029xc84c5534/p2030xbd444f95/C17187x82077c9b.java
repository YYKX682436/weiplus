package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95;

/* renamed from: com.tencent.mm.plugin.report.kvdata.SubDirInfo */
/* loaded from: classes11.dex */
public class C17187x82077c9b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: dirCount_ */
    public long f37838x8d44e41d;

    /* renamed from: fileCount_ */
    public long f37839x4fd0a5cc;

    /* renamed from: fileLenInvalidCount */
    public long f37840x58b2af1;

    /* renamed from: tag_ */
    public int f37841x363405;

    /* renamed from: totalSize_ */
    public long f37842xd546bf9a;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17187x82077c9b)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17187x82077c9b c17187x82077c9b = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17187x82077c9b) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f37841x363405), java.lang.Integer.valueOf(c17187x82077c9b.f37841x363405)) && n51.f.a(java.lang.Long.valueOf(this.f37842xd546bf9a), java.lang.Long.valueOf(c17187x82077c9b.f37842xd546bf9a)) && n51.f.a(java.lang.Long.valueOf(this.f37838x8d44e41d), java.lang.Long.valueOf(c17187x82077c9b.f37838x8d44e41d)) && n51.f.a(java.lang.Long.valueOf(this.f37839x4fd0a5cc), java.lang.Long.valueOf(c17187x82077c9b.f37839x4fd0a5cc)) && n51.f.a(java.lang.Long.valueOf(this.f37840x58b2af1), java.lang.Long.valueOf(c17187x82077c9b.f37840x58b2af1));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f37841x363405);
            fVar.h(2, this.f37842xd546bf9a);
            fVar.h(3, this.f37838x8d44e41d);
            fVar.h(4, this.f37839x4fd0a5cc);
            fVar.h(5, this.f37840x58b2af1);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.e(1, this.f37841x363405) + 0 + b36.f.h(2, this.f37842xd546bf9a) + b36.f.h(3, this.f37838x8d44e41d) + b36.f.h(4, this.f37839x4fd0a5cc) + b36.f.h(5, this.f37840x58b2af1);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17187x82077c9b c17187x82077c9b = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17187x82077c9b) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            c17187x82077c9b.f37841x363405 = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 2) {
            c17187x82077c9b.f37842xd546bf9a = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 3) {
            c17187x82077c9b.f37838x8d44e41d = aVar2.i(intValue);
            return 0;
        }
        if (intValue == 4) {
            c17187x82077c9b.f37839x4fd0a5cc = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        c17187x82077c9b.f37840x58b2af1 = aVar2.i(intValue);
        return 0;
    }
}
