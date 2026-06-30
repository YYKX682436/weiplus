package kl2;

/* loaded from: classes3.dex */
public final class b implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kl2.g f390284a;

    public b(kl2.g gVar) {
        this.f390284a = gVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(android.widget.CompoundButton buttonView, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonView, "buttonView");
        kl2.g gVar = this.f390284a;
        android.widget.TextView textView = gVar.f390308p;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightBtn");
            throw null;
        }
        textView.setEnabled(z17);
        if (z17) {
            il2.s.f373619a.a(zl2.e5.f555277n, gVar.f390314v);
        }
    }
}
