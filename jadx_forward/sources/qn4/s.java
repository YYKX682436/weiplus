package qn4;

/* loaded from: classes12.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f446806d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f446807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qn4.a f446808f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qn4.t f446809g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f446810h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446811i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(qn4.a aVar, qn4.t tVar, java.lang.CharSequence charSequence, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f446808f = aVar;
        this.f446809g = tVar;
        this.f446810h = charSequence;
        this.f446811i = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        qn4.s sVar = new qn4.s(this.f446808f, this.f446809g, this.f446810h, this.f446811i, interfaceC29045xdcb5ca57);
        sVar.f446807e = obj;
        return sVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qn4.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        qn4.a aVar;
        pz5.a aVar2 = pz5.a.f440719d;
        int i17 = this.f446806d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        try {
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            aVar = this.f446808f;
            qn4.t tVar = this.f446809g;
            java.lang.CharSequence charSequence = this.f446810h;
            java.lang.String str = this.f446811i;
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            qn4.q qVar = new qn4.q(tVar, charSequence, str, aVar, null);
            this.f446807e = aVar;
            this.f446806d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, qVar, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return f0Var;
            }
            aVar = (qn4.a) this.f446807e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        ((qn4.w) aVar).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TranslationSpeechMenuItem", "onSpeechStart");
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TranslationSpeechController", "Start speech failed", m143898xd4a2fc34);
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            qn4.r rVar = new qn4.r(this.f446809g, this.f446808f, m143898xd4a2fc34, null);
            this.f446807e = m143895xf1229813;
            this.f446806d = 2;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, rVar, this) == aVar2) {
                return aVar2;
            }
        }
        return f0Var;
    }
}
