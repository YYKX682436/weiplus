package sv4;

/* loaded from: classes12.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sv4.c f494925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sv4.c cVar) {
        super(0);
        this.f494925d = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mv4.h hVar;
        java.lang.ref.WeakReference weakReference = this.f494925d.f494926g;
        sv4.d dVar = (sv4.d) weakReference.get();
        if (dVar == null || (hVar = ((qv4.r0) dVar).f448540a) == null) {
            hVar = new mv4.h("");
        }
        return new sv4.i(weakReference, hVar);
    }
}
