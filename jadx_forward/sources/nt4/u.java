package nt4;

/* loaded from: classes9.dex */
public class u implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.p2377x633fb29.C19166x1e10373b f421384d;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.p2377x633fb29.C19166x1e10373b c19166x1e10373b) {
        this.f421384d = c19166x1e10373b;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5587xf7a06bec c5587xf7a06bec = this.f421384d.f262592f;
        java.lang.Runnable runnable = c5587xf7a06bec.f273897d;
        if (runnable != null) {
            c5587xf7a06bec.f135910h.f88087a = 1;
            runnable.run();
        }
    }
}
