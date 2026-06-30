package mv2;

/* loaded from: classes2.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f413200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f413201e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j17, long j18) {
        super(0);
        this.f413200d = j17;
        this.f413201e = j18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (gm0.j1.a()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyPostOk ");
            long j17 = this.f413200d;
            sb6.append(j17);
            sb6.append(" svrId ");
            long j18 = this.f413201e;
            sb6.append(pm0.v.u(j18));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", sb6.toString());
            java.util.Iterator it = mv2.f0.f413098e.iterator();
            while (it.hasNext()) {
                ((mv2.w0) it.next()).mo56117x5465d15b(j17, j18);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LogPost.FinderPostManager", "is invalid to notifyPostOk");
        }
        return jz5.f0.f384359a;
    }
}
