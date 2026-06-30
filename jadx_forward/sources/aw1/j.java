package aw1;

/* loaded from: classes12.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f96079d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        super(0);
        this.f96079d = c26987xeef691ab;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.C2CWildFileCleaner", "cleanWildFunctions attachment");
        java.lang.String str = "lastCleanAttachmentTime_" + gm0.j1.b().h();
        long j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().getLong(str, 0L);
        aw1.m mVar = aw1.m.f96122a;
        if (aw1.m.a(mVar, j17)) {
            mVar.c(this.f96079d, aw1.m.i(mVar, "attachment", null, 2, null), null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putLong(str, java.lang.System.currentTimeMillis());
        }
        return jz5.f0.f384359a;
    }
}
