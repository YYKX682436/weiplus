package vh0;

/* loaded from: classes.dex */
public final class r2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f518490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vh0.f3 f518492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(java.lang.String str, vh0.f3 f3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f518491e = str;
        this.f518492f = f3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vh0.r2(this.f518491e, this.f518492f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh0.r2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar;
        r45.vq vqVar;
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f518490d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.String str = this.f518491e;
        boolean z18 = true;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                r45.tq tqVar = new r45.tq();
                tqVar.set(1, str);
                com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                lVar.f152200d = 18551;
                lVar.f152199c = "/cgi-bin/micromsg-bin/bypgetweclawbotstatus";
                lVar.f152197a = tqVar;
                lVar.f152198b = new r45.vq();
                com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
                com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
                iVar.p(a17);
                this.f518490d = 1;
                obj = rm0.h.b(iVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
            vqVar = (r45.vq) fVar.f152151d;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatBotRoutineService", th6, "fetchWeClawStatus failed for " + str, new java.lang.Object[0]);
        }
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && vqVar != null) {
            int m75939xb282bd08 = vqVar.m75939xb282bd08(1);
            r45.uq uqVar = m75939xb282bd08 != 1 ? m75939xb282bd08 != 2 ? null : r45.uq.WECLAWBOT_STATUS_OFFLINE : r45.uq.WECLAWBOT_STATUS_ONLINE;
            if (uqVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatBotRoutineService", "fetchWeClawStatus: status is null for " + str);
                return f0Var;
            }
            int i18 = uqVar.f469096d;
            if (i18 == 1) {
                z17 = true;
            } else {
                if (i18 != 2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatBotRoutineService", "fetchWeClawStatus: unknown status number " + i18 + " for " + str);
                    return f0Var;
                }
                z17 = false;
            }
            vh0.f3 f3Var = this.f518492f;
            if (!z17) {
                z18 = false;
            }
            f3Var.nj(str, z18);
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatBotRoutineService", "fetchWeClawStatus failed for " + str + ", errType=" + fVar.f152148a + ", errCode=" + fVar.f152149b + ", errMsg=" + fVar.f152150c);
        return f0Var;
    }
}
