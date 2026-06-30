package sp2;

/* loaded from: classes2.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.p f492615d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(sp2.p pVar) {
        super(0);
        this.f492615d = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        sp2.p pVar = this.f492615d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3 e3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3(pVar.f492702a);
        android.content.Context context = pVar.f492702a;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e9f, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        pVar.f492708g = inflate;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.odb);
        android.view.View view = pVar.f492708g;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.c_3);
        android.view.View view2 = pVar.f492708g;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        android.widget.TextView textView3 = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.b5j);
        textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.opr));
        textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.opp));
        textView3.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.opo));
        textView2.setOnClickListener(new sp2.n(pVar));
        textView3.setOnClickListener(new sp2.o(pVar));
        android.view.View view3 = pVar.f492708g;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentView");
            throw null;
        }
        e3Var.f213508y.addView(view3, 0);
        e3Var.f213501r = new sp2.l(pVar);
        return e3Var;
    }
}
