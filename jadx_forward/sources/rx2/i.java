package rx2;

/* loaded from: classes2.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx2.p f482508d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(rx2.p pVar) {
        super(0);
        this.f482508d = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rx2.p pVar = this.f482508d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = pVar.f482516d;
        java.lang.String string = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cmc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        m92.b j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(abstractActivityC21394xb3d2c0cf), false, 2, null);
        java.lang.String m75945x2fec8307 = j37 != null ? j37.u0().m75945x2fec8307(36) : null;
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            m75945x2fec8307 = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cme);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m75945x2fec8307);
        java.lang.String string2 = abstractActivityC21394xb3d2c0cf.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cmd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
        pVar.c(string, m75945x2fec8307, string2);
        return jz5.f0.f384359a;
    }
}
