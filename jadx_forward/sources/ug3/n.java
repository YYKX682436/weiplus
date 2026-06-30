package ug3;

/* loaded from: classes9.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ug3.o f509102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509103e;

    public n(ug3.o oVar, java.lang.String str) {
        this.f509102d = oVar;
        this.f509103e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.util.ArrayList arrayList = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.f278359y;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.class);
        intent.addFlags(268435456).addFlags(67108864);
        this.f509102d.b(intent, this.f509103e);
    }
}
