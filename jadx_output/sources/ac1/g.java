package ac1;

/* loaded from: classes7.dex */
public class g extends gb1.h {
    public static final int CTRL_INDEX = 510;
    public static final java.lang.String NAME = "updatePositioningContainer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("containerId");
    }

    @Override // gb1.h
    public boolean K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        if (!(view instanceof com.tencent.mm.plugin.appbrand.jsapi.container.WrapperNativeContainerView)) {
            return false;
        }
        int j17 = ik1.w.j(jSONObject, "contentOffsetLeft", 0);
        int j18 = ik1.w.j(jSONObject, "contentOffsetTop", 0);
        int optInt = jSONObject.optInt("animate", 0);
        com.tencent.mm.plugin.appbrand.jsapi.container.WrapperNativeContainerView wrapperNativeContainerView = (com.tencent.mm.plugin.appbrand.jsapi.container.WrapperNativeContainerView) view;
        try {
            wrapperNativeContainerView.setVisibility(jSONObject.getBoolean("visible") ? 0 : 4);
        } catch (org.json.JSONException unused) {
        }
        com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView appBrandNativeContainerView = (com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView) wrapperNativeContainerView.d(com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdatePositioningContainer", "scrollLeft:%d, scrollTop:%d, animation:%d", java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(j18), java.lang.Integer.valueOf(optInt));
        if (optInt == 1) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(appBrandNativeContainerView, "x", appBrandNativeContainerView.getX(), -j17);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(appBrandNativeContainerView, "y", appBrandNativeContainerView.getY(), -j18);
            ofFloat.addUpdateListener(new ac1.d(this, appBrandNativeContainerView));
            ofFloat2.addUpdateListener(new ac1.e(this, appBrandNativeContainerView));
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.setDuration(1000L);
            animatorSet.setInterpolator(new ac1.f(this, 0.0f, 0.0f, 0.58f, 1.0f));
            animatorSet.setTarget(appBrandNativeContainerView);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.start();
        } else {
            appBrandNativeContainerView.setX(-j17);
            appBrandNativeContainerView.setY(-j18);
        }
        int j19 = ik1.w.j(jSONObject, "innerHeight", appBrandNativeContainerView.getHeight());
        int j27 = ik1.w.j(jSONObject, "innerWidth", appBrandNativeContainerView.getWidth());
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiUpdatePositioningContainer", "innerHeight:%d, innerWidth:%d", java.lang.Integer.valueOf(j19), java.lang.Integer.valueOf(j27));
        android.view.ViewGroup.LayoutParams layoutParams = appBrandNativeContainerView.getLayoutParams();
        layoutParams.height = j19;
        layoutParams.width = j27;
        appBrandNativeContainerView.setLayoutParams(layoutParams);
        return true;
    }
}
