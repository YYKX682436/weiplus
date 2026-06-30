package xk2;

/* loaded from: classes10.dex */
public final class b implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xk2.c f536547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f536548e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f536549f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f536550g;

    public b(xk2.c cVar, java.lang.String str, java.lang.String str2, v65.n nVar) {
        this.f536547d = cVar;
        this.f536548e = str;
        this.f536549f = str2;
        this.f536550g = nVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnPreparedListener
    /* renamed from: onPrepared */
    public final void mo53283x58d5b73c(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6) {
        this.f536547d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveBgmPlayer", "prepareAsync done  " + this.f536548e + ", " + this.f536549f);
        this.f536550g.a(java.lang.Boolean.TRUE);
    }
}
