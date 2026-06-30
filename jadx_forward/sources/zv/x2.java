package zv;

/* loaded from: classes.dex */
public final class x2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f557663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d f557664e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f557665f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f557664e = c10465x1b7ee7d;
        this.f557665f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zv.x2(this.f557664e, this.f557665f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zv.x2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.C29043x91b2b43d c29043x91b2b43d;
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f557663d;
        com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d = this.f557664e;
        yz5.l lVar = this.f557665f;
        try {
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c10465x1b7ee7d.f146722d, "getBSPOIInfo failed: " + e17.getMessage());
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            uw.y yVar = c10465x1b7ee7d.f146726h;
            if (yVar == null) {
                c29043x91b2b43d = null;
                if (c29043x91b2b43d == null && p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(c29043x91b2b43d.getValue())) {
                    java.lang.Object value = c29043x91b2b43d.getValue();
                    if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(value)) {
                        value = null;
                    }
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813((com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23538xfa8f1487) value)));
                } else {
                    lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
                }
                return jz5.f0.f384359a;
            }
            this.f557663d = 1;
            a17 = yVar.a(this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = ((p3321xbce91901.C29043x91b2b43d) obj).getValue();
        }
        c29043x91b2b43d = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(a17);
        if (c29043x91b2b43d == null) {
        }
        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
        return jz5.f0.f384359a;
    }
}
