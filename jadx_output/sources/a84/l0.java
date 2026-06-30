package a84;

/* loaded from: classes.dex */
public final class l0 implements za4.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f2328a;

    public l0(kotlinx.coroutines.q qVar) {
        this.f2328a = qVar;
    }

    @Override // za4.r1
    public final int a(boolean z17, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2$1$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback with: isSucc = ");
        sb6.append(z17);
        sb6.append(", canvasXml.len = ");
        sb6.append(str != null ? java.lang.Integer.valueOf(str.length()) : null);
        com.tencent.mars.xlog.Log.i("OpenAdCanvasHelper", sb6.toString());
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        ((kotlinx.coroutines.r) this.f2328a).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.valueOf(z17), str)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.utils.OpenAdCanvasHelper$requestAdCanvasXmlByNet$2$1$1");
        return 0;
    }
}
