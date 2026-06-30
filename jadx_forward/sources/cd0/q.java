package cd0;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f122098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f122099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f122100f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f122101g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(boolean z17, java.lang.ref.WeakReference weakReference, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122098d = z17;
        this.f122099e = weakReference;
        this.f122100f = h0Var;
        this.f122101g = f9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cd0.q(this.f122098d, this.f122099e, this.f122100f, this.f122101g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cd0.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.content.res.Resources s17;
        yb5.d dVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.ref.WeakReference weakReference = cd0.b0.f122059b;
        if (weakReference != null && (u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) weakReference.get()) != null) {
            u3Var.dismiss();
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (this.f122098d) {
            java.lang.String str = null;
            java.lang.ref.WeakReference weakReference2 = this.f122099e;
            if (((weakReference2 == null || (dVar = (yb5.d) weakReference2.get()) == null) ? null : dVar.g()) == null) {
                return f0Var;
            }
            yb5.d dVar2 = (yb5.d) weakReference2.get();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(dVar2 != null ? dVar2.g() : null);
            u1Var.g((java.lang.String) this.f122100f.f391656d);
            yb5.d dVar3 = (yb5.d) weakReference2.get();
            if (dVar3 != null && (s17 = dVar3.s()) != null) {
                str = s17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
            }
            u1Var.n(str);
            u1Var.l(cd0.p.f122097a);
            u1Var.q(false);
        }
        dh3.c cVar = dh3.c.f314022a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f122101g;
        if (f9Var != null) {
            dh3.c.f314028g.entrySet().removeIf(new dh3.b(f9Var));
        }
        return f0Var;
    }
}
