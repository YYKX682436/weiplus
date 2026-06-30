package gz0;

/* loaded from: classes13.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gz0.h f359192d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(gz0.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f359192d = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gz0.f(this.f359192d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gz0.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 m101082x5f9ba979;
        com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6;
        jz5.f0 f0Var = jz5.f0.f384359a;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        gz0.h hVar = this.f359192d;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayer", "startPlay: start create tpPlayer");
            m101082x5f9ba979 = com.p314xaae8f345.p3006xb8ff1437.api.C26184x9df96dcd.m101082x5f9ba979(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (m101082x5f9ba979 == null) {
            return f0Var;
        }
        hVar.f359198e = m101082x5f9ba979;
        long j17 = hVar.f359195b;
        java.lang.String str = hVar.f359194a;
        gz0.d dVar = hVar.f359199f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicPlayer", "startPlay: start set params url " + str + ", startTime:" + j17 + " endTime:" + hVar.f359196c);
        m101082x5f9ba979.mo100945x683d6267(str);
        m101082x5f9ba979.mo100957x5dd7c812(dVar);
        m101082x5f9ba979.mo100955x40f8c003(dVar);
        m101082x5f9ba979.mo100956xa23b7bf3(dVar);
        m101082x5f9ba979.mo100951xa4560c71(dVar);
        m101082x5f9ba979.mo100954x6954c27b(dVar);
        m101082x5f9ba979.mo100968x1ba09fea(new com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1().m101062xac7b1a0a(100, j17));
        m101082x5f9ba979.mo100948xfd27780d(true, hVar.f359195b, hVar.f359196c);
        m101082x5f9ba979.mo100932x857611b5();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe c6229x2bb765fe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6229x2bb765fe();
        c6229x2bb765fe.e();
        if ((c6229x2bb765fe.f136476g.f89780c || iq.b.H()) && (interfaceC26164x73fc6bc6 = hVar.f359198e) != null) {
            interfaceC26164x73fc6bc6.mo100940x3aa51598(0.0f);
        }
        p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        return f0Var;
    }
}
