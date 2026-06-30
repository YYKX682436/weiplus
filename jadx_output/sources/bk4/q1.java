package bk4;

/* loaded from: classes4.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f21540d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f21541e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f21542f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f21543g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(android.widget.TextView textView, java.lang.CharSequence charSequence, int i17, yz5.l lVar) {
        super(1);
        this.f21540d = textView;
        this.f21541e = charSequence;
        this.f21542f = i17;
        this.f21543g = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.CharSequence it = (java.lang.CharSequence) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.CharSequence charSequence = this.f21541e;
        java.lang.CharSequence a17 = pg5.d.a(context, charSequence);
        android.widget.TextView textView = this.f21540d;
        textView.setText(a17);
        textView.setMaxLines(this.f21542f);
        yz5.l lVar = this.f21543g;
        if (lVar != null) {
            lVar.invoke(charSequence);
        }
        return jz5.f0.f302826a;
    }
}
