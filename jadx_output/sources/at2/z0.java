package at2;

/* loaded from: classes.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f13787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(android.view.ViewGroup viewGroup) {
        super(0);
        this.f13787d = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f13787d.findViewById(com.tencent.mm.R.id.cjv);
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        return textView;
    }
}
