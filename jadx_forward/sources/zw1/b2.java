package zw1;

/* loaded from: classes9.dex */
public class b2 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558119a;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7) {
        this.f558119a = activityC13144xce1cfbb7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.c7
    public void a(android.view.View view) {
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = this.f558119a;
        intent.setClass(activityC13144xce1cfbb7.mo55332x76847179(), com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13142x725f2ac0.class);
        intent.putExtra("key_currency_unit", activityC13144xce1cfbb7.N);
        activityC13144xce1cfbb7.startActivityForResult(intent, 4096);
    }
}
