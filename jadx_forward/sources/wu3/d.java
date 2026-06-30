package wu3;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu3.h f531257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f531258e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wu3.h hVar, android.content.Context context) {
        super(0);
        this.f531257d = hVar;
        this.f531258e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        wu3.h hVar = this.f531257d;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) hVar.findViewById(com.p314xaae8f345.mm.R.id.b6_);
        android.widget.TextView textView = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.b6a);
        android.content.Context context = this.f531258e;
        textView.setText(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.k6l));
        android.widget.TextView textView2 = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.b69);
        textView2.setText(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.k6i));
        textView2.setOnClickListener(new wu3.c(hVar));
        return linearLayout;
    }
}
