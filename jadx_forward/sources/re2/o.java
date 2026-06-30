package re2;

/* loaded from: classes2.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f475989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f475990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f475991f;

    public o(java.lang.String str, yz5.l lVar, yz5.p pVar) {
        this.f475989d = str;
        this.f475990e = lVar;
        this.f475991f = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f475989d;
        if (str == null || str.length() == 0) {
            this.f475991f.mo149xb9724478(-1, "cdn upload failed");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveAvatarMerger", "doUpload: ok, remoteUrl=".concat(r26.p0.E0(str, 80)));
            this.f475990e.mo146xb9724478(str);
        }
    }
}
