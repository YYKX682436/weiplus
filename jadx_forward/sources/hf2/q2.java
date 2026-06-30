package hf2;

/* loaded from: classes10.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final hf2.x f362681a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f362682b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f362683c;

    /* renamed from: d, reason: collision with root package name */
    public hf2.n2 f362684d;

    public q2(hf2.x controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f362681a = controller;
        this.f362682b = controller.f362714m + "_Touch";
        this.f362683c = jz5.h.b(new hf2.p2(this));
    }

    public static final hf2.r2 c(hf2.q2 q2Var, float f17, float f18, int i17, int i18, float f19) {
        float width = f17 * q2Var.f362681a.f362722u.f362694b.getWidth();
        float height = f18 * r1.f362722u.f362694b.getHeight();
        float f27 = i17 * f19;
        float f28 = i18 * f19;
        android.graphics.Point point = q2Var.f362681a.f362722u.f362693a;
        float f29 = point.x + width;
        float f37 = 2;
        return new hf2.r2(new android.graphics.Point((int) (f29 - (f27 / f37)), (int) ((point.y + height) - (f28 / f37))), new android.util.Size((int) f27, (int) f28));
    }

    public final void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addTouchListener ");
        jz5.g gVar = this.f362683c;
        sb6.append((hf2.o2) ((jz5.n) gVar).mo141623x754a37bb());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362682b, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f362681a.f372632e;
        if (ubVar == null || (o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9) ubVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.class)) == null || (c10849x610a91e1 = o9Var.f195250r) == null) {
            return;
        }
        c10849x610a91e1.b((hf2.o2) ((jz5.n) gVar).mo141623x754a37bb(), true);
    }

    public final java.util.LinkedList b(android.view.View view) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        hf2.x xVar = this.f362681a;
        r45.ei0 ei0Var = xVar.f362718q;
        if (ei0Var != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            java.lang.String str = "calculateStickerLocationInfo new anchorLocationInfo:" + new hf2.r2(new android.graphics.Point(iArr[0], iArr[1]), new android.util.Size(view.getWidth(), view.getHeight())) + ", cache anchorLocationInfo:" + xVar.f362722u;
            java.lang.String str2 = this.f362682b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
            java.util.LinkedList<r45.ji0> textItemRestoreDataList = ei0Var.f455062d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textItemRestoreDataList, "textItemRestoreDataList");
            for (r45.ji0 ji0Var : textItemRestoreDataList) {
                hf2.r2 c17 = c(this, ji0Var.f459355d, ji0Var.f459356e, ji0Var.f459363o, ji0Var.f459364p, ji0Var.f459360i);
                linkedList.add(new hf2.m2(1, c17));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "calculateStickerLocationInfo textLocation:" + c17);
            }
            java.util.LinkedList<r45.gi0> picItemRestoreDataList = ei0Var.f455063e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(picItemRestoreDataList, "picItemRestoreDataList");
            for (r45.gi0 gi0Var : picItemRestoreDataList) {
                hf2.r2 c18 = c(this, gi0Var.f456801d, gi0Var.f456802e, gi0Var.f456807m, gi0Var.f456808n, gi0Var.f456803f);
                linkedList.add(new hf2.m2(2, c18));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "calculateStickerLocationInfo picLocation:" + c18);
            }
        }
        return linkedList;
    }

    public final void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9 o9Var;
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10849x610a91e1 c10849x610a91e1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeTouchListener ");
        jz5.g gVar = this.f362683c;
        sb6.append((hf2.o2) ((jz5.n) gVar).mo141623x754a37bb());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f362682b, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.ub ubVar = this.f362681a.f372632e;
        if (ubVar == null || (o9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9) ubVar.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.o9.class)) == null || (c10849x610a91e1 = o9Var.f195250r) == null) {
            return;
        }
        c10849x610a91e1.e((hf2.o2) ((jz5.n) gVar).mo141623x754a37bb());
    }

    public final boolean e(float f17, float f18, hf2.m2 m2Var) {
        if (f17 >= m2Var.f362650b.f362693a.x && f17 <= r1 + r0.f362694b.getWidth()) {
            if (f18 >= m2Var.f362650b.f362693a.y && f18 <= r6 + r4.f362694b.getHeight()) {
                return true;
            }
        }
        return false;
    }
}
