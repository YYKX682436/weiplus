package am2;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f8758a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f8759b;

    public v(com.tencent.mm.ui.MMActivity activity, gk2.e liveData) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f8758a = activity;
        this.f8759b = liveData;
    }

    public static final r45.ch1 a(am2.v vVar, com.tencent.mm.protobuf.g gVar, int i17) {
        vVar.getClass();
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(1, java.lang.Integer.valueOf(i17));
        r45.xn1 xn1Var = new r45.xn1();
        xn1Var.set(11, ((mm2.c1) vVar.f8759b.a(mm2.c1.class)).f328812h);
        ch1Var.set(13, xn1Var);
        ch1Var.set(4, gVar);
        return ch1Var;
    }

    public static final r45.kv1 b(am2.v vVar) {
        vVar.getClass();
        ce2.i iVar = (ce2.i) dk2.u7.f234185e.get("MMFinderLiveGift100001");
        if (iVar != null) {
            return iVar.c1();
        }
        return null;
    }
}
