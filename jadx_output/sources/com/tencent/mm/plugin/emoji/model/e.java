package com.tencent.mm.plugin.emoji.model;

/* loaded from: classes15.dex */
public final class e implements ir.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f97543a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final int f97544b;

    public e() {
        java.util.ArrayList<com.tencent.mm.storage.emotion.EmojiInfo> b17 = gr.t.g().b(false);
        this.f97544b = b17.size();
        pr.z zVar = pr.k0.f357723q;
        int a17 = zVar.a(false).a();
        int g17 = zVar.a(false).g();
        int i17 = 0;
        for (com.tencent.mm.storage.emotion.EmojiInfo emojiInfo : b17) {
            if (i17 >= g17) {
                break;
            }
            if (i17 >= a17) {
                java.util.List list = this.f97543a;
                kotlin.jvm.internal.o.d(emojiInfo);
                list.add(new ir.g(emojiInfo, 3, null, 0, 12, null));
            } else {
                java.util.List list2 = this.f97543a;
                kotlin.jvm.internal.o.d(emojiInfo);
                list2.add(new ir.g(emojiInfo, 1, null, 0, 12, null));
            }
            i17++;
        }
        if (pr.k0.f357723q.a(false).c()) {
            this.f97543a.add(new ir.e0(1));
        }
    }

    @Override // ir.k0
    public int a() {
        return this.f97544b;
    }

    @Override // ir.k0
    public java.util.List b() {
        return this.f97543a;
    }

    @Override // ir.k0
    public ir.r p() {
        return ir.v0.a();
    }
}
