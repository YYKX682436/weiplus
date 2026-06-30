package hr3;

/* loaded from: classes11.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f365724d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365725e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 f365726f;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2, android.view.View view, java.lang.String str) {
        this.f365726f = activityC16840x4302a3e2;
        this.f365724d = view;
        this.f365725e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        final java.lang.String str = this.f365725e;
        hr3.o1 o1Var = new hr3.o1() { // from class: hr3.y0$$a
            @Override // hr3.o1
            /* renamed from: apply */
            public final java.lang.Boolean mo133971x58b836e(java.lang.Object obj) {
                android.view.View view = (android.view.View) obj;
                if (view.getId() != com.p314xaae8f345.mm.R.id.m7k) {
                    return java.lang.Boolean.FALSE;
                }
                return java.lang.Boolean.valueOf((view.findViewById(android.R.id.title) instanceof android.widget.TextView) && ((android.widget.TextView) view.findViewById(android.R.id.title)).getText().equals(str));
            }
        };
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2.U;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = this.f365726f;
        android.view.View X6 = activityC16840x4302a3e2.X6(this.f365724d, o1Var);
        if (X6 == null || X6.isAccessibilityFocused() || java.lang.System.currentTimeMillis() - activityC16840x4302a3e2.Q <= 0) {
            return;
        }
        activityC16840x4302a3e2.Q = java.lang.System.currentTimeMillis();
        X6.sendAccessibilityEvent(128);
    }
}
