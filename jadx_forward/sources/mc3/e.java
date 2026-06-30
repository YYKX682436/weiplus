package mc3;

/* loaded from: classes7.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mc3.f f407157d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(mc3.f fVar) {
        super(0);
        this.f407157d = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mc3.f fVar = this.f407157d;
        fVar.f407164m = true;
        boolean z17 = fVar.f407161g;
        java.lang.ref.WeakReference weakReference = fVar.f407162h;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        fVar.mo147148x5cd39ffa();
        if (z17) {
            fVar.V(activity);
            java.util.Iterator it = ((java.util.HashSet) fVar.f407163i).iterator();
            while (it.hasNext()) {
                ((jc3.l0) it.next()).d0(false);
            }
        }
        fVar.f407164m = false;
        return jz5.f0.f384359a;
    }
}
