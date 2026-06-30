package ap1;

/* loaded from: classes5.dex */
public class p1 extends wm3.a {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f12721h = {131072, 131075, 131081};

    /* renamed from: d, reason: collision with root package name */
    public ap1.i1 f12722d;

    /* renamed from: e, reason: collision with root package name */
    public em.c4 f12723e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f12724f;

    /* renamed from: g, reason: collision with root package name */
    public j75.f f12725g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f12724f = jz5.h.b(new ap1.k1(this));
    }

    public static final void T6(ap1.p1 p1Var) {
        ((com.tencent.mm.ui.tools.c9) ((jz5.n) p1Var.f12724f).getValue()).b();
        em.c4 c4Var = p1Var.f12723e;
        if (c4Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        c4Var.d().setVisibility(8);
        androidx.appcompat.app.AppCompatActivity activity = p1Var.getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) activity).removeSearchMenu();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        android.view.View rootView = getRootView();
        em.c4 c4Var = new em.c4(rootView);
        this.f12723e = c4Var;
        if (c4Var.f254178c == null) {
            c4Var.f254178c = rootView.findViewById(com.tencent.mm.R.id.v1i);
        }
        android.view.View view = c4Var.f254178c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/backup/roambackup/uic/RoamSearchContactUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        em.c4 c4Var2 = this.f12723e;
        if (c4Var2 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        if (c4Var2.f254178c == null) {
            c4Var2.f254178c = c4Var2.f254176a.findViewById(com.tencent.mm.R.id.v1i);
        }
        c4Var2.f254178c.setOnClickListener(new ap1.j1(this));
    }
}
