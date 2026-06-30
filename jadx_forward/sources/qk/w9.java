package qk;

/* loaded from: classes5.dex */
public abstract class w9 {
    public static int a(android.content.Context context) {
        int i17;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.ib) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d7) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d7.class))).getClass();
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561909w7);
        int dimensionPixelOffset2 = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        boolean z17 = false;
        boolean z18 = context.getResources().getConfiguration().orientation == 1;
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            if (fp.h.c(24)) {
                z17 = activity.isInMultiWindowMode();
            }
        }
        android.graphics.Point point = new android.graphics.Point();
        ((android.view.WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        if (!z18 || z17) {
            int dimensionPixelOffset3 = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561904w2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmileyPanelFeatureService", "getRecommendHeight: %s, %s, %s, %s", java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(dimensionPixelOffset3), java.lang.Integer.valueOf(point.y));
            int i18 = point.y;
            if (i18 <= 0 || dimensionPixelOffset3 <= (i17 = i18 / 2)) {
                return dimensionPixelOffset3;
            }
        } else {
            i17 = (point.y / 2) - dimensionPixelOffset2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SmileyPanelFeatureService", "getRecommendHeight: %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(dimensionPixelOffset));
            if (i17 <= 0 || i17 >= dimensionPixelOffset) {
                return dimensionPixelOffset;
            }
        }
        return i17;
    }

    public static com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 b(android.content.Context context) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.ib) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d7) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d7.class))).getClass();
        return new com.p314xaae8f345.mm.p2776x373aa5.C22806xb44316b3(context, false);
    }

    public static com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 c(android.content.Context context, boolean z17) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.ib) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d7) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d7.class))).getClass();
        return new com.p314xaae8f345.mm.p2776x373aa5.C22806xb44316b3(context, z17);
    }

    public static qk.v9 d() {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.ib) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d7) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.d7.class))).getClass();
        return new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.w9();
    }
}
