package am2;

/* loaded from: classes3.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f8644d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(java.util.List list) {
        super(0);
        this.f8644d = list;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.util.o1 o1Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("executeBatchMockCommand thread ");
        gk2.e eVar = gk2.e.f272471n;
        sb6.append(eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f328806g : null);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftMockUtil", sb6.toString());
        gk2.e eVar2 = gk2.e.f272471n;
        if (eVar2 != null && (o1Var = ((mm2.c1) eVar2.a(mm2.c1.class)).f328806g) != null) {
            ((com.tencent.mm.plugin.finder.live.util.j1) o1Var).a(this.f8644d);
        }
        return jz5.f0.f302826a;
    }
}
