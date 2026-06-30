package a82;

@j95.b
/* loaded from: classes4.dex */
public final class y1 extends i95.w implements o72.s4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f83772d = "MicroMsg.Fav.FavRecentlyUsedService";

    /* renamed from: e, reason: collision with root package name */
    public final int f83773e = 20;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f83774f = jz5.h.b(new a82.x1(this));

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f83775g = "recentIds";

    /* renamed from: h, reason: collision with root package name */
    public r45.ok5 f83776h;

    public java.util.ArrayList Ai() {
        r45.ok5 Bi = Bi();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList list = Bi.f463863d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(0, java.lang.Long.valueOf(((r45.nk5) it.next()).f463005d));
        }
        arrayList.toString();
        return arrayList;
    }

    public final r45.ok5 Bi() {
        r45.ok5 ok5Var = this.f83776h;
        if (ok5Var != null) {
            return ok5Var;
        }
        r45.ok5 ok5Var2 = new r45.ok5();
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f83774f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        byte[] j17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).j(this.f83775g + en1.a.a());
        if (j17 != null) {
            ok5Var2.mo11468x92b714fd(j17);
        }
        this.f83776h = ok5Var2;
        return ok5Var2;
    }

    public void Di(java.lang.Long l17) {
        long longValue = l17.longValue();
        wi(java.lang.Long.valueOf(longValue));
        java.util.LinkedList linkedList = Bi().f463863d;
        r45.nk5 nk5Var = new r45.nk5();
        nk5Var.f463005d = longValue;
        linkedList.offer(nk5Var);
        if (linkedList.size() > this.f83773e) {
            linkedList.poll();
        }
        r45.ok5 ok5Var = this.f83776h;
        if (ok5Var != null) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) this.f83774f).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).H(this.f83775g + en1.a.a(), ok5Var.mo14344x5f01b1f6());
        }
    }

    public void wi(java.lang.Long l17) {
        java.util.LinkedList<r45.nk5> list = Bi().f463863d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "list");
        for (r45.nk5 nk5Var : list) {
            long j17 = nk5Var.f463005d;
            if (l17 != null && j17 == l17.longValue()) {
                list.remove(nk5Var);
                r45.ok5 ok5Var = this.f83776h;
                if (ok5Var != null) {
                    java.lang.Object mo141623x754a37bb = ((jz5.n) this.f83774f).mo141623x754a37bb();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                    ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) mo141623x754a37bb).H(this.f83775g + en1.a.a(), ok5Var.mo14344x5f01b1f6());
                    return;
                }
                return;
            }
        }
    }
}
