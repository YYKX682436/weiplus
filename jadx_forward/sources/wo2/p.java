package wo2;

/* loaded from: classes2.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo2.q f529645d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wo2.q qVar) {
        super(0);
        this.f529645d = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f529645d.f529648a.f425316f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        int i17 = com.p314xaae8f345.mm.R.id.nut;
        android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(view, com.p314xaae8f345.mm.R.id.nut);
        if (imageView != null) {
            i17 = com.p314xaae8f345.mm.R.id.nuw;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(view, com.p314xaae8f345.mm.R.id.nuw);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.nuz;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(view, com.p314xaae8f345.mm.R.id.nuz);
                if (c22699x3dcdb352 != null) {
                    return new ap2.c((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) view, imageView, textView, c22699x3dcdb352);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i17)));
    }
}
