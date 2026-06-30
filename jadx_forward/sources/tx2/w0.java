package tx2;

/* loaded from: classes3.dex */
public final class w0 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tx2.z0 f504203a;

    public w0(tx2.z0 z0Var) {
        this.f504203a = z0Var;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        android.widget.TextView textView;
        r45.fs3 data = (r45.fs3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.view.View m167130xfb84e958 = this.f504203a.m167130xfb84e958();
        if (m167130xfb84e958 == null || (textView = (android.widget.TextView) m167130xfb84e958.findViewById(com.p314xaae8f345.mm.R.id.f568951ol4)) == null) {
            return;
        }
        hc2.o.a(textView, true);
        textView.setText(java.lang.String.valueOf(data.f456118d));
    }
}
