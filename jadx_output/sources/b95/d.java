package b95;

/* loaded from: classes8.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public static final com.tencent.mm.sdk.platformtools.o4 a(b95.d dVar) {
        dVar.getClass();
        java.lang.Object value = ((jz5.n) b95.j.f18634d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.sdk.platformtools.o4) value;
    }

    public final int b(java.lang.String username) {
        kotlin.jvm.internal.o.g(username, "username");
        if (com.tencent.mm.storage.z3.R4(username)) {
            return 2;
        }
        if (com.tencent.mm.storage.z3.R3(username)) {
            return 3;
        }
        return c01.z1.J(username) ? 4 : 1;
    }
}
