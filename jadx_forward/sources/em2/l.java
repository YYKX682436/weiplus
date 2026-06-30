package em2;

/* loaded from: classes3.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em2.u f336686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f336687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f336688f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(em2.u uVar, android.view.View view, long j17) {
        super(3);
        this.f336686d = uVar;
        this.f336687e = view;
        this.f336688f = j17;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.content.Context context;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ug5.v performer = (ug5.v) obj2;
        android.content.Intent intent = (android.content.Intent) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        em2.u uVar = this.f336686d;
        android.view.View it = this.f336687e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "$it");
        long j17 = this.f336688f;
        android.view.View view = performer.f509193c;
        if (view == null || (context = view.getContext()) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Context context2 = context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
        uVar.d(it, booleanValue, j17, context2, intent);
        return jz5.f0.f384359a;
    }
}
