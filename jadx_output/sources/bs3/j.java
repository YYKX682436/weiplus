package bs3;

/* loaded from: classes.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs3.l f23998d;

    public j(bs3.l lVar) {
        this.f23998d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/uic/SayHiImageDescUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bs3.l lVar = this.f23998d;
        android.content.Intent intent = new android.content.Intent(lVar.getIntent());
        intent.putExtra("key_intent_assemble_ui_half_screen_title", lVar.getString(com.tencent.mm.R.string.o_m));
        kr3.s1 s1Var = kr3.s1.f311475a;
        androidx.appcompat.app.AppCompatActivity context = lVar.getActivity();
        java.lang.String str = (java.lang.String) ((jz5.n) lVar.f24001e).getValue();
        kotlin.jvm.internal.o.g(context, "context");
        s1Var.a(intent, context, str, com.tencent.mm.plugin.profile.ui.mod.components.j0.class, 104, false);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/uic/SayHiImageDescUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
