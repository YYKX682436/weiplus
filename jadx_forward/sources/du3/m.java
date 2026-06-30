package du3;

/* loaded from: classes10.dex */
public final class m extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f325183f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 f325184g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f325185h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f325186i;

    /* renamed from: m, reason: collision with root package name */
    public final int f325187m;

    /* renamed from: n, reason: collision with root package name */
    public final int f325188n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f325189o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f325190p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.view.ViewGroup parent, ju3.d0 status, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 inputPanel) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputPanel, "inputPanel");
        this.f325183f = parent;
        this.f325184g = inputPanel;
        jz5.g b17 = jz5.h.b(new du3.l(this));
        this.f325186i = "";
        this.f325187m = -1;
        this.f325188n = -1;
        this.f325189o = "";
        this.f325190p = jz5.h.b(new du3.k(this));
        java.lang.Object mo141623x754a37bb = ((jz5.n) b17).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) mo141623x754a37bb).setOnClickListener(this);
        inputPanel.m68219x12a54e63(com.p314xaae8f345.mm.R.C30861xcebc809e.b47);
        inputPanel.m68223x466a35c6(new du3.h(this));
        inputPanel.m68226x7cfada14(new du3.i(this));
        inputPanel.m68224x6b7f07fd(new du3.j());
        android.graphics.Point b18 = com.p314xaae8f345.mm.ui.bl.b(parent.getContext());
        float f17 = b18.y;
        float f18 = b18.x;
        float f19 = f17 / f18;
        float f27 = f17 / 2.18f;
        float f28 = (f18 - f27) / 2;
        if (f19 <= 1.78f) {
            inputPanel.d(f27, f28);
        } else {
            if (f19 >= 2.18f) {
                return;
            }
            inputPanel.d(f27, f28);
        }
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282 = this.f325184g;
        if (!(c17042xf8121282.getVisibility() == 0)) {
            return false;
        }
        c17042xf8121282.c();
        c17042xf8121282.m68225x76500a7f(false);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoAddTextPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f325185h = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282 c17042xf8121282 = this.f325184g;
        c17042xf8121282.mode = 0;
        c17042xf8121282.m68225x76500a7f(true);
        int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282.N;
        c17042xf8121282.e("", com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17042xf8121282.P, 0);
        nu3.i iVar = nu3.i.f421751a;
        nu3.i.c(iVar, "KEY_CLICK_TEXT_COUNT_INT", 0, 2, null);
        iVar.b(5);
        iVar.d(8);
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/improve_photo/ImproveEditPhotoAddTextPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
