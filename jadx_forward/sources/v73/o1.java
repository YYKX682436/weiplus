package v73;

/* loaded from: classes9.dex */
public class o1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.av3 f515254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v73.p1 f515255e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(v73.p1 p1Var, r45.av3 av3Var) {
        super(false);
        this.f515255e = p1Var;
        this.f515254d = av3Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "card type clicked");
        v73.p1 p1Var = this.f515255e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16106x38110247 activityC16106x38110247 = p1Var.f515264g;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16106x38110247.f223916i;
        activityC16106x38110247.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16106x38110247 activityC16106x381102472 = p1Var.f515264g;
        activityC16106x381102472.f223919h = this.f515254d.f451808h;
        activityC16106x381102472.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPaySelectCardTypeUI", "go to select contact");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("list_attr", com.p314xaae8f345.mm.ui.p2690x38b72420.i5.g(16, 1, 2, 4, 16384));
        intent.putExtra("block_contact", c01.z1.r());
        intent.putExtra("titile", activityC16106x381102472.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fxp));
        j45.l.v(activityC16106x381102472, ".ui.contact.SelectContactUI", intent, 1);
    }
}
