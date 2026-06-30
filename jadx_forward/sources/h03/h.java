package h03;

/* loaded from: classes2.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h03.q f359419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 f359420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f359421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359422g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f359423h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h03.q qVar, com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 c24451x12373195, long j17, java.lang.String str, boolean z17) {
        super(0);
        this.f359419d = qVar;
        this.f359420e = c24451x12373195;
        this.f359421f = j17;
        this.f359422g = str;
        this.f359423h = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity activity = this.f359419d.f359445f;
        if (activity != null) {
            so2.u1 d17 = c03.i.d(this.f359420e);
            int i17 = (int) this.f359421f;
            java.lang.String userName = this.f359422g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_to_comment_scene", i17);
            intent.putExtra("finder_username", userName);
            intent.putExtra("KEY_DO_NOT_CHECK_ENTER_BIZ_PROFILE", true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, activity, intent, d17 != null ? d17.mo2128x1ed62e84() : 0L, null, 0, 0, false, 0, d17 != null ? d17.w() : null, 224, null);
            if (this.f359423h) {
                pf5.z zVar = pf5.z.f435481a;
                if (!(activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b) a17).Q6(intent, 0);
            } else {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(activity, intent);
            }
        }
        return jz5.f0.f384359a;
    }
}
