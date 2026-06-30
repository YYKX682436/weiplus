package l01;

/* loaded from: classes7.dex */
public class b0 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l01.c0 f396278d;

    public b0(l01.c0 c0Var) {
        this.f396278d = c0Var;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "AppBrandSimpleImageLoaderDownloadThread";
    }

    @Override // java.lang.Runnable
    public void run() {
        l01.c0 c0Var = this.f396278d;
        l01.c0.d(c0Var.f396283d, c0Var.f396284e, c0Var.f396288i);
        l01.p pVar = c0Var.f396286g.f396275d;
        pVar.f396317a.mo50293x3498a0(new l01.a0(this));
    }
}
