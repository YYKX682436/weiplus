package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes9.dex */
public class t1 implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f164774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ot0.q f164775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f164776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164777g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f164778h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f164779i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713 f164780m;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713 c12236xd46e1713, java.util.LinkedList linkedList, ot0.q qVar, int i17, java.lang.String str, byte[] bArr, java.lang.StringBuilder sb6) {
        this.f164780m = c12236xd46e1713;
        this.f164774d = linkedList;
        this.f164775e = qVar;
        this.f164776f = i17;
        this.f164777g = str;
        this.f164778h = bArr;
        this.f164779i = sb6;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.ym6 ym6Var;
        r45.k46 k46Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SendAppMessageTask", "callback, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.hc7 hc7Var = (r45.hc7) oVar.f152244b.f152233a;
        java.lang.String str2 = this.f164777g;
        java.util.LinkedList linkedList = this.f164774d;
        ot0.q qVar = this.f164775e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713 c12236xd46e1713 = this.f164780m;
        if (i17 == 0 && i18 == 0 && hc7Var != null) {
            java.util.LinkedList linkedList2 = hc7Var.f457590d;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList2)) {
                c12236xd46e1713.I1 = new java.util.ArrayList();
                int i19 = 0;
                while (i19 < linkedList.size()) {
                    r45.vc7 vc7Var = i19 < linkedList2.size() ? (r45.vc7) linkedList2.get(i19) : new r45.vc7();
                    java.lang.String str3 = vc7Var.f469647e;
                    qVar.f430226o2 = str3;
                    c12236xd46e1713.I1.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12239x1921410d(str3, vc7Var.f469646d));
                    ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
                    boolean z17 = vc7Var.f469649g;
                    aVar.f429882e = z17;
                    aVar.Q = vc7Var.f469654o;
                    aVar.f429900w = vc7Var.f469652m;
                    if (z17 && (k46Var = vc7Var.f469648f) != null) {
                        aVar.f429883f = k46Var.f459899d;
                        aVar.f429884g = k46Var.f459900e;
                        aVar.f429885h = k46Var.f459901f;
                        aVar.f429886i = k46Var.f459902g;
                        aVar.f429887j = k46Var.f459903h;
                        aVar.f429888k = k46Var.f459906n;
                        aVar.f429890m = k46Var.f459905m;
                        aVar.f429889l = k46Var.f459904i;
                        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7150xae2fbc94 c7150xae2fbc94 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7150xae2fbc94();
                        c7150xae2fbc94.f144583d = c7150xae2fbc94.b("AppId", c12236xd46e1713.f164595f, true);
                        c7150xae2fbc94.f144584e = c7150xae2fbc94.b("PageId", c12236xd46e1713.f164609t, true);
                        c7150xae2fbc94.f144586g = c7150xae2fbc94.b("ShareTicket", vc7Var.f469647e, true);
                        c7150xae2fbc94.f144587h = c7150xae2fbc94.b("ChattingId", (java.lang.String) linkedList.get(i19), true);
                        c7150xae2fbc94.f144588i = ((java.lang.String) linkedList.get(i19)).toLowerCase().endsWith("@chatroom") ? cm.b1.YES : cm.b1.NO;
                        c7150xae2fbc94.f144589j = cm.a1.SHAREAPPMSG;
                        c7150xae2fbc94.f144590k = this.f164776f;
                        c7150xae2fbc94.f144591l = c7150xae2fbc94.b("SceneNote", c12236xd46e1713.L, true);
                        c7150xae2fbc94.f144594o = cm.z0.a(c12236xd46e1713.Y + 1000);
                        c7150xae2fbc94.f144585f = c7150xae2fbc94.i();
                        c7150xae2fbc94.f144592m = cm.c1.DOING;
                        c7150xae2fbc94.f144593n = cm.d1.NOTSUBSCRIBE;
                        c7150xae2fbc94.k();
                    }
                    if (vc7Var.f469650h && (ym6Var = vc7Var.f469651i) != null && ym6Var.f472753d) {
                        aVar.f429897t = ym6Var.f472754e;
                    }
                    if (vc7Var.f469654o) {
                        aVar.f429891n = 1;
                        r45.cz czVar = vc7Var.f469655p;
                        if (czVar != null) {
                            aVar.f429883f = czVar.f453467d;
                            aVar.f429884g = czVar.f453468e;
                            aVar.f429890m = czVar.f453470g;
                            aVar.f429889l = czVar.f453469f;
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713.B(c12236xd46e1713, qVar, str2, hc7Var.f457592f);
                    this.f164780m.C(this.f164775e, this.f164778h, (java.lang.String) linkedList.get(i19), this.f164779i, this.f164776f);
                    i19++;
                }
                c12236xd46e1713.c();
                return 0;
            }
        }
        if (qVar.f430214l2 == 3) {
            qVar.f430214l2 = 2;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            java.lang.String str4 = (java.lang.String) it.next();
            if (hc7Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.C12236xd46e1713.B(c12236xd46e1713, qVar, str2, hc7Var.f457592f);
            }
            this.f164780m.C(this.f164775e, this.f164778h, str4, this.f164779i, this.f164776f);
        }
        c12236xd46e1713.c();
        return 0;
    }
}
