package hf2;

/* loaded from: classes3.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.e1 f362563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ei0 f362564f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362565g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362566h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(hf2.e1 e1Var, r45.ei0 ei0Var, java.lang.String str, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f362563e = e1Var;
        this.f362564f = ei0Var;
        this.f362565g = str;
        this.f362566h = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hf2.c1(this.f362563e, this.f362564f, this.f362565g, this.f362566h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object a17;
        r45.ji0 ji0Var;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f362562d;
        r45.ei0 ei0Var = this.f362564f;
        hf2.e1 e1Var = this.f362563e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f362562d = 1;
            a17 = hf2.e1.a(e1Var, ei0Var, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
        }
        if (!((java.lang.Boolean) a17).booleanValue()) {
            pm0.v.X(new hf2.b1(this.f362566h, e1Var));
        } else if (ei0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(this.f362565g);
            java.util.LinkedList linkedList = ei0Var.f455062d;
            if (linkedList != null && (ji0Var = (r45.ji0) kz5.n0.Z(linkedList)) != null && (str = ji0Var.f459362n) != null) {
                sb6.append(str);
            }
            if ((e1Var.f362586c.length() > 0) != false) {
                sb6.append(";");
                sb6.append(e1Var.f362586c);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8 u8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.u8.f184132a;
            gk2.e buContext = e1Var.f362584a.getStore().getLiveRoomData();
            java.lang.String sb7 = sb6.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
            long m75939xb282bd08 = ((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75939xb282bd08(4);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75939xb282bd08(6));
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            u8Var.a(((mm2.e1) buContext.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), m75939xb282bd08, (valueOf != null ? valueOf.intValue() : c01.id.e()) - m75939xb282bd08, ((mm2.e1) buContext.a(mm2.e1.class)).f410527x, ((mm2.f6) buContext.a(mm2.f6.class)).N6() ? 1 : 0, ((mm2.c1) buContext.a(mm2.c1.class)).f410346h2, ((mm2.c1) buContext.a(mm2.c1.class)).f410340g2, "", 0, 0, "anchorSticker", sb7);
        }
        return jz5.f0.f384359a;
    }
}
