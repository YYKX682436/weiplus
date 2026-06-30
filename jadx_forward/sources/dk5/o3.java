package dk5;

/* loaded from: classes9.dex */
public class o3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.b9 f316306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316307b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316308c;

    public o3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, com.p314xaae8f345.mm.p2621x8fb0427b.b9 b9Var, java.lang.String str) {
        this.f316308c = activityC22571x51759e93;
        this.f316306a = b9Var;
        this.f316307b = str;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 1);
        com.p314xaae8f345.mm.p2621x8fb0427b.b9 b9Var = this.f316306a;
        intent.putExtra("kwebmap_slat", b9Var.f275309b);
        intent.putExtra("kwebmap_lng", b9Var.f275310c);
        intent.putExtra("Kwebmap_locaion", this.f316307b);
        intent.putExtra("kShowshare", false);
        j45.l.j(this.f316308c.mo55332x76847179(), ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
    }
}
