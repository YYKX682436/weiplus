package os3;

/* loaded from: classes8.dex */
public class t3 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 f429747d;

    public t3(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1) {
        this.f429747d = viewOnCreateContextMenuListenerC16941x4db497e1;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898 c10755xa1fef898 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = this.f429747d;
        if (viewOnCreateContextMenuListenerC16941x4db497e1.isFinishing() || viewOnCreateContextMenuListenerC16941x4db497e1.isDestroyed()) {
            return;
        }
        long j17 = c10755xa1fef898.f149938d;
        viewOnCreateContextMenuListenerC16941x4db497e1.E = j17;
        if (j17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ReadMailUI", "doAddDownloadTask fail, downloadId = %d ", java.lang.Long.valueOf(j17));
            return;
        }
        android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("QQMAIL", 4);
        viewOnCreateContextMenuListenerC16941x4db497e1.f236457J = sharedPreferences;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("qqmail_downloadid", viewOnCreateContextMenuListenerC16941x4db497e1.E).commit();
        }
        viewOnCreateContextMenuListenerC16941x4db497e1.I = 1;
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(viewOnCreateContextMenuListenerC16941x4db497e1.E), js3.d.class, new os3.e4(viewOnCreateContextMenuListenerC16941x4db497e1));
    }
}
