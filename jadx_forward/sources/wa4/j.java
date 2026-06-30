package wa4;

/* loaded from: classes4.dex */
public class j extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f525777d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f525778e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f525779f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f525780g = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f525781h = new java.util.LinkedList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f525782i = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.LinkedList f525783m = new java.util.LinkedList();

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
        if (fVar == null || !(fVar instanceof wa4.j)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        }
        wa4.j jVar = (wa4.j) fVar;
        if (!n51.f.a(this.f525777d, jVar.f525777d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        }
        if (!n51.f.a(this.f525778e, jVar.f525778e)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        }
        if (!n51.f.a(this.f525779f, jVar.f525779f)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        }
        if (!n51.f.a(this.f525780g, jVar.f525780g)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        }
        if (!n51.f.a(this.f525781h, jVar.f525781h)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        }
        if (!n51.f.a(this.f525782i, jVar.f525782i)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return false;
        }
        if (n51.f.a(this.f525783m, jVar.f525783m)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("compareContent", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
        return false;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
        java.util.LinkedList linkedList = this.f525783m;
        java.util.LinkedList linkedList2 = this.f525782i;
        java.util.LinkedList linkedList3 = this.f525781h;
        java.util.LinkedList linkedList4 = this.f525780g;
        java.util.LinkedList linkedList5 = this.f525779f;
        java.util.LinkedList linkedList6 = this.f525778e;
        java.util.LinkedList linkedList7 = this.f525777d;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, linkedList7);
            fVar.g(2, 8, linkedList6);
            fVar.g(3, 8, linkedList5);
            fVar.g(4, 8, linkedList4);
            fVar.g(5, 8, linkedList3);
            fVar.g(6, 8, linkedList2);
            fVar.g(7, 8, linkedList);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, linkedList7) + 0 + b36.f.g(2, 8, linkedList6) + b36.f.g(3, 8, linkedList5) + b36.f.g(4, 8, linkedList4) + b36.f.g(5, 8, linkedList3) + b36.f.g(6, 8, linkedList2) + b36.f.g(7, 8, linkedList);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return g17;
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList7.clear();
            linkedList6.clear();
            linkedList5.clear();
            linkedList4.clear();
            linkedList3.clear();
            linkedList2.clear();
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return 0;
        }
        if (i17 != 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        wa4.j jVar = (wa4.j) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr2 = (byte[]) j17.get(i18);
                    wa4.m mVar = new wa4.m();
                    if (bArr2 != null && bArr2.length > 0) {
                        mVar.mo11468x92b714fd(bArr2);
                    }
                    jVar.f525777d.add(mVar);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i19 = 0; i19 < size2; i19++) {
                    byte[] bArr3 = (byte[]) j18.get(i19);
                    wa4.m mVar2 = new wa4.m();
                    if (bArr3 != null && bArr3.length > 0) {
                        mVar2.mo11468x92b714fd(bArr3);
                    }
                    jVar.f525778e.add(mVar2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                return 0;
            case 3:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i27 = 0; i27 < size3; i27++) {
                    byte[] bArr4 = (byte[]) j19.get(i27);
                    wa4.m mVar3 = new wa4.m();
                    if (bArr4 != null && bArr4.length > 0) {
                        mVar3.mo11468x92b714fd(bArr4);
                    }
                    jVar.f525779f.add(mVar3);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                return 0;
            case 4:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i28 = 0; i28 < size4; i28++) {
                    byte[] bArr5 = (byte[]) j27.get(i28);
                    wa4.m mVar4 = new wa4.m();
                    if (bArr5 != null && bArr5.length > 0) {
                        mVar4.mo11468x92b714fd(bArr5);
                    }
                    jVar.f525780g.add(mVar4);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                return 0;
            case 5:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i29 = 0; i29 < size5; i29++) {
                    byte[] bArr6 = (byte[]) j28.get(i29);
                    wa4.o oVar = new wa4.o();
                    if (bArr6 != null && bArr6.length > 0) {
                        oVar.mo11468x92b714fd(bArr6);
                    }
                    jVar.f525781h.add(oVar);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                return 0;
            case 6:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i37 = 0; i37 < size6; i37++) {
                    byte[] bArr7 = (byte[]) j29.get(i37);
                    wa4.o oVar2 = new wa4.o();
                    if (bArr7 != null && bArr7.length > 0) {
                        oVar2.mo11468x92b714fd(bArr7);
                    }
                    jVar.f525782i.add(oVar2);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                return 0;
            case 7:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i38 = 0; i38 < size7; i38++) {
                    byte[] bArr8 = (byte[]) j37.get(i38);
                    wa4.n nVar = new wa4.n();
                    if (bArr8 != null && bArr8.length > 0) {
                        nVar.mo11468x92b714fd(bArr8);
                    }
                    jVar.f525783m.add(nVar);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                return 0;
            default:
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("op", "com.tencent.mm.plugin.sns.snstimeline.SnsAsyncQueue");
                return -1;
        }
    }
}
