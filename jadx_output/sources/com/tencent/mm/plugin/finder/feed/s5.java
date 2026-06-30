package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class s5 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f108973a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f108974b;

    public s5(java.util.LinkedList linkedList, com.tencent.mm.plugin.finder.feed.a7 a7Var) {
        this.f108973a = linkedList;
        this.f108974b = a7Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(view, "view");
        if (!z17 || (linkedList = this.f108973a) == null) {
            return;
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.finder.feed.a7.z(this.f108974b, (r45.my0) it.next(), false);
        }
    }
}
