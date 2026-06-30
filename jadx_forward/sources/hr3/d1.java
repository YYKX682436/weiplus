package hr3;

/* loaded from: classes11.dex */
public class d1 implements ql5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f364995a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 f364996b;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2, int i17) {
        this.f364996b = activityC16840x4302a3e2;
        this.f364995a = i17;
    }

    @Override // ql5.n
    public void a(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f364996b;
        activityC16840x4302a3e2.R.setTranslationY(f17);
        int i17 = this.f364995a;
        float f18 = f17 / i17;
        if (f17 < 0.0f) {
            f18 = 0.0f;
        }
        if (f17 > i17) {
            f18 = 1.0f;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = activityC16840x4302a3e2.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((uj4.e) pf5.z.f435481a.a(activity).a(uj4.e.class)).Y6(f18, f17, i17);
        if (activityC16840x4302a3e2.f235189f == null) {
            activityC16840x4302a3e2.f235189f = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a) ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) activityC16840x4302a3e2.f235187d).h("contact_profile_header_normal");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a = activityC16840x4302a3e2.f235189f;
        if (viewOnClickListenerC16860xc669c20a != null) {
            android.view.View view = viewOnClickListenerC16860xc669c20a.T;
            android.widget.LinearLayout linearLayout = view != null ? ((hr3.u9) view.getTag()).f365607v : null;
            if (linearLayout != null) {
                float f19 = 1.0f * (1.0f - f18);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(f19));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(linearLayout, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                linearLayout.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(linearLayout, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.View view2 = activityC16840x4302a3e2.f235189f.T;
                android.view.View view3 = view2 != null ? ((hr3.u9) view2.getTag()).f365609x : null;
                if (view3 != null) {
                    if (f19 <= 0.0f) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(0);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(8);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/profile/ui/ContactInfoUI$16", "onTranslationYChange", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            bi4.i0 R = activityC16840x4302a3e2.f235189f.R();
            if (R != null) {
                R.r(f18, f17, i17);
            }
        }
    }
}
