package bb2;

/* loaded from: classes5.dex */
public class v2 extends wp.i {

    /* renamed from: J, reason: collision with root package name */
    public android.text.SpannableString f19024J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(xp.d danmakuContext) {
        super(danmakuContext);
        kotlin.jvm.internal.o.g(danmakuContext, "danmakuContext");
    }

    @Override // wp.a
    public void a() {
        r45.oo ooVar;
        java.lang.String string;
        java.lang.Object obj = this.f448354y;
        android.text.SpannableString spannableString = null;
        bb2.o oVar = obj instanceof bb2.o ? (bb2.o) obj : null;
        if (oVar != null && (ooVar = oVar.f18926a) != null && (string = ooVar.getString(2)) != null) {
            i95.m c17 = i95.n0.c(le0.x.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            spannableString = com.tencent.mm.pluginsdk.ui.span.c0.i(com.tencent.mm.sdk.platformtools.x2.f193071a, string);
        }
        this.f19024J = spannableString;
    }

    @Override // wp.i, wp.a
    public zp.d r(zp.m mVar) {
        super.r(mVar);
        return new zp.d(0);
    }
}
