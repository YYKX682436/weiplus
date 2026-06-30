package me5;

/* loaded from: classes4.dex */
public class f extends tg3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f407489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f407490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f407491g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f407492h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f407493i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ me5.g f407494m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(me5.g gVar, int i17, r35.m3 m3Var, android.os.Bundle bundle, java.util.LinkedList linkedList, java.util.Map map, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2) {
        super(i17, m3Var);
        this.f407494m = gVar;
        this.f407489e = bundle;
        this.f407490f = linkedList;
        this.f407491g = map;
        this.f407492h = weakReference;
        this.f407493i = weakReference2;
    }

    @Override // tg3.a
    public void a(android.view.View view) {
        long j17 = this.f407489e.getLong("msg_id");
        me5.g gVar = this.f407494m;
        gVar.d(j17, this.f407490f, 1);
        tg3.k1 k1Var = (tg3.k1) i95.n0.c(tg3.k1.class);
        gVar.getClass();
        ((ih3.e) k1Var).Di("link_revoke", this.f407491g, this.f407489e, this.f407492h, this.f407493i);
    }
}
