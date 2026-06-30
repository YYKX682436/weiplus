package kt1;

/* loaded from: classes4.dex */
public final class g0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f393473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kt1.h0 f393474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.jo5 f393475f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(kt1.h0 h0Var, r45.jo5 jo5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f393474e = h0Var;
        this.f393475f = jo5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kt1.g0(this.f393474e, this.f393475f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((kt1.g0) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f393473d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.jo5 rsp = this.f393475f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rsp, "$rsp");
            kt1.h0 h0Var = this.f393474e;
            h0Var.getClass();
            r45.ho5 ho5Var = new r45.ho5();
            java.util.LinkedList resp_continue_flag = rsp.f459524d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp_continue_flag, "resp_continue_flag");
            java.util.Iterator it = resp_continue_flag.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                java.lang.Long l17 = (java.lang.Long) obj2;
                if (l17 == null || l17.longValue() != 0) {
                    break;
                }
            }
            java.lang.Long l18 = (java.lang.Long) obj2;
            ho5Var.f457865d = l18 != null ? l18.longValue() : 0L;
            kt1.h0 h0Var2 = new kt1.h0(ho5Var.mo14344x5f01b1f6(), h0Var.f393477b, 4);
            this.f393473d = 1;
            if (h0Var2.a(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
