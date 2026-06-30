package an2;

/* loaded from: classes14.dex */
public final class e extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f8844d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f8845e;

    /* renamed from: f, reason: collision with root package name */
    public an2.b f8846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, yz5.l itemSelectionHandler) {
        super(android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e8w, (android.view.ViewGroup) null));
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(itemSelectionHandler, "itemSelectionHandler");
        this.f8844d = itemSelectionHandler;
        android.view.View itemView = this.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        ym5.a1.h(itemView, new an2.c(this));
        android.view.View findViewById = this.itemView.findViewById(com.tencent.mm.R.id.ukg);
        ((android.widget.TextView) findViewById).setOnClickListener(new an2.d(this));
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        this.f8845e = (android.widget.TextView) findViewById;
    }

    public final void i(boolean z17) {
        android.widget.TextView textView = this.f8845e;
        if (!z17) {
            textView.setTextColor(textView.getContext().getColor(com.tencent.mm.R.color.agl));
            textView.setTypeface(android.graphics.Typeface.DEFAULT);
            return;
        }
        textView.setTextColor(textView.getContext().getColor(com.tencent.mm.R.color.aby));
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            textView.setTypeface(android.graphics.Typeface.create(null, 500, false));
        } else {
            textView.setTypeface(android.graphics.Typeface.DEFAULT);
        }
    }
}
