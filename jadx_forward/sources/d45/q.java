package d45;

/* loaded from: classes10.dex */
public final class q extends x35.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f f307987d;

    /* renamed from: e, reason: collision with root package name */
    public final d45.c f307988e;

    /* renamed from: f, reason: collision with root package name */
    public int f307989f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f307990g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f307991h;

    /* renamed from: i, reason: collision with root package name */
    public final int f307992i;

    /* renamed from: m, reason: collision with root package name */
    public final java.text.SimpleDateFormat f307993m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnLongClickListener f307994n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnClickListener f307995o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f307996p;

    /* renamed from: q, reason: collision with root package name */
    public d45.d f307997q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View.OnClickListener f307998r;

    public q(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f mContext, d45.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        this.f307987d = mContext;
        this.f307988e = cVar;
        this.f307989f = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20010xbd4db7c2());
        this.f307990g = new java.util.ArrayList();
        this.f307991h = new java.util.ArrayList();
        this.f307992i = 10;
        this.f307993m = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault());
        this.f307994n = new d45.m(this);
        this.f307995o = new d45.p(this);
        this.f307996p = jz5.h.b(d45.l.f307982d);
        this.f307998r = new d45.k(this);
        m8146xced61ae5();
    }

    public final int B() {
        return this.f307990g.size();
    }

    public final java.util.ArrayList E() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f307991h.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) next).f219963e);
        }
        return arrayList;
    }

    public final void I(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078) {
        java.util.ArrayList arrayList = this.f307991h;
        if (kz5.n0.O(arrayList, abstractC15633xee433078)) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int size = arrayList.size();
            for (int c07 = kz5.n0.c0(arrayList, abstractC15633xee433078); c07 < size; c07++) {
                java.lang.Object obj = arrayList.get(c07);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                int indexOf = this.f307990g.indexOf((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj);
                if (indexOf != -1) {
                    arrayList2.add(java.lang.Integer.valueOf(indexOf));
                }
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.a(arrayList).remove(abstractC15633xee433078);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activity = this.f307987d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((e45.r) pf5.z.f435481a.a(activity).a(e45.r.class)).f330955i.remove(new com.p314xaae8f345.mm.p2470x93e71c27.ui.v0(null, abstractC15633xee433078, null, 5, null));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                m8147xed6e4d18(((java.lang.Number) next).intValue());
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f307990g.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return 5 == ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) this.f307990g.get(i17)).mo63659xfb85f7b0() ? 2 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ee  */
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 r26, int r27) {
        /*
            Method dump skipped, instructions count: 653
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d45.q.mo864xe5e2e48d(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19730xa7b9756f activityC19730xa7b9756f = this.f307987d;
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(activityC19730xa7b9756f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570303ad0, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new d45.b(inflate);
        }
        if (i17 != 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(activityC19730xa7b9756f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570303ad0, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new d45.b(inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(activityC19730xa7b9756f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570304ad1, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
        return new d45.j(inflate3);
    }

    public final java.util.ArrayList x(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) it.next();
                if (5 != abstractC15633xee433078.mo63659xfb85f7b0()) {
                    arrayList.add(abstractC15633xee433078);
                }
            }
        }
        return arrayList;
    }

    public final java.util.ArrayList y(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        java.lang.String str = "";
        for (int i17 = 0; i17 < size; i17++) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) list.get(i17);
            java.lang.String a17 = k35.m1.a(this.f307987d, abstractC15633xee433078.f219968m);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "anotherFormatTimeInList(...)");
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, a17)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15634x4e383bab c15634x4e383bab = new com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15634x4e383bab();
                c15634x4e383bab.f219969n = a17;
                arrayList.add(c15634x4e383bab);
                str = a17;
            }
            abstractC15633xee433078.f219969n = a17;
            arrayList.add(abstractC15633xee433078);
        }
        return arrayList;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 z(int i17) {
        if (i17 < this.f307990g.size()) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) this.f307990g.get(i17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AlbumAdapter", "get item error, media items size[%d], adjustPos[%d]", java.lang.Integer.valueOf(this.f307990g.size()), java.lang.Integer.valueOf(i17));
        return null;
    }
}
