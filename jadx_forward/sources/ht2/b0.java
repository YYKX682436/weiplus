package ht2;

/* loaded from: classes2.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f366345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f366346e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.widget.TextView textView, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        super(1);
        this.f366345d = textView;
        this.f366346e = c22789xd23e9a9b;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.animation.Animator it = (android.animation.Animator) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.widget.TextView textView = this.f366345d;
        if (textView != null) {
            textView.setVisibility(4);
        }
        android.view.ViewParent parent = this.f366346e.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.post(new ht2.a0(viewGroup));
        }
        return jz5.f0.f384359a;
    }
}
