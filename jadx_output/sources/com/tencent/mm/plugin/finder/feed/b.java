package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f106331a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.d f106332b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f106333c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f106334d;

    public b(so2.j5 j5Var, com.tencent.mm.plugin.finder.feed.d dVar, int i17, android.view.View view) {
        this.f106331a = j5Var;
        this.f106332b = dVar;
        this.f106333c = i17;
        this.f106334d = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        if (r0.getBoolean(2) == true) goto L19;
     */
    @Override // gm5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call(java.lang.Object r6) {
        /*
            r5 = this;
            com.tencent.mm.modelbase.f r6 = (com.tencent.mm.modelbase.f) r6
            if (r6 == 0) goto L6c
            int r0 = r6.f70615a
            if (r0 != 0) goto L6d
            int r0 = r6.f70616b
            if (r0 != 0) goto L6d
            com.tencent.mm.protobuf.f r0 = r6.f70618d
            r45.h51 r0 = (r45.h51) r0
            r1 = 2
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r1)
            com.tencent.mm.protocal.protobuf.FinderObject r0 = (com.tencent.mm.protocal.protobuf.FinderObject) r0
            so2.j5 r2 = r5.f106331a
            if (r0 == 0) goto L25
            r3 = r2
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r3
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.getFeedObject()
            r3.setFeedObject(r0)
        L25:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r2
            com.tencent.mm.plugin.finder.storage.FinderItem r0 = r2.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.getFeedObject()
            r45.dm2 r0 = r0.getObject_extend()
            r3 = 0
            if (r0 == 0) goto L48
            r4 = 44
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r4)
            r45.t94 r0 = (r45.t94) r0
            if (r0 == 0) goto L48
            boolean r0 = r0.getBoolean(r1)
            r1 = 1
            if (r0 != r1) goto L48
            goto L49
        L48:
            r1 = r3
        L49:
            com.tencent.mm.plugin.finder.feed.d r0 = r5.f106332b
            if (r1 == 0) goto L5c
            java.lang.String r1 = r0.f106523v
            java.lang.String r3 = "[checkLiveStatusAndEnterTimeLine] live end v1"
            com.tencent.mars.xlog.Log.i(r1, r3)
            int r1 = r5.f106333c
            android.view.View r3 = r5.f106334d
            r0.W(r2, r1, r3)
            goto L6d
        L5c:
            java.lang.String r1 = r0.f106523v
            java.lang.String r2 = "[checkLiveStatusAndEnterTimeLine] live end v2"
            com.tencent.mars.xlog.Log.i(r1, r2)
            r1 = 2131762408(0x7f101ce8, float:1.9155892E38)
            com.tencent.mm.ui.MMActivity r0 = r0.f106174d
            db5.e1.i(r0, r1, r3)
            goto L6d
        L6c:
            r6 = 0
        L6d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.b.call(java.lang.Object):java.lang.Object");
    }
}
