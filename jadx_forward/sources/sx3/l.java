package sx3;

/* loaded from: classes10.dex */
public final class l implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sx3.m f495096a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f495097b;

    public l(sx3.m mVar, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f495096a = mVar;
        this.f495097b = activityC0065xcd7aa112;
    }

    @Override // in5.y0
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.w0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pf5.o.TAG, "onScrollStatsChanged");
        java.util.LinkedList linkedList = data.f374689i;
        if (!linkedList.isEmpty()) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f495096a.mo144225x95f74600(), null, null, new sx3.k(linkedList, this.f495097b, null), 3, null);
        }
    }
}
