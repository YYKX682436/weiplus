package dk5;

/* loaded from: classes9.dex */
public class f3 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f316151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316153f;

    public f3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, android.widget.ImageView imageView, java.lang.String str) {
        this.f316153f = activityC22571x51759e93;
        this.f316151d = imageView;
        this.f316152e = str;
    }

    @Override // l01.u
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Weishi", "dealRetransmitFromWeishiVideoMiniProgram, image load fail:%", this.f316152e);
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "SelectConversationUI#WEISHITHUMB";
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        android.widget.ImageView imageView;
        int i17;
        int i18;
        android.graphics.Bitmap bitmap2;
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316153f;
        if (activityC22571x51759e93.isFinishing() || bitmap == null || bitmap.isRecycled() || (imageView = this.f316151d) == null) {
            return;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i19 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.B2;
        float f17 = height / width;
        int e17 = com.p314xaae8f345.mm.ui.zk.e(activityC22571x51759e93, com.p314xaae8f345.mm.R.C30860x5b28f31.f561164b6);
        int e18 = com.p314xaae8f345.mm.ui.zk.e(activityC22571x51759e93, com.p314xaae8f345.mm.R.C30860x5b28f31.f561163b5);
        if (f17 <= 0.0f || f17 >= 0.5d) {
            if (f17 >= 0.5d && f17 < 1.0f) {
                e17 = (int) (e18 * f17);
                i18 = e17;
            } else if (f17 >= 1.0f && f17 < 2.0f) {
                i17 = (int) (e18 / f17);
                i18 = e18;
                e17 = i18;
                e18 = i17;
            } else if (f17 >= 2.0f) {
                i18 = e18;
                e18 = e17;
                e17 = (int) (e17 * f17);
            } else {
                e17 = 0;
                i17 = 0;
                e18 = 0;
                i18 = 0;
            }
            i17 = e18;
        } else {
            i17 = (int) (e17 / f17);
            i18 = e17;
        }
        if (e17 <= 0 || i17 <= 0) {
            bitmap2 = null;
        } else {
            bitmap2 = android.graphics.Bitmap.createScaledBitmap(bitmap, i17, e17, true);
            imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(e18, i18));
        }
        imageView.setImageBitmap(com.p314xaae8f345.mm.ui.sk.a(bitmap2, true, com.p314xaae8f345.mm.ui.zk.a(activityC22571x51759e93, 3), false));
    }
}
