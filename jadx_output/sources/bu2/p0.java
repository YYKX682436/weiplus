package bu2;

/* loaded from: classes4.dex */
public final class p0 implements com.tencent.mm.app.h4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f24555d;

    public p0(yz5.p pVar) {
        this.f24555d = pVar;
    }

    @Override // com.tencent.mm.app.h4
    public void a(java.lang.Thread crashThread, java.lang.String str, java.lang.Throwable thr) {
        kotlin.jvm.internal.o.g(crashThread, "crashThread");
        kotlin.jvm.internal.o.g(thr, "thr");
        this.f24555d.invoke(str, thr);
    }

    @Override // com.tencent.mm.app.h4
    public void e(int i17, java.lang.String str) {
    }
}
