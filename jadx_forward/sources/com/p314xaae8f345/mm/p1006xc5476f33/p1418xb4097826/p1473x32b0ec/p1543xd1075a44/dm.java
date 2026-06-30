package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes15.dex */
public final class dm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f199664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f f199665e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c14400x1527540f, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f199665e = c14400x1527540f;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dm(this.f199665e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dm) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f199664d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f c14400x1527540f = this.f199665e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f.f199173r;
            if (!c14400x1527540f.e()) {
                return f0Var;
            }
            long j17 = c14400x1527540f.f199180m;
            this.f199664d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec = c14400x1527540f.f199176f;
        if (c14410xbcb3c9ec == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
            throw null;
        }
        int m8300xfda78ef6 = c14410xbcb3c9ec.m8300xfda78ef6() + 1;
        f0Var2.f391649d = m8300xfda78ef6;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
        c0Var.f391645d = true;
        if (m8300xfda78ef6 >= c14400x1527540f.f199182o.size()) {
            c0Var.f391645d = false;
            f0Var2.f391649d = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c14400x1527540f.f199174d, "[startAutoScroll] targetPos = " + f0Var2.f391649d + ", needSmooth = " + c0Var.f391645d);
        if (f0Var2.f391649d == c14400x1527540f.f199182o.size() - 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f.b(c14400x1527540f);
            c14400x1527540f.f199178h.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bm(c14400x1527540f, f0Var2, c0Var));
        } else {
            int i19 = f0Var2.f391649d;
            if (i19 == 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14400x1527540f.a(c14400x1527540f);
                c14400x1527540f.f199179i.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cm(c14400x1527540f, f0Var2, c0Var));
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14410xbcb3c9ec c14410xbcb3c9ec2 = c14400x1527540f.f199176f;
                if (c14410xbcb3c9ec2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                    throw null;
                }
                c14410xbcb3c9ec2.m8317x940d026a(i19, c0Var.f391645d);
            }
        }
        return f0Var;
    }
}
