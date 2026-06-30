package yn1;

/* loaded from: classes11.dex */
public final class t3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545378d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f545379e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f545380f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f545381g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f545382h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(yn1.a4 a4Var, byte[] bArr, int i17, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545378d = a4Var;
        this.f545379e = bArr;
        this.f545380f = i17;
        this.f545381g = str;
        this.f545382h = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.t3(this.f545378d, this.f545379e, this.f545380f, this.f545381g, this.f545382h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yn1.t3 t3Var = (yn1.t3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        t3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        long j17 = this.f545382h;
        yn1.a4 a4Var = this.f545378d;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            byte[] bArr = a4Var.f545143e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bArr);
            byte[] m46286xd0386423 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46286xd0386423(bArr, this.f545379e);
            bw5.l2 l2Var = new bw5.l2();
            boolean[] zArr = l2Var.f111142f;
            l2Var.f111140d = bw5.m2.a(this.f545380f);
            zArr[1] = true;
            l2Var.f111141e = pm0.b0.h(m46286xd0386423);
            zArr[2] = true;
            vn1.m b17 = a4Var.b();
            java.lang.String str = this.f545381g;
            byte[] mo14344x5f01b1f6 = l2Var.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            b17.h(str, mo14344x5f01b1f6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a4Var.f545139a, "[sendBLEMessageAsync] success=true");
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar2 = a4Var.f545142d;
            if (aVar2 != null) {
                aVar2.r(j17, true);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(a4Var.f545139a, "[sendBLEMessageAsync] error", e17);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.a aVar3 = a4Var.f545142d;
            if (aVar3 != null) {
                aVar3.r(j17, false);
            }
        }
        return jz5.f0.f384359a;
    }
}
