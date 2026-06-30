package sf4;

/* loaded from: classes4.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f489071a;

    /* renamed from: b, reason: collision with root package name */
    public final int f489072b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f489073c;

    /* renamed from: d, reason: collision with root package name */
    public final int f489074d;

    /* renamed from: e, reason: collision with root package name */
    public int f489075e;

    /* renamed from: f, reason: collision with root package name */
    public int f489076f;

    /* renamed from: g, reason: collision with root package name */
    public int f489077g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f489078h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f489079i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f489080j;

    public o1(java.util.List groupItems, int i17, int i18, sf4.o1 o1Var, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupItems, "groupItems");
        this.f489071a = i17;
        this.f489072b = i18;
        this.f489073c = z17;
        this.f489074d = 15;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f489078h = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f489079i = arrayList2;
        this.f489080j = kz5.c0.i(new sf4.l1(this), new sf4.m1(this), new sf4.n1(this));
        if ((o1Var != null && i17 != o1Var.f489071a) || ((o1Var != null && i18 != o1Var.f489072b) || b(groupItems))) {
            this.f489075e = i17;
            this.f489076f = i18;
            this.f489077g = 0;
        }
        arrayList.clear();
        arrayList2.clear();
        synchronized (groupItems) {
            java.util.Iterator it = groupItems.iterator();
            while (it.hasNext()) {
                java.util.List list = (java.util.List) it.next();
                if (!list.isEmpty()) {
                    this.f489079i.add(list.get(0));
                }
            }
        }
        if (this.f489071a < groupItems.size()) {
            java.lang.Iterable iterable = (java.lang.Iterable) groupItems.get(this.f489071a);
            synchronized (iterable) {
                java.util.Iterator it6 = iterable.iterator();
                while (it6.hasNext()) {
                    this.f489078h.add((if4.f) it6.next());
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        return new jz5.l(r4, new sf4.q1(r13.f489075e, 0, r4, 0, 0, 24, null));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final jz5.l a(sf4.o1 r13) {
        /*
        L0:
            boolean r0 = r13.f489073c
            if (r0 == 0) goto La
            int r1 = r13.f489075e
            int r1 = r1 + 1
            r13.f489075e = r1
        La:
            int r1 = r13.f489075e
            java.util.ArrayList r2 = r13.f489079i
            int r3 = r2.size()
            r4 = 0
            if (r1 < r3) goto L16
            goto L4e
        L16:
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L58
            if (r1 <= 0) goto L4f
            int r1 = r13.f489075e     // Catch: java.lang.Throwable -> L58
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L58
            if4.f r1 = (if4.f) r1     // Catch: java.lang.Throwable -> L58
            if4.h r1 = r1.f372780e     // Catch: java.lang.Throwable -> L58
            sf4.u1 r2 = sf4.u1.f489116a     // Catch: java.lang.Throwable -> L58
            boolean r2 = r2.j(r1)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L2f
            r4 = r1
        L2f:
            if (r4 == 0) goto L4f
            jz5.l r1 = new jz5.l     // Catch: java.lang.Throwable -> L58
            sf4.q1 r2 = new sf4.q1     // Catch: java.lang.Throwable -> L58
            int r6 = r13.f489075e     // Catch: java.lang.Throwable -> L58
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 24
            r12 = 0
            r5 = r2
            r8 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L58
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L58
            if (r0 != 0) goto L4d
            int r0 = r13.f489075e
            int r0 = r0 + 1
            r13.f489075e = r0
        L4d:
            r4 = r1
        L4e:
            return r4
        L4f:
            if (r0 != 0) goto L0
            int r0 = r13.f489075e
            int r0 = r0 + 1
            r13.f489075e = r0
            goto L0
        L58:
            r1 = move-exception
            if (r0 != 0) goto L61
            int r0 = r13.f489075e
            int r0 = r0 + 1
            r13.f489075e = r0
        L61:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sf4.o1.a(sf4.o1):jz5.l");
    }

    public final boolean b(java.util.List list) {
        int size = list.size();
        java.util.ArrayList arrayList = this.f489079i;
        if (size != arrayList.size()) {
            return true;
        }
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            if (((java.util.List) list.get(i17)).isEmpty() || ((if4.f) arrayList.get(i17)).f372780e.f372786a != ((if4.f) ((java.util.List) list.get(i17)).get(0)).f372780e.f372786a) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ o1(java.util.List list, int i17, int i18, sf4.o1 o1Var, boolean z17, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(list, i17, i18, o1Var, (i19 & 16) != 0 ? true : z17);
    }
}
