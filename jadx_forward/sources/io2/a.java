package io2;

/* loaded from: classes2.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f374995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io2.b f374996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 f374997f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.util.LinkedList linkedList, io2.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1563xbfc28a9a.p1566x332453.C14459x792f41a5 c14459x792f41a5) {
        super(0);
        this.f374995d = linkedList;
        this.f374996e = bVar;
        this.f374997f = c14459x792f41a5;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f374995d;
        java.util.Iterator it = linkedList2.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(j5Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderMemberCardData");
            linkedList.add(new bu2.n0(73729, (so2.j3) j5Var));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374996e.m56464xb5886c64(), "[saveData] infoList.size=" + linkedList2.size() + ", firstPage.size=" + linkedList.size());
        if (linkedList.size() > 0) {
            bu2.e0.f106031a.a(30, xy2.c.f(this.f374997f.m56354xfe9224be()), linkedList);
        }
        return jz5.f0.f384359a;
    }
}
