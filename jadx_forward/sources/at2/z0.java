package at2;

/* loaded from: classes.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f95320d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(android.view.ViewGroup viewGroup) {
        super(0);
        this.f95320d = viewGroup;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.TextView textView = (android.widget.TextView) this.f95320d.findViewById(com.p314xaae8f345.mm.R.id.cjv);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        return textView;
    }
}
