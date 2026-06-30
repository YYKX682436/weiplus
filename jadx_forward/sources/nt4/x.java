package nt4;

/* loaded from: classes9.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5834xa4df3853 f421387d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.p2377x633fb29.C19166x1e10373b c19166x1e10373b, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5834xa4df3853 c5834xa4df3853) {
        this.f421387d = c5834xa4df3853;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.Runnable runnable = this.f421387d.f273897d;
        if (runnable != null) {
            runnable.run();
        }
    }
}
