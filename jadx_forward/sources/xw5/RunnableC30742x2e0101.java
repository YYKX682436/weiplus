package xw5;

/* renamed from: xw5.d$$e */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC30742x2e0101 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xw5.d f539296d;

    public /* synthetic */ RunnableC30742x2e0101(xw5.d dVar) {
        this.f539296d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xw5.d this$0 = this.f539296d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this$0, "this$0");
        if (this$0.f539288j && this$0.f539287i) {
            java.util.Iterator it = this$0.f539285g.iterator();
            while (it.hasNext()) {
                this$0.c((java.lang.String) it.next());
            }
        }
    }
}
