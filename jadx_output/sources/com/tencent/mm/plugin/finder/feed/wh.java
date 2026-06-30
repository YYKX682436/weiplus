package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class wh implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f110977a;

    public wh(int i17) {
        this.f110977a = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.nw1 liveInfo;
        r45.nw1 liveInfo2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cgiGetFinderFeedComment errCode:");
        sb6.append(fVar.f70616b);
        sb6.append(" errType:");
        sb6.append(fVar.f70615a);
        sb6.append(" url:");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        sb6.append((finderObject == null || (liveInfo2 = finderObject.getLiveInfo()) == null) ? null : liveInfo2.getString(3));
        com.tencent.mars.xlog.Log.i("FinderLiveMention.NotifyViewCallback", sb6.toString());
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && ((com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2)) != null) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            intent.putExtra("CURRENT_FEED_ID", finderObject2 != null ? java.lang.Long.valueOf(finderObject2.getId()) : null);
            intent.putExtra("LAUNCH_WITH_ANIM", false);
            com.tencent.mm.protocal.protobuf.FinderObject finderObject3 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            intent.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", (finderObject3 == null || (liveInfo = finderObject3.getLiveInfo()) == null) ? 0 : liveInfo.getInteger(42));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mm.protocal.protobuf.FinderObject finderObject4 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            kotlin.jvm.internal.o.d(finderObject4);
            arrayList.add(finderObject4);
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, "");
            wk0Var.set(1, "");
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            y74Var.set(1, java.lang.Integer.valueOf(this.f110977a));
            com.tencent.mm.protocal.protobuf.FinderObject finderObject5 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            kotlin.jvm.internal.o.d(finderObject5);
            y74Var.set(5, finderObject5);
            wk0Var.set(6, y74Var);
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((vd2.f1) e0Var).Ni(context, intent, arrayList, 0, wk0Var, null);
        }
        return jz5.f0.f302826a;
    }
}
