package bp4;

/* loaded from: classes10.dex */
public final class z3 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 f104970f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f104971g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f104972h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f104973i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f104974m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f104975n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f104976o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String[] f104977p;

    /* renamed from: q, reason: collision with root package name */
    public float f104978q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f104979r;

    /* renamed from: s, reason: collision with root package name */
    public int f104980s;

    /* renamed from: t, reason: collision with root package name */
    public final yz5.l f104981t;

    /* renamed from: u, reason: collision with root package name */
    public final yz5.l f104982u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 holder, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104970f = holder;
        this.f104971g = "MicroMsg.TrackDurationScalePlugin";
        this.f104972h = jz5.h.b(new bp4.t3(this));
        this.f104973i = jz5.h.b(new bp4.y3(this));
        this.f104974m = jz5.h.b(new bp4.q3(this));
        this.f104975n = jz5.h.b(new bp4.r3(this));
        this.f104976o = kz5.c0.i(java.lang.Float.valueOf(0.5f), java.lang.Float.valueOf(0.75f), java.lang.Float.valueOf(1.0f), java.lang.Float.valueOf(1.5f), java.lang.Float.valueOf(2.0f));
        java.lang.String[] stringArray = holder.getContext().getResources().getStringArray(com.p314xaae8f345.mm.R.C30856x58c7259.f559567ah);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stringArray, "getStringArray(...)");
        this.f104977p = stringArray;
        this.f104978q = 1.0f;
        this.f104981t = new bp4.s3(status);
        this.f104982u = new bp4.u3(status);
        holder.m68234x466a35c6(new bp4.p3(this));
        holder.m68232x76bcab3c(false);
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = this.f104970f;
        if (!c17043x8103c103.h()) {
            return false;
        }
        c17043x8103c103.m68236x76500a7f(false);
        return true;
    }

    public final void z(float f17) {
        this.f104978q = f17;
        java.lang.Float valueOf = java.lang.Float.valueOf(f17);
        java.util.List list = this.f104976o;
        int indexOf = list.indexOf(valueOf);
        if (indexOf < 0) {
            indexOf = list.size() / 2;
        }
        this.f104980s = indexOf;
        jz5.g gVar = this.f104973i;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18793x66a884d5) ((jz5.n) gVar).mo141623x754a37bb()).m72531xb887207d(list.size());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18793x66a884d5) ((jz5.n) gVar).mo141623x754a37bb()).m72533xf579a34a(indexOf);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18793x66a884d5) ((jz5.n) gVar).mo141623x754a37bb()).m72532x161cb701(kz5.z.z0(this.f104977p));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18793x66a884d5) ((jz5.n) gVar).mo141623x754a37bb()).m72530x6c4ebec7(new bp4.v3(this));
        ((android.view.View) ((jz5.n) this.f104974m).mo141623x754a37bb()).setOnClickListener(new bp4.w3(this));
        ((android.view.View) ((jz5.n) this.f104975n).mo141623x754a37bb()).setOnClickListener(new bp4.x3(this));
        this.f104979r = false;
        this.f104970f.m68236x76500a7f(true);
    }
}
