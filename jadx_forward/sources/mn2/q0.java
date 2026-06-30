package mn2;

/* loaded from: classes10.dex */
public final class q0 implements c50.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f411625a = "FinderDownloader@" + hashCode();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f411626b = new java.util.concurrent.ConcurrentHashMap();

    public static final void b(c50.z0 z0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, mn2.q0 q0Var, java.lang.String str, int i17) {
        z0Var.a(c14994x9b99c079.m59251x5db1b11(), i17, "");
        q0Var.f411626b.remove(str);
    }

    public void c(java.lang.String mediaId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        dn.m mVar = (dn.m) this.f411626b.remove(mediaId);
        if (mVar != null) {
            ek4.s Di = ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di();
            java.lang.String field_mediaId = mVar.f69601xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            Di.j(field_mediaId, new mn2.p0(this, mVar));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f411625a, "stopDownloadFinderVideo " + mVar);
        }
    }
}
