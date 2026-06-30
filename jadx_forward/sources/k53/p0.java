package k53;

/* loaded from: classes8.dex */
public class p0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k53.u0 f385914a;

    public p0(k53.u0 u0Var) {
        this.f385914a = u0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.n0
    public void a(boolean z17, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        k53.u0 u0Var = this.f385914a;
        if (u0Var.f385931d.equals(str)) {
            android.view.View view = u0Var.f385929b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper$5", "onFinish", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper$5", "onFinish", "(ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.VideoShareWrapper", "success : %b, errCode: %d, localId : %s, mediaId : %s, mediaUrl : %s, costTime: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), str, str2, str3, java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - u0Var.f385934g));
            k53.s0 s0Var = u0Var.f385933f;
            if (s0Var != null) {
                s0Var.a(new k53.t0(u0Var, u0Var.f385932e, str3, str4));
            }
        }
    }
}
