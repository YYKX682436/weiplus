package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class w6 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public int f108431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileProductLoader f108432e;

    public w6(com.tencent.mm.plugin.finder.feed.model.FinderProfileProductLoader finderProfileProductLoader) {
        this.f108432e = finderProfileProductLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.i iVar, com.tencent.mm.protobuf.f fVar) {
        java.util.ArrayList arrayList = null;
        if (!(fVar instanceof bw5.v6)) {
            return null;
        }
        com.tencent.mm.plugin.finder.feed.model.x6 x6Var = new com.tencent.mm.plugin.finder.feed.model.x6(i17, i18, str);
        bw5.v6 v6Var = (bw5.v6) fVar;
        x6Var.setHasMore(v6Var.f34163f);
        java.util.LinkedList<bw5.q5> linkedList = v6Var.f34161d;
        if (linkedList != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            for (bw5.q5 q5Var : linkedList) {
                kotlin.jvm.internal.o.d(q5Var);
                arrayList.add(new so2.q1(q5Var));
            }
        }
        x6Var.setIncrementList(arrayList);
        x6Var.setLastBuffer(v6Var.f34164g[3] ? v6Var.f34162e : com.tencent.mm.protobuf.g.f192155b);
        x6Var.setPullType(this.f108431d);
        return x6Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        java.lang.String ek6;
        this.f108431d = 2;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileProductLoader finderProfileProductLoader = this.f108432e;
        androidx.fragment.app.FragmentActivity activity = finderProfileProductLoader.f107603e.getActivity();
        android.content.Intent intent = activity != null ? activity.getIntent() : null;
        if (intent == null) {
            return null;
        }
        long longExtra = intent.getLongExtra("finder_from_feed_id", 0L);
        java.lang.String stringExtra = intent.getStringExtra("finder_from_feed_dup_flag");
        if (intent.hasExtra("finder_from_session_buffer")) {
            ek6 = intent.getStringExtra("finder_from_session_buffer");
        } else {
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            r45.qt2 contextObj = finderProfileProductLoader.getContextObj();
            ek6 = o3Var.ek(longExtra, stringExtra, contextObj != null ? contextObj.getInteger(7) : 0);
        }
        return new db2.n1(finderProfileProductLoader.f107602d, finderProfileProductLoader.getLastBuffer(), finderProfileProductLoader.getContextObj(), java.lang.String.valueOf(longExtra), ek6);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        java.lang.String ek6;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileProductLoader finderProfileProductLoader = this.f108432e;
        androidx.fragment.app.FragmentActivity activity = finderProfileProductLoader.f107603e.getActivity();
        android.content.Intent intent = activity != null ? activity.getIntent() : null;
        if (intent == null) {
            return null;
        }
        long longExtra = intent.getLongExtra("finder_from_feed_id", 0L);
        java.lang.String stringExtra = intent.getStringExtra("finder_from_feed_dup_flag");
        if (intent.hasExtra("finder_from_session_buffer")) {
            ek6 = intent.getStringExtra("finder_from_session_buffer");
        } else {
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            r45.qt2 contextObj = finderProfileProductLoader.getContextObj();
            ek6 = o3Var.ek(longExtra, stringExtra, contextObj != null ? contextObj.getInteger(7) : 0);
        }
        return new db2.n1(finderProfileProductLoader.f107602d, null, finderProfileProductLoader.getContextObj(), java.lang.String.valueOf(longExtra), ek6);
    }
}
