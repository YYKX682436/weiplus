package wo2;

/* loaded from: classes2.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo2.q f529642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(wo2.q qVar) {
        super(0);
        this.f529642d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f529642d.f529648a.f425316f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        int i17 = com.p314xaae8f345.mm.R.id.nut;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.p314xaae8f345.mm.R.id.nut);
        if (imageView != null) {
            i17 = com.p314xaae8f345.mm.R.id.nuw;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.nuw);
            if (textView != null) {
                return new ap2.b((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) view, imageView, textView);
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }
}
