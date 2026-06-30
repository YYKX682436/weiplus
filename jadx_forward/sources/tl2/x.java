package tl2;

/* loaded from: classes3.dex */
public final class x extends p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975 {
    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void g(u4.m1 transitionValues) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transitionValues, "transitionValues");
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public void j(u4.m1 transitionValues) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transitionValues, "transitionValues");
        java.util.Map values = transitionValues.f506047a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "values");
        java.lang.Object tag = transitionValues.f506048b.getTag();
        ((java.util.HashMap) values).put("com.tencent.mm:View:click_listener", tag instanceof android.view.View.OnClickListener ? (android.view.View.OnClickListener) tag : null);
    }

    @Override // p012xc85e97e9.p112x993b6d55.AbstractC1183x100d4975
    public android.animation.Animator n(android.view.ViewGroup sceneRoot, u4.m1 m1Var, u4.m1 m1Var2) {
        android.view.View view;
        java.util.Map map;
        java.util.Map map2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneRoot, "sceneRoot");
        if ((((m1Var == null || (map2 = m1Var.f506047a) == null) ? null : ((java.util.HashMap) map2).get("com.tencent.mm:View:click_listener")) instanceof android.view.View.OnClickListener) && m1Var2 != null && (view = m1Var2.f506048b) != null) {
            java.lang.Object obj = (m1Var == null || (map = m1Var.f506047a) == null) ? null : ((java.util.HashMap) map).get("com.tencent.mm:View:click_listener");
            view.setOnClickListener(obj instanceof android.view.View.OnClickListener ? (android.view.View.OnClickListener) obj : null);
        }
        return null;
    }
}
