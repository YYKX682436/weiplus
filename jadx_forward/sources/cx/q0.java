package cx;

/* loaded from: classes7.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f305987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(yz5.q qVar) {
        super(1);
        this.f305987d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.C10709x22c215bf mo20556x59bc66e;
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23981x400ee297 it = (com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23981x400ee297) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        long m88750xe591acbc = it.m88750xe591acbc();
        yz5.q qVar = this.f305987d;
        if (m88750xe591acbc == 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf((int) it.m88750xe591acbc());
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.C10709x22c215bf m45417x92b714fd = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.C10709x22c215bf.m45417x92b714fd(it.m88749xfb7e5820());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m45417x92b714fd, "parseFrom(...)");
            qVar.mo147xb9724478(valueOf, null, m45417x92b714fd);
        } else {
            if (it.m88749xfb7e5820() != null) {
                byte[] m88749xfb7e5820 = it.m88749xfb7e5820();
                boolean z17 = false;
                if (m88749xfb7e5820 != null) {
                    if (m88749xfb7e5820.length == 0) {
                        z17 = true;
                    }
                }
                if (!z17) {
                    mo20556x59bc66e = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.C10709x22c215bf.m45417x92b714fd(it.m88749xfb7e5820());
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf((int) it.m88750xe591acbc());
                    java.lang.String m88751x17ec12d2 = it.m88751x17ec12d2();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo20556x59bc66e);
                    qVar.mo147xb9724478(valueOf2, m88751x17ec12d2, mo20556x59bc66e);
                }
            }
            com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.C10709x22c215bf.Builder m45405x3136c9db = com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.C10709x22c215bf.m45405x3136c9db();
            m45405x3136c9db.m45445xca028a92(-1);
            m45405x3136c9db.m45447x23282af6(-1);
            mo20556x59bc66e = m45405x3136c9db.mo20556x59bc66e();
            java.lang.Integer valueOf22 = java.lang.Integer.valueOf((int) it.m88750xe591acbc());
            java.lang.String m88751x17ec12d22 = it.m88751x17ec12d2();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo20556x59bc66e);
            qVar.mo147xb9724478(valueOf22, m88751x17ec12d22, mo20556x59bc66e);
        }
        return jz5.f0.f384359a;
    }
}
