package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class yj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vq f287620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 f287621e;

    public yj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vq vqVar) {
        this.f287621e = c21908xb66fd105;
        this.f287620d = vqVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wq wqVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21895xf6c09a87 c21895xf6c09a87;
        java.util.Map map;
        java.util.Map map2;
        java.util.Map map3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vq vqVar = this.f287620d;
        vqVar.f287420k.setVisibility(8);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c18 = erVar.c();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = this.f287621e;
        if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9) ((sb5.k0) c21908xb66fd105.f284708s.f542241c.a(sb5.k0.class))).s0()) {
            int d17 = erVar.d();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9 g9Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.g9) ((sb5.k0) c21908xb66fd105.f284708s.f542241c.a(sb5.k0.class));
            if (g9Var.s0() && (c17 = erVar.c()) != null && (wqVar = vqVar.f287423n) != null && (c21895xf6c09a87 = wqVar.f287490a) != null && c21895xf6c09a87.getVisibility() == 0) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21895xf6c09a87 c21895xf6c09a872 = vqVar.f287423n.f287490a;
                java.util.List o07 = g9Var.o0(c17.m124847x74d37ac6());
                long m124847x74d37ac6 = c17.m124847x74d37ac6();
                if (g9Var.s0() && (map = g9Var.f280618f) != null && (map2 = g9Var.f280621i) != null && (map3 = g9Var.f280620h) != null) {
                    java.util.HashSet hashSet = (java.util.HashSet) g9Var.f280624o;
                    hashSet.add(java.lang.Long.valueOf(m124847x74d37ac6));
                    java.lang.Long l17 = (java.lang.Long) ((java.util.HashMap) map).remove(java.lang.Long.valueOf(m124847x74d37ac6));
                    if (l17 != null) {
                        if (m124847x74d37ac6 < l17.longValue()) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingServiceNotifyComponent", "head msg id is large than end msg id!");
                        } else {
                            for (long longValue = l17.longValue(); longValue <= m124847x74d37ac6; longValue++) {
                                ((java.util.HashMap) map2).remove(java.lang.Long.valueOf(longValue));
                                hashSet.add(java.lang.Long.valueOf(longValue));
                            }
                            ((java.util.HashMap) g9Var.f280619g).remove(l17);
                        }
                    }
                    java.util.Set set = (java.util.Set) ((java.util.HashMap) map3).remove(l17);
                    int size = set != null ? (d17 - set.size()) + 1 : 0;
                    sb5.z zVar = (sb5.z) g9Var.f280113d.f542241c.a(sb5.z.class);
                    if (zVar != null) {
                        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).I0(size);
                    }
                }
                android.view.LayoutInflater from = android.view.LayoutInflater.from(c21895xf6c09a872.getContext());
                c21895xf6c09a872.removeAllViews();
                java.util.Iterator it = ((java.util.ArrayList) o07).iterator();
                int i17 = 0;
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next();
                    i17++;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(from, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570009uc);
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xq xqVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xq();
                    xqVar.a(xgVar);
                    xqVar.f39492x5b9aa3a3.setVisibility(8);
                    xqVar.f39500xcbecde0f.setVisibility(8);
                    c21908xb66fd105.C0(xqVar, c21908xb66fd105.f284708s, f9Var, erVar.f285439b);
                    c21895xf6c09a872.a(xgVar, new android.widget.FrameLayout.LayoutParams(-2, -2));
                    if (i17 >= 3) {
                        break;
                    }
                }
                c21895xf6c09a872.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ch(c21908xb66fd105, c21895xf6c09a872, g9Var));
            }
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.g0(c21908xb66fd105, 2, c18);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.p0(c21908xb66fd105, vqVar, erVar, erVar.d());
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemDyeingTemplate$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
