package dk2;

/* loaded from: classes3.dex */
public final class l2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ek2.b1 f315246a;

    public l2(ek2.b1 b1Var) {
        this.f315246a = b1Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        dk2.xf m57666x7e07ad96;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        ek2.b1 b1Var = this.f315246a;
        if (b1Var == null) {
            return null;
        }
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
        r45.pu1 pu1Var = (r45.pu1) resp;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.rb rbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.rb) b1Var;
        java.lang.ref.WeakReference weakReference = rbVar.f198190a;
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = weakReference != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) weakReference.get() : null;
        java.lang.ref.WeakReference weakReference2 = rbVar.f198191b;
        android.app.Activity activity = weakReference2 != null ? (android.app.Activity) weakReference2.get() : null;
        if (k0Var != null && activity != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.f35851x233c02ec.getClass();
            str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.TAG;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[goGetLuckMoney] errType:" + i17 + "  errCode:" + i18 + ' ');
            if (i18 == 0 && i17 == 0) {
                java.util.LinkedList m75941xfb821914 = pu1Var.m75941xfb821914(1);
                final java.util.LinkedList linkedList = true ^ (m75941xfb821914 == null || m75941xfb821914.isEmpty()) ? m75941xfb821914 : null;
                if (linkedList != null && (m57666x7e07ad96 = k0Var.m57666x7e07ad96()) != null) {
                    java.lang.Object obj2 = linkedList.get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    final android.os.Handler m77777x504cd8a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
                    ((dk2.r4) m57666x7e07ad96).W(activity, (r45.v62) obj2, new android.os.ResultReceiver(m77777x504cd8a2) { // from class: com.tencent.mm.plugin.finder.live.view.GetLuckMoneyCallback$onCgiBack$1$2$1
                        @Override // android.os.ResultReceiver
                        public void onReceiveResult(int i19, android.os.Bundle bundle) {
                            java.lang.String str2;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.f35851x233c02ec.getClass();
                            str2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.TAG;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "openLuckyMoney result:" + i19);
                            java.util.LinkedList linkedList2 = linkedList;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.this;
                            if (i19 != -1) {
                                if (i19 != 1) {
                                    return;
                                }
                                qo0.b bVar = qo0.b.f446861a4;
                                android.os.Bundle bundle2 = new android.os.Bundle();
                                r45.v62 v62Var = (r45.v62) linkedList2.get(0);
                                bundle2.putString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID", v62Var != null ? v62Var.m75945x2fec8307(0) : null);
                                k0Var2.mo46557x60d69242(bVar, bundle2);
                                return;
                            }
                            java.lang.Object context = k0Var2.getContext();
                            long m75942xfb822ef2 = ((mm2.e1) k0Var2.m57635xbba4bfc0(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
                            long j17 = ((mm2.e1) k0Var2.m57635xbba4bfc0(mm2.e1.class)).f410516m;
                            java.lang.String str3 = ((mm2.e1) k0Var2.m57635xbba4bfc0(mm2.e1.class)).f410525v;
                            byte[] bArr = ((mm2.e1) k0Var2.m57635xbba4bfc0(mm2.e1.class)).f410518o;
                            r45.v62 v62Var2 = (r45.v62) linkedList2.get(0);
                            pq5.g l17 = new ek2.v2(m75942xfb822ef2, j17, str3, bArr, v62Var2 != null ? v62Var2.m75945x2fec8307(0) : null).l();
                            if (context != null && (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
                                l17.f((im5.b) context);
                            }
                            qo0.b bVar2 = qo0.b.f446861a4;
                            android.os.Bundle bundle3 = new android.os.Bundle();
                            r45.v62 v62Var3 = (r45.v62) linkedList2.get(0);
                            bundle3.putString("PARAM_FINDER_LIVE_LUCKY_MONEY_SEND_ID", v62Var3 != null ? v62Var3.m75945x2fec8307(0) : null);
                            k0Var2.mo46557x60d69242(bVar2, bundle3);
                        }
                    }, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.qb(k0Var));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
