package k53;

/* loaded from: classes8.dex */
public class j implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f385898d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 f385899e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3, java.util.List list) {
        this.f385899e = activityC15919x390706d3;
        this.f385898d = list;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3 activityC15919x390706d3 = this.f385899e;
        activityC15919x390706d3.f221648e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        k53.c0 c0Var = new k53.c0(activityC15919x390706d3);
        activityC15919x390706d3.f221649f = c0Var;
        activityC15919x390706d3.f221648e.mo7960x6cab2c8d(c0Var);
        k53.c0 c0Var2 = activityC15919x390706d3.f221649f;
        c0Var2.getClass();
        java.util.List list = this.f385898d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            c0Var2.f385879d.addAll(list);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new k53.t(c0Var2), 1000L);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3.T6(activityC15919x390706d3, ((k53.c0) activityC15919x390706d3.f221648e.mo7946xf939df19()).x(activityC15919x390706d3.f221657q));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = activityC15919x390706d3.f221648e;
        int i17 = activityC15919x390706d3.f221657q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$1", "onGlobalLayout", "()V", "Undefined", "scrollToPosition", "(I)V");
        c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$1", "onGlobalLayout", "()V", "Undefined", "scrollToPosition", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1752xed08e3c8.ActivityC15919x390706d3.U6(activityC15919x390706d3, activityC15919x390706d3.f221657q);
    }
}
