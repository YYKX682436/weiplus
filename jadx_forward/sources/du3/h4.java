package du3;

/* loaded from: classes3.dex */
public final class h4 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f325142f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f325143g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f325144h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f325145i;

    /* renamed from: m, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f325146m;

    /* renamed from: n, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f325147n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f325148o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(ju3.d0 status, android.view.ViewGroup parent) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f325142f = parent;
        this.f325143g = jz5.h.b(new du3.u3(this));
        this.f325144h = jz5.h.b(new du3.g4(this));
        this.f325145i = jz5.h.b(new du3.v3(this));
        this.f325146m = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        this.f325148o = jz5.h.b(new du3.f4(this));
    }

    public final android.view.View A() {
        java.lang.Object mo141623x754a37bb = this.f325143g.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 B() {
        java.lang.Object mo141623x754a37bb = this.f325145i.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    public final hk0.u0 C() {
        return (hk0.u0) ((jz5.n) this.f325148o).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 D() {
        java.lang.Object mo141623x754a37bb = this.f325144h.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb;
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoUndoPlugin", "onAttach");
        android.view.View A = A();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(A, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        A.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(A, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoUndoPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C().Z6(2, new du3.y3(this));
        C().Z6(3, new du3.z3(this));
        C().Z6(4, new du3.a4(this));
        C().a7(1, new du3.b4(this));
        this.f325147n = p3325xe03a0797.p3326xc267989b.l.d(this.f325146m, null, null, new du3.e4(this, null), 3, null);
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoUndoPlugin", "onDetach");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f325147n;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        if (D().isEnabled()) {
            z(D(), false);
        }
        if (B().isEnabled()) {
            z(B(), false);
        }
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        D().setOnClickListener(new du3.w3(this));
        B().setOnClickListener(new du3.x3(this));
    }

    public final void z(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 view, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoUndoPlugin", "changeUndoState >> " + z17);
        view.setEnabled(z17);
        view.m82040x7541828(i65.a.d(this.f325142f.getContext(), z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560806ac5 : com.p314xaae8f345.mm.R.C30859x5a72f63.ac6));
    }
}
