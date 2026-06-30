package us2;

/* loaded from: classes.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f512095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f512096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f512097f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512096e = str;
        this.f512097f = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new us2.v(this.f512096e, this.f512097f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((us2.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.e21 e21Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f512095d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
                java.lang.String finderNickName = this.f512096e;
                java.lang.String eventName = this.f512097f;
                ((c61.l7) b6Var).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderNickName, "finderNickName");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventName, "eventName");
                bq.p1 p1Var = new bq.p1(null, finderNickName, eventName);
                this.f512095d = 1;
                obj = rm0.h.a(p1Var, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            java.util.LinkedList m75941xfb821914 = ((r45.du2) obj).m75941xfb821914(2);
            if (m75941xfb821914 == null || (e21Var = (r45.e21) kz5.n0.Z(m75941xfb821914)) == null) {
                return null;
            }
            if (e21Var.m75939xb282bd08(12) != 1) {
                return e21Var;
            }
            return null;
        } catch (rm0.j e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TemplateEventInfoReqCgi", "getEventTopicInfo error >> " + e17);
            return null;
        }
    }
}
