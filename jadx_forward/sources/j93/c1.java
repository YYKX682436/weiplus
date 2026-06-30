package j93;

/* loaded from: classes.dex */
public final class c1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j93.j1 f379899d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(j93.j1 j1Var) {
        super(0);
        this.f379899d = j1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        java.lang.String stringExtra = this.f379899d.m158359x1e885992().getStringExtra("key_rightButtonDarkColor");
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
