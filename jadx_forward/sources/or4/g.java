package or4;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or4.h f429233d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(or4.h hVar) {
        super(1);
        this.f429233d = hVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.pyg);
        android.widget.TextView textView2 = (android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.pyh);
        android.widget.TextView textView3 = (android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.pye);
        or4.h hVar = this.f429233d;
        java.lang.String string = hVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgl, textView.getText(), textView3.getText());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        java.lang.CharSequence text = textView2.getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text, "getText(...)");
        java.util.List f07 = r26.n0.f0(text, new java.lang.String[]{" "}, false, 0, 6, null);
        if (!f07.isEmpty()) {
            string = string + ' ' + ((java.lang.String) f07.get(0));
        }
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("(\\d{1,2}):(\\d{2})");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        java.lang.CharSequence text2 = textView2.getText();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(text2, "getText(...)");
        java.util.regex.Matcher matcher = compile.matcher(text2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matcher, "matcher(...)");
        r26.m a17 = r26.u.a(matcher, 0, text2);
        if (a17 == null) {
            return string;
        }
        r26.q qVar = (r26.q) a17;
        java.lang.String string2 = hVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgk, (java.lang.String) qVar.a().get(1), (java.lang.String) qVar.a().get(2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        return string + ' ' + string2;
    }
}
