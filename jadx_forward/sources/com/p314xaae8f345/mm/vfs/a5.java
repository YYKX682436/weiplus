package com.p314xaae8f345.mm.vfs;

/* loaded from: classes10.dex */
public final class a5 implements com.p314xaae8f345.mm.vfs.v5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.vfs.a5 f294315a = new com.p314xaae8f345.mm.vfs.a5();

    @Override // com.p314xaae8f345.mm.vfs.v5
    public void a(java.lang.String id6, com.p314xaae8f345.mm.vfs.InterfaceC22750xe27c22eb fs6, int i17, java.util.Map p17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fs6, "fs");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        java.lang.Object obj = p17.get("emptyRef");
        java.lang.Object obj2 = p17.get("overRef");
        java.lang.Object obj3 = p17.get("underRef");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, 0) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj3, 0)) {
            return;
        }
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("VFS.RefCounted", "RefCounted maintenance, emptyRef: " + obj + ", overRef: " + obj2 + ", underRef: " + obj3);
        jx3.f.INSTANCE.d(21019, 0, obj, 65701, "", id6, obj2, "", "", obj3);
    }
}
