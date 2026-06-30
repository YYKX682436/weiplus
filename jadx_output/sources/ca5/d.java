package ca5;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f40079d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f40080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f40081f;

    public d(com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView, java.util.List list, int i17, float f17) {
        this.f40079d = list;
        this.f40080e = i17;
        this.f40081f = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f40079d.set(this.f40080e, java.lang.Float.valueOf(this.f40081f));
    }
}
