package gc3;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f351965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 f351966e;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 c16411x58668904, int i17) {
        this.f351966e = c16411x58668904;
        this.f351965d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jp jpVar = this.f351966e.f229138e;
        boolean z17 = false;
        if (this.f351965d < 28) {
            int i17 = jpVar.f228619k + 1;
            jpVar.f228619k = i17;
            if (i17 >= 4) {
                z17 = true;
            }
        } else {
            jpVar.f228619k = 0;
        }
        jpVar.f228618j = z17;
        jpVar.invalidateSelf();
    }
}
