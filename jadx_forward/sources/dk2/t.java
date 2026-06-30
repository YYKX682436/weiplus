package dk2;

/* loaded from: classes10.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f315618a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public long f315619b;

    public final void a(r45.tt1 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        try {
            r45.b32 b32Var = (r45.b32) resp.m75936x14adae67(1);
            java.util.List list = b32Var != null ? b32Var.f452029d : null;
            if (list == null) {
                list = kz5.p0.f395529d;
            }
            java.util.ArrayList arrayList = this.f315618a;
            arrayList.clear();
            arrayList.addAll(list);
            this.f315619b = resp.m75942xfb822ef2(2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicPanelData", "updateMusicInfo version:" + this.f315619b + ", size:" + arrayList.size());
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "FinderLiveAnchorMusicPanelData updateMusicInfo");
        }
    }
}
