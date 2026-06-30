package t03;

/* loaded from: classes10.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t03.k0 f496028d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t03.k0 k0Var) {
        super(1);
        this.f496028d = k0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        kk4.b it = (kk4.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        kk4.v vVar = (kk4.v) it;
        kk4.c cVar = vVar.f390110b;
        long mo100924x2d67b867 = cVar != null ? ((kk4.f0) cVar).mo100924x2d67b867(205) : 0L;
        kk4.c cVar2 = vVar.f390110b;
        int mo100929x8d5c7601 = cVar2 != null ? ((kk4.f0) cVar2).mo100929x8d5c7601() : 0;
        kk4.c cVar3 = vVar.f390110b;
        int mo100928x463504c = cVar3 != null ? ((kk4.f0) cVar3).mo100928x463504c() : 0;
        t03.k0 k0Var = this.f496028d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(k0Var.f495998g, "setInputContentInfo, size:[" + mo100929x8d5c7601 + ", " + mo100928x463504c + "], rotate:" + mo100924x2d67b867);
        k0Var.f496000i.m(mo100929x8d5c7601, mo100928x463504c, (int) mo100924x2d67b867);
        return jz5.f0.f384359a;
    }
}
