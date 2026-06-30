package sp2;

/* loaded from: classes2.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(sp2.o2 o2Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492589d = o2Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sp2.j0(this.f492589d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        sp2.j0 j0Var = (sp2.j0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "#[AutoPlayCheck]checkAutoPlayAfterRecyclerViewChanged animation hasn't running.");
        sp2.o2 o2Var = this.f492589d;
        up2.m mVar = o2Var.f492693v;
        if (mVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = o2Var.f492672j;
            if (c14595xffb7e034 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            mVar.a(c14595xffb7e034);
        }
        return jz5.f0.f384359a;
    }
}
