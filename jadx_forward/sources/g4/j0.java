package g4;

/* loaded from: classes5.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public int f349915a;

    /* renamed from: b, reason: collision with root package name */
    public int f349916b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayDeque f349917c = new java.util.ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final g4.e1 f349918d = new g4.e1();

    public final void a(g4.l1 event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        boolean z17 = event instanceof g4.i1;
        java.util.ArrayDeque arrayDeque = this.f349917c;
        int i17 = 0;
        g4.e1 e1Var = this.f349918d;
        if (!z17) {
            if (!(event instanceof g4.f1)) {
                if (event instanceof g4.k1) {
                    g4.k1 k1Var = (g4.k1) event;
                    e1Var.b(k1Var.f349935a, k1Var.f349936b, k1Var.f349937c);
                    return;
                }
                return;
            }
            g4.f1 f1Var = (g4.f1) event;
            g4.x0 x0Var = g4.x0.f350138c;
            g4.a1 a1Var = f1Var.f349812a;
            e1Var.b(a1Var, false, x0Var);
            int ordinal = a1Var.ordinal();
            int i18 = f1Var.f349815d;
            if (ordinal == 1) {
                this.f349915a = i18;
                int b17 = f1Var.b();
                while (i17 < b17) {
                    arrayDeque.removeFirst();
                    i17++;
                }
                return;
            }
            if (ordinal != 2) {
                throw new java.lang.IllegalArgumentException("Page drop type must be prepend or append");
            }
            this.f349916b = i18;
            int b18 = f1Var.b();
            while (i17 < b18) {
                arrayDeque.removeLast();
                i17++;
            }
            return;
        }
        g4.i1 i1Var = (g4.i1) event;
        e1Var.getClass();
        g4.a0 combinedLoadStates = i1Var.f349906e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(combinedLoadStates, "combinedLoadStates");
        e1Var.f349794a = combinedLoadStates.f349726a;
        e1Var.f349795b = combinedLoadStates.f349727b;
        e1Var.f349796c = combinedLoadStates.f349728c;
        e1Var.f349797d = combinedLoadStates.f349729d;
        e1Var.f349798e = combinedLoadStates.f349730e;
        int ordinal2 = i1Var.f349902a.ordinal();
        int i19 = i1Var.f349904c;
        int i27 = i1Var.f349905d;
        java.util.List list = i1Var.f349903b;
        if (ordinal2 == 0) {
            arrayDeque.clear();
            this.f349916b = i27;
            this.f349915a = i19;
            arrayDeque.addAll(list);
            return;
        }
        if (ordinal2 != 1) {
            if (ordinal2 != 2) {
                return;
            }
            this.f349916b = i27;
            arrayDeque.addAll(list);
            return;
        }
        this.f349915a = i19;
        int size = list.size() - 1;
        e06.j jVar = new e06.j(size, sz5.b.a(size, 0, -1), -1);
        while (jVar.f327747f) {
            arrayDeque.addFirst(list.get(jVar.b()));
        }
    }

    public final java.util.List b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayDeque arrayDeque = this.f349917c;
        boolean z17 = !arrayDeque.isEmpty();
        g4.e1 e1Var = this.f349918d;
        if (z17) {
            arrayList.add(g4.i1.f349901g.a(kz5.n0.S0(arrayDeque), this.f349915a, this.f349916b, e1Var.c()));
        } else {
            g4.z0 z0Var = e1Var.f349797d;
            g4.a1 a1Var = g4.a1.REFRESH;
            g4.y0 y0Var = z0Var.f350178a;
            g4.j1 j1Var = g4.k1.f349934d;
            if (j1Var.a(y0Var, false)) {
                arrayList.add(new g4.k1(a1Var, false, y0Var));
            }
            g4.a1 a1Var2 = g4.a1.PREPEND;
            g4.y0 y0Var2 = z0Var.f350179b;
            if (j1Var.a(y0Var2, false)) {
                arrayList.add(new g4.k1(a1Var2, false, y0Var2));
            }
            g4.a1 a1Var3 = g4.a1.APPEND;
            g4.y0 y0Var3 = z0Var.f350180c;
            if (j1Var.a(y0Var3, false)) {
                arrayList.add(new g4.k1(a1Var3, false, y0Var3));
            }
            g4.z0 z0Var2 = e1Var.f349798e;
            if (z0Var2 != null) {
                g4.y0 y0Var4 = z0Var2.f350178a;
                if (j1Var.a(y0Var4, true)) {
                    arrayList.add(new g4.k1(a1Var, true, y0Var4));
                }
                g4.y0 y0Var5 = z0Var2.f350179b;
                if (j1Var.a(y0Var5, true)) {
                    arrayList.add(new g4.k1(a1Var2, true, y0Var5));
                }
                g4.y0 y0Var6 = z0Var2.f350180c;
                if (j1Var.a(y0Var6, true)) {
                    arrayList.add(new g4.k1(a1Var3, true, y0Var6));
                }
            }
        }
        return arrayList;
    }
}
