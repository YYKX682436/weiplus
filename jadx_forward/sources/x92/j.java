package x92;

/* loaded from: classes3.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x92.l f534231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f534232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x92.l lVar, android.widget.ImageView imageView) {
        super(0);
        this.f534231d = lVar;
        this.f534232e = imageView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        x92.l lVar = this.f534231d;
        wu5.c cVar = lVar.f534241o;
        if (cVar != null) {
            cVar.cancel(false);
        }
        this.f534232e.setVisibility(0);
        lVar.Y6(true);
        return jz5.f0.f384359a;
    }
}
