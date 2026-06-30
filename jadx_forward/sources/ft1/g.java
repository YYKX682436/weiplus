package ft1;

/* loaded from: classes8.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f348021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f348022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ft1.j f348023f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xg3.t f348024g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j17, ft1.j jVar, xg3.t tVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f348022e = j17;
        this.f348023f = jVar;
        this.f348024g = tVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ft1.g(this.f348022e, this.f348023f, this.f348024g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ft1.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object b17;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar;
        java.util.LinkedList<r45.yx6> linkedList;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2;
        java.util.LinkedList linkedList2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f348021d;
        xg3.t tVar = this.f348024g;
        ft1.j jVar = this.f348023f;
        long j17 = this.f348022e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                if (j17 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "getVerifyRecordHistory: version is 0, reset all fetched flag");
                    jVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "resetAllFetchedFlag");
                    ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) jVar.f348028e).mo141623x754a37bb()).putBoolean("all_history_fetched", false);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "getVerifyRecordHistory, version: " + j17);
                r45.ar3 ar3Var = new r45.ar3();
                ar3Var.f451763d = j17;
                com.p314xaae8f345.mm.p944x882e457a.i b18 = ar3Var.b();
                this.f348021d = 1;
                b17 = rm0.h.b(b18, this);
                if (b17 == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                b17 = obj;
            }
            com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) b17;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "getVerifyRecordHistory: " + fVar);
            if (fVar.b()) {
                r45.br3 br3Var = (r45.br3) fVar.f152151d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get verifyRecord ");
                sb6.append((br3Var == null || (linkedList2 = br3Var.f452536d) == null) ? null : new java.lang.Integer(linkedList2.size()));
                sb6.append(", has_more: ");
                sb6.append(br3Var != null ? java.lang.Boolean.valueOf(br3Var.f452537e) : null);
                sb6.append(" sync_key_buff: ");
                sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l((br3Var == null || (gVar2 = br3Var.f452538f) == null) ? null : gVar2.f273689a));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", sb6.toString());
                if (br3Var != null && (linkedList = br3Var.f452536d) != null) {
                    for (r45.yx6 yx6Var : linkedList) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                        sb7.append("VerifyRecord: ");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yx6Var);
                        sb7.append(ft1.k.b(yx6Var));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", sb7.toString());
                        java.util.LinkedList<r45.mx6> linkedList3 = yx6Var.f473016f;
                        if (linkedList3 != null) {
                            for (r45.mx6 mx6Var : linkedList3) {
                                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                                sb8.append("VerifyMsg: ");
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mx6Var);
                                sb8.append(ft1.k.a(mx6Var));
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", sb8.toString());
                            }
                        }
                        ft1.j.wi(jVar, yx6Var);
                    }
                }
                ft1.j.Ai(jVar, (br3Var == null || (gVar = br3Var.f452538f) == null) ? null : gVar.f273689a);
                boolean z17 = br3Var != null ? br3Var.f452537e : false;
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddFriendVerifyRecordService", "getVerifyRecordHistory: all fetched, persist to MMKV");
                    ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) jVar.f348028e).mo141623x754a37bb()).putBoolean("all_history_fetched", true);
                }
                if (tVar != null) {
                    boolean z18 = z17;
                    int i18 = fVar.f152148a;
                    int i19 = fVar.f152149b;
                    java.lang.String str = fVar.f152150c;
                    if (str == null) {
                        str = "";
                    }
                    tVar.a(z18, i18, i19, str);
                }
            } else if (tVar != null) {
                int i27 = fVar.f152148a;
                int i28 = fVar.f152149b;
                java.lang.String str2 = fVar.f152150c;
                if (str2 == null) {
                    str2 = "request failed";
                }
                tVar.a(true, i27, i28, str2);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AddFriendVerifyRecordService", e17, "getVerifyRecordHistory error, version: " + j17, new java.lang.Object[0]);
            if (tVar != null) {
                java.lang.String message = e17.getMessage();
                if (message == null) {
                    message = "unknown error";
                }
                tVar.a(true, -1, -1, message);
            }
        }
        return jz5.f0.f384359a;
    }
}
