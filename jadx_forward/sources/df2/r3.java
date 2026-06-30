package df2;

/* loaded from: classes3.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f312750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.u3 f312751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312752f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.u3 u3Var, java.lang.String str) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312750d = hVar;
        this.f312751e = u3Var;
        this.f312752f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.r3(this.f312750d, interfaceC29045xdcb5ca57, this.f312751e, this.f312752f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.r3 r3Var = (df2.r3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.m02 m02Var = (r45.m02) ((xg2.i) this.f312750d).f535926b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSetMicTopicController", "modifyMicTopic success");
        java.util.LinkedList m75941xfb821914 = m02Var.m75941xfb821914(1);
        if (m75941xfb821914 != null) {
            java.util.Iterator it = m75941xfb821914.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                boolean z17 = false;
                if (((r45.ix0) obj2).m75939xb282bd08(0) == 25) {
                    z17 = true;
                }
                if (z17) {
                    break;
                }
            }
            r45.ix0 ix0Var = (r45.ix0) obj2;
            if (ix0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSetMicTopicController", "modifyMicTopic result: " + ix0Var.m75939xb282bd08(1) + " msg: " + ix0Var.m75945x2fec8307(2));
            }
        }
        df2.u3 u3Var = this.f312751e;
        xh2.e eVar = (xh2.e) ((mm2.y2) u3Var.m56788xbba4bfc0(mm2.y2.class)).B.mo3195x754a37bb();
        if (eVar == null || (str = eVar.f536076a) == null) {
            str = "";
        }
        ((mm2.y2) u3Var.m56788xbba4bfc0(mm2.y2.class)).B.mo523x53d8522f(new xh2.e(str, this.f312752f, (eVar != null ? eVar.f536078c : -1L) + 1));
        android.content.Context O6 = u3Var.O6();
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
        e4Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.nve);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        e4Var.c();
        return jz5.f0.f384359a;
    }
}
