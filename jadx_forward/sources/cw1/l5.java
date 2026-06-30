package cw1;

/* loaded from: classes12.dex */
public final class l5 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f304637d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.n5 f304638e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(cw1.n5 n5Var, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f304638e = n5Var;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.hh9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f304637d = textView;
        textView.setOnClickListener(new cw1.k5(this, n5Var.f304715e, n5Var));
    }
}
