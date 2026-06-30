package bu2;

/* loaded from: classes2.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106029d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.lang.String str) {
        super(1);
        this.f106029d = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.y31 y31Var = (r45.y31) obj;
        boolean z17 = true;
        java.lang.String m75945x2fec8307 = y31Var.m75945x2fec8307(1);
        java.lang.String str = this.f106029d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, m75945x2fec8307)) {
            if (!(str.length() == 0) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(y31Var.m75945x2fec8307(1))) {
                z17 = false;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
