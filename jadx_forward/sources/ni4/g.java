package ni4;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj4.h f419301d;

    public g(lj4.h hVar) {
        this.f419301d = hVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/SquareItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lj4.h hVar = this.f419301d;
        java.lang.String str = hVar.f400520e;
        java.lang.String str2 = hVar.f400521f;
        l75.e0 e0Var = mj4.l.W;
        ej4.j jVar = new ej4.j(str, str2, "hello", 0, 4);
        gm0.j1.d().a(4099, new ni4.f());
        gm0.j1.d().g(jVar);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/SquareItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
