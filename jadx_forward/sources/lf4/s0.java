package lf4;

/* loaded from: classes4.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf4.j1 f400014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ if4.f f400015e;

    public s0(lf4.j1 j1Var, if4.f fVar) {
        this.f400014d = j1Var;
        this.f400015e = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f400014d.f399954h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: deleteItem fake ");
        if4.f fVar = this.f400015e;
        sb6.append(fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        ef4.e0.f333974a.a(fVar.f372780e.f372786a);
        jf4.a aVar = jf4.a.f380965a;
        aVar.a(fVar.f372780e.f372792g);
        aVar.b(fVar.f372780e.f372792g);
    }
}
