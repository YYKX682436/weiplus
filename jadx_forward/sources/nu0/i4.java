package nu0;

/* loaded from: classes5.dex */
public final class i4 extends gx0.hf {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f421505i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f421506m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f421505i = jz5.h.b(new nu0.f4(this));
        this.f421506m = jz5.h.b(new nu0.g4(this));
    }

    @Override // gx0.hf
    public void U6(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        jz5.g gVar = this.f421505i;
        if (((nu0.q0) ((jz5.n) gVar).mo141623x754a37bb()).b7(mjID.m32425x6ac9171()) == null) {
            return;
        }
        nu0.q0.Y6((nu0.q0) ((jz5.n) gVar).mo141623x754a37bb(), false, null, 3, null);
    }

    @Override // gx0.hf
    public void W6(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 timeRange, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timeRange, "timeRange");
        p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new nu0.e4(this, mjID, aVar, null), 3, null);
    }

    @Override // gx0.hf
    public boolean g7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 mjID, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mjID, "mjID");
        boolean f76 = ((nu0.q0) ((jz5.n) this.f421505i).mo141623x754a37bb()).f7(mjID.m32425x6ac9171());
        if (f76 && z17) {
            pf5.e.m158344xbe96bc24(this, null, null, new nu0.h4(this, z18, null), 3, null);
        }
        return f76;
    }
}
