package zg2;

/* loaded from: classes3.dex */
public final class c implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f554352d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f554353e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zg2.d f554354f;

    public c(zg2.d dVar, p012xc85e97e9.p093xedfae76a.k0 originObserver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originObserver, "originObserver");
        this.f554354f = dVar;
        this.f554352d = originObserver;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        zg2.d dVar = this.f554354f;
        yz5.p pVar = dVar.f554355d;
        if (pVar != null ? ((java.lang.Boolean) pVar.mo149xb9724478(this.f554353e, obj)).booleanValue() : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f554353e, obj)) {
            dVar.getClass();
        } else {
            this.f554353e = obj;
            this.f554352d.mo525x7bb163d5(obj);
        }
    }
}
