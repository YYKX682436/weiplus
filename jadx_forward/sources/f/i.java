package f;

/* loaded from: classes14.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.i f339514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f339515e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f.k f339516f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p013x9d4bf30f.i iVar, p012xc85e97e9.p093xedfae76a.y yVar, f.k kVar) {
        super(1);
        this.f339514d = iVar;
        this.f339515e = yVar;
        this.f339516f = kVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        p012xc85e97e9.p013x9d4bf30f.i iVar = this.f339514d;
        p012xc85e97e9.p093xedfae76a.y yVar = this.f339515e;
        f.k kVar = this.f339516f;
        iVar.a(yVar, kVar);
        return new f.h(kVar);
    }
}
