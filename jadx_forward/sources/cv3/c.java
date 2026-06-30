package cv3;

/* loaded from: classes5.dex */
public abstract class c implements cv3.d {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f304102d;

    /* renamed from: e, reason: collision with root package name */
    public final int f304103e;

    /* renamed from: f, reason: collision with root package name */
    public uu3.u f304104f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f304105g;

    public c(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f304102d = context;
        this.f304103e = i17;
        this.f304105g = "MicroMsg.AbsMusicPickerDrawer";
    }

    public vu3.c a() {
        android.content.Context context = this.f304102d;
        return new vu3.b(context, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77911xe61cad92));
    }

    public abstract void b();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c
    /* renamed from: isShow */
    public boolean mo68187xb9a8b747() {
        uu3.u uVar = this.f304104f;
        return uVar != null && uVar.isDrawerOpen;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c
    /* renamed from: onBackPress */
    public boolean mo68190x4ceae47d() {
        if (!mo68187xb9a8b747()) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f304105g, "closeDrawer: ");
        uu3.u uVar = this.f304104f;
        if (uVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6.a(uVar, false, 1, null);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2003xde351112.InterfaceC17057x18e3a43c
    /* renamed from: setShow */
    public void mo68201x76500a7f(boolean z17) {
        java.lang.String str = this.f304105g;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "closeDrawer: ");
            uu3.u uVar = this.f304104f;
            if (uVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2000xb118f8f1.AbstractGestureDetectorOnGestureListenerC17037xc8d40da6.a(uVar, false, 1, null);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openDrawerWithCheck: ");
        sb6.append(this.f304104f == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        uu3.u uVar2 = this.f304104f;
        if (uVar2 == null && uVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "checkDrawerCreate: ");
            android.content.Context context = this.f304102d;
            int k17 = i65.a.k(context) + com.p314xaae8f345.mm.ui.bk.p(context);
            int i17 = this.f304103e;
            float f17 = i17 > 0 ? i17 : k17 * 0.75f;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
            if (activityC0065xcd7aa112 != null) {
                android.view.View findViewById = activityC0065xcd7aa112.findViewById(android.R.id.content);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                vu3.h hVar = new vu3.h(this.f304102d, 0, 0, 0, false, 30, null);
                uu3.f fVar = new uu3.f();
                fVar.f512809a = f17;
                fVar.f512810b = hVar;
                cv3.h hVar2 = (cv3.h) this;
                fVar.f512811c = new vu3.d(hVar2.d());
                fVar.a(new cv3.f(hVar2));
                fVar.f512812d = a();
                ((java.util.ArrayList) fVar.f512815g).add(new cv3.a(hVar, this));
                uu3.u b17 = fVar.b((android.view.ViewGroup) findViewById);
                this.f304104f = b17;
                b17.m170564xfadc8465(cv3.b.f304101d);
                b();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "openDrawer: ");
        uu3.u uVar3 = this.f304104f;
        if (uVar3 != null) {
            uVar3.l(-uVar3.edgeAttached, false);
        }
    }
}
