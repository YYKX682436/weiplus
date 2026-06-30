package cs0;

/* loaded from: classes14.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 f303572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 c10899x89fee862) {
        super(0);
        this.f303572d = c10899x89fee862;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p859x62f6fe4.p860xae79c325.p864x373aa5.p865x38b7655d.C10899x89fee862 c10899x89fee862 = this.f303572d;
        java.lang.Object obj = c10899x89fee862.f150418h;
        android.view.View view = obj instanceof android.view.View ? (android.view.View) obj : null;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$resetFocusView$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/media/camera/view/control/CameraFocusAndMeteringView$resetFocusView$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        cs0.i iVar = c10899x89fee862.f150418h;
        if (iVar != null) {
            iVar.mo46844x6761d4f();
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = c10899x89fee862.f150430w;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        c10899x89fee862.f150430w = null;
        c10899x89fee862.f150426s = false;
        c10899x89fee862.f150425r = c10899x89fee862.f150424q;
        c10899x89fee862.f150422o = 0.0f;
        c10899x89fee862.f150421n = 0.0f;
        c10899x89fee862.f150427t = true;
        return jz5.f0.f384359a;
    }
}
