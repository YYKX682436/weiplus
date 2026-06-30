package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class v4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f104767b;

    public v4(in5.s0 s0Var, long j17) {
        this.f104766a = s0Var;
        this.f104767b = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        in5.s0 s0Var = this.f104766a;
        if (fVar == null) {
            com.tencent.mars.xlog.Log.i("Finder.FeedMsgNotifyConvert", "get feed detail result is null");
            return db5.e1.i(s0Var.f293121e, com.tencent.mm.R.string.cwu, 0);
        }
        int i17 = fVar.f70615a;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if ((i17 == 0 && fVar.f70616b == 0) || hc2.p.b(i17, fVar.f70616b)) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject == null) {
                return null;
            }
            com.tencent.mars.xlog.Log.i("Finder.FeedMsgNotifyConvert", "get feed detail success");
            ya2.g gVar = ya2.h.f460484a;
            if (!gVar.g(finderObject.getUsername())) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
                com.tencent.mm.protocal.protobuf.FinderContact contact = finderObject.getContact();
                finderContact.setUsername(contact != null ? contact.getUsername() : null);
                com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderObject.getContact();
                finderContact.setNickname(contact2 != null ? contact2.getNickname() : null);
                com.tencent.mm.protocal.protobuf.FinderContact contact3 = finderObject.getContact();
                finderContact.setHeadUrl(contact3 != null ? contact3.getHeadUrl() : null);
                ya2.g.m(gVar, finderContact, false, 2, null);
            }
            bu2.j.f24534a.n(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 32), bu2.i.f24531l);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("feed_object_id", this.f104767b);
            com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
            android.content.Context context = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.iy.d(iyVar, context, intent, 0L, null, 0, 0, false, 0, null, 508, null);
            com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            android.content.Context context2 = s0Var.f293121e;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            i0Var.Xj(context2, intent);
        } else {
            int i18 = fVar.f70616b;
            if (i18 == -4011) {
                return db5.e1.i(s0Var.f293121e, com.tencent.mm.R.string.cv_, 0);
            }
            if (i18 == -4033) {
                return db5.e1.i(s0Var.f293121e, com.tencent.mm.R.string.cwu, 0);
            }
        }
        return f0Var;
    }
}
