package sd5;

/* loaded from: classes9.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f488253a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f488254b;

    /* renamed from: c, reason: collision with root package name */
    public final sd5.q f488255c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f488256d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f488257e;

    public o(java.lang.String talkUsername, yz5.a deleteCreateTimeGetter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talkUsername, "talkUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deleteCreateTimeGetter, "deleteCreateTimeGetter");
        sd5.q qVar = sd5.q.f488259e;
        sd5.q qVar2 = sd5.q.f488259e;
        this.f488253a = talkUsername;
        this.f488254b = deleteCreateTimeGetter;
        this.f488255c = qVar2;
        this.f488256d = new java.util.ArrayList();
    }

    public final int a(int i17) {
        if (i17 > 0) {
            java.util.List list = this.f488256d;
            if (!((java.util.ArrayList) list).isEmpty()) {
                int min = java.lang.Math.min(i17, ((java.util.ArrayList) list).size());
                ((java.util.ArrayList) list).subList(0, min).clear();
                return min;
            }
        }
        return 0;
    }

    public final int b(long j17) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().F2(this.f488253a, ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p5(this.f488253a), j17);
    }

    public final long c() {
        return ((java.lang.Number) this.f488254b.mo152xb9724478()).longValue();
    }

    public final long d() {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.a0(this.f488256d, 0);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f9Var != null ? java.lang.Long.valueOf(f9Var.T1()) : null);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Long l17 = (java.lang.Long) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
        if (l17 != null) {
            return l17.longValue();
        }
        return 0L;
    }

    public final long e() {
        java.lang.Object m143895xf1229813;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.util.List list = this.f488256d;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) kz5.n0.a0(list, kz5.c0.h(list));
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f9Var != null ? java.lang.Long.valueOf(f9Var.T1()) : null);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Long l17 = (java.lang.Long) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
        if (l17 != null) {
            return l17.longValue();
        }
        return 9223372036854775806L;
    }

    public final boolean f() {
        return e() >= ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p5(this.f488253a);
    }

    public final java.util.List g() {
        this.f488255c.getClass();
        return h(16);
    }

    public final java.util.List h(int i17) {
        java.util.List list = this.f488256d;
        ((java.util.ArrayList) list).clear();
        this.f488257e = false;
        sd5.i iVar = sd5.i.f488252a;
        long c17 = c();
        java.lang.String talker = this.f488253a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        ((java.util.ArrayList) list).addAll(iVar.c(talker, i17, c17, 0L));
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new sd5.j());
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        arrayList2.size();
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List i(java.lang.String r21, long r22, boolean r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sd5.o.i(java.lang.String, long, boolean, boolean):java.util.List");
    }

    public final java.util.List j() {
        java.util.List list = this.f488256d;
        if (((java.util.ArrayList) list).isEmpty()) {
            list = g();
        } else {
            ((java.util.ArrayList) list).addAll(sd5.i.f488252a.b(this.f488253a, this.f488255c.f488261b, c(), ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((java.util.ArrayList) list).get(((java.util.ArrayList) list).size() - 1)).mo78012x3fdd41df() + 1));
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new sd5.k());
            }
        }
        list.size();
        return list;
    }

    public final java.util.List k() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmMsgDataSource", "loadMoreTop");
        java.util.List list = this.f488256d;
        if (((java.util.ArrayList) list).isEmpty()) {
            return g();
        }
        java.util.List c17 = sd5.i.f488252a.c(this.f488253a, this.f488255c.f488262c, c(), ((com.p314xaae8f345.mm.p2621x8fb0427b.f9) ((java.util.ArrayList) list).get(0)).mo78012x3fdd41df() - 1);
        if (((java.util.ArrayList) c17).isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvvmMsgDataSource", "beforeList isEmpty!");
            this.f488257e = true;
        }
        ((java.util.ArrayList) list).addAll(c17);
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new sd5.l());
        }
        return list;
    }

    public final java.util.List l() {
        java.util.List d17 = sd5.i.f488252a.d(this.f488253a, c(), d(), ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().p5(this.f488253a));
        java.util.List list = this.f488256d;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(d17);
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new sd5.m());
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        arrayList2.size();
        return arrayList2;
    }

    public final java.util.List m() {
        java.util.List d17 = sd5.i.f488252a.d(this.f488253a, c(), d(), e());
        java.util.List list = this.f488256d;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list).addAll(d17);
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        if (arrayList.size() > 1) {
            kz5.g0.t(arrayList, new sd5.n());
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        arrayList2.size();
        return arrayList2;
    }
}
