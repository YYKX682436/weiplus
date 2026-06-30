package bk4;

/* loaded from: classes4.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f103074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f103075f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f103076g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(android.widget.TextView textView, java.lang.CharSequence charSequence, int i17, yz5.l lVar) {
        super(1);
        this.f103073d = textView;
        this.f103074e = charSequence;
        this.f103075f = i17;
        this.f103076g = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.CharSequence it = (java.lang.CharSequence) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.CharSequence charSequence = this.f103074e;
        java.lang.CharSequence a17 = pg5.d.a(context, charSequence);
        android.widget.TextView textView = this.f103073d;
        textView.setText(a17);
        textView.setMaxLines(this.f103075f);
        yz5.l lVar = this.f103076g;
        if (lVar != null) {
            lVar.mo146xb9724478(charSequence);
        }
        return jz5.f0.f384359a;
    }
}
