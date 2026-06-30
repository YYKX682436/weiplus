package ni2;

/* loaded from: classes10.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ni2.k0 f418876e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ni2.k0 k0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f418876e = k0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ni2.j0(this.f418876e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ni2.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        xh2.a aVar;
        java.lang.Object obj2;
        java.lang.Integer num;
        java.lang.String str;
        pz5.a aVar2 = pz5.a.f440719d;
        int i17 = this.f418875d;
        ni2.k0 k0Var = this.f418876e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (((mm2.e1) k0Var.f418883h.a(mm2.e1.class)).g7() && (aVar = k0Var.f418888p) != null) {
                java.util.Set entrySet = k0Var.f418886n.entrySet();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
                java.util.Iterator it = entrySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((xh2.a) ((java.util.Map.Entry) obj2).getValue()).b(), aVar.b())) {
                        break;
                    }
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
                if (entry == null || (num = (java.lang.Integer) entry.getKey()) == null) {
                    num = 0;
                }
                int intValue = num.intValue();
                fj2.s sVar = fj2.s.f344716a;
                ml2.w4 w4Var = ml2.w4.f409729q;
                km2.q qVar = aVar.f536053a;
                if (qVar == null || (str = qVar.f390705c) == null) {
                    str = "";
                }
                sVar.g(w4Var, str, aVar.f536054b.f536086e, intValue);
            }
            lj2.x0 x0Var = k0Var.f418884i;
            java.util.HashMap hashMap = k0Var.f418886n;
            this.f418875d = 1;
            obj = x0Var.M(hashMap, this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            k0Var.a();
        }
        return jz5.f0.f384359a;
    }
}
