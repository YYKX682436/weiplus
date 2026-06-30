package ap1;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f12739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.a0 f12740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.ref.WeakReference weakReference, ap1.a0 a0Var, int i17) {
        super(0);
        this.f12739d = weakReference;
        this.f12740e = a0Var;
        this.f12741f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ap1.w wVar = (ap1.w) this.f12739d.get();
        if (wVar != null) {
            java.lang.String username = this.f12740e.f12600a;
            kotlin.jvm.internal.o.g(username, "username");
            int i17 = this.f12741f;
            if (i17 >= 0) {
                ap1.z zVar = wVar.f12685f;
                if (zVar == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                if (i17 < zVar.f12768d.size()) {
                    ap1.z zVar2 = wVar.f12685f;
                    if (zVar2 == null) {
                        kotlin.jvm.internal.o.o("adapter");
                        throw null;
                    }
                    if (kotlin.jvm.internal.o.b(((ap1.a0) zVar2.f12768d.get(i17)).f12600a, username)) {
                        ap1.z zVar3 = wVar.f12685f;
                        if (zVar3 == null) {
                            kotlin.jvm.internal.o.o("adapter");
                            throw null;
                        }
                        zVar3.notifyItemChanged(i17);
                    }
                }
            }
            ap1.z zVar4 = wVar.f12685f;
            if (zVar4 == null) {
                kotlin.jvm.internal.o.o("adapter");
                throw null;
            }
            java.util.Iterator it = zVar4.f12768d.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (kotlin.jvm.internal.o.b(((ap1.a0) it.next()).f12600a, username)) {
                    break;
                }
                i18++;
            }
            if (i18 >= 0) {
                ap1.z zVar5 = wVar.f12685f;
                if (zVar5 == null) {
                    kotlin.jvm.internal.o.o("adapter");
                    throw null;
                }
                zVar5.notifyItemChanged(i18);
            }
        }
        return jz5.f0.f302826a;
    }
}
