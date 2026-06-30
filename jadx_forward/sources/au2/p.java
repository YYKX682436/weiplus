package au2;

/* loaded from: classes2.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f95615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f95616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dq.b f95617f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17, dq.b bVar) {
        super(0);
        this.f95615d = h0Var;
        this.f95616e = z17;
        this.f95617f = bVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "show drawer successfully!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18 c14988xa0c9eb18 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18) this.f95615d.f391656d;
        if (c14988xa0c9eb18 != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5.s(c14988xa0c9eb18, false, false, 0, 7, null);
            hc2.v0.d(c14988xa0c9eb18, "finder_quick_add", "view_exp", false, null, null, 28, null);
        }
        long currentTimeMillis = this.f95616e ? java.lang.System.currentTimeMillis() : c01.id.c();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = this.f95617f.f323817a;
        if (o4Var != null) {
            o4Var.B("kFinderLastAddShortcutsShowTimeKey", currentTimeMillis);
        }
        return jz5.f0.f384359a;
    }
}
