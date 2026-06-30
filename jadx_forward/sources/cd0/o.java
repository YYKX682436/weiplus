package cd0;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f122092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f122093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f122094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f122095g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f122096h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.ref.WeakReference weakReference, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, com.p314xaae8f345.mm.p944x882e457a.f fVar, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122092d = weakReference;
        this.f122093e = c0Var;
        this.f122094f = fVar;
        this.f122095g = z17;
        this.f122096h = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cd0.o(this.f122092d, this.f122093e, this.f122094f, this.f122095g, this.f122096h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cd0.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yb5.d dVar;
        android.content.res.Resources s17;
        android.content.res.Resources s18;
        yb5.d dVar2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.ref.WeakReference weakReference = cd0.b0.f122059b;
        if (weakReference != null && (u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) weakReference.get()) != null) {
            u3Var.dismiss();
        }
        java.lang.String str = null;
        str = null;
        str = null;
        java.lang.ref.WeakReference weakReference2 = this.f122092d;
        android.app.Activity g17 = (weakReference2 == null || (dVar2 = (yb5.d) weakReference2.get()) == null) ? null : dVar2.g();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (g17 == null) {
            return f0Var;
        }
        boolean z17 = this.f122093e.f391645d;
        boolean z18 = this.f122095g;
        if (z17) {
            com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f122094f;
            java.lang.String str2 = ((r45.og) fVar.f152151d).f463764d;
            if (!(str2 == null || str2.length() == 0) && z18) {
                yb5.d dVar3 = (yb5.d) weakReference2.get();
                db5.e1.s(dVar3 != null ? dVar3.g() : null, ((r45.og) fVar.f152151d).f463764d, "");
                return f0Var;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = this.f122096h;
        if (f0Var2.f391649d > 0 && z18) {
            yb5.d dVar4 = (yb5.d) weakReference2.get();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(dVar4 != null ? dVar4.g() : null);
            yb5.d dVar5 = (yb5.d) weakReference2.get();
            u1Var.g((dVar5 == null || (s18 = dVar5.s()) == null) ? null : s18.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nhb, new java.lang.Integer(f0Var2.f391649d)));
            if (weakReference2 != null && (dVar = (yb5.d) weakReference2.get()) != null && (s17 = dVar.s()) != null) {
                str = s17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571987vi);
            }
            u1Var.n(str);
            u1Var.l(cd0.n.f122091a);
            u1Var.q(false);
        }
        return f0Var;
    }
}
