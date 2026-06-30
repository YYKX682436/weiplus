package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f101911d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC f101912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f101913f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(com.tencent.mm.modelbase.f fVar, com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC finderActivityTabUIC, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f101911d = fVar;
        this.f101912e = finderActivityTabUIC;
        this.f101913f = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.activity.uic.n1(this.f101911d, this.f101912e, this.f101913f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.activity.uic.n1 n1Var = (com.tencent.mm.plugin.finder.activity.uic.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        n1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.r03 r03Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.modelbase.f fVar = this.f101911d;
        int i17 = fVar.f70615a;
        kotlin.jvm.internal.c0 c0Var = this.f101913f;
        com.tencent.mm.plugin.finder.activity.uic.FinderActivityTabUIC finderActivityTabUIC = this.f101912e;
        if (i17 == 0 && fVar.f70616b == 0) {
            r45.ma1 ma1Var = (r45.ma1) fVar.f70618d;
            if (ma1Var != null && (r03Var = (r45.r03) ma1Var.getCustom(1)) != null) {
                finderActivityTabUIC.f452711w = r03Var;
            }
            r45.r03 r03Var2 = (r45.r03) finderActivityTabUIC.f452711w;
            if (r03Var2 != null) {
                r45.cn5 cn5Var = (r45.cn5) ((r45.ma1) fVar.f70618d).getCustom(2);
                if (cn5Var != null) {
                    if (cn5Var.getInteger(0) > 0) {
                        r03Var2.set(1, java.lang.Long.valueOf(cn5Var.getLong(1)));
                        r03Var2.set(0, cn5Var.getString(3));
                        r03Var2.set(4, java.lang.Integer.valueOf(cn5Var.getInteger(4)));
                        r45.hj2 hj2Var = (r45.hj2) r03Var2.getCustom(19);
                        if (hj2Var != null) {
                            hj2Var.set(14, 1);
                        }
                        if (cn5Var.getLong(1) != 0) {
                            finderActivityTabUIC.getIntent().putExtra("key_activity_id", cn5Var.getLong(1));
                        } else {
                            java.lang.String string = cn5Var.getString(3);
                            if (!(string == null || string.length() == 0) && pm0.v.Z(cn5Var.getString(3)) != 0) {
                                finderActivityTabUIC.getIntent().putExtra("key_activity_id", pm0.v.Z(cn5Var.getString(3)));
                            }
                        }
                        if (cn5Var.getInteger(4) != 0) {
                            finderActivityTabUIC.getIntent().putExtra("key_topic_type", cn5Var.getInteger(4));
                        }
                    }
                }
                finderActivityTabUIC.E7(r03Var2);
                c0Var.f310112d = finderActivityTabUIC.Q7(r03Var2);
            }
        }
        if (!c0Var.f310112d) {
            finderActivityTabUIC.C7(fVar.f70616b, fVar.f70617c);
        }
        int i18 = fVar.f70616b;
        if (!finderActivityTabUIC.B) {
            finderActivityTabUIC.B = true;
            int i19 = i18 == 0 ? 200 : 400;
            com.tencent.mm.plugin.finder.assist.l0 l0Var = com.tencent.mm.plugin.finder.assist.l0.f102339b;
            android.content.Intent intent = finderActivityTabUIC.getIntent();
            l0Var.getClass();
            kotlin.jvm.internal.o.g(intent, "intent");
            java.lang.String stringExtra = intent.getStringExtra("async_callback_param");
            java.lang.Object remove = stringExtra != null ? l0Var.f102303a.remove(stringExtra) : null;
            zy2.i5 i5Var = remove instanceof zy2.i5 ? (zy2.i5) remove : null;
            if (i5Var != null) {
                i5Var.a(java.lang.Integer.valueOf(i19));
            }
        }
        return jz5.f0.f302826a;
    }
}
