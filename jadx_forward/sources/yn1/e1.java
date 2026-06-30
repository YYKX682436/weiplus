package yn1;

/* loaded from: classes11.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f545179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f545180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f545181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f545182g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(yn1.r2 r2Var, byte[] bArr, int i17, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545179d = r2Var;
        this.f545180e = bArr;
        this.f545181f = i17;
        this.f545182g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.e1(this.f545179d, this.f545180e, this.f545181f, this.f545182g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yn1.e1 e1Var = (yn1.e1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        boolean b17;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar;
        long j17 = this.f545182g;
        yn1.r2 r2Var = this.f545179d;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            byte[] bArr = r2Var.f545345c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr);
            byte[] m46286xd0386423 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46286xd0386423(bArr, this.f545180e);
            bw5.l2 l2Var = new bw5.l2();
            boolean[] zArr = l2Var.f111142f;
            l2Var.f111140d = bw5.m2.a(this.f545181f);
            z17 = true;
            zArr[1] = true;
            l2Var.f111141e = pm0.b0.h(m46286xd0386423);
            zArr[2] = true;
            vn1.m a17 = r2Var.a();
            byte[] mo14344x5f01b1f6 = l2Var.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            b17 = a17.b(mo14344x5f01b1f6);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[sendBLEMessageAsync] success=");
            sb6.append(b17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationPlatformImpl", sb6.toString());
            gVar = r2Var.f545343a;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MM.Mig.MigrationPlatformImpl", "[sendBLEMessageAsync] error", e17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar2 = r2Var.f545343a;
            if (gVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
                throw null;
            }
            gVar2.G(j17, false);
        }
        if (gVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
        if (!b17) {
            z17 = false;
        }
        gVar.G(j17, z17);
        return jz5.f0.f384359a;
    }
}
