package gx1;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx1.r f358856d;

    public q(gx1.r rVar) {
        this.f358856d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gx1.r rVar = this.f358856d;
        if (rVar.f358857d.f376853j != 0) {
            int i17 = rVar.f358858e.f358859e.m54595x9925e2d6().f422848d;
            if (i17 == rVar.f358857d.f376871s.length()) {
                rVar.f358858e.f358859e.x();
                rVar.f358858e.f358859e.getText().append((java.lang.CharSequence) "\n");
                rVar.f358858e.f358859e.B();
                rVar.f358858e.f358859e.setSelection(i17);
            }
            ix1.l lVar = rVar.f358857d;
            lVar.f376853j = 0;
            int i18 = lVar.f376854k;
            if (i18 == 1) {
                rVar.f358858e.f358859e.u(px1.v.f440395c, java.lang.Boolean.TRUE);
            } else if (i18 == 3) {
                rVar.f358858e.f358859e.u(px1.v.f440394b, java.lang.Boolean.TRUE);
            } else if (i18 == 2) {
                rVar.f358858e.f358859e.u(px1.v.f440396d, java.lang.Boolean.TRUE);
            }
        }
    }
}
