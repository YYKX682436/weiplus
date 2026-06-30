package androidx.core.graphics.drawable;

/* loaded from: classes13.dex */
public class IconCompat extends androidx.versionedparcelable.CustomVersionedParcelable {

    /* renamed from: k, reason: collision with root package name */
    public static final android.graphics.PorterDuff.Mode f11036k = android.graphics.PorterDuff.Mode.SRC_IN;

    /* renamed from: a, reason: collision with root package name */
    public int f11037a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f11038b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f11039c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.Parcelable f11040d;

    /* renamed from: e, reason: collision with root package name */
    public int f11041e;

    /* renamed from: f, reason: collision with root package name */
    public int f11042f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.res.ColorStateList f11043g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.PorterDuff.Mode f11044h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f11045i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f11046j;

    public IconCompat() {
        this.f11037a = -1;
        this.f11039c = null;
        this.f11040d = null;
        this.f11041e = 0;
        this.f11042f = 0;
        this.f11043g = null;
        this.f11044h = f11036k;
        this.f11045i = null;
    }

    public static android.graphics.Bitmap c(android.graphics.Bitmap bitmap, boolean z17) {
        int min = (int) (java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(config);
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(min));
        arrayList.add(java.lang.Integer.valueOf(min));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "androidx/core/graphics/drawable/IconCompat", "createLegacyIconFromAdaptiveIcon", "(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
        yj0.a.e(obj, createBitmap, "androidx/core/graphics/drawable/IconCompat", "createLegacyIconFromAdaptiveIcon", "(Landroid/graphics/Bitmap;Z)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        android.graphics.Paint paint = new android.graphics.Paint(3);
        float f17 = min;
        float f18 = 0.5f * f17;
        float f19 = 0.9166667f * f18;
        if (z17) {
            float f27 = 0.010416667f * f17;
            paint.setColor(0);
            paint.setShadowLayer(f27, 0.0f, f17 * 0.020833334f, 1023410176);
            canvas.drawCircle(f18, f18, f19, paint);
            paint.setShadowLayer(f27, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f18, f18, f19, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.CLAMP;
        android.graphics.BitmapShader bitmapShader = new android.graphics.BitmapShader(bitmap, tileMode, tileMode);
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - min)) / 2.0f, (-(bitmap.getHeight() - min)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f18, f18, f19, paint);
        canvas.setBitmap(null);
        return createBitmap;
    }

    public static androidx.core.graphics.drawable.IconCompat d(android.content.Context context, int i17) {
        context.getClass();
        return e(context.getResources(), context.getPackageName(), i17);
    }

    public static androidx.core.graphics.drawable.IconCompat e(android.content.res.Resources resources, java.lang.String str, int i17) {
        str.getClass();
        if (i17 == 0) {
            throw new java.lang.IllegalArgumentException("Drawable resource ID must not be 0");
        }
        androidx.core.graphics.drawable.IconCompat iconCompat = new androidx.core.graphics.drawable.IconCompat(2);
        iconCompat.f11041e = i17;
        if (resources != null) {
            try {
                iconCompat.f11038b = resources.getResourceName(i17);
            } catch (android.content.res.Resources.NotFoundException unused) {
                throw new java.lang.IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f11038b = str;
        }
        iconCompat.f11046j = str;
        return iconCompat;
    }

    public int f() {
        int i17 = this.f11037a;
        if (i17 == -1) {
            return f3.e.a(this.f11038b);
        }
        if (i17 == 2) {
            return this.f11041e;
        }
        throw new java.lang.IllegalStateException("called getResId() on " + this);
    }

    public java.lang.String g() {
        int i17 = this.f11037a;
        if (i17 == -1) {
            return f3.e.b(this.f11038b);
        }
        if (i17 == 2) {
            java.lang.String str = this.f11046j;
            return (str == null || android.text.TextUtils.isEmpty(str)) ? ((java.lang.String) this.f11038b).split(":", -1)[0] : this.f11046j;
        }
        throw new java.lang.IllegalStateException("called getResPackage() on " + this);
    }

    public android.net.Uri h() {
        int i17 = this.f11037a;
        if (i17 == -1) {
            return f3.e.d(this.f11038b);
        }
        if (i17 == 4 || i17 == 6) {
            return android.net.Uri.parse((java.lang.String) this.f11038b);
        }
        throw new java.lang.IllegalStateException("called getUri() on " + this);
    }

    public java.lang.String toString() {
        java.lang.String str;
        if (this.f11037a == -1) {
            return java.lang.String.valueOf(this.f11038b);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Icon(typ=");
        switch (this.f11037a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb6.append(str);
        switch (this.f11037a) {
            case 1:
            case 5:
                sb6.append(" size=");
                sb6.append(((android.graphics.Bitmap) this.f11038b).getWidth());
                sb6.append("x");
                sb6.append(((android.graphics.Bitmap) this.f11038b).getHeight());
                break;
            case 2:
                sb6.append(" pkg=");
                sb6.append(this.f11046j);
                sb6.append(" id=");
                sb6.append(java.lang.String.format("0x%08x", java.lang.Integer.valueOf(f())));
                break;
            case 3:
                sb6.append(" len=");
                sb6.append(this.f11041e);
                if (this.f11042f != 0) {
                    sb6.append(" off=");
                    sb6.append(this.f11042f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb6.append(" uri=");
                sb6.append(this.f11038b);
                break;
        }
        if (this.f11043g != null) {
            sb6.append(" tint=");
            sb6.append(this.f11043g);
        }
        if (this.f11044h != f11036k) {
            sb6.append(" mode=");
            sb6.append(this.f11044h);
        }
        sb6.append(")");
        return sb6.toString();
    }

    public IconCompat(int i17) {
        this.f11039c = null;
        this.f11040d = null;
        this.f11041e = 0;
        this.f11042f = 0;
        this.f11043g = null;
        this.f11044h = f11036k;
        this.f11045i = null;
        this.f11037a = i17;
    }
}
