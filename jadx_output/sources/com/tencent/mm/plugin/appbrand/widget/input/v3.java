package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public abstract class v3 extends com.tencent.mm.plugin.appbrand.widget.input.q0 {
    @Override // com.tencent.mm.plugin.appbrand.widget.input.q0
    public boolean C(com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var, pl1.f fVar) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        if (e4Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition failed, EditText is null");
            return false;
        }
        int inputId = e4Var.getInputId();
        java.lang.ref.WeakReference weakReference = this.f91610o;
        if (weakReference == null || (v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) failed, pageView is null", java.lang.Integer.valueOf(inputId));
            return false;
        }
        com.tencent.mm.plugin.appbrand.page.ia customViewContainer = v5Var.getCustomViewContainer();
        if (customViewContainer == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) failed, CustomViewContainer is null", java.lang.Integer.valueOf(inputId));
            return false;
        }
        java.lang.Boolean bool = fVar.f356606t;
        boolean w17 = customViewContainer.w(inputId, new float[]{fVar.f356591e.intValue(), fVar.f356590d.intValue(), fVar.f356588b.intValue(), fVar.f356589c.intValue(), 0}, (bool == null || !bool.booleanValue()) ? 0 : 4, fVar.f356610x, java.lang.Boolean.FALSE);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTextAreaInvokeHandler", "updateInputPosition(viewId : %s) success = %s", java.lang.Integer.valueOf(inputId), java.lang.Boolean.valueOf(w17));
        return w17;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.q0
    public boolean k(com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var, pl1.f fVar) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        if (e4Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl failed, EditText is null");
            return false;
        }
        int i17 = fVar.Q;
        java.lang.ref.WeakReference weakReference = this.f91610o;
        if (weakReference == null || (v5Var = (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get()) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) failed, pageView is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        com.tencent.mm.plugin.appbrand.page.ia customViewContainer = v5Var.getCustomViewContainer();
        if (customViewContainer == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) failed, CustomViewContainer is null", java.lang.Integer.valueOf(i17));
            return false;
        }
        java.lang.Boolean bool = fVar.f356606t;
        int i18 = (bool == null || !bool.booleanValue()) ? 0 : 4;
        int i19 = fVar.P;
        float[] fArr = {fVar.f356591e.intValue(), fVar.f356590d.intValue(), fVar.f356588b.intValue(), fVar.f356589c.intValue(), 0};
        java.lang.Boolean bool2 = fVar.f356610x;
        boolean e17 = customViewContainer.e(e4Var, i17, i19, fArr, i18, bool2 != null && bool2.booleanValue());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTextAreaInvokeHandler", "addInputImpl(viewId : %s) success = %s, ", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(e17));
        return e17;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.q0
    public synchronized com.tencent.mm.plugin.appbrand.widget.input.v4 o() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.input.q0
    public void z(com.tencent.mm.plugin.appbrand.widget.input.e4 e4Var) {
        if (e4Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl failed, EditText is null");
            return;
        }
        int inputId = e4Var.getInputId();
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f91605g;
        if (onFocusChangeListener != null) {
            ((x.n) e4Var.f91412i).remove(onFocusChangeListener);
        }
        java.lang.ref.WeakReference weakReference = this.f91610o;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = weakReference == null ? null : (com.tencent.mm.plugin.appbrand.page.v5) weakReference.get();
        if (v5Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) failed, pageView is null", java.lang.Integer.valueOf(inputId));
            return;
        }
        com.tencent.mm.plugin.appbrand.page.ia customViewContainer = v5Var.getCustomViewContainer();
        if (customViewContainer == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) failed, CustomViewContainer is null", java.lang.Integer.valueOf(inputId));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTextAreaInvokeHandler", "removeInputImpl(viewId : %s) success = %s", java.lang.Integer.valueOf(inputId), java.lang.Boolean.valueOf(customViewContainer.r(inputId)));
        }
    }
}
