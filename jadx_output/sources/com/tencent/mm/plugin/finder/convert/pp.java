package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class pp implements ju2.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.rp f104275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dm.pd f104277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f104278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f104279e;

    public pp(com.tencent.mm.plugin.finder.convert.rp rpVar, in5.s0 s0Var, dm.pd pdVar, int i17, boolean z17) {
        this.f104275a = rpVar;
        this.f104276b = s0Var;
        this.f104277c = pdVar;
        this.f104278d = i17;
        this.f104279e = z17;
    }

    @Override // ju2.s
    public void a() {
        java.lang.String str;
        android.content.Context context;
        com.tencent.mm.plugin.finder.convert.kp kpVar;
        int i17;
        int i18;
        int i19 = this.f104278d;
        com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.Companion companion = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgOperateVM.f122968f;
        dm.pd mention = this.f104277c;
        int a17 = companion.a(mention);
        com.tencent.mm.plugin.finder.convert.rp rpVar = this.f104275a;
        rpVar.getClass();
        in5.s0 holder = this.f104276b;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(mention, "mention");
        if (a17 == 0 || a17 == 1) {
            com.tencent.mm.plugin.finder.convert.kp kpVar2 = rpVar.f104498g;
            int i27 = kpVar2.f103851a == 1 ? 14 : 15;
            com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract finderMsgContract = com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.f122820a;
            int g17 = finderMsgContract.g(mention);
            boolean z17 = mention.field_businessType == 1;
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            android.content.Context context2 = holder.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            long j17 = i27;
            int i28 = kpVar2.f103851a;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = mention.field_contact;
            if (finderContact == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            com.tencent.mm.plugin.finder.report.o3.Mj(o3Var, context2, j17, 1L, false, g17, 3, com.tencent.mm.plugin.finder.presenter.contract.FinderMsgContract.l(finderMsgContract, context2, i28, false, str, mention, z17, false, true, false, com.tencent.mm.plugin.appbrand.jsapi.q3.CTRL_INDEX, null), 8, null);
            boolean z18 = this.f104279e;
            int i29 = 2;
            int i37 = z18 ? 2 : 1;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context2 instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            if (((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.t70.f127590a.I2().r()).booleanValue()) {
                nv2.d1 d1Var = nv2.d1.f340475b;
                boolean z19 = !z18;
                java.lang.String field_finderUserName = mention.field_finderUserName;
                kotlin.jvm.internal.o.f(field_finderUserName, "field_finderUserName");
                d1Var.getClass();
                int i38 = mention.field_type;
                if (i38 != 1) {
                    if (i38 != 2) {
                        if (i38 == 15) {
                            i29 = 3;
                        } else if (i38 != 33) {
                            com.tencent.mars.xlog.Log.e("Finder.InteractActionMgr", "unexpected mention type with mentionID:" + mention.field_svrMentionId + " type:" + mention.field_type);
                            context = context2;
                            kpVar = kpVar2;
                            i17 = 1;
                        } else {
                            i29 = 5;
                        }
                    }
                    i18 = i29;
                } else {
                    i18 = 1;
                }
                java.lang.String field_username = mention.field_username;
                kotlin.jvm.internal.o.f(field_username, "field_username");
                db2.k6 k6Var = new db2.k6(z19, field_finderUserName, field_username, i18, 0, java.lang.Long.valueOf(mention.field_svrMentionId), null, null, 192, null);
                k6Var.a(false);
                com.tencent.mm.plugin.finder.assist.g2.a(d1Var.f340476a, 600L, "mentionThank_" + mention.field_svrMentionId, new nv2.x0(k6Var, V6), null, null, 24, null);
                context = context2;
                kpVar = kpVar2;
                i17 = 1;
            } else {
                nv2.e2 e2Var = nv2.e2.f340481d;
                long j18 = mention.field_svrMentionId;
                java.lang.String field_finderUserName2 = mention.field_finderUserName;
                kotlin.jvm.internal.o.f(field_finderUserName2, "field_finderUserName");
                java.lang.String field_username2 = mention.field_username;
                kotlin.jvm.internal.o.f(field_username2, "field_username");
                e2Var.getClass();
                context = context2;
                kpVar = kpVar2;
                nv2.b2 b2Var = new nv2.b2(field_finderUserName2, field_username2, i37, i19, 0, V6, null, 64, null);
                b2Var.f340464k = java.lang.Long.valueOf(j18);
                e2Var.b(b2Var);
                i17 = 1;
                com.tencent.mm.sdk.event.IEvent d17 = b2Var.d(true);
                if (d17 != null) {
                    d17.e();
                }
            }
            if (z18 || kpVar.f103851a != i17) {
                return;
            }
            finderMsgContract.a(context, i17);
        }
    }
}
