package dk2;

/* loaded from: classes10.dex */
public final class u9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.ca f315735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315736e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f315737f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315738g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315739h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dn.h f315740i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315741m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(dk2.ca caVar, java.lang.String str, int i17, java.lang.String str2, yz5.l lVar, dn.h hVar, yz5.l lVar2) {
        super(0);
        this.f315735d = caVar;
        this.f315736e = str;
        this.f315737f = i17;
        this.f315738g = str2;
        this.f315739h = lVar;
        this.f315740i = hVar;
        this.f315741m = lVar2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dk2.ca caVar = this.f315735d;
        java.util.Map map = caVar.f314825b;
        java.lang.String str = this.f315736e;
        if (map.containsKey(str)) {
            int i17 = this.f315737f;
            if (i17 == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDownloadSuccess, mediaId: ");
                sb6.append(str);
                sb6.append(", path: ");
                java.lang.String str2 = this.f315738g;
                sb6.append(str2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", sb6.toString());
                if (str == null) {
                    str = "";
                }
                caVar.a(str);
                this.f315739h.mo146xb9724478(str2);
            } else {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("download failed, mediaId: ");
                sb7.append(str);
                sb7.append(", ret: ");
                sb7.append(i17);
                sb7.append(", sceneResult: ");
                dn.h hVar = this.f315740i;
                sb7.append(hVar != null ? java.lang.Integer.valueOf(hVar.f69553xb5f54fe9) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVReplayDownloadManager", sb7.toString());
                if (str == null) {
                    str = "";
                }
                caVar.a(str);
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("Download failed: ret=");
                sb8.append(i17);
                sb8.append(", sceneRetCode=");
                sb8.append(hVar != null ? java.lang.Integer.valueOf(hVar.f69553xb5f54fe9) : null);
                this.f315741m.mo146xb9724478(sb8.toString());
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVReplayDownloadManager", "onFinish, task not exists. mediaId: " + str);
        }
        return jz5.f0.f384359a;
    }
}
