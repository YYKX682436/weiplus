package zh0;

/* loaded from: classes11.dex */
public final class b implements k70.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f554387d;

    public b(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f554387d = qVar;
    }

    @Override // k70.w
    public void f(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, java.lang.String str2, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4) obj;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        boolean z17 = i19 == 0 && i27 == 0;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f554387d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadHelper", "[+] onImgTaskEnd called and download successfully, img_local_id:" + j17 + ", msg_local_id:" + j18);
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new vh0.p1(vh0.h1.OK, null)));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DownloadHelper", "[-] onImgTaskEnd called with download failure, " + i19 + ',' + i27 + ", img_local_id:" + j17 + ", msg_local_id:" + j18);
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new vh0.p1(vh0.h1.IMG_DOWNLOAD_FAILURE, null)));
    }

    @Override // k70.w
    public void l(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadHelper", "[+] onImgTaskCanceled called, img_local_id:" + j17 + ", msg_local_id:" + j18);
        try {
            p3325xe03a0797.p3326xc267989b.q qVar = this.f554387d;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new vh0.p1(vh0.h1.CANCELLED, null)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.DownloadHelper", th6, "[-] fail to resume cont.", new java.lang.Object[0]);
        }
    }

    @Override // k70.w
    public void o(long j17, long j18, java.lang.String str, int i17, int i18, java.lang.Object obj, int i19, int i27, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }
}
