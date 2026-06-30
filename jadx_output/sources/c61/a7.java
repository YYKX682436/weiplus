package c61;

/* loaded from: classes10.dex */
public final class a7 implements com.tencent.mm.ui.widget.dialog.x1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f38878a;

    public a7(kotlin.coroutines.Continuation continuation) {
        this.f38878a = continuation;
    }

    public final void a(boolean z17, int[] iArr) {
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "#showWeCoinNotEnoughDialog result=" + z17 + ", text=" + iArr);
        this.f38878a.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.valueOf(z17)));
    }
}
