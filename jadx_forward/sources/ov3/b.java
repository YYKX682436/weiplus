package ov3;

/* loaded from: classes5.dex */
public final class b extends rv3.e {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(yz5.p r2, iv3.b r3, boolean r4, boolean r5, int r6, p3321xbce91901.jvm.p3324x21ffc6bd.i r7) {
        /*
            r1 = this;
            r7 = r6 & 1
            if (r7 == 0) goto L5
            r2 = 0
        L5:
            r7 = r6 & 4
            r0 = 0
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            java.lang.String r6 = "clickCallback"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r6)
            r1.<init>(r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ov3.b.<init>(yz5.p, iv3.b, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // rv3.e, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ekz;
    }

    @Override // rv3.e, in5.r
    /* renamed from: o */
    public void h(in5.s0 holder, rv3.h item, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = item.f481928d;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = c16997xb0aa383a.f237261y;
        if (c19792x256d2725 == null || (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null || (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) == null) {
            return;
        }
        boolean z18 = true;
        if (!(list == null || list.isEmpty())) {
            for (java.lang.Object obj : list) {
                if (obj instanceof jz5.l) {
                    jz5.l lVar = (jz5.l) obj;
                    java.lang.Object obj2 = lVar.f384366d;
                    if (obj2 == rv3.f.f481922d) {
                        x(holder, item);
                    } else if (obj2 == rv3.f.f481923e) {
                        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.uin);
                        java.lang.Object obj3 = lVar.f384367e;
                        java.lang.Boolean bool = obj3 instanceof java.lang.Boolean ? (java.lang.Boolean) obj3 : null;
                        w(textView, bool != null ? bool.booleanValue() : false);
                    }
                }
            }
            return;
        }
        java.lang.String m76585x66e287ae = c19788xd7cfd73e.m76585x66e287ae();
        if (m76585x66e287ae != null && m76585x66e287ae.length() != 0) {
            z18 = false;
        }
        java.lang.String str = z18 ? c19788xd7cfd73e.m76623xd93f812f() + c19788xd7cfd73e.m76624x4c9b7dca() : c19788xd7cfd73e.m76585x66e287ae() + c19788xd7cfd73e.m76587x815afa6b();
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.uio);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        zy2.v8.a(ya2.l.f542035a, str, imageView, null, null, 12, null);
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.uij)).setText(c16997xb0aa383a.f237256t);
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.uii)).setText(c19792x256d2725.m76818x5d49e3ea());
        x(holder, item);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.uis);
        if (p17 != null) {
            p17.setOnClickListener(new ov3.a(this, holder, item));
        }
        yz5.p pVar = this.f481917e;
        if (pVar != null) {
            android.view.View itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            pVar.mo149xb9724478(itemView, item);
        }
    }

    public final void x(in5.s0 s0Var, rv3.h hVar) {
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.uis);
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.uiu);
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.uir);
        android.view.View p19 = s0Var.p(com.p314xaae8f345.mm.R.id.uit);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.b(textView);
        int ordinal = hVar.f481932h.ordinal();
        android.content.Context context = s0Var.f374654e;
        if (ordinal == 1) {
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oaj));
            textView.setTextColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.abx));
            if (p17 != null) {
                p17.setBackground(null);
            }
            if (p18 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p19 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (ordinal != 2) {
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oah));
            textView.setTextColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            if (p17 != null) {
                p17.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562593jo);
            }
            if (p18 != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(p18, arrayList3.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(p18, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p19 == null) {
                return;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p19, arrayList4.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.oah));
        textView.setTextColor(b3.l.m9702x7444d5ad(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
        if (p17 != null) {
            p17.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562593jo);
        }
        if (p18 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p18, arrayList5.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (p19 == null) {
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
        arrayList6.add(0);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(p19, arrayList6.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/recordvideo/ui/editor/music/finder/item/MusicPickerFeedItemConvert", "updateUseStatus", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/recordvideo/ui/editor/music/model/MusicPickerDataListItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
