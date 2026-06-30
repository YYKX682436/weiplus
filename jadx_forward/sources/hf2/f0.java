package hf2;

/* loaded from: classes10.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.h0 f362589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(hf2.h0 h0Var) {
        super(3);
        this.f362589d = h0Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        r45.ei0 restoreData = (r45.ei0) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(restoreData, "restoreData");
        hf2.h0 h0Var = this.f362589d;
        h0Var.f362603a.q7("launchStickerOperationContainer", bitmap, booleanValue, restoreData, false);
        h0Var.f362603a.n7("operation success");
        h0Var.a();
        return jz5.f0.f384359a;
    }
}
