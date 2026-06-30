package eo2;

/* loaded from: classes2.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337097a;

    public e(java.lang.String str) {
        this.f337097a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        eo2.f fVar2 = eo2.f.f337098a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fVar);
        java.lang.String str = this.f337097a;
        fVar2.g(str, fVar);
        return java.lang.Boolean.valueOf(((java.util.HashSet) eo2.f.f337100c).remove(str));
    }
}
