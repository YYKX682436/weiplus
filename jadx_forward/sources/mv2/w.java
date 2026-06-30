package mv2;

/* loaded from: classes2.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f413198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j17) {
        super(0);
        this.f413198d = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (gm0.j1.a()) {
            java.util.Iterator it = mv2.f0.f413098e.iterator();
            while (it.hasNext()) {
                mv2.w0 w0Var = (mv2.w0) it.next();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyPostErr ");
                long j17 = this.f413198d;
                sb6.append(j17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", sb6.toString());
                w0Var.mo56114x385435c6(j17, false);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LogPost.FinderPostManager", "is invalid to notifyPostErr");
        }
        return jz5.f0.f384359a;
    }
}
