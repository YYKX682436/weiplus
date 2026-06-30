package fe2;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f343044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fe2.h f343045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343046f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fe2.h hVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f343045e = hVar;
        this.f343046f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fe2.g(this.f343045e, this.f343046f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fe2.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f343044d;
        fe2.h hVar = this.f343045e;
        java.lang.String boxId = this.f343046f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mm2.e0 e0Var = (mm2.e0) hVar.P0(mm2.e0.class);
            this.f343044d = 1;
            if (e0Var.T6(boxId, true, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        mm2.e0 e0Var2 = (mm2.e0) hVar.P0(mm2.e0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxId, "boxId");
        r45.qm1 qm1Var = new r45.qm1();
        int i18 = qs5.v.f448005a;
        qm1Var.set(0, 1);
        qm1Var.set(1, boxId);
        e0Var2.N6(qm1Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxId, "boxId");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("event_type", 1);
            jSONObject.put("group_box_number", boxId);
            ((ml2.r0) i95.n0.c(ml2.r0.class)).wj(jSONObject);
        } catch (java.lang.Throwable unused) {
        }
        return jz5.f0.f384359a;
    }
}
