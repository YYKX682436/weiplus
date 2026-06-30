package y14;

/* loaded from: classes5.dex */
public final class f implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y14.e f540439b;

    public f(java.lang.String str, y14.e eVar) {
        this.f540438a = str;
        this.f540439b = eVar;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        y14.e eVar = this.f540439b;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("YuanBaoAvatarDownloadHelper", "downloadImage failed");
            if (eVar != null) {
                ((y14.i) eVar).a();
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadImage success: ");
        java.lang.String filePath = this.f540438a;
        sb6.append(filePath);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("YuanBaoAvatarDownloadHelper", sb6.toString());
        if (eVar != null) {
            y14.i iVar = (y14.i) eVar;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
            ym5.a1.f(new y14.h(iVar.f540445a, filePath, iVar.f540446b));
        }
    }
}
