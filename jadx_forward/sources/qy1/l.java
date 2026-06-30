package qy1;

/* loaded from: classes13.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f449274d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qy1.m f449275e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(qy1.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f449275e = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qy1.l(this.f449275e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy1.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object i17;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f449274d;
        if (i18 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            oy1.m mVar = oy1.m.f431418a;
            if (oy1.m.f431428k == null) {
                oy1.m.f431428k = java.lang.Long.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.c0.clicfg_data_report_sdk_cgi_receive_task_delay, 0L));
            }
            java.lang.Long l17 = oy1.m.f431428k;
            long longValue = l17 != null ? l17.longValue() : 0L;
            this.f449274d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(longValue, this) == aVar) {
                return aVar;
            }
        } else {
            if (i18 != 1) {
                if (i18 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                i17 = ((u26.c0) obj).f505674a;
                return u26.c0.b(i17);
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        u26.w wVar = this.f449275e.f449278c;
        this.f449274d = 2;
        i17 = ((u26.k) wVar).i(this);
        if (i17 == aVar) {
            return aVar;
        }
        return u26.c0.b(i17);
    }
}
