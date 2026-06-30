package dk5;

/* loaded from: classes9.dex */
public class n5 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f316297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316298b;

    public n5(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99, ot0.q qVar) {
        this.f316298b = activityC22573x19a79d99;
        this.f316297a = qVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("record_xml", this.f316297a.f430196h0);
        intent.putExtra("record_show_share", false);
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99 = this.f316298b;
        intent.putExtra("record_app_id", activityC22573x19a79d99.f292552e.f67370x28d45f97);
        j45.l.j(activityC22573x19a79d99.mo55332x76847179(), "record", ".ui.RecordMsgDetailUI", intent, null);
    }
}
