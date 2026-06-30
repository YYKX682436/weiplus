package cw2;

/* loaded from: classes.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f305092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f305093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(int i17, int i18) {
        super(1);
        this.f305092d = i17;
        this.f305093e = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "$this$null");
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = this.f305092d;
            layoutParams2.height = this.f305093e;
            view.setLayoutParams(layoutParams2);
        }
        return jz5.f0.f384359a;
    }
}
