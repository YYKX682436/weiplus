package mx0;

/* loaded from: classes5.dex */
public final class z6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b f414003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f414004e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced) {
        super(0);
        this.f414003d = c4093x6b88526b;
        this.f414004e = c10977x8e40eced;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String m47293xb18253c3;
        java.lang.String m47290x3ff8399b;
        boolean b17 = mx0.s.f413830a.b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onAIGCRequestFailed isErrTipsOpt:");
        sb6.append(b17);
        sb6.append(", sdk error.message: ");
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b = this.f414003d;
        sb6.append(c4093x6b88526b.f16057x38eb0007);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", sb6.toString());
        boolean z17 = true;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f414004e;
        if (b17) {
            java.lang.String str = c4093x6b88526b.f16057x38eb0007;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                java.lang.String message = c4093x6b88526b.f16057x38eb0007;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(message, "message");
                if (!r26.n0.B(message, "AigcResultCodeFailed", false)) {
                    m47290x3ff8399b = c4093x6b88526b.f16057x38eb0007;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m47290x3ff8399b);
                    c10977x8e40eced.U0(m47290x3ff8399b, new mx0.y6(c10977x8e40eced));
                }
            }
            m47290x3ff8399b = c10977x8e40eced.m47290x3ff8399b();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m47290x3ff8399b);
            c10977x8e40eced.U0(m47290x3ff8399b, new mx0.y6(c10977x8e40eced));
        } else {
            if (c4093x6b88526b.m33746x130a215f() == 1) {
                java.lang.String message2 = c4093x6b88526b.f16057x38eb0007;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(message2, "message");
                if (r26.n0.B(message2, "AigcResultCodeReject", false)) {
                    m47293xb18253c3 = c10977x8e40eced.m47292x54ab18fd();
                } else {
                    java.lang.String message3 = c4093x6b88526b.f16057x38eb0007;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(message3, "message");
                    if (r26.n0.B(message3, "AigcResultCodeTimeout", false)) {
                        m47293xb18253c3 = c10977x8e40eced.m47293xb18253c3();
                    } else {
                        java.lang.String message4 = c4093x6b88526b.f16057x38eb0007;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(message4, "message");
                        m47293xb18253c3 = r26.n0.B(message4, "AigcResultCodeInsecurity", false) ? c10977x8e40eced.m47291xae4d55c3() : c10977x8e40eced.m47290x3ff8399b();
                    }
                }
            } else {
                m47293xb18253c3 = c4093x6b88526b.m33746x130a215f() == 87 ? c10977x8e40eced.m47293xb18253c3() : c10977x8e40eced.m47290x3ff8399b();
            }
            android.widget.Toast m123883x26a183b = db5.t7.m123883x26a183b(c10977x8e40eced.getContext(), m47293xb18253c3, 0);
            m123883x26a183b.setGravity(17, 0, 0);
            m123883x26a183b.show();
            if (c10977x8e40eced.I1) {
                c10977x8e40eced.y0();
                c10977x8e40eced.u0();
            }
            c10977x8e40eced.t0(false);
        }
        return jz5.f0.f384359a;
    }
}
