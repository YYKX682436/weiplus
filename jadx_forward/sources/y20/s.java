package y20;

/* loaded from: classes.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.test.EcsTestUI f540556d;

    public s(com.tencent.mm.feature.ecs.test.EcsTestUI ecsTestUI) {
        this.f540556d = ecsTestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/test/EcsTestUI$setupListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.ecs.test.EcsTestUI ecsTestUI = this.f540556d;
        android.widget.EditText editText = ecsTestUI.d;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchEdit");
            throw null;
        }
        editText.getText().clear();
        com.tencent.mm.feature.ecs.test.EcsTestUI.U6(ecsTestUI, "");
        android.widget.Button button = ecsTestUI.e;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("clearSearchBtn");
            throw null;
        }
        button.setVisibility(8);
        yj0.a.h(this, "com/tencent/mm/feature/ecs/test/EcsTestUI$setupListeners$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
