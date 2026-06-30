package g80;

/* loaded from: classes12.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s70.e f350946d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(s70.e eVar) {
        super(0);
        this.f350946d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        s70.b bVar;
        s70.e eVar = this.f350946d;
        java.lang.ref.WeakReference weakReference = eVar.f485466a.f485487k;
        if (weakReference != null && (bVar = (s70.b) weakReference.get()) != null) {
            ((e80.l) bVar).a(eVar);
        }
        java.util.Iterator it = ((java.util.HashSet) ((jz5.n) ((v70.w) i95.n0.c(v70.w.class)).f515159n).mo141623x754a37bb()).iterator();
        while (it.hasNext()) {
            ((e80.l) ((s70.b) it.next())).a(eVar);
        }
        return jz5.f0.f384359a;
    }
}
