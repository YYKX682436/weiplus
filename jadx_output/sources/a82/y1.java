package a82;

@j95.b
/* loaded from: classes4.dex */
public final class y1 extends i95.w implements o72.s4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f2239d = "MicroMsg.Fav.FavRecentlyUsedService";

    /* renamed from: e, reason: collision with root package name */
    public final int f2240e = 20;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f2241f = jz5.h.b(new a82.x1(this));

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f2242g = "recentIds";

    /* renamed from: h, reason: collision with root package name */
    public r45.ok5 f2243h;

    public java.util.ArrayList Ai() {
        r45.ok5 Bi = Bi();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList list = Bi.f382330d;
        kotlin.jvm.internal.o.f(list, "list");
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(0, java.lang.Long.valueOf(((r45.nk5) it.next()).f381472d));
        }
        arrayList.toString();
        return arrayList;
    }

    public final r45.ok5 Bi() {
        r45.ok5 ok5Var = this.f2243h;
        if (ok5Var != null) {
            return ok5Var;
        }
        r45.ok5 ok5Var2 = new r45.ok5();
        java.lang.Object value = ((jz5.n) this.f2241f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        byte[] j17 = ((com.tencent.mm.sdk.platformtools.o4) value).j(this.f2242g + en1.a.a());
        if (j17 != null) {
            ok5Var2.parseFrom(j17);
        }
        this.f2243h = ok5Var2;
        return ok5Var2;
    }

    public void Di(java.lang.Long l17) {
        long longValue = l17.longValue();
        wi(java.lang.Long.valueOf(longValue));
        java.util.LinkedList linkedList = Bi().f382330d;
        r45.nk5 nk5Var = new r45.nk5();
        nk5Var.f381472d = longValue;
        linkedList.offer(nk5Var);
        if (linkedList.size() > this.f2240e) {
            linkedList.poll();
        }
        r45.ok5 ok5Var = this.f2243h;
        if (ok5Var != null) {
            java.lang.Object value = ((jz5.n) this.f2241f).getValue();
            kotlin.jvm.internal.o.f(value, "getValue(...)");
            ((com.tencent.mm.sdk.platformtools.o4) value).H(this.f2242g + en1.a.a(), ok5Var.toByteArray());
        }
    }

    public void wi(java.lang.Long l17) {
        java.util.LinkedList<r45.nk5> list = Bi().f382330d;
        kotlin.jvm.internal.o.f(list, "list");
        for (r45.nk5 nk5Var : list) {
            long j17 = nk5Var.f381472d;
            if (l17 != null && j17 == l17.longValue()) {
                list.remove(nk5Var);
                r45.ok5 ok5Var = this.f2243h;
                if (ok5Var != null) {
                    java.lang.Object value = ((jz5.n) this.f2241f).getValue();
                    kotlin.jvm.internal.o.f(value, "getValue(...)");
                    ((com.tencent.mm.sdk.platformtools.o4) value).H(this.f2242g + en1.a.a(), ok5Var.toByteArray());
                    return;
                }
                return;
            }
        }
    }
}
