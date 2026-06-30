package c01;

/* loaded from: classes12.dex */
public class pd implements java.util.concurrent.Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f118915d;

    public pd(java.lang.String str) {
        this.f118915d = str;
    }

    @Override // java.util.concurrent.Callable
    public java.lang.Object call() {
        c01.qd qdVar = new c01.qd(this.f118915d, true, false);
        java.lang.String b17 = qdVar.b(4);
        com.p314xaae8f345.mm.app.C5000x71a2fa35.f134779g.e(b17);
        com.p314xaae8f345.mm.app.C4999x403c3a42.f134762j.f135025k.e(b17);
        return qdVar;
    }
}
