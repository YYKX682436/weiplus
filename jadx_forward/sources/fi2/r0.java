package fi2;

/* loaded from: classes10.dex */
public final class r0 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi2.x0 f344433d;

    public r0(fi2.x0 x0Var) {
        this.f344433d = x0Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        android.widget.TextView textView;
        xh2.e eVar = (xh2.e) obj;
        fi2.x0 x0Var = this.f344433d;
        lj2.k b17 = x0Var.b();
        java.lang.String title = eVar.f536076a;
        b17.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        if (b17.f400416d && (textView = b17.f400418g) != null) {
            textView.setText(title.concat(": "));
        }
        lj2.k b18 = x0Var.b();
        b18.getClass();
        java.lang.String text = eVar.f536077b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        if (b18.f400416d) {
            android.widget.TextView textView2 = b18.f400414b;
            if (textView2 != null) {
                textView2.setText(text);
            }
            b18.a();
        }
    }
}
