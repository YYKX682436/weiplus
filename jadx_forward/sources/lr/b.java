package lr;

/* loaded from: classes13.dex */
public final class b extends lr.s0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f402028f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View itemView, lr.k0 k0Var) {
        super(itemView, k0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.b6o);
        this.f402028f = findViewById;
        itemView.setOnClickListener(null);
        findViewById.setOnClickListener(new lr.a(this));
        findViewById.setContentDescription(findViewById.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aqo));
    }
}
