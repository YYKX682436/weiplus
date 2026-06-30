package im3;

/* loaded from: classes10.dex */
public final class l extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c58;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        im3.j item = (im3.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f568828o70);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565672d55);
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = item.f374237m;
        if (i18 == 1) {
            e60.b1 b1Var = (e60.b1) i95.n0.c(e60.b1.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            int mo63659xfb85f7b0 = abstractC15633xee433078 != null ? abstractC15633xee433078.mo63659xfb85f7b0() : 0;
            java.lang.String o17 = abstractC15633xee433078 != null ? abstractC15633xee433078.o() : null;
            java.lang.String str = o17 == null ? "" : o17;
            java.lang.String str2 = abstractC15633xee433078 != null ? abstractC15633xee433078.f219963e : null;
            if (str2 == null) {
                str2 = "";
            }
            ((o23.i) b1Var).Ai(imageView, mo63659xfb85f7b0, str, str2, abstractC15633xee433078 != null ? abstractC15633xee433078.f219967i : 0L, abstractC15633xee433078 != null ? abstractC15633xee433078.f219968m : 0L);
            textView.setVisibility(8);
        } else if (i18 == 2) {
            t23.i1 i1Var = (t23.i1) i95.n0.c(t23.i1.class);
            java.lang.String o18 = abstractC15633xee433078 != null ? abstractC15633xee433078.o() : null;
            java.lang.String str3 = abstractC15633xee433078 != null ? abstractC15633xee433078.f219963e : null;
            long j17 = abstractC15633xee433078 != null ? abstractC15633xee433078.f219967i : 0L;
            long j18 = abstractC15633xee433078 != null ? abstractC15633xee433078.f219968m : 0L;
            ((t23.r0) i1Var).getClass();
            android.graphics.Bitmap g17 = t23.p0.h().g(o18, str3, j17, null, j18);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getGalleryBitmapFromMemory(...)");
            if (g17.isRecycled()) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ccy);
            } else {
                imageView.setImageBitmap(g17);
            }
            if (abstractC15633xee433078 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC15633xee433078, "null cannot be cast to non-null type com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem");
                textView.setText(n(((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.C15635xf0ea441b) abstractC15633xee433078).f219979x / 1000));
                textView.setVisibility(0);
            }
        } else if (i18 == 3 && (c19792x256d2725 = item.f374233f.f461898f) != null && (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
            java.lang.String str4 = c19788xd7cfd73e.m76623xd93f812f() + c19788xd7cfd73e.m76624x4c9b7dca();
            o11.f fVar = new o11.f();
            fVar.f423610a = true;
            fVar.f423612c = true;
            fVar.f423624o = com.p314xaae8f345.mm.R.C30861xcebc809e.ccy;
            n11.a.b().h(str4, imageView, fVar.a());
            textView.setText(n(c19788xd7cfd73e.m76629x36bbd779()));
            textView.setVisibility(0);
        }
        if (item.f374236i) {
            android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.mib);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewSelectedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/mv/model/preview/MvPreviewSelectedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.mib);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/mv/model/preview/MvPreviewSelectedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/mv/model/preview/MvPreviewSelectedItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/mv/model/preview/MvPreviewLiveItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final java.lang.String n(int i17) {
        java.lang.String valueOf = java.lang.String.valueOf(i17 % 60);
        if (valueOf.length() < 2) {
            valueOf = "0".concat(valueOf);
        }
        return (i17 / 60) + ':' + valueOf;
    }
}
