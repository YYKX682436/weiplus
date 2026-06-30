package bm2;

/* loaded from: classes3.dex */
public class z2 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.EditText f22478d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f22479e;

    /* renamed from: f, reason: collision with root package name */
    public final bm2.a3 f22480f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(bm2.g3 g3Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.dsy);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.EditText editText = (android.widget.EditText) findViewById;
        this.f22478d = editText;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.f484312dt4);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
        this.f22479e = imageView;
        bm2.a3 a3Var = new bm2.a3(g3Var, new java.lang.ref.WeakReference(imageView), 0, 2, null);
        this.f22480f = a3Var;
        editText.addTextChangedListener(a3Var);
    }
}
