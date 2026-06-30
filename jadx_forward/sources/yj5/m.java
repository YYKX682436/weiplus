package yj5;

/* loaded from: classes8.dex */
public final class m implements com.p314xaae8f345.mm.ui.s9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yj5.p f544254d;

    public m(yj5.p pVar) {
        this.f544254d = pVar;
    }

    @Override // com.p314xaae8f345.mm.ui.s9
    public final void j(java.lang.String str) {
        yj5.p pVar = this.f544254d;
        java.lang.String x17 = pVar.f280113d.x();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(x17, str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveTipsBarProcessor", "liveTipsBarStorage notify, hostRoomId:%s", x17);
            pVar.o0();
        }
    }
}
