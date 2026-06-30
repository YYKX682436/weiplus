package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class i0 extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f206601a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f206602b;

    public i0(android.app.Activity activity) {
        this.f206602b = activity;
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        if (i17 == 1) {
            this.f206601a = true;
        } else {
            this.f206601a = false;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0.f206616a.f(this.f206602b.hashCode());
        }
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        if (reason.f545049a == 2) {
            return;
        }
        if (!this.f206601a) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j0.f206616a.e(this.f206602b.hashCode());
        }
        this.f206601a = false;
    }
}
