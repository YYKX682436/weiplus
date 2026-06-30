package c03;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f37660d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f37661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f37662f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f37663g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f37664h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context, java.util.Map map, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, java.lang.String str) {
        super(0);
        this.f37660d = context;
        this.f37661e = map;
        this.f37662f = h0Var;
        this.f37663g = finderItem;
        this.f37664h = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        n40.o oVar = (n40.o) i95.n0.c(n40.o.class);
        android.content.Context context = this.f37660d;
        java.util.Map map = this.f37661e;
        android.os.Bundle bundle = (android.os.Bundle) this.f37662f.f310123d;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f37663g;
        ((a03.h0) oVar).ij(context, map, false, bundle, finderItem != null ? finderItem.getFeedObject() : null, this.f37664h);
        return jz5.f0.f302826a;
    }
}
