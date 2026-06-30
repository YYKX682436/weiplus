package com.tencent.mm.feature.ecs.share;

/* loaded from: classes.dex */
public final class e implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f65980d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f65981e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.share.a f65982f;

    public e(android.content.Context context, java.util.List customMenuItem, com.tencent.mm.feature.ecs.share.a callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(customMenuItem, "customMenuItem");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f65980d = context;
        this.f65981e = customMenuItem;
        this.f65982f = callback;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var == null || !g4Var.z()) {
            return;
        }
        for (com.tencent.mm.feature.ecs.share.p pVar : this.f65981e) {
            int ordinal = pVar.f65998a.ordinal();
            android.content.Context context = this.f65980d;
            boolean z17 = pVar.f66000c;
            if (ordinal == 0) {
                org.json.JSONObject jSONObject = pVar.f65999b;
                int optInt = jSONObject != null ? jSONObject.optInt(dm.i4.COL_ID) : 0;
                java.lang.String optString = jSONObject != null ? jSONObject.optString("icon") : null;
                if (optString == null) {
                    optString = "";
                }
                t00.e1 e1Var = (t00.e1) this.f65982f;
                e1Var.getClass();
                org.json.JSONObject jSONObject2 = e1Var.f414278c;
                java.lang.String optString2 = jSONObject2 != null ? jSONObject2.optString(optString) : null;
                if (optString2 != null) {
                    optString = optString2;
                }
                java.lang.String optString3 = jSONObject != null ? jSONObject.optString("darkIcon") : null;
                java.lang.String str = optString3 != null ? optString3 : "";
                e1Var.getClass();
                org.json.JSONObject jSONObject3 = e1Var.f414278c;
                java.lang.String optString4 = jSONObject3 != null ? jSONObject3.optString(str) : null;
                if (optString4 != null) {
                    str = optString4;
                }
                if (com.tencent.mm.ui.bk.C()) {
                    optString = str;
                }
                android.graphics.drawable.Drawable createFromPath = android.graphics.drawable.Drawable.createFromPath(optString);
                if (createFromPath != null) {
                    com.tencent.mm.feature.ecs.share.c cVar = new com.tencent.mm.feature.ecs.share.c(context, optInt + 10000, pVar);
                    cVar.f228368i = jSONObject != null ? jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE) : null;
                    cVar.setIcon(createFromPath);
                    cVar.f228375s = z17;
                    g4Var.v(cVar);
                }
            } else if (ordinal == 3) {
                com.tencent.mm.feature.ecs.share.b bVar = com.tencent.mm.feature.ecs.share.b.f65970e;
                com.tencent.mm.feature.ecs.share.c cVar2 = new com.tencent.mm.feature.ecs.share.c(context, 3, pVar);
                cVar2.f228368i = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.la_);
                cVar2.setIcon(com.tencent.mm.R.raw.icons_outlined_link);
                cVar2.f228375s = z17;
                g4Var.v(cVar2);
            } else if (ordinal == 4) {
                com.tencent.mm.feature.ecs.share.b bVar2 = com.tencent.mm.feature.ecs.share.b.f65970e;
                com.tencent.mm.feature.ecs.share.c cVar3 = new com.tencent.mm.feature.ecs.share.c(context, 4, pVar);
                cVar3.f228368i = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490394tr);
                cVar3.setIcon(com.tencent.mm.R.raw.icons_outlined_report_problem);
                cVar3.f228375s = z17;
                g4Var.v(cVar3);
            }
        }
    }
}
