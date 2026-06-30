package lj5;

/* loaded from: classes.dex */
public final class c implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f400524a;

    /* renamed from: b, reason: collision with root package name */
    public mj5.a f400525b;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f400524a == null) {
            this.f400524a = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570641dp2, (android.view.ViewGroup) null);
            c(null, this.f400525b);
        }
        android.view.View view = this.f400524a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        mj5.a aVar = (mj5.a) pVar;
        mj5.a aVar2 = this.f400525b;
        this.f400525b = aVar;
        c(aVar2, aVar);
    }

    public final void c(mj5.a aVar, mj5.a aVar2) {
        android.view.View view;
        if (aVar2 == null || (view = this.f400524a) == null) {
            return;
        }
        android.widget.Button button = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.oom);
        if (button != null) {
            button.setText(aVar2.f408619d);
            button.setOnClickListener(new lj5.a(aVar2));
        }
        android.widget.Button button2 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.q0d);
        if (button2 != null) {
            button2.setText(aVar2.f408621f);
            button2.setOnClickListener(new lj5.b(aVar2));
        }
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f400525b;
    }
}
