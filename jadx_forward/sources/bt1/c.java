package bt1;

/* loaded from: classes4.dex */
public final class c implements en1.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bt1.d f105679d;

    public c(bt1.d dVar) {
        this.f105679d = dVar;
    }

    @Override // en1.j
    /* renamed from: onAuthResponse */
    public void mo8828x48bdb988(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Byp.BypService", "[onAuthResponse] autoAuth=" + z17);
        bt1.l lVar = this.f105679d.f105680d;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("syncExtension");
            throw null;
        }
        java.util.List list = bt1.a.f105676a;
        bt1.l.b(lVar, bt1.a.f105677b, bt1.g.f105685e, false, 0, 12, null);
    }

    @Override // en1.j
    /* renamed from: onRegResponse */
    public void mo8829x6279e596(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
    }
}
