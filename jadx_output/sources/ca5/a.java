package ca5;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.transvoice.ui.SoundWaveView f40074d;

    public a(com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView) {
        this.f40074d = soundWaveView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewTrans2Txt.SoundWaveView", "active waiting!!!");
        ca5.i iVar = ca5.i.WAITING;
        com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = this.f40074d;
        soundWaveView.f196428e = iVar;
        soundWaveView.C = -1;
        soundWaveView.f();
        java.util.Iterator it = soundWaveView.f196431h.iterator();
        while (it.hasNext()) {
            ((android.animation.AnimatorSet) it.next()).end();
        }
        java.util.Iterator it6 = soundWaveView.f196431h.iterator();
        while (it6.hasNext()) {
            ((android.animation.AnimatorSet) it6.next()).start();
        }
    }
}
