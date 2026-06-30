package mv2;

/* loaded from: classes2.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mv2.g0 f413203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.lang.String str, mv2.g0 g0Var) {
        super(0);
        this.f413202d = str;
        this.f413203e = g0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (gm0.j1.a()) {
            java.util.Iterator it = mv2.f0.f413098e.iterator();
            while (it.hasNext()) {
                mv2.w0 w0Var = (mv2.w0) it.next();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyPrePostEvent ");
                java.lang.String str = this.f413202d;
                sb6.append(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostManager", sb6.toString());
                w0Var.mo56230x6f338df6(str, this.f413203e);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LogPost.FinderPostManager", "is invalid to notifyPrePostEvent");
        }
        return jz5.f0.f384359a;
    }
}
