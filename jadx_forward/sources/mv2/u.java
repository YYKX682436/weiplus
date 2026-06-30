package mv2;

/* loaded from: classes2.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f413166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f413167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f413168f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j17, long j18, boolean z17) {
        super(0);
        this.f413166d = j17;
        this.f413167e = j18;
        this.f413168f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (gm0.j1.a()) {
            java.util.Iterator it = mv2.f0.f413099f.iterator();
            while (it.hasNext()) {
                mv2.v0 v0Var = (mv2.v0) it.next();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyPostOk ");
                long j17 = this.f413166d;
                sb6.append(j17);
                sb6.append(" svrId ");
                long j18 = this.f413167e;
                sb6.append(pm0.v.u(j18));
                sb6.append(" isOk ");
                sb6.append(this.f413168f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", sb6.toString());
                v0Var.mo56488x5465d15b(j17, j18);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LogPost.FinderPostManager", "is invalid to notifyPostError");
        }
        return jz5.f0.f384359a;
    }
}
