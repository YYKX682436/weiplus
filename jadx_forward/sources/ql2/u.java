package ql2;

/* loaded from: classes10.dex */
public final class u extends bi4.o0 {

    /* renamed from: c, reason: collision with root package name */
    public int f446090c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f446091d;

    /* renamed from: e, reason: collision with root package name */
    public r45.g92 f446092e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.e0 f446093f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ql2.v f446094g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.lang.String str, ql2.v vVar) {
        super(str);
        this.f446094g = vVar;
        this.f446090c = 1;
    }

    @Override // bi4.o0
    public boolean d(android.content.Context context, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pj4.e0 e0Var = this.f446093f;
        if (e0Var == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102607b.f436672d, "18")) {
            return false;
        }
        java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(11, 8, 65);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        vd2.t3.f517454a.i(0, new android.content.Intent(), e0Var.f436560d, pm0.v.Z(e0Var.f436563g), e0Var.f436562f, Gj, "");
        return true;
    }

    @Override // bi4.o0
    public java.lang.CharSequence i() {
        r45.g92 g92Var = this.f446092e;
        java.lang.String m75945x2fec8307 = g92Var != null ? g92Var.m75945x2fec8307(4) : null;
        return m75945x2fec8307 == null ? "" : m75945x2fec8307;
    }

    @Override // bi4.o0
    public boolean j() {
        return true;
    }

    @Override // bi4.o0
    public void m(java.lang.String str, pj4.j0 j0Var) {
        super.m(str, j0Var);
        if (j0Var == null) {
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j0Var.f436672d, "18")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder3rdLiveStatusService", "jumpInfo type check fail,type:" + j0Var.f436672d);
            return;
        }
        byte[] decode = android.util.Base64.decode(j0Var.f436675g, 0);
        pj4.e0 e0Var = new pj4.e0();
        e0Var.mo11468x92b714fd(decode);
        this.f446093f = e0Var;
        ql2.v vVar = this.f446094g;
        if (vVar.f446096e.containsKey(e0Var.f436563g)) {
            this.f446092e = (r45.g92) vVar.f446096e.get(e0Var.f436563g);
            r();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder3rdLiveStatusService", "start cgi to get finderinfo,live id:" + e0Var.f436563g);
        i95.m c17 = i95.n0.c(m40.h0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        m40.h0 h0Var = (m40.h0) c17;
        java.lang.String str2 = e0Var.f436561e;
        java.lang.String username = e0Var.f436562f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
        java.lang.String export_id = e0Var.f436560d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(export_id, "export_id");
        m40.h0.ci(h0Var, 0L, str2, 65, 2, username, true, null, null, 0L, null, false, false, export_id, null, 0, null, 53184, null).l().h(new ql2.t(e0Var, vVar, this));
    }

    @Override // bi4.o0
    public void n() {
    }

    @Override // bi4.o0
    public boolean p(android.widget.FrameLayout container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        r();
        android.widget.ImageView imageView = new android.widget.ImageView(container.getContext());
        s(imageView);
        container.addView(imageView);
        container.setVisibility(0);
        this.f446091d = new java.lang.ref.WeakReference(imageView);
        return true;
    }

    public final void r() {
        java.lang.String m75945x2fec8307;
        r45.g92 g92Var = this.f446092e;
        if (g92Var == null || (m75945x2fec8307 = g92Var.m75945x2fec8307(0)) == null) {
            return;
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0.u9((s40.w0) c17, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(m75945x2fec8307), false, null, new ql2.s(this), 0, null, null, null, 246, null);
    }

    public final void s(android.widget.ImageView imageView) {
        android.graphics.drawable.Drawable drawable;
        if (this.f446090c == 2) {
            drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79236x2de5f313);
            com.p314xaae8f345.mm.ui.uk.f(drawable, -1);
        } else {
            drawable = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79236x2de5f313);
        }
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }
}
