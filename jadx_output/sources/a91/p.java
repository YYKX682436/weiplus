package a91;

/* loaded from: classes13.dex */
public class p implements a91.d {
    @Override // a91.d
    public boolean a(z81.i iVar, android.graphics.Canvas canvas, org.json.JSONArray jSONArray) {
        if (jSONArray.length() < 1) {
            return false;
        }
        canvas.rotate((float) ((((float) jSONArray.optDouble(0)) / 3.141592653589793d) * 180.0d));
        return true;
    }

    @Override // a91.d
    public boolean b(z81.i iVar, android.graphics.Canvas canvas, com.tencent.mm.plugin.appbrand.canvas.action.arg.DrawActionArg drawActionArg) {
        if (((com.tencent.mm.plugin.appbrand.canvas.action.arg.RotateActionArg) drawActionArg) == null) {
            return false;
        }
        canvas.rotate((float) ((r7.f77102e / 3.141592653589793d) * 180.0d));
        return true;
    }

    @Override // a91.d
    public java.lang.String getMethod() {
        return com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VIDEO_ROTATION;
    }
}
