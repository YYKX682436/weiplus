package com.p314xaae8f345.mm.ui.p2641xabe4e85a;

/* renamed from: com.tencent.mm.ui.applet.SecurityImage */
/* loaded from: classes14.dex */
public class C21463x46cf9db extends android.widget.LinearLayout {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f278723p = 0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f278724d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f278725e;

    /* renamed from: f, reason: collision with root package name */
    public int f278726f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f278727g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f278728h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f278729i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.EditText f278730m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f278731n;

    /* renamed from: o, reason: collision with root package name */
    public bb5.k f278732o;

    public C21463x46cf9db(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f278724d = null;
        this.f278725e = null;
        this.f278726f = 0;
        this.f278727g = null;
        this.f278728h = null;
        this.f278729i = null;
        this.f278730m = null;
        this.f278731n = null;
    }

    public final void a(boolean z17) {
        this.f278728h.setAlpha(z17 ? 255 : 40);
        this.f278728h.setBackgroundColor(z17 ? 0 : -5592406);
        this.f278727g.setVisibility(z17 ? 4 : 0);
    }

    public void b(int i17, byte[] bArr, java.lang.String str, java.lang.String str2) {
        a(true);
        this.f278724d = str;
        this.f278725e = str2;
        this.f278726f = i17;
        android.graphics.Bitmap G = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.G(bArr);
        if (G != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SecurityImage", "dkwt setSecImg sid:%s key:%s imgBuf:%d [%d %d]", str, str2, java.lang.Integer.valueOf(bArr.length), java.lang.Integer.valueOf(G.getWidth()), java.lang.Integer.valueOf(G.getHeight()));
            this.f278724d = str;
            this.f278725e = str2;
            this.f278726f = i17;
            this.f278728h.setImageBitmap(G);
            return;
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = java.lang.Integer.valueOf(bArr == null ? -1 : bArr.length);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SecurityImage", "dkwt setSecImg ERROR sid:%s key:%s imgBuf:%d", objArr);
    }

    /* renamed from: getSecCodeType */
    public int m78853x44217902() {
        return this.f278726f;
    }

    /* renamed from: getSecImgCode */
    public java.lang.String m78854x2bc566b5() {
        android.widget.EditText editText = this.f278730m;
        return editText == null ? "" : editText.getText().toString().trim();
    }

    /* renamed from: getSecImgEncryptKey */
    public java.lang.String m78855x1761a082() {
        return this.f278725e;
    }

    /* renamed from: getSecImgSid */
    public java.lang.String m78856x8dcccb06() {
        return this.f278724d;
    }

    /* renamed from: setNetworkModel */
    public void m78857x95126b1d(bb5.k kVar) {
        bb5.k kVar2 = this.f278732o;
        if (kVar2 != null) {
            kVar2.f100673a = null;
        }
        this.f278732o = kVar;
        kVar.f100673a = this;
    }
}
