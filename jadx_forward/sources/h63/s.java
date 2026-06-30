package h63;

/* loaded from: classes10.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h63.u f360810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c f360811e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(h63.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        super(1);
        this.f360810d = uVar;
        this.f360811e = abstractC11887x3610e10c;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a;
        java.lang.String str2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        h63.u uVar = this.f360810d;
        if (booleanValue) {
            str2 = uVar.TAG;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "recover success");
        } else {
            str = uVar.TAG;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "recover failed, start game again");
            h63.g1 g1Var = (h63.g1) i95.n0.c(h63.g1.class);
            m50421x3c6fed6a = uVar.m50421x3c6fed6a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a, "access$getActivityContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f c16049x1ab5a75f = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16049x1ab5a75f) this.f360811e;
            g1Var.Ui(m50421x3c6fed6a, c16049x1ab5a75f.getAppid(), c16049x1ab5a75f.getVersionType(), true, c16049x1ab5a75f.getCom.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH java.lang.String(), c16049x1ab5a75f.getReportInfo(), c16049x1ab5a75f.getEntranceType(), c16049x1ab5a75f.getEntranceId());
        }
        uVar.m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.C16050xdfd5394d(0));
        return jz5.f0.f384359a;
    }
}
