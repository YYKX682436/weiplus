package fb2;

/* loaded from: classes2.dex */
public final class a implements fb2.m {

    /* renamed from: a, reason: collision with root package name */
    public long f342372a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f342373b = "";

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fb2.m
    public boolean a(db2.c3 resp, int i17, int i18) {
        int i19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209493u2).mo141623x754a37bb()).r()).intValue() == 1) {
            this.f342372a = resp.d().m75942xfb822ef2(12);
            java.lang.String m75945x2fec8307 = resp.d().m75945x2fec8307(19);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            this.f342373b = m75945x2fec8307;
            if (this.f342372a != 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m75945x2fec8307)) {
                java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(1);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = null;
                if (m75941xfb821914 != null) {
                    java.util.Iterator it = m75941xfb821914.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) next).m76784x5db1b11() == this.f342372a) {
                            c19792x256d2725 = next;
                            break;
                        }
                    }
                    c19792x256d2725 = c19792x256d2725;
                }
                if (c19792x256d2725 != null) {
                    java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m76793xbd916e4b = c19792x256d2725.m76793xbd916e4b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76793xbd916e4b, "getLikeList(...)");
                    java.util.Iterator<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> it6 = m76793xbd916e4b.iterator();
                    int i27 = 0;
                    while (true) {
                        i19 = -1;
                        if (!it6.hasNext()) {
                            i27 = -1;
                            break;
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it6.next().m76102x6c03c64c(), c01.z1.r())) {
                            break;
                        }
                        i27++;
                    }
                    if (i27 > 1) {
                        c19792x256d2725.m76793xbd916e4b().add(1, c19792x256d2725.m76793xbd916e4b().remove(i27));
                    }
                    java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m76793xbd916e4b2 = c19792x256d2725.m76793xbd916e4b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76793xbd916e4b2, "getLikeList(...)");
                    java.util.Iterator<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> it7 = m76793xbd916e4b2.iterator();
                    int i28 = 0;
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it7.next().m76102x6c03c64c(), this.f342373b)) {
                            i19 = i28;
                            break;
                        }
                        i28++;
                    }
                    if (i19 > 0) {
                        c19792x256d2725.m76793xbd916e4b().add(0, c19792x256d2725.m76793xbd916e4b().remove(i19));
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("meExistIndex=");
                    sb6.append(i27);
                    sb6.append(" friendExistIndex=");
                    sb6.append(i19);
                    sb6.append(" redDotUsername=");
                    sb6.append(this.f342373b);
                    sb6.append(" self=");
                    sb6.append(c01.z1.r());
                    sb6.append("likeList=");
                    java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87> m76793xbd916e4b3 = c19792x256d2725.m76793xbd916e4b();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76793xbd916e4b3, "getLikeList(...)");
                    java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m76793xbd916e4b3, 10));
                    java.util.Iterator<T> it8 = m76793xbd916e4b3.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it8.next()).m76102x6c03c64c());
                    }
                    sb6.append(arrayList);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdjustOrderAvatarInterceptor", sb6.toString());
                }
            }
        }
        return false;
    }

    @Override // fb2.m
    public boolean b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d loadedInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedInfo, "loadedInfo");
        return false;
    }

    @Override // fb2.m
    public boolean c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.d loadedInfo, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedInfo, "loadedInfo");
        return false;
    }
}
