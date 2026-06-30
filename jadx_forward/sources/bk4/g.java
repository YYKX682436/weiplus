package bk4;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd f103009d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd c5255x5f3208fd) {
        super(0);
        this.f103009d = c5255x5f3208fd;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        try {
            bk4.y yVar = bk4.y.f103151a;
            java.lang.String filePath = this.f103009d.f135586g.f89294c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filePath, "filePath");
            yVar.c0(filePath);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatus.StatusIconHelper", th6, "updateRes exception", new java.lang.Object[0]);
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1629L, 9L, 1L, false);
        return jz5.f0.f384359a;
    }
}
