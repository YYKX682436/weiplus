package df;

/* loaded from: classes15.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.d f310960d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(df.d dVar) {
        super(1);
        this.f310960d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.inputmethod.InputConnection inputConnection = (android.view.inputmethod.InputConnection) obj;
        df.d dVar = this.f310960d;
        if (dVar != null) {
            dVar.a(inputConnection);
        }
        return jz5.f0.f384359a;
    }
}
