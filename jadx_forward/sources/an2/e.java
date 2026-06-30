package an2;

/* loaded from: classes14.dex */
public final class e extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f90377d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f90378e;

    /* renamed from: f, reason: collision with root package name */
    public an2.b f90379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, yz5.l itemSelectionHandler) {
        super(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e8w, (android.view.ViewGroup) null));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemSelectionHandler, "itemSelectionHandler");
        this.f90377d = itemSelectionHandler;
        android.view.View itemView = this.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        ym5.a1.h(itemView, new an2.c(this));
        android.view.View findViewById = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.ukg);
        ((android.widget.TextView) findViewById).setOnClickListener(new an2.d(this));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "apply(...)");
        this.f90378e = (android.widget.TextView) findViewById;
    }

    public final void i(boolean z17) {
        android.widget.TextView textView = this.f90378e;
        if (!z17) {
            textView.setTextColor(textView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.agl));
            textView.setTypeface(android.graphics.Typeface.DEFAULT);
            return;
        }
        textView.setTextColor(textView.getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aby));
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            textView.setTypeface(android.graphics.Typeface.create(null, 500, false));
        } else {
            textView.setTypeface(android.graphics.Typeface.DEFAULT);
        }
    }
}
