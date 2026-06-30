package ep2;

/* loaded from: classes2.dex */
public class k extends tb2.f {

    /* renamed from: m, reason: collision with root package name */
    public final int f337257m;

    /* renamed from: n, reason: collision with root package name */
    public final int f337258n;

    /* renamed from: o, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f337259o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i17, float f17, boolean z17, boolean z18, android.content.Context baseContext, float f18, int i18) {
        super(f17, z17, z18, f18, new ep2.f(baseContext, i17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseContext, "baseContext");
        this.f337257m = i17;
        this.f337258n = i18;
        this.f337259o = p3325xe03a0797.p3326xc267989b.z0.b();
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.q(holder, item, i17, i18, z17, list);
        r(holder, item);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.Z3).mo141623x754a37bb()).r()).intValue() == 1) {
            java.lang.String u17 = pm0.v.u(item.getFeedObject().f66939xc8a07680);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveViewCallback", "#bindActivityIcon feedId=".concat(u17));
            android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hmm);
            if (imageView == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyLiveViewCallback", "#bindActivityIcon feedId=" + u17 + " iconView is null!");
            } else {
                java.lang.Object tag = imageView.getTag(com.p314xaae8f345.mm.R.id.fuo);
                if (tag instanceof p3325xe03a0797.p3326xc267989b.r2) {
                    p3325xe03a0797.p3326xc267989b.p2.a((p3325xe03a0797.p3326xc267989b.r2) tag, null, 1, null);
                }
                android.view.View itemView = holder.f3639x46306858;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                ym5.a1.h(itemView, new ep2.g(imageView));
                imageView.setTag(com.p314xaae8f345.mm.R.id.fuo, p3325xe03a0797.p3326xc267989b.l.d(this.f337259o, null, null, new ep2.h(holder, item, imageView, null), 3, null));
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fuv);
        if (textView2 == null || (textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f569217pg0)) == null) {
            return;
        }
        textView.setImportantForAccessibility(2);
        textView2.setContentDescription(holder.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.efq, textView2.getText().toString(), textView.getText().toString()));
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x03af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r(in5.s0 r31, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r32) {
        /*
            Method dump skipped, instructions count: 1267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep2.k.r(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed):void");
    }
}
