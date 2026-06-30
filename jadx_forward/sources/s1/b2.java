package s1;

/* loaded from: classes14.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.k2 f483526d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(s1.k2 k2Var) {
        super(0);
        this.f483526d = k2Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        s1.q0 a17 = this.f483526d.a();
        java.util.Iterator it = ((java.util.LinkedHashMap) a17.f483598e).entrySet().iterator();
        while (it.hasNext()) {
            ((s1.k0) ((java.util.Map.Entry) it.next()).getValue()).f483555d = true;
        }
        u1.w wVar = a17.f483594a;
        if (!wVar.X) {
            wVar.I(false);
        }
        return jz5.f0.f384359a;
    }
}
