package gz2;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f359267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f359269f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.List list, java.lang.String str, int i17) {
        super(0);
        this.f359267d = list;
        this.f359268e = str;
        this.f359269f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gz2.i iVar = gz2.i.f359273a;
        java.util.List<jz5.l> list = this.f359267d;
        java.lang.String str = this.f359268e;
        int i17 = this.f359269f;
        synchronized (iVar) {
            if (list != null) {
                for (jz5.l lVar : list) {
                    gz2.i.a(iVar, str, ((java.lang.String) lVar.f384366d) + '-' + ((java.lang.String) lVar.f384367e));
                }
            }
            gz2.i.a(iVar, str, "_totalCount_");
            gz2.i.f359277e.put(str, java.lang.Integer.valueOf(i17));
            if (gz2.i.f359278f == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveBatchReporter", "start");
                gz2.i.f359278f = p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.i2.f392010d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new gz2.h(iVar, null), 2, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
