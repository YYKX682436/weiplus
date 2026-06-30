package xk0;

/* loaded from: classes10.dex */
public class o extends yk0.a implements xk0.h {
    public final cm5.m G;
    public final int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f536531J;
    public boolean K;
    public android.text.SpannableString L;

    public o(android.content.Context context, android.graphics.Matrix matrix, java.lang.String str, android.graphics.Rect rect, android.graphics.Rect rect2, android.text.SpannableString spannableString, int i17, int i18, java.lang.String str2, boolean z17, boolean z18) {
        super(context, matrix, str, rect, rect2, z17, z18);
        this.H = -1;
        this.I = -65536;
        this.f536531J = false;
        this.K = true;
        cm5.l lVar = new cm5.l(context);
        this.G = lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        lVar.f124982c = str2;
        this.H = i17;
        this.L = spannableString;
        this.I = i18;
    }

    @Override // yk0.a
    public java.lang.String F() {
        return "MicroMsg.StickerTextItem-" + hashCode();
    }

    @Override // yk0.a
    public boolean G() {
        if (this.L != null) {
            return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0.toString());
        }
        return false;
    }

    public void H(android.graphics.Bitmap bitmap, java.lang.String str) {
        int i17;
        int i18;
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(F(), "replaceBitmap: new bitmap null");
            return;
        }
        android.graphics.Bitmap bitmap2 = this.f536485g;
        if (bitmap2 != null) {
            i17 = bitmap2.getWidth();
            i18 = this.f536485g.getHeight();
        } else {
            i17 = 0;
            i18 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(F(), "replaceBitmap: old size[%d,%d], new size[%d,%d], text=%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), str);
        this.f536485g = bitmap;
        this.L = new android.text.SpannableString(str);
    }

    @Override // xk0.h
    public xk0.q a() {
        return new xk0.q(this.H, this.I, this.f536531J, this.K, this.L);
    }

    @Override // xk0.h
    public void b(int i17) {
        this.G.f124983d = i17;
    }

    @Override // xk0.h
    public void c(boolean z17) {
        this.f536531J = z17;
    }

    @Override // xk0.f
    /* renamed from: clear */
    public void mo175635x5a5b64d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(F(), "clear");
        super.mo175635x5a5b64d();
        this.L = new android.text.SpannableString("");
    }

    @Override // xk0.h
    public void d(boolean z17) {
        this.K = z17;
    }

    @Override // xk0.h
    public boolean e() {
        return false;
    }

    @Override // xk0.f
    public android.graphics.Bitmap p() {
        return this.G.c(this.L, this.H, this.I, this.f536531J, this.K);
    }

    @Override // xk0.h
    /* renamed from: setTextSize */
    public void mo175638x3abfd950(float f17) {
        F();
        this.G.f124981b = f17;
    }

    @Override // yk0.a
    public float z(float f17) {
        if (f17 <= 0.0f) {
            return 1.0f;
        }
        return f17;
    }
}
