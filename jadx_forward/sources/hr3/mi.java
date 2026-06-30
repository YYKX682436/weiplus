package hr3;

/* loaded from: classes11.dex */
public class mi extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f365346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a f365347e;

    public mi(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a, java.lang.String str) {
        this.f365347e = activityC16872x6384268a;
        this.f365346d = str;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16872x6384268a activityC16872x6384268a = this.f365347e;
        activityC16872x6384268a.E[1] = 1;
        boolean z17 = activityC16872x6384268a.B;
        java.lang.String str = this.f365346d;
        if (z17) {
            java.lang.CharSequence m79028xfb85ada3 = activityC16872x6384268a.f235379h.m79028xfb85ada3();
            int e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(m79028xfb85ada3.toString(), com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2);
            if (e17 > 0) {
                activityC16872x6384268a.E[2] = 1;
            }
            uc0.q qVar = (uc0.q) i95.n0.c(uc0.q.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16872x6384268a.mo55332x76847179();
            hr3.li liVar = new hr3.li(this, m79028xfb85ada3);
            ((tc0.m) qVar).getClass();
            hw3.a.a(mo55332x76847179, str, e17, 64, liVar);
        } else {
            java.lang.String e18 = ck5.f.e(str, 64);
            if (e18 == null) {
                e18 = "";
            }
            if (str != null && e18.length() < str.length()) {
                android.widget.Toast.makeText(activityC16872x6384268a, activityC16872x6384268a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574344hy2), 0).show();
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = activityC16872x6384268a.f235379h;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float m79030x40077844 = activityC16872x6384268a.f235379h.m79030x40077844();
            ((ke0.e) xVar).getClass();
            c21503x6e5a020a.m79039x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activityC16872x6384268a, e18, m79030x40077844));
            activityC16872x6384268a.f235379h.m79037xf579a34a(e18.length());
            android.view.View view2 = activityC16872x6384268a.f235380i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        activityC16872x6384268a.D[4] = 1;
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/SayHiWithSnsPermissionUI3$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f365347e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560257ff));
        textPaint.setUnderlineText(false);
    }
}
