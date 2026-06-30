package fj4;

/* loaded from: classes11.dex */
public final class c implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f344760d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f344763g;

    /* renamed from: i, reason: collision with root package name */
    public long f344765i;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f344761e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f344762f = new java.util.LinkedList();

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f344764h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public java.util.List f344766m = new java.util.LinkedList();

    public c(java.util.List list) {
        this.f344760d = list;
        a();
    }

    public final void a() {
        boolean z17 = true;
        java.util.List<pj4.n1> list = this.f344760d;
        if (list != null) {
            for (pj4.n1 n1Var : list) {
                mj4.h a17 = fj4.b.a(n1Var);
                this.f344764h.add(a17);
                mj4.k kVar = (mj4.k) a17;
                this.f344761e.add(kVar.h());
                if (kVar.p().length() == 0) {
                    this.f344762f.add(bk4.e1.f102993a.d());
                } else {
                    this.f344762f.add(kVar.p());
                }
                java.lang.String text_status_id = n1Var.f436732d;
                if (text_status_id != null) {
                    java.util.List list2 = this.f344766m;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text_status_id, "text_status_id");
                    list2.add(text_status_id);
                } else {
                    this.f344766m.add("");
                }
            }
        }
        if (!(list == null || list.isEmpty())) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
            this.f344765i = ((pj4.n1) list.get(0)).f436738m;
        }
        java.util.List list3 = this.f344764h;
        if (list3 != null && !list3.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(com.p314xaae8f345.tav.p2957xa228aba5.C25746x8808ec8f.f47897xee1ddd9f);
        java.util.Date parse = simpleDateFormat.parse(simpleDateFormat.format(java.lang.Long.valueOf(((mj4.k) ((mj4.h) this.f344764h.get(0))).f408600b.f76512x81959a6e * 1000)));
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(parse);
        this.f344763g = java.lang.String.valueOf(calendar.get(5));
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
