package dk2;

/* loaded from: classes3.dex */
public final class ia extends dk2.t4 {

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f315152b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f315153c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(r45.ch1 msg) {
        super(msg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f315152b = jz5.h.b(new dk2.ha(this));
    }

    @Override // dk2.zf
    public java.lang.Object D() {
        if (mo124533xfb85f7b0() != 20128) {
            return null;
        }
        r45.aj1 aj1Var = new r45.aj1();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = this.f315634a.m75934xbce7f2f(4);
        byte[] g17 = m75934xbce7f2f != null ? m75934xbce7f2f.g() : null;
        if (g17 == null) {
            return null;
        }
        try {
            aj1Var.mo11468x92b714fd(g17);
            return aj1Var;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
            return null;
        }
    }

    public final boolean F() {
        dk2.zf t17 = t();
        dk2.fg fgVar = t17 instanceof dk2.fg ? (dk2.fg) t17 : null;
        return (fgVar != null ? fgVar.q() : null) != null;
    }

    public final dk2.zf t() {
        return (dk2.zf) ((jz5.n) this.f315152b).mo141623x754a37bb();
    }
}
