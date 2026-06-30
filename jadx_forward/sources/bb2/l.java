package bb2;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 f100440d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 c13682x42ec4fe7) {
        this.f100440d = c13682x42ec4fe7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletFastFollowBtn", "autoHide triggered");
        yz5.a onAutoHide = this.f100440d.getOnAutoHide();
        if (onAutoHide != null) {
            onAutoHide.mo152xb9724478();
        }
    }
}
