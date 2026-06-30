package df2;

/* loaded from: classes.dex */
public final class q3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f312663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.u3 f312664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, df2.u3 u3Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312663d = hVar;
        this.f312664e = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.q3(this.f312663d, interfaceC29045xdcb5ca57, this.f312664e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.q3 q3Var = (df2.q3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        q3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f312663d).f535914b;
        rm0.j jVar = aVar2.f535912a;
        int i17 = jVar != null ? jVar.f478958f : -1;
        if (jVar == null || (str = jVar.getMessage()) == null) {
            str = "";
        }
        rm0.j jVar2 = aVar2.f535912a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSetMicTopicController", "modifyMicTopic fail, errCode: " + i17 + " errType: " + (jVar2 != null ? jVar2.f478957e : -1) + " errMsg: " + str);
        boolean z17 = str.length() == 0;
        df2.u3 u3Var = this.f312664e;
        if (z17) {
            str = u3Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p0r);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        android.content.Context O6 = u3Var.O6();
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
        e4Var.f293309c = str;
        e4Var.b(com.p314xaae8f345.mm.R.raw.f79077x2e716e0d);
        e4Var.c();
        return jz5.f0.f384359a;
    }
}
