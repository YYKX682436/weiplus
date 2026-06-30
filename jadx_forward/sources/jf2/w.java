package jf2;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e f380940a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f380941b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f380942c;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store, java.util.List entranceBtnList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entranceBtnList, "entranceBtnList");
        this.f380940a = store;
        this.f380941b = entranceBtnList;
        this.f380942c = "LiveAnchorBottomEntrancePriorityHelper";
    }

    public final boolean a(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f380941b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jf2.h) obj).mo58036x368f3a() == i17) {
                break;
            }
        }
        jf2.h hVar = (jf2.h) obj;
        if (hVar != null) {
            return hVar.i();
        }
        return false;
    }

    public final java.util.List b() {
        return kz5.c0.i(24, 18, 10, 25, 11, 16, 6, 8, 2);
    }

    public final jf2.v c() {
        return new jf2.v(kz5.c0.i(18, 10, 6, 2), null, 2, null);
    }
}
