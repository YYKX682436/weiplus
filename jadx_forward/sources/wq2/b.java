package wq2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f530043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f530044e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f530045f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wq2.h f530046g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, int i18, boolean z17, wq2.h hVar) {
        super(0);
        this.f530043d = i17;
        this.f530044e = i18;
        this.f530045f = z17;
        this.f530046g = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.yz2 yz2Var;
        r45.xz2 xz2Var = new r45.xz2();
        r45.kv0 a17 = db2.t4.f309704a.a(10200);
        wq2.h hVar = this.f530046g;
        android.app.Activity activity = hVar.f530062a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        a17.set(1, java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) activity).getD()));
        xz2Var.f472143d = a17;
        xz2Var.f472149m = this.f530043d;
        xz2Var.f472159w = this.f530044e;
        xz2Var.f472144e = (this.f530045f || (yz2Var = hVar.f530065d) == null) ? null : yz2Var.f473055i;
        xz2Var.f472161y = new java.util.LinkedList();
        xz2Var.A = null;
        xz2Var.B = hVar.f530068g;
        dk2.of ofVar = hVar.f530067f;
        xz2Var.D = ofVar != null ? ofVar.f315398e : null;
        xz2Var.E = ofVar != null ? ofVar.f315400g : 0;
        return (az2.j) xz2Var.b();
    }
}
