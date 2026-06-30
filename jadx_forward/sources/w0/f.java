package w0;

/* loaded from: classes14.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0.s f523368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f523369e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f523370f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f523371g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(w0.s sVar, java.lang.String str, n0.v2 v2Var, java.lang.Object obj) {
        super(1);
        this.f523368d = sVar;
        this.f523369e = str;
        this.f523370f = v2Var;
        this.f523371g = obj;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        n0.b2 DisposableEffect = (n0.b2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(DisposableEffect, "$this$DisposableEffect");
        n0.v2 v2Var = this.f523370f;
        java.lang.Object obj2 = this.f523371g;
        w0.s sVar = this.f523368d;
        w0.e eVar = new w0.e(v2Var, obj2, sVar);
        java.lang.Object mo152xb9724478 = eVar.mo152xb9724478();
        if (mo152xb9724478 == null || sVar.b(mo152xb9724478)) {
            return new w0.c(sVar.d(this.f523369e, eVar));
        }
        if (mo152xb9724478 instanceof x0.e0) {
            n0.q4 q4Var = (n0.q4) ((x0.e0) mo152xb9724478);
            n0.w2 w2Var = n0.w2.f415272a;
            n0.r4 r4Var = q4Var.f415221d;
            if (r4Var == w2Var || r4Var == n0.h5.f415062a || r4Var == n0.c4.f415007a) {
                str = "MutableState containing " + q4Var.mo128745x754a37bb() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            str = mo152xb9724478 + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
        }
        throw new java.lang.IllegalArgumentException(str);
    }
}
