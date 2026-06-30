package cf2;

/* loaded from: classes3.dex */
public class e implements com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f122441d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cf2.h f122442e;

    public e(cf2.h hVar, android.content.Context context) {
        this.f122442e = hVar;
        this.f122441d = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NoticeCancelEditTipsDialog", "#dismiss height=" + i17 + " isResized=" + z17);
        if (com.p314xaae8f345.mm.ui.w9.c(this.f122441d) || com.p314xaae8f345.mm.ui.bk.g0() || !fp.h.a(30)) {
            return;
        }
        cf2.h hVar = this.f122442e;
        hVar.getClass();
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, i17);
        ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new cf2.g(hVar));
        ofInt.setDuration(200L);
        ofInt.start();
    }
}
