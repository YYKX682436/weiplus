package mv2;

/* loaded from: classes2.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f413196d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f413197e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j17, boolean z17) {
        super(0);
        this.f413196d = j17;
        this.f413197e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (gm0.j1.a()) {
            java.util.Iterator it = mv2.f0.f413098e.iterator();
            while (it.hasNext()) {
                ((mv2.w0) it.next()).mo56116x1ed18348(this.f413196d, this.f413197e);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LogPost.FinderPostManager", "is invalid to notifyEventPost");
        }
        return jz5.f0.f384359a;
    }
}
