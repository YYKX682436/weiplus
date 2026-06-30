package j02;

/* loaded from: classes8.dex */
public class a implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f378508d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13233xe6767370 activityC13233xe6767370, long j17) {
        this.f378508d = j17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0 i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i();
        long j17 = this.f378508d;
        i18.t(j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadConfirmUI", "Remove task: %d", java.lang.Long.valueOf(j17));
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(j17);
        if (c17 == null || c17.f68421xf1ebe47b != 5) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).nj(c17.f68417x26b3182a, 11311002L, 2L, 7, null);
    }
}
