package p61;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.C11356x9a817b8c f433740d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.C11356x9a817b8c c11356x9a817b8c) {
        this.f433740d = c11356x9a817b8c;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.C11356x9a817b8c c11356x9a817b8c = this.f433740d;
        c11356x9a817b8c.smoothScrollTo(0, c11356x9a817b8c.getBottom());
    }
}
