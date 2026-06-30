package h03;

/* loaded from: classes2.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 f359426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h03.q f359428f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 c24451x12373195, java.lang.String str, h03.q qVar) {
        super(0);
        this.f359426d = c24451x12373195;
        this.f359427e = str;
        this.f359428f = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = c03.i.a(this.f359426d);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LVFinderPlugin", "reportBulletComment finderItem is null");
        } else {
            java.lang.String str = this.f359427e;
            java.lang.Long j17 = r26.h0.j(str);
            if (j17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LVFinderPlugin", "reportBulletComment bulletId[" + str + "] is null");
            } else {
                android.app.Activity activity = this.f359428f.f359445f;
                if (activity != null) {
                    bd2.b.f100777a.f(activity, a17.m59251x5db1b11(), a17.m59229xb5af1dd5(), j17.longValue());
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
