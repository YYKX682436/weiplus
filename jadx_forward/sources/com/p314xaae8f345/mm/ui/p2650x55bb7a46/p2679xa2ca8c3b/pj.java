package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class pj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f286805d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qj f286806e;

    public pj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qj qjVar, android.graphics.Bitmap bitmap) {
        this.f286806e = qjVar;
        this.f286805d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qj qjVar = this.f286806e;
        android.widget.ImageView imageView = qjVar.f286906g;
        if (imageView == null) {
            return;
        }
        java.lang.String str = (java.lang.String) imageView.getTag(com.p314xaae8f345.mm.R.id.k7p);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", "[setBackgroundBitmap] final set bitmap，url :%s，oldUrl：%s", qjVar.f286907h, str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qjVar.f286907h) && qjVar.f286907h.equals(str) && (bitmap = this.f286805d) != null) {
            qjVar.f286906g.setImageBitmap(bitmap);
            qjVar.f286906g.setVisibility(0);
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = qjVar.f286908i;
            android.widget.ImageView imageView2 = qjVar.f286906g;
            java.lang.String str2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.B1;
            c21908xb66fd105.u1(imageView2);
        }
    }
}
