package r14;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f450166a;

    /* renamed from: b, reason: collision with root package name */
    public final r14.b f450167b;

    /* renamed from: c, reason: collision with root package name */
    public final v24.e f450168c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f450169d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f450170e;

    /* renamed from: f, reason: collision with root package name */
    public final o25.y1 f450171f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f450172g;

    public y(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, r14.b controller, v24.e qrCodeReporter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qrCodeReporter, "qrCodeReporter");
        this.f450166a = context;
        this.f450167b = controller;
        this.f450168c = qrCodeReporter;
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
        this.f450171f = new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m();
        r14.a[] aVarArr = r14.a.f450139d;
        jz5.l lVar = new jz5.l(0, new r14.i(this));
        r14.a[] aVarArr2 = r14.a.f450139d;
        jz5.l lVar2 = new jz5.l(1, new r14.j(this));
        r14.a[] aVarArr3 = r14.a.f450139d;
        jz5.l lVar3 = new jz5.l(2, new r14.k(this));
        r14.a[] aVarArr4 = r14.a.f450139d;
        jz5.l lVar4 = new jz5.l(3, new r14.l(this));
        r14.a[] aVarArr5 = r14.a.f450139d;
        jz5.l lVar5 = new jz5.l(4, new r14.m(this));
        r14.a[] aVarArr6 = r14.a.f450139d;
        jz5.l lVar6 = new jz5.l(5, new r14.n(this));
        r14.a[] aVarArr7 = r14.a.f450139d;
        jz5.l lVar7 = new jz5.l(6, new r14.o(this));
        r14.a[] aVarArr8 = r14.a.f450139d;
        this.f450172g = kz5.c1.k(lVar, lVar2, lVar3, lVar4, lVar5, lVar6, lVar7, new jz5.l(7, new r14.p(this)));
    }

    public static final void a(r14.y yVar, android.view.MenuItem menuItem) {
        int i17;
        yz5.a aVar = (yz5.a) yVar.f450172g.get(java.lang.Integer.valueOf(menuItem.getItemId()));
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        int itemId = menuItem.getItemId();
        int d17 = yVar.f450167b.d();
        r14.a[] aVarArr = r14.a.f450139d;
        if (itemId == 0) {
            i17 = 23;
        } else if (itemId == 1) {
            i17 = 24;
        } else if (itemId == 2) {
            i17 = 25;
        } else if (itemId == 3) {
            i17 = 27;
        } else if (itemId == 4) {
            i17 = 28;
        } else if (itemId == 5) {
            i17 = 29;
        } else if (itemId == 6) {
            i17 = 30;
        } else {
            if (itemId != 7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ColorfulSelfQRCodeDialogHelper", "try reportAction but did not get actionType");
                return;
            }
            i17 = 31;
        }
        v24.e.c(yVar.f450168c, i17, d17, null, null, 0, 28, null);
    }

    public final void b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = this.f450170e;
        if (k0Var != null) {
            k0Var.V1 = false;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) this.f450166a, 0, false);
        this.f450170e = k0Var2;
        ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) this.f450171f).Di(this.f450166a, k0Var2, 1, null, new r14.e(this));
        k0Var2.f293405n = new r14.q(this, k0Var2);
        k0Var2.f293407o = new r14.r(this, k0Var2);
        k0Var2.f293414s = new r14.s(this);
        k0Var2.f293417v = new r14.t(this);
    }
}
