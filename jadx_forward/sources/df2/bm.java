package df2;

/* loaded from: classes3.dex */
public final class bm extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.hm f311350d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(df2.hm hmVar) {
        super(0);
        this.f311350d = hmVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        df2.hm hmVar = this.f311350d;
        android.view.View b76 = hmVar.b7();
        if (b76 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b76, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateVisitorHeatTips$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(b76, "com/tencent/mm/plugin/finder/live/controller/LiveHeatController$updateVisitorHeatTips$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        df2.hm.Z6(hmVar);
        return jz5.f0.f384359a;
    }
}
