package am2;

/* loaded from: classes3.dex */
public final class e2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f8661a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f8662b;

    public e2(com.tencent.mm.ui.MMActivity activity, gk2.e liveData) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f8661a = activity;
        this.f8662b = liveData;
    }

    public static final void a(am2.e2 e2Var, r45.ai1 ai1Var) {
        ((mm2.x4) e2Var.f8662b.a(mm2.x4.class)).f329545z.postValue(new jz5.l(ai1Var, "mockMsgId"));
    }
}
