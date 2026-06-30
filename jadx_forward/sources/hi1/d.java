package hi1;

/* loaded from: classes7.dex */
public class d implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap[] f363019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f363020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hi1.l f363021f;

    public d(android.graphics.Bitmap[] bitmapArr, int i17, hi1.l lVar) {
        this.f363019d = bitmapArr;
        this.f363020e = i17;
        this.f363021f = lVar;
    }

    @Override // l01.u
    public void b() {
        android.graphics.Bitmap m10969xb866ec1c = bp.b.m10969xb866ec1c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e, com.p314xaae8f345.mm.R.raw.f80616x3c6dbd49, null);
        if (m10969xb866ec1c != null) {
            this.f363019d[this.f363020e] = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.t0(m10969xb866ec1c, false, m10969xb866ec1c.getWidth() / 2, false, null);
        } else {
            this.f363019d[this.f363020e] = null;
        }
        int i17 = this.f363020e;
        android.graphics.Bitmap[] bitmapArr = this.f363019d;
        if (i17 == bitmapArr.length - 1) {
            hi1.o.f363033c.f363035b = bitmapArr;
            this.f363021f.a();
        }
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return null;
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap[] bitmapArr = this.f363019d;
        int i17 = this.f363020e;
        bitmapArr[i17] = bitmap;
        if (i17 == bitmapArr.length - 1) {
            hi1.o.f363033c.f363035b = bitmapArr;
            this.f363021f.a();
        }
    }
}
