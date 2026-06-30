package xx3;

/* loaded from: classes10.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f539544d;

    /* renamed from: e, reason: collision with root package name */
    public int f539545e;

    public f(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xx3.f(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new xx3.f((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        vx3.i d17;
        t45.n0 n0Var;
        t45.f0 f0Var;
        t45.g gVar;
        t45.f fVar;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f539545e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (xx3.h.a()) {
                java.lang.String r17 = c01.z1.r();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
                d17 = mx3.i0.d(r17);
                if (d17 == null) {
                    return null;
                }
                t45.n0 n0Var2 = d17.f522822f;
                java.lang.Integer num = n0Var2 != null ? new java.lang.Integer(n0Var2.f497148d) : null;
                if (num != null && num.intValue() == 2) {
                    t45.n0 n0Var3 = d17.f522822f;
                    if (n0Var3 == null || (gVar = n0Var3.f497150f) == null || (fVar = gVar.f497093d) == null) {
                        return null;
                    }
                    long j17 = fVar.f497082d;
                    if (n0Var3 == null || gVar == null || fVar == null || (str = fVar.f497083e) == null) {
                        return null;
                    }
                    this.f539544d = d17;
                    this.f539545e = 1;
                    obj = xx3.h.b(j17, str, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (num != null && num.intValue() == 1 && (n0Var = d17.f522822f) != null && (f0Var = n0Var.f497149e) != null && f0Var.f497084d != null) {
                    return new nx3.b(1, (int) d17.f522818b, (int) d17.f522819c, false, d17);
                }
            }
            return null;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vx3.i iVar = (vx3.i) this.f539544d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        d17 = iVar;
        xx3.a aVar2 = (xx3.a) obj;
        if (aVar2 == null) {
            return null;
        }
        d17.f522820d = aVar2.f539526a;
        boolean z17 = aVar2.f539527b;
        if (z17) {
            return null;
        }
        return new nx3.b(2, (int) d17.f522818b, (int) d17.f522819c, z17, d17);
    }
}
