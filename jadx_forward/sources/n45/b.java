package n45;

/* loaded from: classes8.dex */
public final class b extends n23.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f416617d = new java.util.ArrayList();

    @Override // n23.a
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveNoticeMsgItemProcessor", "[reportFetchResult] errCode = " + i17);
        if (i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21158, "", "", "", 7);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21158, "", "", "", 8);
        }
    }

    @Override // n23.a, n23.k
    public void b(jz5.l item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        synchronized (this.f416617d) {
            java.lang.Object obj = item.f384366d;
            int i17 = ((qk.h6) ((l23.a) obj)).f66763x28ef0850;
            java.lang.String str = ((qk.h6) ((l23.a) obj)).f66769xf47740ff;
            if (this.f416617d.isEmpty()) {
                pm0.v.P("FinderLiveNoticeMsgItemProcessor", false, new n45.a(this), 1000L);
            }
            this.f416617d.add(item);
        }
    }
}
