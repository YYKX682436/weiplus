package mv2;

/* loaded from: classes2.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f413076d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j17) {
        super(0);
        this.f413076d = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (gm0.j1.a()) {
            java.util.Iterator it = mv2.f0.f413098e.iterator();
            while (it.hasNext()) {
                mv2.w0 w0Var = (mv2.w0) it.next();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyStartPost ");
                long j17 = this.f413076d;
                sb6.append(j17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", sb6.toString());
                w0Var.mo55429x74e3dc83(j17);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LogPost.FinderPostManager", "is invalid to notifyStartPost");
        }
        return jz5.f0.f384359a;
    }
}
