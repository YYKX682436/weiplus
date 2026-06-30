package gc3;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f351963d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 f351964e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.p1831x6b2e132.C16411x58668904 c16411x58668904, boolean z17) {
        this.f351964e = c16411x58668904;
        this.f351963d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jp jpVar = this.f351964e.f229138e;
        int i17 = jpVar.f228619k + 1;
        jpVar.f228619k = i17;
        jpVar.f228618j = i17 >= 4;
        if (!this.f351963d) {
            jpVar.f228621m = 3;
        }
        jpVar.invalidateSelf();
    }
}
