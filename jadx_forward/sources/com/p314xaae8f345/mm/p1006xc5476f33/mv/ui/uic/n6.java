package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class n6 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f8 f232863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t6 f232864f;

    public n6(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t6 t6Var, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.f8 f8Var) {
        this.f232864f = t6Var;
        this.f232863e = f8Var;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570857c53;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.jf2 jf2Var;
        android.view.View p17;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6 item = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l6) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (list != null) {
            if (list.contains(1)) {
                android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.f568335mi3);
                if (p18 != null) {
                    int i19 = item.f232811g ? 0 : 4;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Integer.valueOf(i19));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(p18, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.lby);
                if (p19 != null) {
                    p19.setScaleX(item.f232811g ? 1.0f - item.f232812h : 1.0f);
                }
            }
            if (!list.contains(2) || (p17 = holder.p(com.p314xaae8f345.mm.R.id.lby)) == null) {
                return;
            }
            p17.setScaleX(item.f232811g ? 1.0f - item.f232812h : 1.0f);
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.o7z);
        if (textView != null && (jf2Var = item.f232809e) != null) {
            int m75939xb282bd08 = jf2Var.m75939xb282bd08(1);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lm3.d0.c(m75939xb282bd08));
            sb6.append('s');
            textView.setText(sb6.toString());
        }
        android.view.View findViewById = holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568335mi3);
        if (findViewById != null) {
            if (item.f232811g) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/ui/uic/MusicMvPreviewTrackUIC$TrackDataConvert;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.m6(this, i17));
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.lby);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t6 t6Var = this.f232864f;
        p27.setPivotX(t6Var.f232997i);
        if (item.f232811g) {
            p27.setScaleX(1.0f - item.f232812h);
        } else {
            p27.setScaleX(1.0f);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.cl7);
        imageView.setImageDrawable(null);
        if (i17 >= t6Var.f232995g.size()) {
            return;
        }
        java.lang.Object obj = t6Var.f232995g.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        jk4.f fVar = (jk4.f) obj;
        boolean z18 = item.f232810f;
        ll3.i1 i1Var = ll3.i1.f400715a;
        if (z18) {
            java.lang.String path = fVar.f316016t;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "path");
            if (path.length() > 0) {
                java.lang.String str = fVar.f316016t;
                java.lang.String thumbFilePath = i1Var.b("thumb_" + fVar.f316016t.hashCode());
                e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                long hashCode = str.hashCode();
                ((o23.i) b1Var).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbFilePath, "thumbFilePath");
                e33.m6.a(imageView, 2, thumbFilePath, str, hashCode, i17, 0L);
                return;
            }
        }
        java.lang.String thumbUrl = fVar.f316004h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(thumbUrl, "thumbUrl");
        if (!(thumbUrl.length() > 0)) {
            imageView.setImageDrawable(null);
            return;
        }
        o11.f fVar2 = new o11.f();
        fVar2.f423615f = i1Var.b("thumb_" + fVar.f316015s);
        fVar2.f423611b = true;
        fVar2.f423610a = true;
        n11.a.b().h(fVar.f316004h + fVar.f316005i, imageView, fVar2.a());
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
