package es2;

/* loaded from: classes2.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f337946e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, java.util.LinkedList linkedList) {
        super(1);
        this.f337945d = str;
        this.f337946e = linkedList;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        cs2.p it = (cs2.p) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String str = this.f337945d;
        boolean z17 = str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.f303625i2, str);
        if (z17) {
            this.f337946e.add(it);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
