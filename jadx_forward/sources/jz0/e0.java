package jz0;

/* loaded from: classes4.dex */
public final class e0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz0.f0 f384104d;

    public e0(jz0.f0 f0Var) {
        this.f384104d = f0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoTitleBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jz0.f0 f0Var = this.f384104d;
        if (f0Var.f384107d) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = f0Var.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085).m78596x71afbec8(f0Var.f384108e ? 8 : 0);
            f0Var.f384108e = !f0Var.f384108e;
        }
        yj0.a.h(this, "com/tencent/mm/mj_template/sns/backgroundwork/ui/MaasFakeVideoTitleBarUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
