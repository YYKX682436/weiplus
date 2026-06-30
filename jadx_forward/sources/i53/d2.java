package i53;

/* loaded from: classes8.dex */
public class d2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w1 {

    /* renamed from: u, reason: collision with root package name */
    public i53.c2 f370077u;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w1
    public void b() {
        super.b();
        i53.c2 c2Var = this.f370077u;
        if (c2Var != null) {
            i53.w2 w2Var = ((i53.p2) c2Var).f370222a;
            if (w2Var.f370309n == 0) {
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() - w2Var.f370309n;
            w2Var.f370309n = 0L;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("loading_time", java.lang.Long.valueOf(currentTimeMillis));
            w2Var.b(501, 41, hashMap);
            w2Var.f370307i.f();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w1
    public void d(int i17) {
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) this.f264176d.getLayoutParams();
        layoutParams.topMargin = i17 - this.f264176d.getHeight();
        this.f264176d.setLayoutParams(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w1
    public void e() {
        i53.c2 c2Var = this.f370077u;
        if (c2Var != null) {
            i53.p2 p2Var = (i53.p2) c2Var;
            p2Var.getClass();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            i53.w2 w2Var = p2Var.f370222a;
            w2Var.f370309n = currentTimeMillis;
            w2Var.f370307i.e();
            w2Var.postDelayed(new i53.o2(p2Var), 400L);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w1
    public void f(android.view.View view, android.view.View view2) {
        super.f(view, view2);
        m74244x3940e08c(-1);
    }

    /* renamed from: setOnPullDownListener */
    public void m134740x3876e65c(i53.c2 c2Var) {
        this.f370077u = c2Var;
    }
}
