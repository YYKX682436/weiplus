package v61;

/* loaded from: classes8.dex */
public class j extends android.content.AbstractThreadedSyncAdapter {
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1014x633fb29.ServiceC11387x52d7dd27 serviceC11387x52d7dd27, android.content.Context context) {
        super(context, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncService", "ContactsSyncService SyncAdapterImpl construction");
    }

    @Override // android.content.AbstractThreadedSyncAdapter
    public void onPerformSync(android.accounts.Account account, android.os.Bundle bundle, java.lang.String str, android.content.ContentProviderClient contentProviderClient, android.content.SyncResult syncResult) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactsSyncService", "ContactsSyncService SyncAdapterImpl onPerformSync");
        if (gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ContactsSyncService", "Don't auto sync contacts again from now on!!!");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactsSyncService", "ContactsSyncService account not ready, ignore this sync");
        }
    }
}
