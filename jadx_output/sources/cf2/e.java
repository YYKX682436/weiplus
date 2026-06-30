package cf2;

/* loaded from: classes3.dex */
public class e implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f40908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cf2.h f40909e;

    public e(cf2.h hVar, android.content.Context context) {
        this.f40909e = hVar;
        this.f40908d = context;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public void w2(int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("NoticeCancelEditTipsDialog", "#dismiss height=" + i17 + " isResized=" + z17);
        if (com.tencent.mm.ui.w9.c(this.f40908d) || com.tencent.mm.ui.bk.g0() || !fp.h.a(30)) {
            return;
        }
        cf2.h hVar = this.f40909e;
        hVar.getClass();
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, i17);
        ofInt.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new cf2.g(hVar));
        ofInt.setDuration(200L);
        ofInt.start();
    }
}
