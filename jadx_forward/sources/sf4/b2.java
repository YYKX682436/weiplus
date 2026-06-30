package sf4;

/* loaded from: classes4.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.j2 f488952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f488953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f488954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f488955g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo f488956h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(sf4.j2 j2Var, java.lang.String str, long j17, long j18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        super(0);
        this.f488952d = j2Var;
        this.f488953e = str;
        this.f488954f = j17;
        this.f488955g = j18;
        this.f488956h = videoInfo;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = this.f488952d.f489032a;
        if (c18499x2fc2446b != null) {
            java.lang.String str = this.f488953e;
            long j17 = this.f488954f;
            long j18 = this.f488955g;
            com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo = this.f488956h;
            java.lang.String str2 = videoInfo != null ? videoInfo.f18114x9330627b : null;
            if (str2 == null) {
                str2 = "";
            }
            c18499x2fc2446b.e0(str, j17, j18, str2);
        }
        return jz5.f0.f384359a;
    }
}
