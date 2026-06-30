package l41;

/* loaded from: classes15.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f397510d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(l41.j1 j1Var) {
        super(0);
        this.f397510d = j1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent intent = this.f397510d.f397375a.getIntent();
        if (intent != null) {
            return (android.os.ResultReceiver) intent.getParcelableExtra("key_result_receiver");
        }
        return null;
    }
}
