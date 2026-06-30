package ej4;

/* loaded from: classes4.dex */
public final class v extends ej4.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f334916d;

    /* renamed from: e, reason: collision with root package name */
    public final bi4.d f334917e;

    /* renamed from: f, reason: collision with root package name */
    public final bi4.c f334918f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String userName, android.widget.TextView iconTV, bi4.d iconType, bi4.c iconScene) {
        super(iconTV, userName, null, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconTV, "iconTV");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconType, "iconType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconScene, "iconScene");
        this.f334916d = userName;
        this.f334917e = iconType;
        this.f334918f = iconScene;
        b();
    }

    @Override // ej4.r
    public void b() {
        java.lang.Object obj = a().get();
        android.widget.TextView textView = obj instanceof android.widget.TextView ? (android.widget.TextView) obj : null;
        if (textView == null) {
            return;
        }
        if (this.f334918f == bi4.c.SNS_FEED) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392101a, null, new ej4.u(textView, this, null), 2, null);
            return;
        }
        java.lang.CharSequence O = bk4.i.a().O(textView, this.f334907a, textView.getText(), i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20), this.f334917e, this.f334918f);
        if (O == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(textView.getText(), O)) {
            return;
        }
        textView.setText(O);
    }
}
