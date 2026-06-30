package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class ka implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f282686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ma f282687e;

    public ka(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ma maVar, java.lang.String str) {
        this.f282687e = maVar;
        this.f282686d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f282686d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ma maVar = this.f282687e;
        if (K0) {
            db5.e1.i(maVar.f282735d.f282957b.f282625g, com.p314xaae8f345.mm.R.C30867xcad56011.k7_, com.p314xaae8f345.mm.R.C30867xcad56011.b58);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.VIEW");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i1.f(maVar.f282735d.f282957b.f282625g, intent, new com.p314xaae8f345.mm.vfs.r6(str), "video/*", false);
        try {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = maVar.f282735d.f282957b.f282625g;
            android.content.Intent createChooser = android.content.Intent.createChooser(intent, viewOnClickListenerC21748xb3d38e6b.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cdy));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(createChooser);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(viewOnClickListenerC21748xb3d38e6b, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            viewOnClickListenerC21748xb3d38e6b.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(viewOnClickListenerC21748xb3d38e6b, "com/tencent/mm/ui/chatting/gallery/ImageGalleryViewHolder$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImageGalleryViewHolder", "startActivity fail, activity not found");
            db5.e1.i(maVar.f282735d.f282957b.f282625g, com.p314xaae8f345.mm.R.C30867xcad56011.cbm, com.p314xaae8f345.mm.R.C30867xcad56011.cbn);
        }
    }
}
