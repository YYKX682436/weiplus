package uf;

/* loaded from: classes7.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.o1 f508578d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(uf.o1 o1Var) {
        super(1);
        this.f508578d = o1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        uf.h2 it = (uf.h2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaCastHandler", "volume now:" + it.f508564b);
        f06.v[] vVarArr = uf.o1.f508604u;
        uf.o0 q17 = this.f508578d.q();
        java.lang.Object obj2 = it.f508564b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
        q17.e(((java.lang.Number) obj2).intValue() + 1);
        return jz5.f0.f384359a;
    }
}
