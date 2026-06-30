package tj3;

/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final sj3.g3 f501335a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.a f501336b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f501337c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f501338d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f501339e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f501340f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f501341g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f501342h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f501343i;

    public x(sj3.g3 multiTalkNewTalkingUILogic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTalkNewTalkingUILogic, "multiTalkNewTalkingUILogic");
        this.f501335a = multiTalkNewTalkingUILogic;
        this.f501336b = tj3.v.f501333d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f501337c = arrayList;
        this.f501338d = arrayList;
        this.f501341g = jz5.h.b(tj3.w.f501334d);
        this.f501342h = new java.util.ArrayList();
    }

    public final void a(java.util.Set visibleUser, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visibleUser, "visibleUser");
        java.util.List list = this.f501338d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t) next;
            if (tVar.f231832d || tVar.a()) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.t) it6.next()).f231830b);
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList2) {
            java.lang.String str2 = (java.lang.String) obj;
            if (visibleUser.contains(str2) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, (java.lang.String) ((jz5.n) this.f501341g).mo141623x754a37bb())) {
                arrayList3.add(obj);
            }
        }
        int size = arrayList3.size();
        java.util.List list2 = this.f501342h;
        if (size == ((java.util.ArrayList) list2).size() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f501343i) && !this.f501340f) {
            boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f501343i);
            if (!z17) {
                java.util.Iterator it7 = arrayList3.iterator();
                while (it7.hasNext()) {
                    if (!((java.util.ArrayList) list2).contains((java.lang.String) it7.next())) {
                        z17 = true;
                    }
                }
            }
            if (!z17) {
                return;
            }
        }
        this.f501343i = str;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(arrayList3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAvatarLayoutAdapter", "onVisibleUserChanged: visibleUser " + visibleUser + ", videoUser " + arrayList3 + ", " + str + ", forceRefresh " + this.f501340f);
        this.f501340f = false;
        if (kz5.n0.O(arrayList3, str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj2 : arrayList3) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) obj2, str)) {
                    arrayList4.add(obj2);
                }
            }
            Ri.Y(kz5.n0.X0(arrayList4), str);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 Ri2 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList3) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) obj3, str)) {
                arrayList5.add(obj3);
            }
        }
        Ri2.Y(kz5.n0.X0(arrayList5), "");
    }
}
