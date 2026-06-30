package bk4;

/* loaded from: classes11.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 f103064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f103065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f103066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f103067g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bk4.c2 f103068h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f103069i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975, yz5.l lVar, android.widget.TextView textView, java.lang.CharSequence charSequence, bk4.c2 c2Var, android.view.ViewGroup viewGroup) {
        super(1);
        this.f103064d = abstractC1183x100d4975;
        this.f103065e = lVar;
        this.f103066f = textView;
        this.f103067g = charSequence;
        this.f103068h = c2Var;
        this.f103069i = viewGroup;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.CharSequence result = (java.lang.CharSequence) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 abstractC1183x100d4975 = this.f103064d;
        if (abstractC1183x100d4975 == null) {
            yz5.l lVar = this.f103065e;
            if (lVar != null) {
                lVar.mo146xb9724478(result);
            }
        } else {
            android.widget.TextView textView = this.f103066f;
            java.lang.CharSequence text = textView.getText();
            int height = textView.getLayout().getHeight() + textView.getPaddingTop() + textView.getPaddingBottom();
            textView.setText(pg5.d.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, this.f103067g));
            textView.getLayoutParams().height = height;
            textView.setLayoutParams(textView.getLayoutParams());
            bk4.o1 o1Var = new bk4.o1(this.f103068h, this.f103066f, text, this.f103065e, result);
            abstractC1183x100d4975.a(o1Var);
            ((java.util.LinkedList) this.f103068h.f102944b).add(o1Var);
            u4.g1.a(this.f103069i, abstractC1183x100d4975);
        }
        return jz5.f0.f384359a;
    }
}
