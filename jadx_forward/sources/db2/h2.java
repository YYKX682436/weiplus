package db2;

/* loaded from: classes2.dex */
public final class h2 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309536t;

    /* renamed from: u, reason: collision with root package name */
    public final int f309537u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f309538v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f309539w;

    /* renamed from: x, reason: collision with root package name */
    public final int f309540x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 finderItem, bw5.ps0 scene, java.lang.String str, java.util.LinkedList linkedList, java.lang.String str2, java.lang.String str3, java.util.LinkedList linkedList2, int i17, java.lang.String str4, java.util.LinkedList linkedList3, int i18, r45.ze2 ze2Var) {
        super(null, null, 3, null);
        char c17;
        bw5.sp spVar;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        bw5.aw awVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderItem, "finderItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        this.f309536t = str3;
        this.f309537u = i17;
        this.f309538v = str4;
        this.f309539w = linkedList3;
        this.f309540x = i18;
        bw5.zq zqVar = new bw5.zq();
        zqVar.f117649f = finderItem.m59251x5db1b11();
        boolean[] zArr = zqVar.f117662v;
        zArr[3] = true;
        zqVar.f117650g = finderItem.m59299x6bf53a6c();
        zArr[4] = true;
        zqVar.f117651h = 1;
        zArr[5] = true;
        zqVar.f117652i = str;
        zArr[6] = true;
        zqVar.f117653m = str2;
        zArr[7] = true;
        zqVar.f117654n = linkedList2;
        zArr[8] = true;
        zqVar.f117660t = i17;
        zArr[14] = true;
        zqVar.f117655o = str3;
        zArr[9] = true;
        zqVar.f117656p = linkedList;
        zArr[10] = true;
        zqVar.f117657q = str4;
        zArr[11] = true;
        zqVar.f117658r = linkedList3;
        zArr[12] = true;
        zqVar.f117659s = i18;
        zArr[13] = true;
        if (ze2Var != null) {
            spVar = new bw5.sp();
            spVar.f114620d = ze2Var.m75938x746dc8a6(0);
            boolean[] zArr2 = spVar.f114637x;
            zArr2[1] = true;
            spVar.f114621e = ze2Var.m75938x746dc8a6(1);
            zArr2[2] = true;
            spVar.f114622f = ze2Var.m75945x2fec8307(2);
            zArr2[3] = true;
            spVar.f114623g = ze2Var.m75945x2fec8307(3);
            zArr2[4] = true;
            spVar.f114624h = ze2Var.m75945x2fec8307(4);
            zArr2[5] = true;
            spVar.f114625i = ze2Var.m75945x2fec8307(5);
            zArr2[6] = true;
            spVar.f114630q = ze2Var.m75939xb282bd08(10);
            zArr2[11] = true;
            c17 = 15;
            spVar.f114635v = ze2Var.m75941xfb821914(15);
            zArr2[16] = true;
            spVar.f114636w = ze2Var.m75939xb282bd08(16);
            zArr2[17] = true;
        } else {
            c17 = 15;
            spVar = null;
        }
        zqVar.f117661u = spVar;
        zArr[c17] = true;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = zqVar;
        lVar.f152198b = new bw5.ar();
        lVar.f152200d = 22561;
        lVar.f152199c = "/cgi-bin/micromsg-bin/findermodfeed";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedId:");
        sb6.append(pm0.v.u(zqVar.f117649f));
        sb6.append(" description:");
        sb6.append(str);
        sb6.append(" shortTitle:");
        sb6.append((linkedList == null || (awVar = (bw5.aw) kz5.n0.Z(linkedList)) == null) ? null : awVar.f106976e[1] ? awVar.f106975d : "");
        sb6.append(" coverUrl:");
        sb6.append(str2);
        sb6.append(" coverUrlWord:[");
        if (linkedList2 != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((java.lang.String) it.next()) + '#');
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        sb6.append("] cardShowStyle:");
        sb6.append(this.f309537u);
        sb6.append(" fullCoverUrl:");
        sb6.append(this.f309536t);
        sb6.append(" shareCoverUrl:");
        sb6.append(this.f309538v);
        sb6.append(" shareCoverUrlWord:[");
        java.util.LinkedList linkedList4 = this.f309539w;
        if (linkedList4 != null) {
            arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList4, 10));
            java.util.Iterator it6 = linkedList4.iterator();
            while (it6.hasNext()) {
                arrayList2.add(((java.lang.String) it6.next()) + '#');
            }
        } else {
            arrayList2 = null;
        }
        sb6.append(arrayList2);
        sb6.append("] shareCoverShowStyle:");
        sb6.append(this.f309540x);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderModFeed", sb6.toString());
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        bw5.ar resp = (bw5.ar) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CgiFinderModFeed", "[onCgiEnd] " + i17 + ":errType errCode:" + i18 + " errMsg:" + str);
    }
}
