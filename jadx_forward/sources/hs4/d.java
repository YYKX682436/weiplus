package hs4;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f366149a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f366150b;

    /* renamed from: c, reason: collision with root package name */
    public db5.o4 f366151c;

    /* renamed from: d, reason: collision with root package name */
    public db5.t4 f366152d;

    /* renamed from: e, reason: collision with root package name */
    public db5.t4 f366153e;

    /* renamed from: f, reason: collision with root package name */
    public db5.g4 f366154f;

    /* renamed from: g, reason: collision with root package name */
    public db5.g4 f366155g;

    /* renamed from: h, reason: collision with root package name */
    public hs4.c f366156h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f366157i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f366158j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f366159k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f366160l = false;

    /* renamed from: m, reason: collision with root package name */
    public int f366161m = 0;

    public d(android.content.Context context) {
        hs4.a aVar = new hs4.a(this);
        this.f366150b = context;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_payment_select_remove_confirm_button_android, false)) {
            this.f366149a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 0, 3);
        } else {
            this.f366149a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 2, 3);
        }
        this.f366154f = new db5.g4(context);
        this.f366155g = new db5.g4(context);
        this.f366157i = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4(context, null);
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        this.f366157i.setFocusable(false);
        this.f366157i.setLayoutParams(layoutParams);
        this.f366157i.m7963x830bc99d(true);
        this.f366157i.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        this.f366157i.m7965x440a0e9(20);
        this.f366157i.setPadding(0, 0, 0, 0);
        hs4.c cVar = new hs4.c(this);
        this.f366156h = cVar;
        cVar.f366147e = this.f366154f;
        cVar.f366146d = aVar;
        this.f366157i.mo7960x6cab2c8d(cVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f366149a;
        if (z2Var != null) {
            z2Var.j(this.f366157i);
        }
    }

    public boolean a() {
        return this.f366149a.h();
    }

    public void b() {
        hs4.c cVar = this.f366156h;
        if (cVar != null) {
            cVar.m8146xced61ae5();
        }
        this.f366149a.C();
    }

    public void c() {
        this.f366149a.B();
    }

    public void d() {
        hs4.c cVar;
        db5.o4 o4Var = this.f366151c;
        if (o4Var != null) {
            o4Var.mo887xc459429a(this.f366154f);
        }
        this.f366157i.setPadding(0, 0, 0, 0);
        if (this.f366155g != null && (cVar = this.f366156h) != null) {
            cVar.m8146xced61ae5();
        }
        this.f366149a.C();
    }
}
