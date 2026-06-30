package c0;

/* loaded from: classes14.dex */
public final class p implements c0.o {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f36941a = kotlinx.coroutines.flow.r2.b(0, 16, u26.u.DROP_OLDEST, 1, null);

    public java.lang.Object a(c0.m mVar, kotlin.coroutines.Continuation continuation) {
        java.lang.Object emit = ((kotlinx.coroutines.flow.q2) this.f36941a).emit(mVar, continuation);
        return emit == pz5.a.f359186d ? emit : jz5.f0.f302826a;
    }

    public boolean b(c0.m interaction) {
        kotlin.jvm.internal.o.g(interaction, "interaction");
        return ((kotlinx.coroutines.flow.q2) this.f36941a).e(interaction);
    }
}
