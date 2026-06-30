package g41;

/* loaded from: classes3.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f350237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g41.f f350238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(boolean z17, g41.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f350237d = z17;
        this.f350238e = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new g41.c(this.f350237d, this.f350238e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        g41.c cVar = (g41.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f350237d;
        g41.f fVar = this.f350238e;
        if (z17) {
            java.lang.Object mo141623x754a37bb = ((jz5.n) fVar.f350243b).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
            com.p314xaae8f345.mm.p980x69aca1b.p982x5b09653.C11206x8495c06e c11206x8495c06e = (com.p314xaae8f345.mm.p980x69aca1b.p982x5b09653.C11206x8495c06e) mo141623x754a37bb;
            if (!c11206x8495c06e.f153799o) {
                c11206x8495c06e.f153799o = true;
                int i17 = c11206x8495c06e.f153798n;
                for (int i18 = 0; i18 < i17; i18++) {
                    c11206x8495c06e.f153801q[i18] = (float) ((java.lang.Math.random() * 0.8d) + 0.2d);
                }
                c11206x8495c06e.invalidate();
            }
        } else {
            java.lang.Object mo141623x754a37bb2 = ((jz5.n) fVar.f350243b).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
            ((com.p314xaae8f345.mm.p980x69aca1b.p982x5b09653.C11206x8495c06e) mo141623x754a37bb2).f153799o = false;
        }
        return jz5.f0.f384359a;
    }
}
