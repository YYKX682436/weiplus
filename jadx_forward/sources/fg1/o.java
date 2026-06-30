package fg1;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg1.u f343409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fg1.u uVar) {
        super(1);
        this.f343409d = uVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        fg1.u uVar = this.f343409d;
        uVar.b().c(-1, -1);
        if (!booleanValue) {
            uVar.c(false);
        }
        return jz5.f0.f384359a;
    }
}
