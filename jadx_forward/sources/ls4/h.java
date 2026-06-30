package ls4;

/* loaded from: classes8.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls4.u f402593d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ls4.u uVar) {
        super(1);
        this.f402593d = uVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long j17;
        ns4.c0 it = (ns4.c0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        ls4.u uVar = this.f402593d;
        uVar.getClass();
        js4.n nVar = new js4.n();
        nVar.f383084i = it.f420997c;
        nVar.f383085j = false;
        pr4.l lVar = uVar.f402633a;
        nVar.f383077b = lVar.f439553a;
        if (it.b()) {
            j17 = 0;
        } else {
            j17 = r8.f421027a.f439562j - it.f420996b.f421028b;
        }
        nVar.f383086k = j17;
        nVar.f383079d = new ls4.n(uVar);
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d(lVar.f439554b, nVar);
        return jz5.f0.f384359a;
    }
}
