package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class i2 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f66754a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f66755b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66756c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.nw1 f66757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66758e;

    public i2(com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.feature.finder.live.v4 v4Var, android.content.Context context, r45.nw1 nw1Var, yz5.l lVar) {
        this.f66754a = finderObject;
        this.f66755b = v4Var;
        this.f66756c = context;
        this.f66757d = nw1Var;
        this.f66758e = lVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        java.lang.String description;
        java.lang.String string;
        r45.nw1 liveInfo;
        r45.jy1 jy1Var;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f66754a;
        android.content.Intent putExtra = (finderObject == null || (liveInfo = finderObject.getLiveInfo()) == null || (jy1Var = (r45.jy1) liveInfo.getCustom(25)) == null) ? null : new android.content.Intent().putExtra("KEY_PARAMS_LAYER_SHOW_INFO", jy1Var.toByteArray());
        r45.nw1 liveInfo2 = finderObject.getLiveInfo();
        if (liveInfo2 != null) {
            int integer = liveInfo2.getInteger(12);
            if (putExtra != null) {
                putExtra.putExtra("KEY_PARAMS_SOURCE_TYPE", integer);
            }
        }
        r45.nw1 liveInfo3 = finderObject.getLiveInfo();
        if (liveInfo3 != null && (string = liveInfo3.getString(22)) != null && putExtra != null) {
            putExtra.putExtra("KEY_PARAMS_GAME_APP_ID", string);
        }
        com.tencent.mm.feature.finder.live.v4 v4Var = this.f66755b;
        android.content.Context context = this.f66756c;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Context context2 = context;
        long id6 = finderObject.getId();
        java.lang.Long valueOf = java.lang.Long.valueOf(this.f66757d.getLong(0));
        java.lang.String objectNonceId = finderObject.getObjectNonceId();
        java.lang.String str2 = "";
        if (objectNonceId == null) {
            objectNonceId = "";
        }
        com.tencent.mm.plugin.finder.search.l4 l4Var = com.tencent.mm.plugin.finder.search.l4.f125761a;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = finderObject.getObjectDesc();
        if (objectDesc != null && (description = objectDesc.getDescription()) != null) {
            str2 = description;
        }
        v4Var.oj(putExtra, context2, id6, valueOf, objectNonceId, l4Var.d(str2), "", finderObject.getSessionBuffer(), "");
        yz5.l lVar = this.f66758e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
    }
}
