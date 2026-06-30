package k14;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {
    public p(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new k14.p(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        k14.p pVar = new k14.p((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        pVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        k14.t tVar = k14.t.f384910a;
        com.p314xaae8f345.mm.udr.e0 e0Var = (com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class);
        tVar.d().getClass();
        com.p314xaae8f345.p3133xd0ce8b26.aff.udr.x Ui = ((com.p314xaae8f345.mm.udr.a1) e0Var).Ui("ilinkres_902ac54f", "hearing_aid_audio_zip");
        java.util.RandomAccess randomAccess = kz5.p0.f395529d;
        if (Ui != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HearingAidDownloadResource", "downloadResources local success");
            k14.t.f384912c.set(true);
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
            tVar.d().getClass();
            qVar.c("ilinkres_902ac54f");
            java.util.LinkedList linkedList = qVar.f299081e;
            if (linkedList != null) {
                linkedList.add("hearing_aid_audio_zip");
            }
            java.util.LinkedList linkedList2 = qVar.f299082f;
            if (linkedList2 != null) {
                java.util.RandomAccess mo14972x73ec24f3 = tVar.d().mo14972x73ec24f3();
                if (mo14972x73ec24f3 != null) {
                    randomAccess = mo14972x73ec24f3;
                }
                linkedList2.addAll(randomAccess);
            }
            ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Di(qVar, new k14.q());
        } else {
            k14.t.f384913d.set(true);
            com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q qVar2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.udr.q();
            tVar.d().getClass();
            qVar2.c("ilinkres_902ac54f");
            java.util.LinkedList linkedList3 = qVar2.f299081e;
            if (linkedList3 != null) {
                linkedList3.add("hearing_aid_audio_zip");
            }
            java.util.LinkedList linkedList4 = qVar2.f299082f;
            if (linkedList4 != null) {
                java.util.RandomAccess mo14972x73ec24f32 = tVar.d().mo14972x73ec24f3();
                if (mo14972x73ec24f32 != null) {
                    randomAccess = mo14972x73ec24f32;
                }
                linkedList4.addAll(randomAccess);
            }
            ((com.p314xaae8f345.mm.udr.a1) ((com.p314xaae8f345.mm.udr.e0) i95.n0.c(com.p314xaae8f345.mm.udr.e0.class))).Di(qVar2, new k14.r());
        }
        return jz5.f0.f384359a;
    }
}
