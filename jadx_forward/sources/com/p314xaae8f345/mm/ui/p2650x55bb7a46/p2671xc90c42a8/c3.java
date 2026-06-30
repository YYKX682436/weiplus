package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes12.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f283678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.d3 f283679e;

    public c3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.d3 d3Var, java.util.LinkedList linkedList) {
        this.f283679e = d3Var;
        this.f283678d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.d3 d3Var = this.f283679e;
        java.util.ArrayList arrayList = d3Var.f283702f.f283890e;
        java.util.LinkedList linkedList = this.f283678d;
        arrayList.addAll(0, linkedList);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var = d3Var.f283702f;
        n3Var.f283901s = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "[loadData] %s", java.lang.Integer.valueOf(n3Var.f283890e.size()));
        zb5.g gVar = d3Var.f283702f.f283889d;
        if (gVar != null) {
            boolean z17 = d3Var.f283700d;
            int size = linkedList.size();
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 viewOnClickListenerC21789x2eb4d316 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) gVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryUI", "[onDataLoaded] isFirst:%s addCount:%s mIntentPos:%s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(viewOnClickListenerC21789x2eb4d316.f282285p));
            if (z17) {
                viewOnClickListenerC21789x2eb4d316.W6(false, null);
                viewOnClickListenerC21789x2eb4d316.f282278f.mo7946xf939df19().m8146xced61ae5();
                int i17 = viewOnClickListenerC21789x2eb4d316.f282285p;
                if (i17 > 0) {
                    if (i17 % 4 == 0) {
                        viewOnClickListenerC21789x2eb4d316.f282285p = i17 + 1;
                    }
                    int mo1894x7e414b06 = viewOnClickListenerC21789x2eb4d316.f282278f.mo7946xf939df19().mo1894x7e414b06();
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = viewOnClickListenerC21789x2eb4d316.f282278f;
                    int min = java.lang.Math.min(mo1894x7e414b06 - 1, viewOnClickListenerC21789x2eb4d316.f282285p);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(java.lang.Integer.valueOf(min));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
                    c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba4, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
                } else {
                    int mo1894x7e414b062 = viewOnClickListenerC21789x2eb4d316.f282278f.mo7946xf939df19().mo1894x7e414b06();
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = viewOnClickListenerC21789x2eb4d316.f282278f;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList3.add(java.lang.Integer.valueOf(mo1894x7e414b062 - 1));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(c1163xf1deaba42, arrayList3.toArray(), "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
                    c1163xf1deaba42.a1(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba42, "com/tencent/mm/ui/chatting/gallery/MediaHistoryGalleryUI", "onDataLoaded", "(ZI)V", "Undefined", "scrollToPosition", "(I)V");
                }
                if (size <= 0) {
                    viewOnClickListenerC21789x2eb4d316.f282282m.setVisibility(0);
                    viewOnClickListenerC21789x2eb4d316.f282278f.setVisibility(8);
                    viewOnClickListenerC21789x2eb4d316.f282282m.setTextColor(i65.a.d(viewOnClickListenerC21789x2eb4d316, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
                    viewOnClickListenerC21789x2eb4d316.f282282m.setText(viewOnClickListenerC21789x2eb4d316.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5e));
                } else {
                    viewOnClickListenerC21789x2eb4d316.f282282m.setVisibility(8);
                    viewOnClickListenerC21789x2eb4d316.f282278f.setVisibility(0);
                }
            } else if (viewOnClickListenerC21789x2eb4d316.f282278f.E0()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MediaHistoryGalleryUI", "[onDataLoaded] isComputingLayout ");
            } else if (size > 0) {
                viewOnClickListenerC21789x2eb4d316.f282278f.mo7946xf939df19().m8153xd399a4d9(0, size);
                viewOnClickListenerC21789x2eb4d316.f282278f.mo7946xf939df19().m8151xc67946d3(size, viewOnClickListenerC21789x2eb4d316.f282293x + size);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryUI", "onDataLoading notifyItemRangeChanged:%s", java.lang.Integer.valueOf(viewOnClickListenerC21789x2eb4d316.f282293x + size));
            } else {
                viewOnClickListenerC21789x2eb4d316.f282278f.mo7946xf939df19().m8147xed6e4d18(0);
            }
        }
        d3Var.f283702f.f283894i.f279925o = false;
    }
}
