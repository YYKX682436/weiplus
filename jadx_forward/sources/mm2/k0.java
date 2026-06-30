package mm2;

/* loaded from: classes3.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f410720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nn1 f410721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.l0 f410722f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(r45.nn1 nn1Var, mm2.l0 l0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f410721e = nn1Var;
        this.f410722f = l0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mm2.k0(this.f410721e, this.f410722f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f410720d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.i30 i30Var = (r45.i30) this.f410721e.m75936x14adae67(4);
            java.lang.String N6 = this.f410722f.N6(i30Var);
            if ((N6 == null || N6.length() == 0) || i30Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveCheerAnimationSlice", "checkPreload return, getPagPath error : " + N6 + " resource: " + i30Var);
                return f0Var;
            }
            java.lang.String e17 = kk.k.e(N6);
            if (com.p314xaae8f345.mm.vfs.w6.j(N6)) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i30Var.m75945x2fec8307(1), e17)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveCheerAnimationSlice", "checkPreload return, file exists : " + N6 + " tempMd5: " + e17);
                    return f0Var;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveCheerAnimationSlice", "checkPreload file not valid, tempMd5: " + e17);
                com.p314xaae8f345.mm.vfs.w6.h(N6);
            }
            wh2.l lVar = wh2.l.f527488a;
            java.lang.String m75945x2fec8307 = i30Var.m75945x2fec8307(0);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            this.f410720d = 1;
            obj = lVar.a(m75945x2fec8307, N6, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveCheerAnimationSlice", "checkPreload result: " + ((wh2.i) obj));
        return f0Var;
    }
}
