package tl2;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl2.u f501790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 f501791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f501792f;

    public m(tl2.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 n1Var, java.lang.String str) {
        this.f501790d = uVar;
        this.f501791e = n1Var;
        this.f501792f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tl2.u uVar = this.f501790d;
        int i17 = com.p314xaae8f345.mm.ui.bl.b(uVar.f501807d).y;
        int h17 = uVar.h();
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = (com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) ((jz5.n) uVar.f501813m).mo141623x754a37bb();
        android.graphics.Rect rect = uVar.f501810g;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getGlobalVisibleRect(rect);
        }
        boolean n17 = uVar.n();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 n1Var = this.f501791e;
        int i18 = uVar.f501808e;
        android.graphics.Rect rect2 = uVar.f501811h;
        if (n17) {
            rect2.set(i18, 0, ((int) ((h17 * 0.5f) - i18)) + i18, i17);
        } else {
            rect2.set(0, i18, h17, ((int) (((1.0f - n1Var.f268951a) * (i17 - uVar.f501809f)) - i18)) + i18);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[calculateViewRect] wh=");
        sb6.append(uVar.h());
        sb6.append(':');
        android.app.Activity activity = uVar.f501807d;
        sb6.append(com.p314xaae8f345.mm.ui.bl.b(activity).y);
        sb6.append(" targetRect=");
        sb6.append(rect2);
        sb6.append(" sourceRect=");
        sb6.append(rect);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRestrictVideoTransition", sb6.toString());
        java.lang.Object wi6 = ((yg0.s2) ((zg0.u2) i95.n0.c(zg0.u2.class))).wi(activity, this.f501792f, null, n1Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1 m1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) wi6;
        m1Var.Q.add(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.a1(m1Var, uVar));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) activity : null;
        if (abstractActivityC15087xee12defa != null) {
            abstractActivityC15087xee12defa.m78488x9f743232(uVar.f501817q);
        }
        uVar.f501812i = new java.lang.ref.WeakReference(wi6);
        m1Var.show();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).wk(1);
        ((hg5.d) wi6).f362939o = new tl2.l(uVar);
    }
}
