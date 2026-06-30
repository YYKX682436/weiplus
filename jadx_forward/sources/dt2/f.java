package dt2;

/* loaded from: classes3.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dt2.h f324707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f324708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.w94 f324709f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dt2.h hVar, android.graphics.Bitmap bitmap, r45.w94 w94Var) {
        super(0);
        this.f324707d = hVar;
        this.f324708e = bitmap;
        this.f324709f = w94Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        dt2.h hVar = this.f324707d;
        hVar.f324713d.setImageBitmap(this.f324708e);
        android.view.View view = hVar.f324716g;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView$setFragment$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/replay/widget/FinderLiveReplayFragmentThumbView$setFragment$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        hVar.m126201x1a7c9f24(r2.getWidth() / r2.getHeight());
        hVar.f324715f.setOnClickListener(new dt2.e(hVar, this.f324709f));
        return jz5.f0.f384359a;
    }
}
