package it3;

/* loaded from: classes10.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 f376112d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2) {
        super(2);
        this.f376112d = activityC16983x775783e2;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2.f237144t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16983x775783e2 activityC16983x775783e2 = this.f376112d;
        activityC16983x775783e2.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((b92.u2) ((bg0.v) i95.n0.c(bg0.v.class))).getClass();
        java.lang.String Ai = t21.o2.Bi().Ai();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Ai, "getAccVideoPath(...)");
        sb6.append(Ai);
        sb6.append("/vsg_thumb_");
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String sb7 = sb6.toString();
        if (bitmap != null) {
            ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).getClass();
            if (dw3.c0.f325715a.B(bitmap, sb7, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K2().f152724d)) {
                z17 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "[onSave] success:" + z17 + " thumbPath:" + sb7);
                activityC16983x775783e2.runOnUiThread(new it3.q(z17, activityC16983x775783e2, sb7));
                return jz5.f0.f384359a;
            }
        }
        z17 = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderRedPacketCoverEditUI", "[onSave] success:" + z17 + " thumbPath:" + sb7);
        activityC16983x775783e2.runOnUiThread(new it3.q(z17, activityC16983x775783e2, sb7));
        return jz5.f0.f384359a;
    }
}
