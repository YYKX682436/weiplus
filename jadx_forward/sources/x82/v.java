package x82;

/* loaded from: classes9.dex */
public class v implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f534068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.gp0 f534069b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f534070c;

    public v(o72.r2 r2Var, r45.gp0 gp0Var, android.content.Context context) {
        this.f534068a = r2Var;
        this.f534069b = gp0Var;
        this.f534070c = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_detail_info_id", this.f534068a.f67645x88be67a1);
        intent.putExtra("key_detail_data_id", this.f534069b.T);
        intent.putExtra("show_share", false);
        ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
        o72.x1.L0(this.f534070c, ".ui.FavImgGalleryUI", intent, null);
    }
}
