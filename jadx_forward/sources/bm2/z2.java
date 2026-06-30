package bm2;

/* loaded from: classes3.dex */
public class z2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.EditText f104011d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f104012e;

    /* renamed from: f, reason: collision with root package name */
    public final bm2.a3 f104013f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(bm2.g3 g3Var, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.dsy);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.EditText editText = (android.widget.EditText) findViewById;
        this.f104011d = editText;
        android.view.View findViewById2 = itemView.findViewById(com.p314xaae8f345.mm.R.id.f565845dt4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f104012e = imageView;
        bm2.a3 a3Var = new bm2.a3(g3Var, new java.lang.ref.WeakReference(imageView), 0, 2, null);
        this.f104013f = a3Var;
        editText.addTextChangedListener(a3Var);
    }
}
