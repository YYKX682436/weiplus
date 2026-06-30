package cm2;

/* loaded from: classes3.dex */
public abstract class t implements so2.j5, c61.bc {

    /* renamed from: d, reason: collision with root package name */
    public long f124918d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f124919e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f124921g;

    /* renamed from: h, reason: collision with root package name */
    public int f124922h;

    /* renamed from: i, reason: collision with root package name */
    public int f124923i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f124924m;

    /* renamed from: n, reason: collision with root package name */
    public int f124925n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f124926o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f124927p;

    /* renamed from: q, reason: collision with root package name */
    public int f124928q;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f124930s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f124931t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f124932u;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f124920f = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f124929r = "";

    public final cm2.t e(r45.f52 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f124919e = info.m75934xbce7f2f(6);
        java.lang.String m75945x2fec8307 = info.m75945x2fec8307(5);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        this.f124920f = m75945x2fec8307;
        this.f124921g = info.m75933x41a8a7f2(1);
        this.f124922h = info.m75939xb282bd08(7);
        this.f124918d = info.m75942xfb822ef2(4);
        this.f124923i = info.m75939xb282bd08(10);
        this.f124924m = info.m75934xbce7f2f(2);
        this.f124925n = info.m75939xb282bd08(0);
        this.f124926o = info.m75933x41a8a7f2(11);
        this.f124927p = info.m75933x41a8a7f2(12);
        java.lang.String m75945x2fec83072 = info.m75945x2fec8307(13);
        this.f124929r = m75945x2fec83072 != null ? m75945x2fec83072 : "";
        this.f124928q = info.m75939xb282bd08(9);
        this.f124930s = info.m75934xbce7f2f(14);
        this.f124931t = info.m75934xbce7f2f(15);
        this.f124932u = info.m75939xb282bd08(16) == 1;
        return this;
    }

    public final r45.f52 f(r45.f52 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        info.set(6, this.f124919e);
        info.set(5, this.f124920f);
        info.set(1, java.lang.Boolean.valueOf(this.f124921g));
        info.set(7, java.lang.Integer.valueOf(this.f124922h));
        info.set(4, java.lang.Long.valueOf(this.f124918d));
        info.set(10, java.lang.Integer.valueOf(this.f124923i));
        info.set(2, new com.p314xaae8f345.mm.p2495xc50a8b8b.g(b().mo14344x5f01b1f6()));
        info.set(11, java.lang.Boolean.valueOf(this.f124926o));
        info.set(12, java.lang.Boolean.valueOf(this.f124927p));
        info.set(13, this.f124929r);
        info.set(9, java.lang.Integer.valueOf(this.f124928q));
        info.set(14, this.f124930s);
        info.set(15, this.f124931t);
        info.set(16, java.lang.Integer.valueOf(this.f124932u ? 1 : 0));
        return info;
    }
}
