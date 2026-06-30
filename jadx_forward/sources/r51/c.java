package r51;

/* loaded from: classes15.dex */
public final class c extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public float f474154d = 2.1474836E9f;

    /* renamed from: e, reason: collision with root package name */
    public final float f474155e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 f474156f;

    public c(com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480, float f17) {
        this.f474156f = c11323x28056480;
        this.f474155e = f17;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (this.f474154d == 2.1474836E9f) {
            float f17 = this.f474155e;
            if (java.lang.Math.abs(f17) > 2000.0f) {
                this.f474154d = f17 <= 0.0f ? -2000.0f : 2000.0f;
            } else {
                this.f474154d = f17;
            }
        }
        float abs = java.lang.Math.abs(this.f474154d);
        com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = this.f474156f;
        if (abs >= 0.0f && java.lang.Math.abs(this.f474154d) <= 20.0f) {
            c11323x28056480.a();
            c11323x28056480.getHandler().sendEmptyMessage(2000);
            return;
        }
        float f18 = (int) (this.f474154d / 100.0f);
        c11323x28056480.m48605x2b27c8ca(c11323x28056480.m48594xf4decdbe() - f18);
        if (!c11323x28056480.A) {
            float m48591x51ddd610 = c11323x28056480.m48591x51ddd610();
            float f19 = (-c11323x28056480.m48590x14a2e4cf()) * m48591x51ddd610;
            float m48592x99620925 = ((c11323x28056480.m48592x99620925() - 1) - c11323x28056480.m48590x14a2e4cf()) * m48591x51ddd610;
            double d17 = m48591x51ddd610 * 0.25d;
            if (c11323x28056480.m48594xf4decdbe() - d17 < f19) {
                f19 = c11323x28056480.m48594xf4decdbe() + f18;
            } else if (c11323x28056480.m48594xf4decdbe() + d17 > m48592x99620925) {
                m48592x99620925 = c11323x28056480.m48594xf4decdbe() + f18;
            }
            if (c11323x28056480.m48594xf4decdbe() <= f19) {
                this.f474154d = 40.0f;
                c11323x28056480.m48605x2b27c8ca((int) f19);
            } else if (c11323x28056480.m48594xf4decdbe() >= m48592x99620925) {
                c11323x28056480.m48605x2b27c8ca((int) m48592x99620925);
                this.f474154d = -40.0f;
            }
        }
        float f27 = this.f474154d;
        if (f27 < 0.0f) {
            this.f474154d = f27 + 20.0f;
        } else {
            this.f474154d = f27 - 20.0f;
        }
        c11323x28056480.getHandler().sendEmptyMessage(1000);
    }
}
