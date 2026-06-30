package fg1;

/* loaded from: classes7.dex */
public final class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fg1.u f343424c;

    public t(fg1.u uVar) {
        this.f343424c = uVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc
    public boolean a(android.view.KeyEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.AppBrandVideoCastHandler", "volume up");
        fg1.u uVar = this.f343424c;
        gg1.c1 b17 = uVar.b();
        fg1.s sVar = new fg1.s(uVar);
        b17.getClass();
        x91.h b18 = b17.f353072e.b();
        gg1.b0 b0Var = new gg1.b0(b17, sVar);
        x91.l lVar = b18.f534183d;
        if (lVar == null) {
            return true;
        }
        b18.f534181b.g(new w91.c(b18.a(lVar), b18.f534183d.f534197a), b0Var);
        return true;
    }
}
