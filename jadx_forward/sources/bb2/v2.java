package bb2;

/* loaded from: classes5.dex */
public class v2 extends wp.i {

    /* renamed from: J, reason: collision with root package name */
    public android.text.SpannableString f100557J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(xp.d danmakuContext) {
        super(danmakuContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(danmakuContext, "danmakuContext");
    }

    @Override // wp.a
    public void a() {
        r45.oo ooVar;
        java.lang.String m75945x2fec8307;
        java.lang.Object obj = this.f529887y;
        android.text.SpannableString spannableString = null;
        bb2.o oVar = obj instanceof bb2.o ? (bb2.o) obj : null;
        if (oVar != null && (ooVar = oVar.f100459a) != null && (m75945x2fec8307 = ooVar.m75945x2fec8307(2)) != null) {
            i95.m c17 = i95.n0.c(le0.x.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            spannableString = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, m75945x2fec8307);
        }
        this.f100557J = spannableString;
    }

    @Override // wp.i, wp.a
    public zp.d r(zp.m mVar) {
        super.r(mVar);
        return new zp.d(0);
    }
}
