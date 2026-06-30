package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbq/z1;", "cgi", "Lcom/tencent/mm/protocal/protobuf/FinderUserPageResponse;", "resp", "Ljz5/f0;", "invoke", "(Lbq/z1;Lcom/tencent/mm/protocal/protobuf/FinderUserPageResponse;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$2 */
/* loaded from: classes2.dex */
public final class C15252x2de5cc80 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: $onComplete */
    final /* synthetic */ yz5.a f36305x7188775c;

    /* renamed from: $username */
    final /* synthetic */ java.lang.String f36306xc9c924fa;

    /* renamed from: this$0 */
    final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.UserInfoHelper f36307xcbdd23aa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15252x2de5cc80(yz5.a aVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.UserInfoHelper userInfoHelper) {
        super(2);
        this.f36305x7188775c = aVar;
        this.f36306xc9c924fa = str;
        this.f36307xcbdd23aa = userInfoHelper;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        m61704xb9724478((bq.z1) obj, (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) obj2);
        return jz5.f0.f384359a;
    }

    /* renamed from: invoke */
    public final void m61704xb9724478(bq.z1 cgi, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgi, "cgi");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        this.f36305x7188775c.mo152xb9724478();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("username=");
        sb6.append(this.f36306xc9c924fa);
        sb6.append(", scene username=");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa J2 = cgi.J();
        sb6.append(J2 != null ? J2.m76197x6c03c64c() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.UserInfoHelper.TAG, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.UserInfoHelper.Companion companion = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.UserInfoHelper.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2) companion.m61701xbe91d134().get(this.f36306xc9c924fa);
        if (l2Var == null) {
            l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.uic.l2(0, 0, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0, null, null, null, null, null, null, null, null, -1, 1, null);
        }
        l2Var.f205446b = cgi.E;
        l2Var.f205447c = cgi.F;
        l2Var.f205445a = cgi.D;
        l2Var.f205448d = new java.util.LinkedList(cgi.C);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = cgi.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        l2Var.f205450f = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) fVar).m77084xafc1214e();
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = cgi.f152179f.f152244b.f152233a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUserPageResponse");
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862> m77051x283f0769 = ((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19796x6abb1fc1) fVar2).m77051x283f0769();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m77051x283f0769, "getJump_info(...)");
        l2Var.f205457m = m77051x283f0769;
        companion.m61701xbe91d134().put(this.f36306xc9c924fa, l2Var);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.UserInfoHelper userInfoHelper = this.f36307xcbdd23aa;
        n3Var.mo77785xc570fb34(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.finder.view.FinderBottomCustomDialogHelper$UserInfoHelper$doSceneForUserInfo$2.1
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15230x4b89f918.UserInfoHelper.this.m61696x6e84a9c3();
            }
        });
    }
}
