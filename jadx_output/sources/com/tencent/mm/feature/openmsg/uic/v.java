package com.tencent.mm.feature.openmsg.uic;

/* loaded from: classes8.dex */
public final class v extends wm3.a {

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f67376f = jz5.h.b(com.tencent.mm.feature.openmsg.uic.p.f67364d);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f67377d;

    /* renamed from: e, reason: collision with root package name */
    public db0.j f67378e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f67377d = jz5.h.b(new com.tencent.mm.feature.openmsg.uic.u(this));
    }

    public static final void T6(com.tencent.mm.feature.openmsg.uic.v vVar, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = vVar.U6().b().getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = i17;
        vVar.U6().b().setLayoutParams(marginLayoutParams);
    }

    public final em.a U6() {
        return (em.a) ((jz5.n) this.f67377d).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new com.tencent.mm.feature.openmsg.uic.t(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        db0.j jVar = this.f67378e;
        if (jVar != null) {
            jVar.f227834d.clear();
            jVar.f227832b = null;
        }
    }
}
