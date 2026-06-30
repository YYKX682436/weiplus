package yu2;

/* loaded from: classes2.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yu2.f f547382d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(yu2.f fVar) {
        super(0);
        this.f547382d = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View mo144222x4ff8c0f0 = this.f547382d.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.g3x);
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(mo144222x4ff8c0f0, com.p314xaae8f345.mm.R.id.g1u);
        if (textView == null) {
            throw new java.lang.NullPointerException("Missing required view with ID: ".concat(mo144222x4ff8c0f0.getResources().getResourceName(com.p314xaae8f345.mm.R.id.g1u)));
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) mo144222x4ff8c0f0;
        return new vb2.j0(relativeLayout, textView, relativeLayout);
    }
}
