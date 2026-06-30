package a12;

/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a12.s f522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String str, a12.s sVar) {
        super(1);
        this.f521d = str;
        this.f522e = sVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        if (view instanceof com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer) {
            com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = (com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer) view;
            android.content.Context context = magicSclViewContainer.getContext();
            a12.s sVar = this.f522e;
            java.lang.String str = this.f521d;
            magicSclViewContainer.getOnTouchListeners().put(str, new a12.p(new android.view.GestureDetector(context, new a12.q(sVar, str))));
        }
        return jz5.f0.f302826a;
    }
}
