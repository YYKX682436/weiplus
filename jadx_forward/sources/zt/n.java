package zt;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final zt.n f557085a = new zt.n();

    public final void a(s15.h recordDataItem, android.graphics.Bitmap bitmap, android.widget.ImageView imgView) {
        o70.f aj6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordDataItem, "recordDataItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imgView, "imgView");
        int i17 = recordDataItem.f384955d;
        if (recordDataItem.m75939xb282bd08(i17 + 2) == 2 || recordDataItem.m75939xb282bd08(i17 + 2) == 4) {
            if (recordDataItem.m163590x877bf986() == 0 || recordDataItem.m163589x4e343d67() == 0) {
                aj6 = ((v70.b0) ((xs.f1) i95.n0.c(xs.f1.class))).aj(bitmap != null ? bitmap.getWidth() : 0, bitmap != null ? bitmap.getHeight() : 0);
            } else {
                aj6 = ((v70.b0) ((xs.f1) i95.n0.c(xs.f1.class))).aj(recordDataItem.m163590x877bf986(), recordDataItem.m163589x4e343d67());
            }
            android.view.ViewGroup.LayoutParams layoutParams = imgView.getLayoutParams();
            layoutParams.width = aj6.f424764a;
            layoutParams.height = aj6.f424765b;
            imgView.setLayoutParams(layoutParams);
        }
    }
}
