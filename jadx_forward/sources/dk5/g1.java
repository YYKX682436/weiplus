package dk5;

/* loaded from: classes9.dex */
public class g1 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 f316166a;

    public g1(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8) {
        this.f316166a = activityC22567x42e895b8;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.a3
    public void a(java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4) {
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8 activityC22567x42e895b8 = this.f316166a;
        android.app.ProgressDialog progressDialog = activityC22567x42e895b8.f292500t;
        if (progressDialog != null) {
            progressDialog.dismiss();
            activityC22567x42e895b8.f292500t = null;
        }
        if (activityC22567x42e895b8.f292504x == 1) {
            dp.a.m125854x26a183b(activityC22567x42e895b8, activityC22567x42e895b8.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi), 0).show();
        }
        activityC22567x42e895b8.finish();
    }
}
