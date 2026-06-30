package te3;

/* loaded from: classes5.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.sns.ActivityC16463xebab0e3 f500108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500109e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.sns.ActivityC16463xebab0e3 activityC16463xebab0e3, java.lang.String str) {
        super(0);
        this.f500108d = activityC16463xebab0e3;
        this.f500109e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f500109e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.sns.ActivityC16463xebab0e3 activityC16463xebab0e3 = this.f500108d;
        int i17 = activityC16463xebab0e3.f229670f;
        activityC16463xebab0e3.f229670f = i17 + 1;
        android.util.DisplayMetrics displayMetrics = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDisplayMetrics();
        float f17 = displayMetrics.widthPixels - 50.0f;
        float f18 = displayMetrics.heightPixels - 50.0f;
        ((v12.i) ((aq0.g) i95.n0.c(aq0.g.class))).Ai(new aq0.h(java.lang.String.valueOf(i17), java.lang.System.currentTimeMillis(), new android.graphics.RectF(f17 - 50.0f, f18 - 50.0f, f17, f18), aq0.e.f94546e, str, "", true, activityC16463xebab0e3.f229671g.c()));
        return jz5.f0.f384359a;
    }
}
