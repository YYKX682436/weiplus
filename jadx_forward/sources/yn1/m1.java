package yn1;

/* loaded from: classes9.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f545286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f545287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f545288f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(yn1.r2 r2Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545287e = r2Var;
        this.f545288f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.m1(this.f545287e, this.f545288f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yn1.m1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f545286d;
        long j17 = this.f545288f;
        yn1.r2 r2Var = this.f545287e;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                yn1.z0 z0Var = yn1.z0.f545466a;
                this.f545286d = 1;
                obj = z0Var.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            jz5.l lVar = (jz5.l) obj;
            if (lVar != null) {
                java.lang.String str = (java.lang.String) lVar.f384366d;
                java.lang.String str2 = (java.lang.String) lVar.f384367e;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationPlatformImpl", "[createGroupAsync] success: networkName=" + str + ", passphrase=" + str2);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar = r2Var.f545343a;
                if (gVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                    throw null;
                }
                gVar.i1(j17, str, str2);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.MigrationPlatformImpl", "[createGroupAsync] failed: result is null");
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar2 = r2Var.f545343a;
                if (gVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                    throw null;
                }
                gVar2.i1(j17, "", "");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.MigrationPlatformImpl", "[createGroupAsync] error", e17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar3 = r2Var.f545343a;
            if (gVar3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                throw null;
            }
            gVar3.i1(j17, "", "");
        }
        return jz5.f0.f384359a;
    }
}
