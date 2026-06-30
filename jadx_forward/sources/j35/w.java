package j35;

/* loaded from: classes5.dex */
public class w implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19627x87d09a1e f379057d;

    public w(com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19627x87d09a1e activityC19627x87d09a1e) {
        this.f379057d = activityC19627x87d09a1e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19627x87d09a1e activityC19627x87d09a1e = this.f379057d;
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionActivity", "START_SETTINGS_REQUEST click ok");
            activityC19627x87d09a1e.startActivityForResult(activityC19627x87d09a1e.f271052m, 1);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PermissionActivity", "onResume scene = %d startActivityForResult() Exception = %s ", java.lang.Integer.valueOf(activityC19627x87d09a1e.f271051i), e17.getMessage());
        }
    }
}
