package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes5.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9 f166042d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9 activityC12328x4aa1de9) {
        this.f166042d = activityC12328x4aa1de9;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.y yVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.ActivityC12328x4aa1de9 activityC12328x4aa1de9 = this.f166042d;
        if (activityC12328x4aa1de9.isDestroyed() || activityC12328x4aa1de9.isFinishing() || (yVar = activityC12328x4aa1de9.f165882h) == null || !yVar.b()) {
            return;
        }
        try {
            android.view.View view = activityC12328x4aa1de9.f165883i;
            if (view == null) {
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) activityC12328x4aa1de9.findViewById(android.R.id.content);
                android.view.View inflate = android.view.View.inflate(activityC12328x4aa1de9, com.p314xaae8f345.mm.R.C30864xbddafb2a.c1_, null);
                frameLayout.addView(inflate, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
                ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jma)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.ggc);
                activityC12328x4aa1de9.f165883i = inflate;
            } else {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/launching/AppBrandLaunchProxyUI$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            activityC12328x4aa1de9.n6(activityC12328x4aa1de9.f165886o);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandLaunchProxyUI", "attach dialog View e=%s", e17);
        }
    }
}
