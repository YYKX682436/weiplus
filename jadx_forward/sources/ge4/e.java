package ge4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f352521a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f352522b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f352523c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f352524d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f352525e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f352526f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f352527g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f352528h = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));

    /* renamed from: i, reason: collision with root package name */
    public boolean f352529i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.l f352530j;

    /* renamed from: k, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f352531k;

    /* renamed from: l, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.f3 f352532l;

    public e() {
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a17 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(new jz5.l(-1, new android.os.Bundle()));
        this.f352531k = a17;
        this.f352532l = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.b(a17);
    }

    public final void a(jz5.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emitEvent", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        p3325xe03a0797.p3326xc267989b.l.d(this.f352528h, null, null, new ge4.b(this, lVar, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emitEvent", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
    }

    public final java.util.ArrayList b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getErrorMediaIds", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f352526f.iterator();
        while (it.hasNext()) {
            java.lang.String h17 = ((ge4.a) it.next()).b().h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h17);
            arrayList.add(h17);
        }
        java.util.Iterator it6 = this.f352525e.iterator();
        while (it6.hasNext()) {
            java.lang.String h18 = ((ge4.a) it6.next()).b().h();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h18);
            arrayList.add(h18);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getErrorMediaIds", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
        return arrayList;
    }
}
