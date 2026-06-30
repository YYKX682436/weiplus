package qy0;

/* loaded from: classes3.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qy0.d0 f449185d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(qy0.d0 d0Var) {
        super(0);
        this.f449185d = d0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        byte[] byteArrayExtra = this.f449185d.m158359x1e885992().getByteArrayExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO");
        r45.zi2 zi2Var = new r45.zi2();
        if (byteArrayExtra != null) {
            try {
                zi2Var.mo11468x92b714fd(byteArrayExtra);
                return zi2Var;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            }
        }
        return null;
    }
}
