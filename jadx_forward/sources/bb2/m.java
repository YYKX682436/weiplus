package bb2;

/* loaded from: classes10.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 f100450d;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 c13682x42ec4fe7) {
        this.f100450d = c13682x42ec4fe7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 c13682x42ec4fe7 = this.f100450d;
        c13682x42ec4fe7.f184321m = true;
        c13682x42ec4fe7.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletFastFollowBtn", "handleLongPressStart");
        c13682x42ec4fe7.f184318g = true;
        c13682x42ec4fe7.j();
        yz5.l lVar = c13682x42ec4fe7.onContinueClick;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - c13682x42ec4fe7.f184319h));
        }
        pm0.v.U(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7.f184314z, c13682x42ec4fe7.f184333y);
    }
}
