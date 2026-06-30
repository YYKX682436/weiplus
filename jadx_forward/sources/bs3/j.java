package bs3;

/* loaded from: classes.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs3.l f105531d;

    public j(bs3.l lVar) {
        this.f105531d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/uic/SayHiImageDescUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bs3.l lVar = this.f105531d;
        android.content.Intent intent = new android.content.Intent(lVar.m158359x1e885992());
        intent.putExtra("key_intent_assemble_ui_half_screen_title", lVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.o_m));
        kr3.s1 s1Var = kr3.s1.f393008a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = lVar.m158354x19263085();
        java.lang.String str = (java.lang.String) ((jz5.n) lVar.f105534e).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        s1Var.a(intent, context, str, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0.class, 104, false);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/uic/SayHiImageDescUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
