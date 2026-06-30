package mm3;

/* loaded from: classes10.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f411142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c.ActivityC16658x38bdd532 f411143e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c.ActivityC16658x38bdd532 activityC16658x38bdd532) {
        super(0);
        this.f411142d = u3Var;
        this.f411143e = activityC16658x38bdd532;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f411142d.dismiss();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1918x30166c.ActivityC16658x38bdd532 activityC16658x38bdd532 = this.f411143e;
        android.content.Intent intent = new android.content.Intent(activityC16658x38bdd532, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16654xdc9bdf62.class);
        intent.putExtra("key_track_data", activityC16658x38bdd532.f232427e.mo14344x5f01b1f6());
        pm0.v.g(intent, activityC16658x38bdd532.getIntent(), "key_mv_from_scene", 0);
        activityC16658x38bdd532.f232428f = true;
        activityC16658x38bdd532.startActivityForResult(intent, 7);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 c17 = fm3.g0.f345603a.c();
        c17.f141015k = 7L;
        c17.G = 0;
        c17.k();
        c17.o();
        return jz5.f0.f384359a;
    }
}
