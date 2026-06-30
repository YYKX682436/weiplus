package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B/\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/label/ui/AbsLabelUserDialog;", "Lhg5/d;", "Landroidx/lifecycle/x;", "Ljz5/f0;", "checkDismissOnContextDestroy", "Landroid/content/Context;", "uiContext", "Ln80/d;", "uiParamConfig", "Ln80/b;", "dataFetcher", "Ln80/c;", "opCallback", "<init>", "(Landroid/content/Context;Ln80/d;Ln80/b;Ln80/c;)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.label.ui.AbsLabelUserDialog */
/* loaded from: classes11.dex */
public final class DialogC16164x43fb9455 extends hg5.d implements p012xc85e97e9.p093xedfae76a.x {
    public static final /* synthetic */ int K = 0;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final p3325xe03a0797.p3326xc267989b.y0 I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f224714J;

    /* renamed from: r, reason: collision with root package name */
    public final n80.d f224715r;

    /* renamed from: s, reason: collision with root package name */
    public final n80.b f224716s;

    /* renamed from: t, reason: collision with root package name */
    public final n80.c f224717t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f224718u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f224719v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.ArrayList f224720w;

    /* renamed from: x, reason: collision with root package name */
    public int f224721x;

    /* renamed from: y, reason: collision with root package name */
    public int f224722y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f224723z;

    public /* synthetic */ DialogC16164x43fb9455(android.content.Context context, n80.d dVar, n80.b bVar, n80.c cVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, dVar, (i17 & 4) != 0 ? null : bVar, (i17 & 8) != 0 ? null : cVar);
    }

    @Override // hg5.d
    public android.view.View F() {
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.crx, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return inflate;
    }

    @Override // hg5.d
    public void G() {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 L;
        super.G();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsLabelUserDialog", "[" + hashCode() + "] initContentView");
        android.view.View view = (android.view.View) ((jz5.n) this.F).mo141623x754a37bb();
        if (view != null) {
            view.setOnClickListener(new f93.m(this));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 L2 = L();
        if (L2 != null) {
            L2.mo7967x900dcbe1((com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d) ((jz5.n) this.G).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 L3 = L();
        if ((L3 != null ? L3.mo7946xf939df19() : null) == null && (L = L()) != null) {
            L.mo7960x6cab2c8d((f93.e) ((jz5.n) this.f224714J).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 L4 = L();
        if (L4 != null) {
            L4.N(new f93.o(this));
        }
        p3325xe03a0797.p3326xc267989b.l.d(this.I, null, null, new f93.n(this, null), 3, null);
    }

    @Override // hg5.d
    public void J() {
        super.J();
        p3325xe03a0797.p3326xc267989b.z0.e(this.I, null, 1, null);
        java.lang.Object context = getContext();
        p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        if (yVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsLabelUserDialog", "onDismiss: removeObserver to " + getContext());
            yVar.mo273xed6858b4().c(this);
        }
    }

    public final android.widget.TextView K() {
        return (android.widget.TextView) ((jz5.n) this.B).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 L() {
        return (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) ((jz5.n) this.A).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0156 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0149 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r21) {
        /*
            Method dump skipped, instructions count: 703
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455.M(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N(int r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455.N(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O(int r24, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r25) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.DialogC16164x43fb9455.O(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: checkDismissOnContextDestroy */
    public final void m65192xe074238c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AbsLabelUserDialog", "checkDismissWhenContextDestroy: dialog lifecycle state:" + ((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4()).f93138c.name());
        if (((p012xc85e97e9.p093xedfae76a.b0) mo273xed6858b4()).f93138c != p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            J();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC16164x43fb9455(android.content.Context uiContext, n80.d uiParamConfig, n80.b bVar, n80.c cVar) {
        super(uiContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiContext, "uiContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParamConfig, "uiParamConfig");
        this.f224715r = uiParamConfig;
        this.f224716s = bVar;
        this.f224717t = cVar;
        this.f224718u = new java.util.ArrayList();
        this.f224719v = new java.util.ArrayList();
        this.f224720w = new java.util.ArrayList();
        this.f224723z = jz5.h.b(new f93.v(this));
        this.A = jz5.h.b(new f93.u(this));
        this.B = jz5.h.b(new f93.i(this));
        this.C = jz5.h.b(new f93.t(this));
        this.D = jz5.h.b(new f93.j(this));
        this.E = jz5.h.b(new f93.k(this));
        this.F = jz5.h.b(new f93.g(this));
        this.G = jz5.h.b(new f93.q(this));
        this.H = jz5.h.b(f93.h.f341878d);
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.I = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        this.f224714J = jz5.h.b(new f93.f(this, uiContext));
    }
}
