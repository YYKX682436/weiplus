package c01;

/* loaded from: classes12.dex */
public class pd implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f37382d;

    public pd(java.lang.String str) {
        this.f37382d = str;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        c01.qd qdVar = new c01.qd(this.f37382d, true, false);
        java.lang.String b17 = qdVar.b(4);
        com.tencent.mm.app.MMCrashReportContents.f53246g.e(b17);
        com.tencent.mm.app.MMBugReportContents.f53229j.f53492k.e(b17);
        return qdVar;
    }
}
