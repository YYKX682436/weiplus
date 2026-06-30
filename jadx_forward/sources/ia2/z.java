package ia2;

/* loaded from: classes10.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f371517d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p3325xe03a0797.p3326xc267989b.q qVar) {
        super(1);
        this.f371517d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object value = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        boolean m143903xa8fbbff4 = p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(value);
        p3325xe03a0797.p3326xc267989b.q qVar = this.f371517d;
        if (m143903xa8fbbff4) {
            if ((p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(value) ? null : value) != null) {
                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(value)) {
                    value = null;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(value);
                com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24644xff1e8b2e c24644xff1e8b2e = (com.p314xaae8f345.p2845xc516c4b6.p2875x994388b2.C24644xff1e8b2e) value;
                com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23 c16279x64cea23 = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.p1816x633fb29.C16279x64cea23();
                c16279x64cea23.f226120f = c24644xff1e8b2e.m91400x79d7af9();
                c16279x64cea23.f226119e = c24644xff1e8b2e.m91399x2605e9e2();
                ((p3325xe03a0797.p3326xc267989b.r) qVar).s(c16279x64cea23, ia2.x.f371515d);
                return jz5.f0.f384359a;
            }
        }
        ((p3325xe03a0797.p3326xc267989b.r) qVar).s(null, ia2.y.f371516d);
        return jz5.f0.f384359a;
    }
}
