package ij5;

/* loaded from: classes.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.n0 f373310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ij5.n0 n0Var) {
        super(0);
        this.f373310d = n0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        java.lang.String stringExtra = this.f373310d.m158359x1e885992().getStringExtra("key_rightButtonDarkFontColor");
        if (stringExtra != null) {
            if (!(!r26.n0.N(stringExtra))) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                i17 = android.graphics.Color.parseColor(stringExtra);
                return java.lang.Integer.valueOf(i17);
            }
        }
        i17 = -1;
        return java.lang.Integer.valueOf(i17);
    }
}
