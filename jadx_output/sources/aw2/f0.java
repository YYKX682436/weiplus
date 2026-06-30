package aw2;

/* loaded from: classes2.dex */
public final class f0 extends uo2.m0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ aw2.j0 f14748c;

    public f0(aw2.j0 j0Var) {
        this.f14748c = j0Var;
    }

    @Override // uo2.m0
    public void a(java.lang.Object obj) {
        aw2.j0 j0Var = this.f14748c;
        j0Var.getClass();
        if (obj instanceof org.json.JSONObject) {
            try {
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                j0Var.f14759f = jSONObject.optString(dm.i4.COL_ID);
                j0Var.f14760g = jSONObject.optString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
                com.tencent.mm.plugin.finder.view.FinderJumperView chooseView = j0Var.f14758e;
                kotlin.jvm.internal.o.f(chooseView, "chooseView");
                java.lang.String str = j0Var.f14760g;
                if (str == null) {
                    str = "";
                }
                com.tencent.mm.plugin.finder.view.FinderJumperView.c(chooseView, str, false, 2, null);
            } catch (org.json.JSONException e17) {
                com.tencent.mars.xlog.Log.e("FinderPostMusicWidget", java.lang.String.valueOf(e17.getMessage()));
            }
        }
    }

    @Override // uo2.m0
    public boolean b(long j17, int i17) {
        aw2.j0 j0Var = this.f14748c;
        java.lang.String str = ((dv2.o0) ((jz5.n) j0Var.f14763m).getValue()).f243913d;
        if (str != null) {
            if (str.length() > 0) {
                com.tencent.mm.plugin.lite.s sVar = j0Var.f14762i;
                int i18 = str.length() == 0 ? -1 : 0;
                if (sVar != null) {
                    sVar.c(j17, i17, "{\"errCode\": " + i18 + ",\"audioUrl\": \"" + str + "\"}");
                }
                return false;
            }
        }
        dv2.o0 o0Var = (dv2.o0) ((jz5.n) j0Var.f14763m).getValue();
        aw2.e0 e0Var = new aw2.e0(j0Var, j17, i17);
        o0Var.getClass();
        o0Var.f243916g = e0Var;
        pf5.e.launch$default(o0Var, null, null, new dv2.n0(o0Var, null), 3, null);
        return true;
    }
}
