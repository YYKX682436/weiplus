package tk4;

/* loaded from: classes11.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f501514d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f501515e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f501516f;

    /* renamed from: g, reason: collision with root package name */
    public int f501517g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a f501518h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioDeviceInfo[] f501519i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a, android.media.AudioDeviceInfo[] audioDeviceInfoArr, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f501518h = c18711x7115b73a;
        this.f501519i = audioDeviceInfoArr;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tk4.h(this.f501518h, this.f501519i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tk4.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a;
        p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar;
        android.media.AudioDeviceInfo[] audioDeviceInfoArr;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f501517g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a2 = this.f501518h;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.d dVar2 = c18711x7115b73a2.f256171J;
            this.f501514d = dVar2;
            android.media.AudioDeviceInfo[] audioDeviceInfoArr2 = this.f501519i;
            this.f501515e = audioDeviceInfoArr2;
            this.f501516f = c18711x7115b73a2;
            this.f501517g = 1;
            p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar2;
            if (kVar.b(null, this) == aVar) {
                return aVar;
            }
            c18711x7115b73a = c18711x7115b73a2;
            dVar = kVar;
            audioDeviceInfoArr = audioDeviceInfoArr2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c18711x7115b73a = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a) this.f501516f;
            audioDeviceInfoArr = (android.media.AudioDeviceInfo[]) this.f501515e;
            dVar = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.d) this.f501514d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (audioDeviceInfoArr != null) {
            try {
                for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26 || audioDeviceInfo.getType() == 8) {
                        java.lang.CharSequence productName = audioDeviceInfo.getProductName();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(productName, "getProductName(...)");
                        if (r26.n0.B(productName, "car", true)) {
                            java.lang.Integer num = new java.lang.Integer(3);
                            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a.N;
                            c18711x7115b73a.e(num);
                        } else {
                            java.lang.Integer num2 = new java.lang.Integer(2);
                            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a.N;
                            c18711x7115b73a.e(num2);
                        }
                    }
                    if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11) {
                        java.lang.Integer num3 = new java.lang.Integer(1);
                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a.N;
                        c18711x7115b73a.e(num3);
                    }
                }
            } catch (java.lang.Throwable th6) {
                ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
                throw th6;
            }
        }
        ((p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) dVar).d(null);
        return jz5.f0.f384359a;
    }
}
