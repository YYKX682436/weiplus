package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class nj implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286462a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f286463b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.oj f286464c;

    public nj(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.oj ojVar, int i17, int i18) {
        this.f286464c = ojVar;
        this.f286462a = i17;
        this.f286463b = i18;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.oj ojVar = this.f286464c;
        if (bitmap == null || bitmap.isRecycled() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", " [fillHeaderVBackground] load url，error: %s", str);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd105 = ojVar.f286744f;
            android.widget.ImageView imageView = ojVar.f286742d.f284948e;
            java.lang.String str3 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.B1;
            c21908xb66fd105.u1(imageView);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemDyeingTemplate", " [fillHeaderVBackground]load] load url， success : %s", str);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105 c21908xb66fd1052 = ojVar.f286744f;
        android.widget.ImageView imageView2 = ojVar.f286742d.f284948e;
        int i17 = this.f286462a;
        int i18 = this.f286463b;
        java.lang.String str4 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.C21908xb66fd105.B1;
        c21908xb66fd1052.getClass();
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qj(c21908xb66fd1052, bitmap, i17, i18, imageView2, str));
    }
}
