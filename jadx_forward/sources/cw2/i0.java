package cw2;

/* loaded from: classes2.dex */
public final class i0 implements cw2.w9 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f305294d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f305295e;

    /* renamed from: f, reason: collision with root package name */
    public cs2.j f305296f;

    public i0(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f305294d = lifecycleOwner;
        this.f305295e = context;
    }

    @Override // cw2.w9
    public boolean V0() {
        es2.g gVar;
        cs2.j jVar = this.f305296f;
        es2.a aVar = jVar instanceof es2.a ? (es2.a) jVar : null;
        return (aVar == null || (gVar = aVar.f337859e) == null || !gVar.f337891v) ? false : true;
    }

    @Override // cw2.w9
    public cs2.j d1() {
        return this.f305296f;
    }
}
