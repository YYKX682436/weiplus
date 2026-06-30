package dj0;

/* loaded from: classes11.dex */
public class j implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj0.k f314382d;

    public j(dj0.k kVar) {
        this.f314382d = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        dj0.x xVar;
        android.view.WindowInsets rootWindowInsets;
        dj0.k kVar = this.f314382d;
        android.view.View view = kVar.f314386g;
        int i17 = dj0.m.f314395a;
        if (view == null || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            xVar = null;
        } else {
            dj0.x xVar2 = new dj0.x(rootWindowInsets);
            dj0.w wVar = xVar2.f314420a;
            wVar.p(xVar2);
            wVar.d(view.getRootView());
            xVar = xVar2;
        }
        if (xVar != null) {
            dj0.w wVar2 = xVar.f314420a;
            dj0.l f17 = wVar2.f(8);
            dj0.l f18 = wVar2.f(7);
            int i18 = f17.f314394d;
            if (kVar.f314388i == i18) {
                return;
            }
            kVar.f314388i = i18;
            int i19 = f18.f314394d;
            if (i18 > i19) {
                i18 -= i19;
            }
            android.app.Activity activity = kVar.f314383d;
            if (activity == null) {
                return;
            }
            double d17 = i18 / activity.getResources().getDisplayMetrics().density;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put(qc1.v.f76446x24728b, i18 != 0);
                jSONObject.put("keyboardHeight", d17);
                jSONObject.put("inputAccessoryHeight", 0);
            } catch (org.json.JSONException unused) {
            }
            java.lang.String jSONObject2 = jSONObject.toString();
            if (kVar.f314387h == null || android.text.TextUtils.isEmpty(jSONObject2)) {
                return;
            }
            kVar.f314387h.mo138418x90b54003(jSONObject2);
        }
    }
}
