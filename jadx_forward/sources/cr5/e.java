package cr5;

/* loaded from: classes11.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f303553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f303554e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f303555f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f303556g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f303557h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ cr5.f f303558i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.List list, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var4, cr5.f fVar) {
        super(0);
        this.f303553d = list;
        this.f303554e = f0Var;
        this.f303555f = f0Var2;
        this.f303556g = f0Var3;
        this.f303557h = f0Var4;
        this.f303558i = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TileDrawHelper. drawTiles. tiles=");
        sb6.append(this.f303553d.size());
        sb6.append(", insideLoadCount=");
        sb6.append(this.f303554e.f391649d);
        sb6.append(", outsideLoadCount=");
        sb6.append(this.f303555f.f391649d);
        sb6.append(", realDrawCount=");
        sb6.append(this.f303556g.f391649d);
        sb6.append(", backgroundCount=");
        sb6.append(this.f303557h.f391649d);
        sb6.append(". '");
        yq5.k kVar = this.f303558i.f303562d.f105287c.f296539o;
        sb6.append(kVar != null ? kVar.a() : null);
        sb6.append('\'');
        return sb6.toString();
    }
}
