package ju2;

/* loaded from: classes10.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f383377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f383378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 f383379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ju2.v f383380g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j17, java.lang.String str, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5542xa257d922 c5542xa257d922, ju2.v vVar) {
        super(0);
        this.f383377d = j17;
        this.f383378e = str;
        this.f383379f = c5542xa257d922;
        this.f383380g = vVar;
    }

    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ju2.w wVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderThanksButtonViewModel", "thank forward UpdateListener event objectID:" + this.f383377d + " wxUsername:" + this.f383378e);
        am.md mdVar = this.f383379f.f135866g;
        ?? r07 = (mdVar == null || !mdVar.f88871b) ? 0 : 1;
        ju2.v vVar = this.f383380g;
        vVar.f383386f = r07;
        r45.hn2 hn2Var = vVar.f383389i;
        if (hn2Var != null) {
            hn2Var.set(1, java.lang.Integer.valueOf((int) r07));
        }
        java.lang.ref.WeakReference weakReference = vVar.f383385e;
        if (weakReference != null && (wVar = (ju2.w) weakReference.get()) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1) wVar).I();
        }
        return jz5.f0.f384359a;
    }
}
