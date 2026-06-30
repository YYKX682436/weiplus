package mx0;

/* loaded from: classes.dex */
public final class s2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.v2 f413834d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f413835e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(mx0.v2 v2Var, int i17) {
        super(0);
        this.f413834d = v2Var;
        this.f413835e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f413834d.f413923d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(this.f413835e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/OpenAlbumPlugin$setVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/OpenAlbumPlugin$setVisibility$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f384359a;
    }
}
