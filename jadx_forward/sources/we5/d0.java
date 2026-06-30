package we5;

/* loaded from: classes5.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f526856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rd5.d f526857e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yb5.d f526858f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, rd5.d dVar, yb5.d dVar2) {
        super(1);
        this.f526856d = f9Var;
        this.f526857e = dVar;
        this.f526858f = dVar2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao it = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = it.f284912b;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f526856d;
        c22624x85d69039.setTag(com.p314xaae8f345.mm.R.id.bon, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
        it.f284912b.setTag(com.p314xaae8f345.mm.R.id.rfh, f9Var.Q0());
        it.f284912b.setTag(com.p314xaae8f345.mm.R.id.bom, java.lang.Boolean.TRUE);
        it.f284912b.m84175x8dd5167d(Integer.MAX_VALUE);
        yb5.d dVar = this.f526858f;
        boolean D = dVar.D();
        rd5.d dVar2 = this.f526857e;
        it.f284912b.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.go(dVar2, D, it, null));
        if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.L4(dVar2.f475787d.f526833b.Q0()) || dVar.E()) {
            it.f284912b.m84176x8e6ff544((int) (r6.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561774sa) / j65.f.f379476g));
        } else {
            it.f284912b.m84176x8e6ff544((int) (com.p314xaae8f345.mm.ui.bk.o(0.88f) / j65.f.f379476g));
        }
        return jz5.f0.f384359a;
    }
}
