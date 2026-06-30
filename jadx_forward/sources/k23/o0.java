package k23;

/* loaded from: classes12.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.x f385169d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(k23.x xVar) {
        super(0);
        this.f385169d = xVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        k23.x xVar = this.f385169d;
        xVar.c();
        android.view.ViewParent parent = xVar.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(xVar);
        }
        return jz5.f0.f384359a;
    }
}
