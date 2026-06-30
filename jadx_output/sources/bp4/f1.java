package bp4;

/* loaded from: classes3.dex */
public final class f1 extends yt3.a implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f23166f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f23167g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.view.View view, ju3.d0 status) {
        super(status, null);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f23166f = view;
        this.f23167g = "MicroMsg.EditFinishPlugin";
        if (view instanceof android.widget.TextView) {
            dq4.c cVar = dq4.c.f242369a;
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            float a17 = cVar.a(context, 14.0f);
            android.widget.TextView textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setTextSize(1, a17);
            }
        }
        view.setOnClickListener(this);
    }

    @Override // yt3.r2
    public void onAttach() {
        android.view.View view = this.f23166f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        com.tencent.mars.xlog.Log.i(this.f23167g, "on click edit finish");
        nu3.i.f340218a.b(12);
        nu3.i.f340221d.f60874i = java.lang.System.currentTimeMillis();
        ut3.f fVar = ut3.f.f431176c;
        android.content.Context context = this.f23166f.getContext();
        bp4.e1 e1Var = new bp4.e1(this);
        ut3.d dVar = fVar.f431177a;
        if (!(dVar != null ? dVar.c5(context, fVar.f431178b, e1Var) : false)) {
            ju3.d0.k(this.f465332d, ju3.c0.A1, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void onDetach() {
        android.view.View view = this.f23166f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/MultiEditFinishPlugin", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
