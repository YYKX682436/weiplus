package a84;

/* loaded from: classes4.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f2287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a84.i f2288e;

    public h(a84.i iVar, android.graphics.Bitmap bitmap) {
        this.f2288e = iVar;
        this.f2287d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$6$1");
        this.f2288e.f2302f.a(this.f2287d, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$6$1");
    }
}
