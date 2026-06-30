package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class ph extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.uh f108722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f108723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f108724f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph(com.tencent.mm.plugin.finder.feed.uh uhVar, java.lang.String str, int i17) {
        super(0);
        this.f108722d = uhVar;
        this.f108723e = str;
        this.f108724f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.li liVar;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter;
        com.tencent.mm.plugin.finder.feed.uh uhVar = this.f108722d;
        java.util.Iterator it = uhVar.f109191p.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            cd2.b bVar = (cd2.b) next;
            java.lang.String str = this.f108723e;
            if (str == null || str.length() == 0) {
                break;
            }
            if (kotlin.jvm.internal.o.b(str, bVar.f40655d.q()) && (liVar = uhVar.f109188m) != null && (wxRecyclerAdapter = liVar.f107299i) != null) {
                wxRecyclerAdapter.notifyItemChanged(i17, java.lang.Integer.valueOf(this.f108724f));
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}
