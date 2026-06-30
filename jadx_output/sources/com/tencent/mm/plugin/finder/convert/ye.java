package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ye extends in5.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105013a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ so2.d1 f105014b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ tw2.h f105015c;

    public ye(in5.s0 s0Var, so2.d1 d1Var, tw2.h hVar) {
        this.f105013a = s0Var;
        this.f105014b = d1Var;
        this.f105015c = hVar;
    }

    @Override // in5.i
    public java.lang.Object a(androidx.recyclerview.widget.k3 k3Var) {
        int adapterPosition;
        if (k3Var == null || (adapterPosition = k3Var.getAdapterPosition()) == -1) {
            return null;
        }
        tw2.h hVar = this.f105015c;
        int itemCount = hVar.getItemCount();
        if (adapterPosition < 0 || adapterPosition >= itemCount) {
            return null;
        }
        return (r45.mb4) hVar.x(adapterPosition);
    }

    @Override // in5.i
    public long b(androidx.recyclerview.widget.k3 k3Var) {
        return (k3Var != null ? k3Var.itemView : null) != null ? r3.hashCode() : 0;
    }

    @Override // in5.i
    public void c(java.util.Set recordsSet) {
        com.tencent.mm.plugin.finder.convert.ye yeVar = this;
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        android.content.Context context = yeVar.f105013a.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        r45.qt2 d17 = xy2.c.d(context);
        if (d17 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.FeedFullImageConvert", "onExposeTimeRecorded: size = " + recordsSet.size());
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            in5.e eVar = (in5.e) it.next();
            r45.mb4 mb4Var = (r45.mb4) eVar.f293022a;
            long j17 = eVar.f293023b;
            long j18 = eVar.f293024c;
            android.view.View view = eVar.f293027f;
            if (view != null) {
                java.lang.Object tag = view.getTag(com.tencent.mm.R.id.teh);
                java.lang.Long l17 = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
                long longValue = l17 != null ? l17.longValue() : 0L;
                java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.tei);
                java.lang.String str = tag2 instanceof java.lang.String ? (java.lang.String) tag2 : null;
                if (str == null) {
                    str = "";
                }
                long max = longValue == 0 ? j18 - j17 : java.lang.Math.max(longValue - j17, 0L);
                if (!(str.length() > 0)) {
                    str = mb4Var.getString(1) + mb4Var.getString(19);
                }
                bu2.r rVar = bu2.r.f24559a;
                java.lang.String valueOf = java.lang.String.valueOf(mb4Var.getString(9));
                com.tencent.mm.sdk.platformtools.c0 c0Var = bu2.r.f24561c;
                boolean z17 = !(c0Var.b(valueOf) != null);
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                so2.d1 d1Var = yeVar.f105014b;
                java.lang.String ek6 = o3Var.ek(d1Var.getItemId(), d1Var.w(), d17.getInteger(5));
                dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
                jz5.l[] lVarArr = new jz5.l[11];
                lVarArr[0] = new jz5.l("feed_id", pm0.v.u(d1Var.getItemId()));
                lVarArr[1] = new jz5.l("finder_context_id", d17.getString(1));
                lVarArr[2] = new jz5.l("comment_scene", java.lang.Integer.valueOf(d17.getInteger(5)));
                lVarArr[3] = new jz5.l("session_buffer", ek6);
                lVarArr[4] = new jz5.l("finder_username", d1Var.getFeedObject().getUserName());
                lVarArr[5] = new jz5.l("extra_info", d17.getString(11));
                lVarArr[6] = new jz5.l("white_pic_time", java.lang.Long.valueOf(max));
                lVarArr[7] = new jz5.l("pic_index", java.lang.Integer.valueOf(eVar.f293026e));
                lVarArr[8] = new jz5.l("pic_url", str);
                lVarArr[9] = new jz5.l("is_livephoto", java.lang.Integer.valueOf(((r45.a42) mb4Var.getCustom(67)) != null ? 1 : 0));
                lVarArr[10] = new jz5.l("first_expose", java.lang.Integer.valueOf(z17 ? 1 : 2));
                ((cy1.a) rVar2).Bj("finder_feed_photo", "finder_photo_optimize", kz5.c1.k(lVarArr), 1, false);
                com.tencent.mars.xlog.Log.i("Finder.FeedFullImageConvert", "Current feed: " + hc2.o0.t(d1Var) + ", pos: " + eVar.f293026e + ", mediaID: " + mb4Var.getString(9) + ", whiteScreenTime: " + max + ", isFirstExposed: " + z17 + ", picUrl: " + str);
                java.lang.String valueOf2 = java.lang.String.valueOf(mb4Var.getString(9));
                c0Var.d(valueOf2, valueOf2);
            }
            yeVar = this;
        }
    }
}
