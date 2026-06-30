package ju2;

/* loaded from: classes2.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 f383343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f383344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f383345f;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        this.f383343d = c15003x1d0c0ec1;
        this.f383344e = h0Var;
        this.f383345f = abstractC14490x69736cb5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1 = this.f383343d;
        if (c15003x1d0c0ec1 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) this.f383344e.f391656d;
            jz5.f0 f0Var = null;
            if (c19781xd1c47b87 != null) {
                java.lang.String m76102x6c03c64c = c19781xd1c47b87.m76102x6c03c64c();
                if (m76102x6c03c64c == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FeedFullConvert", "commentInfoToThank.username is null");
                } else {
                    c15003x1d0c0ec1.setVisibility(0);
                    android.content.Context context = c15003x1d0c0ec1.getContext();
                    java.lang.Integer valueOf = context != null ? java.lang.Integer.valueOf(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561066an1)) : null;
                    android.content.Context context2 = c15003x1d0c0ec1.getContext();
                    java.lang.Integer valueOf2 = context2 != null ? java.lang.Integer.valueOf(context2.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh)) : null;
                    android.content.Context context3 = c15003x1d0c0ec1.getContext();
                    java.lang.Integer valueOf3 = context3 != null ? java.lang.Integer.valueOf(context3.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abx)) : null;
                    android.content.Context context4 = c15003x1d0c0ec1.getContext();
                    java.lang.String string = context4 != null ? context4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.nx9) : null;
                    android.content.Context context5 = c15003x1d0c0ec1.getContext();
                    ju2.q qVar = new ju2.q(0, 0L, valueOf, valueOf2, valueOf3, null, 500, string, context5 != null ? java.lang.Integer.valueOf(context5.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh)) : null, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f81188x9330204f), 35, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f383345f;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1.G(c15003x1d0c0ec1, abstractC14490x69736cb5.mo2128x1ed62e84(), m76102x6c03c64c, c19781xd1c47b87.m76099xae95cb97() == 1, 6, qVar, c19781xd1c47b87, null, 0, null, null, com.p314xaae8f345.p2969xcb80528d.p2971xac8f1cfd.C25866x5a9c3fca.f48865xd4605761, null);
                    hc2.v0.e(c15003x1d0c0ec1, "thank_friend_recommend_feed_bubble", 0, 0, false, false, null, new ju2.c(abstractC14490x69736cb5), 62, null);
                }
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                c15003x1d0c0ec1.setVisibility(8);
            }
        }
    }
}
