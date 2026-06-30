package pj5;

/* loaded from: classes9.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f436908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 f436909e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f436910f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f436911g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.content.Context context, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 c1Var, yz5.l lVar, long j17) {
        super(4);
        this.f436908d = context;
        this.f436909e = c1Var;
        this.f436910f = lVar;
        this.f436911g = j17;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScheduleMsgHelper", "SetMsgRemindCgi callback, errType: " + intValue + ", errCode: " + intValue2 + ", errMsg: " + ((java.lang.String) obj3) + ", remindId: " + ((java.lang.String) obj4));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.c1 c1Var = this.f436909e;
        android.content.Context context = this.f436908d;
        if (intValue == 0 && intValue2 == 0) {
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573808fw5);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            e4Var.c();
            c1Var.getClass();
            c1Var.f284431n.f140726d = 1L;
            pm0.v.K(null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.a1(c1Var));
            yz5.l lVar = this.f436910f;
            if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Long.valueOf(this.f436911g));
            }
        } else {
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var2.d(com.p314xaae8f345.mm.R.C30867xcad56011.p6z);
            e4Var2.c();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(795L, 4L, 1L, false);
            c1Var.getClass();
            c1Var.f284431n.f140726d = 2L;
            pm0.v.K(null, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.a1(c1Var));
        }
        return jz5.f0.f384359a;
    }
}
