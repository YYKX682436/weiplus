package h34;

/* loaded from: classes11.dex */
public class n implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h34.r f360085d;

    public n(h34.r rVar) {
        this.f360085d = rVar;
    }

    @Override // i11.c
    /* renamed from: onGetLocation */
    public boolean mo630x9b865cc(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        if (!z17) {
            return true;
        }
        h34.r rVar = this.f360085d;
        rVar.f360092h = f18;
        rVar.f360093i = f17;
        rVar.f360094m = (int) d18;
        return false;
    }
}
