package lu1;

/* loaded from: classes5.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f402888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lu1.z f402889e;

    public y(lu1.z zVar, android.graphics.Bitmap bitmap) {
        this.f402889e = zVar;
        this.f402888d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        lu1.z zVar = this.f402889e;
        boolean z17 = zVar.f402892f;
        android.widget.ImageView imageView = zVar.f402891e;
        android.graphics.Bitmap bitmap = this.f402888d;
        if (!z17) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        float min = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight()) / 2;
        android.graphics.Bitmap bitmap2 = null;
        if (bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardUtil", "getRoundedCornerBitmap in bitmap is null");
        } else {
            android.graphics.Bitmap m17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.m(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888, false);
            if (m17 != null) {
                android.graphics.Canvas canvas = new android.graphics.Canvas(m17);
                android.graphics.Paint paint = new android.graphics.Paint();
                android.graphics.Rect rect = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                android.graphics.RectF rectF = new android.graphics.RectF(rect);
                paint.setAntiAlias(true);
                paint.setDither(true);
                paint.setFilterBitmap(true);
                canvas.drawARGB(0, 0, 0, 0);
                paint.setColor(-4144960);
                canvas.drawRoundRect(rectF, min, min, paint);
                paint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, rect, rect, paint);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardUtil", "bitmap recycle %s", bitmap.toString());
                bitmap.recycle();
                bitmap2 = m17;
            }
        }
        imageView.setImageBitmap(bitmap2);
    }
}
