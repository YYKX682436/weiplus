package gc3;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 f351962d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 c16411x58668904) {
        this.f351962d = c16411x58668904;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jp jpVar = this.f351962d.f229138e;
        jpVar.f228621m = 2;
        jpVar.invalidateSelf();
    }
}
