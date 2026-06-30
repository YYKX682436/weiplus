package i34;

/* loaded from: classes11.dex */
public class d extends android.graphics.drawable.BitmapDrawable implements x51.r0 {

    /* renamed from: m, reason: collision with root package name */
    public static final android.graphics.Paint f369844m;

    /* renamed from: n, reason: collision with root package name */
    public static android.graphics.Bitmap f369845n;

    /* renamed from: d, reason: collision with root package name */
    public int f369846d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f369847e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f369848f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f369849g;

    /* renamed from: h, reason: collision with root package name */
    public x51.o0 f369850h;

    /* renamed from: i, reason: collision with root package name */
    public final int f369851i;

    static {
        android.graphics.Paint paint = new android.graphics.Paint();
        f369844m = paint;
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
    }

    public d(android.widget.ImageView imageView, java.lang.String str, int i17) {
        super(imageView.getResources(), a(imageView, i17));
        this.f369851i = -1;
        this.f369849g = imageView;
        this.f369848f = str;
        this.f369851i = i17;
        invalidateSelf();
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).wi(this);
    }

    public static android.graphics.Bitmap a(android.view.View view, int i17) {
        if (view == null) {
            return f369845n;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        android.graphics.Bitmap bitmap = f369845n;
        if (bitmap == null || bitmap.getWidth() != measuredWidth) {
            try {
                if (i17 > 0) {
                    f369845n = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.K0(view.getResources().getDrawable(i17));
                } else {
                    f369845n = com.p314xaae8f345.mm.sdk.p2603x2137b148.j.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
                }
                if (f369845n.getWidth() != measuredWidth && measuredWidth > 0 && measuredHeight > 0) {
                    f369845n = android.graphics.Bitmap.createScaledBitmap(f369845n, measuredWidth, measuredHeight, true);
                }
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ShakeAvatarDrawable", e17, "", new java.lang.Object[0]);
            }
        }
        return f369845n;
    }

    public static java.lang.String b(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShakeAvatarDrawable", "getStoragePath: but url is null");
            return null;
        }
        java.lang.String c17 = h34.v.c();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17)) {
            return java.lang.String.format("%s/%s", c17, kk.k.g(str.getBytes()));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ShakeAvatarDrawable", "getStoragePath, but save dir is null");
        return null;
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeAvatarDrawable", "type[%d] notifyKey[%s] albumUrl[%s]", java.lang.Integer.valueOf(this.f369846d), str, this.f369847e);
        x51.o0 o0Var = this.f369850h;
        if (o0Var == null || !str.equals(o0Var.c())) {
            return;
        }
        int i17 = this.f369846d;
        if (4 == i17 || (h34.z.d(i17) && 6 != this.f369846d)) {
            this.f369849g.post(new i34.b(this, bitmap));
        }
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        android.graphics.Bitmap bitmap;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeAvatarDrawable", "album username[%s], url[%s], type[%d], attr[%s]", this.f369848f, this.f369847e, java.lang.Integer.valueOf(this.f369846d), toString());
        int i17 = this.f369846d;
        if (4 == i17 || (h34.z.d(i17) && 6 != this.f369846d)) {
            int i18 = this.f369846d;
            if (4 == i18) {
                this.f369850h = new i34.c(this.f369847e);
                y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
                x51.o0 o0Var = this.f369850h;
                ((x60.e) fVar).getClass();
                bitmap = x51.w0.d(o0Var);
            } else if (!h34.z.d(i18) || 6 == this.f369846d) {
                bitmap = null;
            } else {
                this.f369850h = new j34.h(this.f369847e);
                y60.f fVar2 = (y60.f) i95.n0.c(y60.f.class);
                x51.o0 o0Var2 = this.f369850h;
                ((x60.e) fVar2).getClass();
                bitmap = x51.w0.d(o0Var2);
            }
            if (bitmap == null || bitmap.isRecycled()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeAvatarDrawable", "bm is null or recycled, album url[%s]", this.f369847e);
                bitmap = a(this.f369849g, this.f369851i);
            }
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, (android.graphics.Rect) null, getBounds(), f369844m);
            }
        }
    }
}
