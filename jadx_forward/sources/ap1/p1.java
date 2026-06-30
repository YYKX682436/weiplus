package ap1;

/* loaded from: classes5.dex */
public class p1 extends wm3.a {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f94254h = {131072, 131075, 131081};

    /* renamed from: d, reason: collision with root package name */
    public ap1.i1 f94255d;

    /* renamed from: e, reason: collision with root package name */
    public em.c4 f94256e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f94257f;

    /* renamed from: g, reason: collision with root package name */
    public j75.f f94258g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f94257f = jz5.h.b(new ap1.k1(this));
    }

    public static final void T6(ap1.p1 p1Var) {
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.c9) ((jz5.n) p1Var.f94257f).mo141623x754a37bb()).b();
        em.c4 c4Var = p1Var.f94256e;
        if (c4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        c4Var.d().setVisibility(8);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = p1Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).m78552x1356dacb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View m80380x71e92c1d = m80380x71e92c1d();
        em.c4 c4Var = new em.c4(m80380x71e92c1d);
        this.f94256e = c4Var;
        if (c4Var.f335711c == null) {
            c4Var.f335711c = m80380x71e92c1d.findViewById(com.p314xaae8f345.mm.R.id.v1i);
        }
        android.view.View view = c4Var.f335711c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        em.c4 c4Var2 = this.f94256e;
        if (c4Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        if (c4Var2.f335711c == null) {
            c4Var2.f335711c = c4Var2.f335709a.findViewById(com.p314xaae8f345.mm.R.id.v1i);
        }
        c4Var2.f335711c.setOnClickListener(new ap1.j1(this));
    }
}
