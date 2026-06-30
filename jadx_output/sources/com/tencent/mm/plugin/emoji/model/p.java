package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes15.dex */
public final class p {
    public p(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.String str) {
        return com.tencent.mm.plugin.emoji.model.q.f97592d.containsKey(str) || com.tencent.mm.plugin.emoji.model.q.f97593e.containsKey(str);
    }

    public final boolean b() {
        if (com.tencent.mm.plugin.emoji.model.q.f97594f == null) {
            com.tencent.mm.plugin.emoji.model.q.f97594f = java.lang.Boolean.valueOf(c01.z1.y());
        }
        return kotlin.jvm.internal.o.b(com.tencent.mm.plugin.emoji.model.q.f97594f, java.lang.Boolean.TRUE);
    }

    public final void c() {
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        com.tencent.mm.plugin.emoji.model.q.f97592d = com.tencent.mm.storage.n5.f().b().b1();
        com.tencent.mm.plugin.emoji.model.q.f97593e.clear();
    }
}
