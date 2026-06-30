package ih1;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ih1.u f373051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ih1.u uVar) {
        super(0);
        this.f373051d = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.i0) this.f373051d.f373064b;
        i0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandServiceWC", "[MBAd] getGlobalNativeWidgetHandler");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 t37 = i0Var.f170218a.t3();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.z zVar = (t37 == null || !t37.J0()) ? null : t37.D1;
        if (zVar != null) {
            zVar.B(frameLayout);
        }
        return frameLayout;
    }
}
