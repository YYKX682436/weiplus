package vw3;

/* loaded from: classes.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI f522418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.repairer.ui.BaseRepairerPrefUI baseRepairerPrefUI) {
        super(1);
        this.f522418d = baseRepairerPrefUI;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        hx3.b state = (hx3.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof hx3.a)) {
            java.lang.String m75945x2fec8307 = ((hx3.a) dVar).f367190b.m75945x2fec8307(1);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            this.f522418d.mo54450xbf7c1df6(m75945x2fec8307);
        }
        return jz5.f0.f384359a;
    }
}
