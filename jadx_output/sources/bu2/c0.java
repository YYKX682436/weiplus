package bu2;

/* loaded from: classes2.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f24496d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(java.lang.String str) {
        super(1);
        this.f24496d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.y31 y31Var = (r45.y31) obj;
        boolean z17 = true;
        java.lang.String string = y31Var.getString(1);
        java.lang.String str = this.f24496d;
        if (!kotlin.jvm.internal.o.b(str, string)) {
            if (!(str.length() == 0) && !com.tencent.mm.sdk.platformtools.t8.K0(y31Var.getString(1))) {
                z17 = false;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
