package ap1;

/* loaded from: classes5.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f94272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.a0 f94273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f94274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(java.lang.ref.WeakReference weakReference, ap1.a0 a0Var, int i17) {
        super(0);
        this.f94272d = weakReference;
        this.f94273e = a0Var;
        this.f94274f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ap1.w wVar = (ap1.w) this.f94272d.get();
        if (wVar != null) {
            java.lang.String username = this.f94273e.f94133a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
            int i17 = this.f94274f;
            if (i17 >= 0) {
                ap1.z zVar = wVar.f94218f;
                if (zVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                if (i17 < zVar.f94301d.size()) {
                    ap1.z zVar2 = wVar.f94218f;
                    if (zVar2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                        throw null;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ap1.a0) zVar2.f94301d.get(i17)).f94133a, username)) {
                        ap1.z zVar3 = wVar.f94218f;
                        if (zVar3 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                            throw null;
                        }
                        zVar3.m8147xed6e4d18(i17);
                    }
                }
            }
            ap1.z zVar4 = wVar.f94218f;
            if (zVar4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                throw null;
            }
            java.util.Iterator it = zVar4.f94301d.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = -1;
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((ap1.a0) it.next()).f94133a, username)) {
                    break;
                }
                i18++;
            }
            if (i18 >= 0) {
                ap1.z zVar5 = wVar.f94218f;
                if (zVar5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
                    throw null;
                }
                zVar5.m8147xed6e4d18(i18);
            }
        }
        return jz5.f0.f384359a;
    }
}
