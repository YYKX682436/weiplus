package sp0;

/* loaded from: classes7.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc3.k f492475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp0.d f492476e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jc3.k kVar, sp0.d dVar) {
        super(1);
        this.f492475d = kVar;
        this.f492476e = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        lc3.z zVar;
        com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23981x400ee297 it = (com.p314xaae8f345.p2845xc516c4b6.p2859x2d333a85.C23981x400ee297) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        int m88750xe591acbc = (int) it.m88750xe591acbc();
        java.lang.String m88751x17ec12d2 = it.m88751x17ec12d2();
        this.f492476e.getClass();
        if (m88750xe591acbc == 0) {
            zVar = lc3.x.f399467a;
        } else {
            zVar = new lc3.z(4, "fail:internal errorbizErrCode: " + m88750xe591acbc + ", bizErrCode:" + m88751x17ec12d2);
        }
        jc3.k.b(this.f492475d, zVar, null, 2, null);
        return jz5.f0.f384359a;
    }
}
