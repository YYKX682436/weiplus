package x82;

/* loaded from: classes9.dex */
public class s implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.pp0 f534062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f534063b;

    public s(r45.pp0 pp0Var, android.content.Context context) {
        this.f534062a = pp0Var;
        this.f534063b = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("map_view_type", 1);
        intent.putExtra("map_indoor_support", 1);
        r45.pp0 pp0Var = this.f534062a;
        if (pp0Var != null) {
            intent.putExtra("kwebmap_slat", pp0Var.f464801f);
            intent.putExtra("kwebmap_lng", pp0Var.f464799d);
            intent.putExtra("Kwebmap_locaion", pp0Var.f464805m);
        }
        intent.putExtra("kShowshare", false);
        intent.putExtra("key_drawer_allow_no_poiid", true);
        j45.l.j(this.f534063b, ya.b.f77489x9ff58fb5, ".ui.RedirectUI", intent, null);
    }
}
