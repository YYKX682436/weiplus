package zi4;

/* loaded from: classes4.dex */
public final class j1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.k1 f554762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.zb f554763e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(zi4.k1 k1Var, bw5.zb zbVar) {
        super(0);
        this.f554762d = k1Var;
        this.f554763e = zbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context;
        java.lang.ref.WeakReference weakReference = this.f554762d.f554714e;
        if (weakReference != null && (context = (android.content.Context) weakReference.get()) != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = "Data from Flutter: " + this.f554763e.m75960xfb7e5820();
            e4Var.c();
        }
        return jz5.f0.f384359a;
    }
}
