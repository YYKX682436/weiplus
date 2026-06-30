package ca5;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f40082d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f40083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f40084f;

    public e(com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView, java.util.List list, int i17, float f17) {
        this.f40082d = list;
        this.f40083e = i17;
        this.f40084f = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f40082d.set(this.f40083e, java.lang.Float.valueOf(this.f40084f));
    }
}
