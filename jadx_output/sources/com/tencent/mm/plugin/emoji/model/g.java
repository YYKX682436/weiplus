package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes15.dex */
public final class g implements ir.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f97547a;

    /* renamed from: b, reason: collision with root package name */
    public final int f97548b;

    public g(boolean z17) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        this.f97547a = linkedList;
        java.util.ArrayList<com.tencent.mm.storage.emotion.EmojiInfo> a17 = gr.t.g().a();
        this.f97548b = a17.size();
        if (z17) {
            linkedList.add(new ir.z(0));
        }
        pr.z zVar = pr.k0.f357723q;
        int a18 = zVar.b(false).a();
        int g17 = zVar.b(false).g();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCustomItem", "sync: " + a18 + ", " + g17);
        int i17 = 0;
        for (com.tencent.mm.storage.emotion.EmojiInfo emojiInfo : a17) {
            if (emojiInfo.field_catalog == 18) {
                this.f97548b--;
            } else {
                if (i17 >= g17) {
                    break;
                }
                if (i17 >= a18) {
                    ((java.util.LinkedList) this.f97547a).add(new ir.g(emojiInfo, 3, null, 0, 12, null));
                } else {
                    ((java.util.LinkedList) this.f97547a).add(new ir.g(emojiInfo, 0, null, 0, 12, null));
                }
                i17++;
            }
        }
        if (pr.k0.f357723q.b(false).c()) {
            ((java.util.LinkedList) this.f97547a).add(new ir.e0(0));
        }
    }

    @Override // ir.k0
    public int a() {
        return this.f97548b;
    }

    @Override // ir.k0
    public java.util.List b() {
        return this.f97547a;
    }

    @Override // ir.k0
    public ir.r p() {
        return ir.v0.b();
    }
}
