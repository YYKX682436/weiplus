package yq1;

/* loaded from: classes7.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f546021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f546022e;

    public w(java.util.List list, int i17) {
        this.f546021d = list;
        this.f546022e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f546022e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
        java.util.List<java.lang.String[]> items = this.f546021d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1 t1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175968a;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(t1Var2.s(i17))) {
            int m17 = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.m(i17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String[] strArr : items) {
                int parseInt = java.lang.Integer.parseInt(strArr[2]);
                java.lang.String str = strArr[3];
                java.lang.Iterable<ot0.s0> iterable = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(java.lang.Long.parseLong(strArr[0]), strArr[1]).f430114i;
                if (parseInt > 0) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iterable);
                    iterable = kz5.n0.K0(iterable, parseInt);
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(iterable, "let(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(iterable, 10));
                for (ot0.s0 s0Var : iterable) {
                    java.lang.String str2 = s0Var.f430295e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList2.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b1(str2, s0Var.f430303o, str));
                }
                kz5.h0.u(arrayList, arrayList2);
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b1 b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.b1) it.next();
                arrayList3.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0(b1Var.f175721a, t1Var2.j(b1Var.f175722b), b1Var.f175723c));
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0 z0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0) next;
                java.lang.String str3 = z0Var.f176018a;
                if (!(!hy4.i.p(str3) || com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.f175976i.b(str3, z0Var.f176019b))) {
                    arrayList4.add(next);
                }
            }
            int size = arrayList4.size();
            int max = java.lang.Math.max(arrayList4.size() - m17, 0);
            java.util.List K0 = kz5.n0.K0(arrayList4, m17);
            if (!K0.isEmpty()) {
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).y(i17, size, K0.size(), K0.size() / size, max, m17);
                t1Var2.d(K0, i17, max, 1);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preloadData preloadByInfoIdAndBuffer toStrip:");
                sb6.append(m17);
                sb6.append(" strip:");
                sb6.append(max);
                sb6.append(" dispatch:");
                java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(K0, 10));
                java.util.Iterator it7 = K0.iterator();
                while (it7.hasNext()) {
                    arrayList5.add(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.d.d(((com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.z0) it7.next()).f176018a));
                }
                sb6.append(arrayList5);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PreloadLogic", sb6.toString());
            }
        }
    }
}
