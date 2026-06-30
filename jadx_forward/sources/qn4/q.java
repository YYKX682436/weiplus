package qn4;

/* loaded from: classes12.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn4.t f446799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f446800e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446801f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qn4.a f446802g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(qn4.t tVar, java.lang.CharSequence charSequence, java.lang.String str, qn4.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f446799d = tVar;
        this.f446800e = charSequence;
        this.f446801f = str;
        this.f446802g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qn4.q(this.f446799d, this.f446800e, this.f446801f, this.f446802g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qn4.q qVar = (qn4.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        qVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        java.lang.Object m143895xf12298132;
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.String str = this.f446801f;
        qn4.t tVar = this.f446799d;
        tVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechController", "playWithIndependentPlayer: using independent StreamSilkPlayer");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(gm0.j1.b().f354778h.f354678e);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a c20976x6ba6452a = (com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) m143895xf1229813;
        if (c20976x6ba6452a == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TranslationSpeechController", "playWithIndependentPlayer: accountScope is null");
            throw new java.lang.IllegalStateException("Account scope not available");
        }
        pn4.q0 q0Var = new pn4.q0(tVar.f446813b, this.f446800e.toString(), str, c20976x6ba6452a);
        q0Var.l(r45.jy3.Translate, r45.iy3.CHINESE);
        tVar.f446825n = q0Var;
        y21.h hVar = tVar.f446824m;
        hVar.b(q0Var);
        try {
            c01.f b17 = c01.d9.b();
            boolean z17 = false;
            if (b17 != null && (p17 = b17.p()) != null) {
                z17 = p17.n(26, false);
            }
            m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.valueOf(z17));
        } catch (java.lang.Throwable th7) {
            p3321xbce91901.C29043x91b2b43d.Companion companion3 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf12298132 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th7));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf12298132);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TranslationSpeechController", "isForceSpeakOff error: " + m143898xd4a2fc34.getMessage());
            m143895xf12298132 = java.lang.Boolean.FALSE;
        }
        hVar.f(!((java.lang.Boolean) m143895xf12298132).booleanValue());
        hVar.c(new qn4.n(tVar, this.f446802g));
        hVar.d();
        return jz5.f0.f384359a;
    }
}
