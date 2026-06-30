package ko2;

/* loaded from: classes2.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ko2.f f391460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ik4 f391461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f391462f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ko2.f fVar, r45.ik4 ik4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(1);
        this.f391460d = fVar;
        this.f391461e = ik4Var;
        this.f391462f = abstractC14490x69736cb5;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204176d;
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        mo2.q qVar = (mo2.q) this.f391460d;
        qVar.getClass();
        r45.ik4 user = this.f391461e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(user, "user");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item = this.f391462f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (!z17) {
            java.lang.String m75945x2fec8307 = user.m75945x2fec8307(3);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Nickname", user.m75945x2fec8307(0));
                intent.putExtra("FeedId", item.getFeedObject().m59251x5db1b11());
                intent.putExtra("DupFlag", item.w());
                intent.putExtra("memberProviderUsername", qVar.f411923g);
                intent.putExtra("showInteraction", true);
                intent.putExtra("Username", user.m75945x2fec8307(1));
                if (user.m75939xb282bd08(2) == 2) {
                    intent.putExtra("V5UserName", user.m75945x2fec8307(1));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1568xba823be6.c cVar = qVar.f411921e;
                if (cVar != null && (f204176d = cVar.getF204176d()) != null) {
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.sl((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17, f204176d, null, intent, 9, null, 16, null);
                }
            } else {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = qVar.f411922f;
                if (activityC0065xcd7aa112 != null) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("finder_username", user.m75945x2fec8307(3));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1, activityC0065xcd7aa112, intent2, item.getFeedObject().m59251x5db1b11(), null, 0, 5, false, 0, item.w(), 192, null);
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(activityC0065xcd7aa112, intent2);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
