package tr2;

/* loaded from: classes5.dex */
public final class k implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tr2.l f502920a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f502921b;

    public k(tr2.l lVar, java.lang.Integer num) {
        this.f502920a = lVar;
        this.f502921b = num;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        lz5.m mVar = new lz5.m();
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f502920a.f502934m;
        mVar.put("easter_egg_emoji_md5", interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42933xb5885648() : null);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_clk")) {
            mVar.put("set_like_easter_egg_clk", this.f502921b);
        }
        return kz5.b1.b(mVar);
    }
}
