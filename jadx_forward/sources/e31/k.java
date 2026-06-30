package e31;

/* loaded from: classes9.dex */
public interface k {
    static /* synthetic */ void i(e31.k kVar, java.lang.String str, java.util.List list, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLocalSubscribeStatus");
        }
        kVar.a(str, list, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? false : z18, z19);
    }

    void a(java.lang.String str, java.util.List list, boolean z17, boolean z18, boolean z19);

    void b(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3);

    void c(android.content.Context context, java.lang.String str, java.lang.String str2, android.os.Bundle bundle);

    void d(java.lang.String str, java.lang.String str2);

    default void e(android.content.Context context, int i17, java.lang.String bizUsername, java.lang.String nickname) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizUsername, "bizUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        b(context, i17, bizUsername, nickname, null);
    }

    void f(java.lang.String str, boolean z17);

    void g(android.content.Context context, int i17, int i18, java.lang.String str, android.os.Bundle bundle);

    void h(java.lang.String str, com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3, e31.i iVar);
}
