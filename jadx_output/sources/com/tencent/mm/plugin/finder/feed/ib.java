package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ib extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.jb f106999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f107000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(com.tencent.mm.plugin.finder.feed.jb jbVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        super(0);
        this.f106999d = jbVar;
        this.f107000e = finderItem;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fp0.t tVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        com.tencent.mm.plugin.finder.feed.jb jbVar = this.f106999d;
        int size = jbVar.f107007m.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.util.ArrayList arrayList = jbVar.f107007m;
            ((so2.f1) arrayList.get(i17)).f410336d.set(4, 1);
            java.lang.String string = ((so2.f1) arrayList.get(i17)).f410336d.getString(5);
            if (string == null) {
                string = "";
            }
            hashMap.put(string, new jz5.l(((so2.f1) arrayList.get(i17)).f410336d, java.lang.Integer.valueOf(i17)));
        }
        com.tencent.mm.plugin.finder.feed.hb hbVar = new com.tencent.mm.plugin.finder.feed.hb(jbVar, hashMap);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f107000e;
        if (finderItem != null && (tVar = jbVar.f107006i) != null) {
            tVar.b(new fp0.r(new com.tencent.mm.plugin.finder.feed.gd(true, finderItem, jbVar, hbVar), null, 2, null));
        }
        return jz5.f0.f302826a;
    }
}
