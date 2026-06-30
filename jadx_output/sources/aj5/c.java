package aj5;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f5401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ aj5.e f5402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5403f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.ArrayList arrayList, aj5.e eVar, java.lang.String str) {
        super(1);
        this.f5401d = arrayList;
        this.f5402e = eVar;
        this.f5403f = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        if (((wi5.s) state.a(wi5.s.class)) != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSelectContactAfterAction chatroomLiveItemList: ");
            java.util.ArrayList arrayList = this.f5401d;
            sb6.append(arrayList.size());
            com.tencent.mars.xlog.Log.i("MicroMsg.MoreDuplicateGroupUIC", sb6.toString());
            boolean z17 = true;
            boolean z18 = !arrayList.isEmpty();
            aj5.e eVar = this.f5402e;
            if (z18) {
                com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) eVar.f5416d).getValue()).k();
                kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
                com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
                if (a17 != null) {
                    a17.n(arrayList, false);
                }
            }
            java.lang.String str = this.f5403f;
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (!z17) {
                p13.u uVar = new p13.u();
                uVar.f351141c = str;
                uVar.f351140b = 99;
                uVar.f351152n = (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) eVar.f5417e).getValue();
                uVar.f351151m = new aj5.a(eVar);
                eVar.f5418f = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
