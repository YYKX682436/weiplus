package df2;

/* loaded from: classes3.dex */
public final class vo extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f313151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.zo f313152e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo(df2.zo zoVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f313152e = zoVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.vo(this.f313152e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.vo) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f313151d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f313151d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        df2.zo zoVar = this.f313152e;
        android.widget.FrameLayout Z6 = zoVar.Z6();
        if ((Z6 != null ? Z6.getChildCount() : 0) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(zoVar.f313512m, "[checkRootGone]");
            android.widget.FrameLayout Z62 = zoVar.Z6();
            if (Z62 != null) {
                Z62.setVisibility(8);
            }
        }
        return jz5.f0.f384359a;
    }
}
