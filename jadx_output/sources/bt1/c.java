package bt1;

/* loaded from: classes4.dex */
public final class c implements en1.j {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bt1.d f24146d;

    public c(bt1.d dVar) {
        this.f24146d = dVar;
    }

    @Override // en1.j
    public void onAuthResponse(o45.ug ugVar, o45.vg vgVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("Byp.BypService", "[onAuthResponse] autoAuth=" + z17);
        bt1.l lVar = this.f24146d.f24147d;
        if (lVar == null) {
            kotlin.jvm.internal.o.o("syncExtension");
            throw null;
        }
        java.util.List list = bt1.a.f24143a;
        bt1.l.b(lVar, bt1.a.f24144b, bt1.g.f24152e, false, 0, 12, null);
    }

    @Override // en1.j
    public void onRegResponse(o45.ci ciVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18) {
    }
}
