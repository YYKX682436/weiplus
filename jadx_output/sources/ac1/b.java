package ac1;

/* loaded from: classes7.dex */
public class b extends gb1.d {
    public static final int CTRL_INDEX = 509;
    public static final java.lang.String NAME = "insertPositioningContainer";

    @Override // gb1.i
    public int H(org.json.JSONObject jSONObject) {
        return jSONObject.getInt("containerId");
    }

    @Override // gb1.d
    public android.view.View K(com.tencent.mm.plugin.appbrand.jsapi.t tVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView appBrandNativeContainerView = new com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(tVar.getContext()));
        appBrandNativeContainerView.setBackgroundColor(0);
        boolean optBoolean = jSONObject.optBoolean("visible", true);
        boolean optBoolean2 = jSONObject.optBoolean("canFullScreenByChild", false);
        int j17 = ik1.w.j(jSONObject, "contentOffsetLeft", 0);
        int j18 = ik1.w.j(jSONObject, "contentOffsetTop", 0);
        appBrandNativeContainerView.setX(-j17);
        appBrandNativeContainerView.setY(-j18);
        com.tencent.mm.plugin.appbrand.jsapi.container.WrapperNativeContainerView wrapperNativeContainerView = new com.tencent.mm.plugin.appbrand.jsapi.container.WrapperNativeContainerView(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(tVar.getContext()), appBrandNativeContainerView);
        wrapperNativeContainerView.setVisibility(optBoolean ? 0 : 4);
        wrapperNativeContainerView.setDuplicateParentStateEnabled(true);
        appBrandNativeContainerView.setDuplicateParentStateEnabled(true);
        appBrandNativeContainerView.setFullscreenWithChild(optBoolean2);
        return wrapperNativeContainerView;
    }

    @Override // gb1.d
    public void N(com.tencent.mm.plugin.appbrand.jsapi.t tVar, int i17, android.view.View view, org.json.JSONObject jSONObject) {
        view.setOnTouchListener(new ac1.a(this));
    }
}
