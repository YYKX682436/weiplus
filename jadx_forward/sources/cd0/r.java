package cd0;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f122102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f122103e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f122104f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, boolean z17, java.lang.ref.WeakReference weakReference, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122102d = f9Var;
        this.f122103e = z17;
        this.f122104f = weakReference;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cd0.r(this.f122102d, this.f122103e, this.f122104f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        cd0.r rVar = (cd0.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        rVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        yb5.d dVar;
        android.app.Activity g17;
        android.content.res.Resources resources;
        yb5.d dVar2;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.ref.WeakReference weakReference = cd0.b0.f122059b;
        if (weakReference != null && (u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) weakReference.get()) != null) {
            u3Var.dismiss();
        }
        dh3.c cVar = dh3.c.f314022a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = this.f122102d;
        if (f9Var != null) {
            dh3.c.f314028g.entrySet().removeIf(new dh3.b(f9Var));
        }
        if (this.f122103e) {
            java.lang.String str = null;
            java.lang.ref.WeakReference weakReference2 = this.f122104f;
            android.app.Activity g18 = (weakReference2 == null || (dVar2 = (yb5.d) weakReference2.get()) == null) ? null : dVar2.g();
            if (weakReference2 != null && (dVar = (yb5.d) weakReference2.get()) != null && (g17 = dVar.g()) != null && (resources = g17.getResources()) != null) {
                str = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d48);
            }
            db5.t7.i(g18, str, com.p314xaae8f345.mm.R.raw.f80084xebd378da);
        }
        return jz5.f0.f384359a;
    }
}
