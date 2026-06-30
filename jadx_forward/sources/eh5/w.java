package eh5;

/* loaded from: classes10.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh5.y f334508d;

    public w(eh5.y yVar) {
        this.f334508d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh5.y yVar = this.f334508d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = yVar.f334515n;
        if (c22642x62f5b194 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
        c22642x62f5b194.invalidateOutline();
        yVar.f334517p = false;
        if (yVar.f334518q) {
            yVar.f334518q = false;
            yVar.dismiss();
        }
    }
}
