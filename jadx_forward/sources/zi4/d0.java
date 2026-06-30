package zi4;

/* loaded from: classes11.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24924xf55b6e2f f554732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24922x59782579 f554733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f554734f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zi4.g0 f554735g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f554736h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24924xf55b6e2f c24924xf55b6e2f, com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24922x59782579 c24922x59782579, yz5.l lVar, zi4.g0 g0Var, java.lang.String str) {
        super(0);
        this.f554732d = c24924xf55b6e2f;
        this.f554733e = c24922x59782579;
        this.f554734f = lVar;
        this.f554735g = g0Var;
        this.f554736h = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yz5.l lVar = this.f554734f;
        try {
            this.f554732d.m92301x6d2ecb5a(this.f554733e, lVar);
        } catch (java.lang.Throwable th6) {
            zi4.g0.a(this.f554735g);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FLTStatusActionHost", "sendCallbackToFlutter: onReceiveAction throw, cmdId=" + this.f554736h + ", err=" + th6.getMessage());
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6))));
        }
        return jz5.f0.f384359a;
    }
}
