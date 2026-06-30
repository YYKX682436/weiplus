package mm3;

/* loaded from: classes10.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ss4 f411178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm3.n f411179f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r45.ss4 ss4Var, mm3.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f411178e = ss4Var;
        this.f411179f = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm3.j(this.f411178e, this.f411179f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm3.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.hf2 hf2Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f411177d;
        mm3.n nVar = this.f411179f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            mm3.i iVar = new mm3.i(nVar, null);
            this.f411177d = 1;
            obj = p3325xe03a0797.p3326xc267989b.l.g(p0Var, iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.List tracks = (java.util.List) obj;
        r45.ef2 ef2Var = (r45.ef2) this.f411178e.m75936x14adae67(5);
        java.lang.Long l17 = (ef2Var == null || (hf2Var = (r45.hf2) ef2Var.m75936x14adae67(1)) == null) ? null : new java.lang.Long(hf2Var.m75939xb282bd08(14));
        if (l17 == null) {
            throw new java.lang.IllegalStateException("Couldn't get the duration of song".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea0 = nVar.f411186d;
        if (c16708x2eab1ea0 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tracksEditView");
            throw null;
        }
        long longValue = l17.longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tracks, "tracks");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MvTracksEditView", "update: " + tracks.size() + " tracks, songDuration=" + longValue + ", thumbDuration=" + (c16708x2eab1ea0.f233546f / c16708x2eab1ea0.mo67411xf6b910ea()));
        c16708x2eab1ea0.f233550m = tracks;
        c16708x2eab1ea0.f233561x = longValue;
        c16708x2eab1ea0.f233558u.f491391n = longValue;
        c16708x2eab1ea0.b();
        c16708x2eab1ea0.f233557t.a(c16708x2eab1ea0.f233562y);
        c16708x2eab1ea0.e();
        c16708x2eab1ea0.f233560w.f491364p.clear();
        c16708x2eab1ea0.f233545e.setVisibility(0);
        c16708x2eab1ea0.f233544d.D0();
        c16708x2eab1ea0.f233547g.m8146xced61ae5();
        int i18 = 0;
        for (java.lang.Object obj2 : tracks) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1923xd1075a44.C16708x2eab1ea0 c16708x2eab1ea02 = nVar.f411186d;
            if (c16708x2eab1ea02 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tracksEditView");
                throw null;
            }
            java.util.LinkedList linkedList = nVar.f411190h;
            if (linkedList == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trackList");
                throw null;
            }
            java.lang.String m75945x2fec8307 = ((r45.jf2) linkedList.get(i18)).m75945x2fec8307(10);
            c16708x2eab1ea02.c(i18, !(m75945x2fec8307 == null || m75945x2fec8307.length() == 0));
            i18 = i19;
        }
        return jz5.f0.f384359a;
    }
}
