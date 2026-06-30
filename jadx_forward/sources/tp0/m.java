package tp0;

/* loaded from: classes7.dex */
public final class m implements jc3.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f502559a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f502560b;

    public m(android.widget.FrameLayout frameLayout) {
        this.f502560b = frameLayout;
    }

    @Override // jc3.m
    public java.lang.Object a(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        org.json.JSONObject optJSONObject = data.optJSONObject("position");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optJSONObject);
        return new tp0.j(vp0.b.b(java.lang.Integer.valueOf(optJSONObject.optInt("x"))), vp0.b.b(java.lang.Integer.valueOf(optJSONObject.optInt("y"))), vp0.b.b(java.lang.Integer.valueOf(optJSONObject.optInt("width"))), vp0.b.b(java.lang.Integer.valueOf(optJSONObject.optInt("height"))), optJSONObject.optInt("zIndex"), data.optInt("hide"));
    }

    @Override // jc3.m
    public void b(java.lang.Object obj, jc3.k callback) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f502560b.removeView(view);
        this.f502559a.remove(java.lang.Integer.valueOf(view.getId()));
    }

    @Override // jc3.m
    public void c(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        android.view.View view = (android.view.View) obj;
        tp0.j viewAttribute = (tp0.j) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewAttribute, "viewAttribute");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(viewAttribute.f502555c, viewAttribute.f502556d);
        layoutParams.leftMargin = viewAttribute.f502553a;
        layoutParams.topMargin = viewAttribute.f502554b;
        view.setLayoutParams(layoutParams);
    }

    @Override // jc3.m
    public jc3.l d(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return new jc3.a();
    }

    @Override // jc3.m
    public void e(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        int i17;
        android.view.View view = (android.view.View) obj;
        tp0.j viewAttribute = (tp0.j) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewAttribute, "viewAttribute");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(viewAttribute.f502555c, viewAttribute.f502556d);
        layoutParams.leftMargin = viewAttribute.f502553a;
        layoutParams.topMargin = viewAttribute.f502554b;
        java.util.HashMap hashMap = this.f502559a;
        java.util.Iterator it = hashMap.entrySet().iterator();
        int i18 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            i17 = viewAttribute.f502557e;
            if (!hasNext) {
                break;
            } else if (i17 >= ((java.lang.Number) ((java.util.Map.Entry) it.next()).getValue()).intValue()) {
                i18++;
            }
        }
        android.widget.FrameLayout frameLayout = this.f502560b;
        if (i18 > frameLayout.getChildCount()) {
            i18 = frameLayout.getChildCount();
        }
        frameLayout.addView(view, i18, layoutParams);
        hashMap.put(java.lang.Integer.valueOf(view.getId()), java.lang.Integer.valueOf(i17));
    }
}
