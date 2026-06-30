package yf1;

/* loaded from: classes7.dex */
public final class o implements pd1.j {

    /* renamed from: a, reason: collision with root package name */
    public final wf.b f543184a;

    /* renamed from: b, reason: collision with root package name */
    public final yf1.n f543185b = new yf1.n(this, null);

    public o(wf.b bVar) {
        this.f543184a = bVar;
    }

    public boolean a() {
        return this.f543184a.V.get();
    }

    public boolean b(int i17, int i18) {
        wf.b bVar = this.f543184a;
        bVar.w();
        if (i17 == 0 || i18 == 0 || bVar.f526951i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(bVar.w(), "setSurfaceSize, Adapter is null");
            return false;
        }
        if (bVar.V.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.w(), "setSurfaceSize, JustPlayAudio");
        } else {
            bVar.f526951i.mo173673x1c9cdc8c(i17, i18);
        }
        return true;
    }

    @Override // pd1.j
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, pd1.i iVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.t mo50357xcd94f799 = v5Var.mo50357xcd94f799();
        wf.b bVar = this.f543184a;
        if (mo50357xcd94f799 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getVideoPositionAsync, null == jsRuntime");
            iVar.a(bVar.f526959s, bVar.f526960t);
            return;
        }
        java.lang.String str = "document.querySelector('embed[embed-id=\"" + bVar.f334030d + "\"]').getBoundingClientRect().toJSON()";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.XWebLivePlayerOriginVideoContainer", "getVideoPositionAsync, jsScript: " + str);
        mo50357xcd94f799.mo14660x738236e6(str, new yf1.l(this, iVar));
    }

    @Override // pd1.j
    public int i() {
        return this.f543184a.f526957q;
    }

    @Override // pd1.j
    /* renamed from: isPlaying */
    public boolean mo129535xc00617a4() {
        wf.a aVar = this.f543184a.f526951i;
        if (aVar == null) {
            return false;
        }
        return aVar.mo173671xc00617a4();
    }

    @Override // pd1.j
    public int k() {
        return this.f543184a.f526958r;
    }

    @Override // pd1.j
    public android.graphics.Point m() {
        wf.b bVar = this.f543184a;
        return new android.graphics.Point(bVar.f526959s, bVar.f526960t);
    }

    @Override // pd1.j
    public pd1.o n() {
        return this.f543185b;
    }
}
