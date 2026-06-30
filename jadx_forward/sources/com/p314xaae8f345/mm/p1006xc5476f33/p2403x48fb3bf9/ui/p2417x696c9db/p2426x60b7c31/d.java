package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes8.dex */
public final class d implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f266569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f266571f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f266572g;

    public d(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, int i17, boolean z18) {
        this.f266569d = z17;
        this.f266570e = c1Var;
        this.f266571f = i17;
        this.f266572g = z18;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        android.net.Uri[] uriArr;
        android.net.Uri[] uriArr2;
        android.net.Uri data;
        if (i17 == 219) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebView.ChooseMediaFromSystemHelper", "chooseFromAlbum onActivityResult resultCode:" + i18 + ", data:" + intent);
            if (android.os.Build.VERSION.SDK_INT >= 33 && -1 == i18 && intent != null && intent.getData() == null && intent.getClipData() != null) {
                android.content.ClipData clipData = intent.getClipData();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(clipData);
                if (clipData.getItemCount() > 0) {
                    android.content.ClipData clipData2 = intent.getClipData();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(clipData2);
                    uriArr = new android.net.Uri[clipData2.getItemCount()];
                    android.content.ClipData clipData3 = intent.getClipData();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(clipData3);
                    int itemCount = clipData3.getItemCount();
                    for (int i19 = 0; i19 < itemCount; i19++) {
                        android.content.ClipData clipData4 = intent.getClipData();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(clipData4);
                        uriArr[i19] = clipData4.getItemAt(i19).getUri();
                    }
                    uriArr2 = uriArr;
                    dw4.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c(uriArr2, this.f266569d, this.f266570e, this.f266571f, this.f266572g));
                }
            }
            if (-1 == i18 && intent == null) {
                uriArr = new android.net.Uri[0];
            } else {
                if (-1 == i18) {
                    android.net.Uri uri = null;
                    try {
                        data = intent.getData();
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebView.ChooseMediaFromSystemHelper", "chooseFromCamera onActivityResult extra uri get exception:" + e17);
                    }
                    if (data == null) {
                        android.os.Bundle extras = intent.getExtras();
                        if (extras != null) {
                            data = (android.net.Uri) extras.getParcelable("android.intent.extra.STREAM");
                        }
                        uriArr2 = new android.net.Uri[]{uri};
                        dw4.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c(uriArr2, this.f266569d, this.f266570e, this.f266571f, this.f266572g));
                    }
                    uri = data;
                    uriArr2 = new android.net.Uri[]{uri};
                    dw4.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c(uriArr2, this.f266569d, this.f266570e, this.f266571f, this.f266572g));
                }
                uriArr = new android.net.Uri[0];
            }
            uriArr2 = uriArr;
            dw4.a.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c(uriArr2, this.f266569d, this.f266570e, this.f266571f, this.f266572g));
        }
    }
}
