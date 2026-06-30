package or4;

/* loaded from: classes.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or4.h f429232d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(or4.h hVar) {
        super(1);
        this.f429232d = hVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.f567057py0);
        android.widget.TextView textView2 = (android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.pxn);
        android.view.View findViewById = it.findViewById(com.p314xaae8f345.mm.R.id.pxw);
        android.widget.TextView textView3 = (android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.pxy);
        android.view.View findViewById2 = it.findViewById(com.p314xaae8f345.mm.R.id.pxo);
        android.widget.TextView textView4 = (android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.pxq);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(textView.getText());
        sb6.append(" ");
        if (textView2.getVisibility() == 0) {
            sb6.append(textView2.getText());
            sb6.append(" ");
        }
        int visibility = findViewById.getVisibility();
        or4.h hVar = this.f429232d;
        if (visibility == 0) {
            sb6.append(hVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhh));
            sb6.append(", ");
            sb6.append(hVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgl, hVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhb), textView3.getText()));
        }
        if (findViewById2.getVisibility() == 0) {
            sb6.append(hVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhf));
            sb6.append(", ");
            sb6.append(hVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgl, hVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhb), textView4.getText()));
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
