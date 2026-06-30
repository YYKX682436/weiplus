package yq1;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f545999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f546000e;

    public s(java.util.List list, int i17) {
        this.f545999d = list;
        this.f546000e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lr1.c0 c0Var = lr1.c0.f402176a;
        java.util.List<ot0.l0> items = this.f545999d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        lr1.c0.f402179d = 0L;
        ((java.util.LinkedList) lr1.c0.f402180e).clear();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (ot0.l0 l0Var : items) {
            java.util.LinkedList items2 = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(l0Var.f430107h, l0Var.f430106g).f430114i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(items2, "items");
            kz5.h0.u(arrayList, items2);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            java.lang.String str = ((ot0.s0) next).f430295e;
            if (str == null ? false : hy4.i.l(str)) {
                arrayList2.add(next);
            }
        }
        java.util.Iterator it6 = arrayList2.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            int i17 = this.f546000e;
            if (!hasNext) {
                linkedList.size();
                c0Var.a(linkedList, i17);
                return;
            }
            ot0.s0 s0Var = (ot0.s0) it6.next();
            r45.u9 u9Var = new r45.u9();
            java.lang.String Url = s0Var.f430295e;
            u9Var.f468680e = Url;
            lr1.c0 c0Var2 = lr1.c0.f402176a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Url, "Url");
            u9Var.f468679d = c0Var2.b(Url);
            u9Var.f468682g = s0Var.f430303o;
            u9Var.f468683h = s0Var.L;
            if (i17 != 0) {
                if (s0Var.I == 1) {
                    u9Var.f468681f = 3;
                } else {
                    u9Var.f468681f = 1;
                }
                linkedList.add(u9Var);
            } else if (s0Var.I == 1) {
                u9Var.f468681f = 2;
                linkedList.add(u9Var);
            }
        }
    }
}
