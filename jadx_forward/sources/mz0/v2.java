package mz0;

/* loaded from: classes4.dex */
public final class v2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.x2 f414605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(mz0.x2 x2Var) {
        super(0);
        this.f414605d = x2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        byte[] byteArrayExtra = this.f414605d.m158359x1e885992().getByteArrayExtra("key_video_template_info");
        if (byteArrayExtra == null) {
            return null;
        }
        r45.ib6 ib6Var = new r45.ib6();
        try {
            ib6Var.mo11468x92b714fd(byteArrayExtra);
            return ib6Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            return ib6Var;
        }
    }
}
