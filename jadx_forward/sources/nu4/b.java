package nu4;

/* loaded from: classes7.dex */
public final class b extends com.p314xaae8f345.mm.vfs.r6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String path) {
        super(com.p314xaae8f345.mm.vfs.z7.a(path));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
    }

    public final boolean O(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        return com.p314xaae8f345.mm.vfs.w6.j(u() + '/' + id6);
    }

    public final com.p314xaae8f345.mm.vfs.r6 Q(java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        if (!com.p314xaae8f345.mm.vfs.w6.j(u())) {
            com.p314xaae8f345.mm.vfs.w6.u(u());
        }
        return new com.p314xaae8f345.mm.vfs.r6(u() + '/' + id6);
    }
}
