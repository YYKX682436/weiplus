package ht2;

/* loaded from: classes2.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f366442d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f366443e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.widget.TextView textView, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        super(0);
        this.f366442d = textView;
        this.f366443e = c22699x3dcdb352;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.TextView textView = this.f366442d;
        if (textView != null) {
            textView.setVisibility(4);
        }
        android.view.ViewParent parent = this.f366443e.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            return java.lang.Boolean.valueOf(viewGroup.post(new ht2.t(viewGroup)));
        }
        return null;
    }
}
