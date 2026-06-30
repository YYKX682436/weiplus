package ue2;

/* loaded from: classes3.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f508330d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ue2.o f508331e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ue2.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f508331e = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ue2.c(this.f508331e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ue2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f508330d;
        boolean z17 = true;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                ko0.l lVar = ko0.l.f391403a;
                ko0.d dVar = ko0.d.f391369f;
                this.f508330d = 1;
                obj = lVar.a(dVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.String str = ue2.o.f508360y;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initializeUIComponents: 资源下载完成，success=");
            if (!booleanValue) {
                z17 = false;
            }
            sb6.append(z17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            if (booleanValue) {
                ko0.l lVar2 = ko0.l.f391403a;
                if (!lVar2.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initializeUIComponents: 资源下载成功但实例无效，重新创建实例");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveBeautyUtil", "#releaseDataBucketInstance");
                    ko0.l.f391407e = null;
                    lVar2.d();
                    dk2.d.f314834a.e(lVar2.b());
                    this.f508331e.D();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "initializeUIComponents: 实例更新完成，isValid=" + lVar2.c());
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(ue2.o.f508360y, "initializeUIComponents: 资源下载异常", e17);
        }
        return jz5.f0.f384359a;
    }
}
