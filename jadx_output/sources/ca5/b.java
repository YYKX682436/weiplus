package ca5;

/* loaded from: classes14.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f40075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.transvoice.ui.SoundWaveView f40076e;

    public b(com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView, int i17) {
        this.f40076e = soundWaveView;
        this.f40075d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = this.f40076e;
        java.util.ArrayList arrayList = soundWaveView.f196429f;
        soundWaveView.g(((java.lang.Integer) arrayList.get(r2)).intValue(), (java.util.List) ((java.util.ArrayList) soundWaveView.f196433m).get(this.f40075d));
    }
}
