package l72;

/* loaded from: classes11.dex */
public class a0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 f398367a;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 activityC13535x2550df61) {
        this.f398367a = activityC13535x2550df61;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceAgreementUI", "click agree ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13535x2550df61 activityC13535x2550df61 = this.f398367a;
        android.content.Intent intent = new android.content.Intent(activityC13535x2550df61, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1699xe125c5cf.ActivityC15538x252a13b6.class);
        android.os.Bundle extras = activityC13535x2550df61.getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.putExtra("needContract", activityC13535x2550df61.f181739r);
        activityC13535x2550df61.startActivityForResult(intent, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(917L, 65L, 1L, false);
        activityC13535x2550df61.f181738q.B();
    }
}
