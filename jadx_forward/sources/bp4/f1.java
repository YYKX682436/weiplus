package bp4;

/* loaded from: classes3.dex */
public final class f1 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f104699f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f104700g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.view.View view, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104699f = view;
        this.f104700g = "MicroMsg.EditFinishPlugin";
        if (view instanceof android.widget.TextView) {
            dq4.c cVar = dq4.c.f323902a;
            android.content.Context context = view.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            float a17 = cVar.a(context, 14.0f);
            android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setTextSize(1, a17);
            }
        }
        view.setOnClickListener(this);
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        android.view.View view = this.f104699f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "onAttach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f104700g, "on click edit finish");
        nu3.i.f421751a.b(12);
        nu3.i.f421754d.f142407i = java.lang.System.currentTimeMillis();
        ut3.f fVar = ut3.f.f512709c;
        android.content.Context context = this.f104699f.getContext();
        bp4.e1 e1Var = new bp4.e1(this);
        ut3.d dVar = fVar.f512710a;
        if (!(dVar != null ? dVar.c5(context, fVar.f512711b, e1Var) : false)) {
            ju3.d0.k(this.f546865d, ju3.c0.A1, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        android.view.View view = this.f104699f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
