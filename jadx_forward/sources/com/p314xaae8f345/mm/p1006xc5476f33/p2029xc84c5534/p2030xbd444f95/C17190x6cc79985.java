package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95;

/* renamed from: com.tencent.mm.plugin.report.kvdata.WeChatSDInfo */
/* loaded from: classes11.dex */
public class C17190x6cc79985 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: depth_ */
    public int f37868xb0688dfc;

    /* renamed from: dirCount_ */
    public long f37869x8d44e41d;

    /* renamed from: fileCount_ */
    public long f37870x4fd0a5cc;

    /* renamed from: fileLenInvalidCount_ */
    public long f37871xabda338e;

    /* renamed from: subDirList_ */
    public java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17187x82077c9b> f37872x5ba6a154 = new java.util.LinkedList<>();

    /* renamed from: subDirResultsSize_ */
    public int f37873x87531cf5;

    /* renamed from: tempAccDirCount_ */
    public long f37874x34150690;

    /* renamed from: tempAccDirResultsSize_ */
    public int f37875xdfd9ab88;

    /* renamed from: tempAccFileCount_ */
    public long f37876x8304d1b9;

    /* renamed from: tempAccFileLenInvalidCount_ */
    public long f37877xafce1b3b;

    /* renamed from: tempAccTotalSize_ */
    public long f37878x87aeb87;

    /* renamed from: totalSize_ */
    public long f37879xd546bf9a;

    /* renamed from: totalTime_ */
    public long f37880xd554a64e;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17190x6cc79985)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17190x6cc79985 c17190x6cc79985 = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17190x6cc79985) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f37879xd546bf9a), java.lang.Long.valueOf(c17190x6cc79985.f37879xd546bf9a)) && n51.f.a(java.lang.Long.valueOf(this.f37869x8d44e41d), java.lang.Long.valueOf(c17190x6cc79985.f37869x8d44e41d)) && n51.f.a(java.lang.Long.valueOf(this.f37870x4fd0a5cc), java.lang.Long.valueOf(c17190x6cc79985.f37870x4fd0a5cc)) && n51.f.a(java.lang.Long.valueOf(this.f37871xabda338e), java.lang.Long.valueOf(c17190x6cc79985.f37871xabda338e)) && n51.f.a(java.lang.Integer.valueOf(this.f37873x87531cf5), java.lang.Integer.valueOf(c17190x6cc79985.f37873x87531cf5)) && n51.f.a(java.lang.Long.valueOf(this.f37880xd554a64e), java.lang.Long.valueOf(c17190x6cc79985.f37880xd554a64e)) && n51.f.a(java.lang.Integer.valueOf(this.f37868xb0688dfc), java.lang.Integer.valueOf(c17190x6cc79985.f37868xb0688dfc)) && n51.f.a(java.lang.Long.valueOf(this.f37878x87aeb87), java.lang.Long.valueOf(c17190x6cc79985.f37878x87aeb87)) && n51.f.a(java.lang.Integer.valueOf(this.f37875xdfd9ab88), java.lang.Integer.valueOf(c17190x6cc79985.f37875xdfd9ab88)) && n51.f.a(java.lang.Long.valueOf(this.f37874x34150690), java.lang.Long.valueOf(c17190x6cc79985.f37874x34150690)) && n51.f.a(java.lang.Long.valueOf(this.f37876x8304d1b9), java.lang.Long.valueOf(c17190x6cc79985.f37876x8304d1b9)) && n51.f.a(java.lang.Long.valueOf(this.f37877xafce1b3b), java.lang.Long.valueOf(c17190x6cc79985.f37877xafce1b3b)) && n51.f.a(this.f37872x5ba6a154, c17190x6cc79985.f37872x5ba6a154);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f37879xd546bf9a);
            fVar.h(2, this.f37869x8d44e41d);
            fVar.h(3, this.f37870x4fd0a5cc);
            fVar.h(4, this.f37871xabda338e);
            fVar.e(5, this.f37873x87531cf5);
            fVar.h(6, this.f37880xd554a64e);
            fVar.e(7, this.f37868xb0688dfc);
            fVar.h(8, this.f37878x87aeb87);
            fVar.e(9, this.f37875xdfd9ab88);
            fVar.h(10, this.f37874x34150690);
            fVar.h(11, this.f37876x8304d1b9);
            fVar.h(12, this.f37877xafce1b3b);
            fVar.g(13, 8, this.f37872x5ba6a154);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f37879xd546bf9a) + 0 + b36.f.h(2, this.f37869x8d44e41d) + b36.f.h(3, this.f37870x4fd0a5cc) + b36.f.h(4, this.f37871xabda338e) + b36.f.e(5, this.f37873x87531cf5) + b36.f.h(6, this.f37880xd554a64e) + b36.f.e(7, this.f37868xb0688dfc) + b36.f.h(8, this.f37878x87aeb87) + b36.f.e(9, this.f37875xdfd9ab88) + b36.f.h(10, this.f37874x34150690) + b36.f.h(11, this.f37876x8304d1b9) + b36.f.h(12, this.f37877xafce1b3b) + b36.f.g(13, 8, this.f37872x5ba6a154);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            this.f37872x5ba6a154.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17190x6cc79985 c17190x6cc79985 = (com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17190x6cc79985) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                c17190x6cc79985.f37879xd546bf9a = aVar2.i(intValue);
                return 0;
            case 2:
                c17190x6cc79985.f37869x8d44e41d = aVar2.i(intValue);
                return 0;
            case 3:
                c17190x6cc79985.f37870x4fd0a5cc = aVar2.i(intValue);
                return 0;
            case 4:
                c17190x6cc79985.f37871xabda338e = aVar2.i(intValue);
                return 0;
            case 5:
                c17190x6cc79985.f37873x87531cf5 = aVar2.g(intValue);
                return 0;
            case 6:
                c17190x6cc79985.f37880xd554a64e = aVar2.i(intValue);
                return 0;
            case 7:
                c17190x6cc79985.f37868xb0688dfc = aVar2.g(intValue);
                return 0;
            case 8:
                c17190x6cc79985.f37878x87aeb87 = aVar2.i(intValue);
                return 0;
            case 9:
                c17190x6cc79985.f37875xdfd9ab88 = aVar2.g(intValue);
                return 0;
            case 10:
                c17190x6cc79985.f37874x34150690 = aVar2.i(intValue);
                return 0;
            case 11:
                c17190x6cc79985.f37876x8304d1b9 = aVar2.i(intValue);
                return 0;
            case 12:
                c17190x6cc79985.f37877xafce1b3b = aVar2.i(intValue);
                return 0;
            case 13:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17187x82077c9b c17187x82077c9b = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2030xbd444f95.C17187x82077c9b();
                    if (bArr2 != null && bArr2.length > 0) {
                        c17187x82077c9b.mo11468x92b714fd(bArr2);
                    }
                    c17190x6cc79985.f37872x5ba6a154.add(c17187x82077c9b);
                }
                return 0;
            default:
                return -1;
        }
    }
}
