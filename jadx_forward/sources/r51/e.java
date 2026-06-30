package r51;

/* loaded from: classes15.dex */
public final class e extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public int f474158d = Integer.MAX_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f474159e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final int f474160f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 f474161g;

    public e(com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480, int i17) {
        this.f474161g = c11323x28056480;
        this.f474160f = i17;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f474158d == Integer.MAX_VALUE) {
            this.f474158d = this.f474160f;
        }
        int i17 = this.f474158d;
        int i18 = (int) (i17 * 0.1f);
        this.f474159e = i18;
        if (i18 == 0) {
            if (i17 < 0) {
                this.f474159e = -1;
            } else {
                this.f474159e = 1;
            }
        }
        int abs = java.lang.Math.abs(i17);
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = this.f474161g;
        if (abs <= 1) {
            c11323x28056480.a();
            c11323x28056480.getHandler().sendEmptyMessage(3000);
            return;
        }
        c11323x28056480.m48605x2b27c8ca(c11323x28056480.m48594xf4decdbe() + this.f474159e);
        if (!c11323x28056480.A) {
            float m48591x51ddd610 = c11323x28056480.m48591x51ddd610();
            float m48592x99620925 = ((c11323x28056480.m48592x99620925() - 1) - c11323x28056480.m48590x14a2e4cf()) * m48591x51ddd610;
            if (c11323x28056480.m48594xf4decdbe() <= (-c11323x28056480.m48590x14a2e4cf()) * m48591x51ddd610 || c11323x28056480.m48594xf4decdbe() >= m48592x99620925) {
                c11323x28056480.m48605x2b27c8ca(c11323x28056480.m48594xf4decdbe() - this.f474159e);
                c11323x28056480.a();
                c11323x28056480.getHandler().sendEmptyMessage(3000);
                return;
            }
        }
        c11323x28056480.getHandler().sendEmptyMessage(1000);
        this.f474158d -= this.f474159e;
    }
}
