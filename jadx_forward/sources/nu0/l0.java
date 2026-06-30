package nu0;

/* loaded from: classes5.dex */
public final class l0 implements com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f421537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f421538b;

    public l0(nu0.q0 q0Var, p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f421537a = q0Var;
        this.f421538b = qVar;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p469xb845a2f1.h
    public final void a(java.lang.String str) {
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e[] m33150x5a8a256c;
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e[] m33150x5a8a256c2;
        int i17 = 0;
        if (!(str == null || str.length() == 0)) {
            p3325xe03a0797.p3326xc267989b.q qVar = this.f421538b;
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((p3325xe03a0797.p3326xc267989b.r) qVar).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813("Startup failed: " + str));
            return;
        }
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8 = this.f421537a.f421608r;
        int length = (c4063x855a1ef8 == null || (m33150x5a8a256c2 = c4063x855a1ef8.m33150x5a8a256c()) == null) ? 0 : m33150x5a8a256c2.length;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef82 = this.f421537a.f421608r;
        if (c4063x855a1ef82 != null && (m33150x5a8a256c = c4063x855a1ef82.m33150x5a8a256c()) != null) {
            nu0.q0 q0Var = this.f421537a;
            p3325xe03a0797.p3326xc267989b.q qVar2 = this.f421538b;
            int length2 = m33150x5a8a256c.length;
            int i18 = 0;
            while (i17 < length2) {
                com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4060x7aac656e c4060x7aac656e = m33150x5a8a256c[i17];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c4060x7aac656e);
                q0Var.g7(i18, c4060x7aac656e, new nu0.k0(q0Var, f0Var, length, qVar2));
                i17++;
                i18++;
            }
        }
        if (length == 0) {
            ((p3325xe03a0797.p3326xc267989b.r) this.f421538b).mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
            nu0.q0.W6(this.f421537a);
        }
    }
}
