package kv4;

/* loaded from: classes12.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv4.l f394239d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(kv4.l lVar) {
        super(1);
        this.f394239d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        mv4.b bVar = (mv4.b) kz5.n0.Z(((rv4.a) this.f394239d.f394241a).f481957a);
        if (bVar != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564328sc1);
            if (textView != null) {
                textView.setText(((rv4.b) bVar).f481968d);
            }
            view.setOnClickListener(new kv4.j(bVar));
        }
        return jz5.f0.f384359a;
    }
}
