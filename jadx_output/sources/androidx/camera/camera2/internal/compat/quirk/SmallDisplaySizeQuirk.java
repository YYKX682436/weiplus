package androidx.camera.camera2.internal.compat.quirk;

/* loaded from: classes13.dex */
public class SmallDisplaySizeQuirk implements androidx.camera.core.impl.Quirk {
    private static final java.util.Map<java.lang.String, android.util.Size> MODEL_TO_DISPLAY_SIZE_MAP;
    private static final java.lang.String TAG = "SmallDisplaySizeQuirk";

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        MODEL_TO_DISPLAY_SIZE_MAP = hashMap;
        hashMap.put("REDMI NOTE 8", new android.util.Size(1080, 2340));
        hashMap.put("REDMI NOTE 7", new android.util.Size(1080, 2340));
        hashMap.put("SM-A207M", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, com.tencent.mm.plugin.appbrand.jsapi.bio.face.q.CTRL_INDEX));
        hashMap.put("REDMI NOTE 7S", new android.util.Size(1080, 2340));
        hashMap.put("SM-A127F", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1600));
        hashMap.put("SM-A536E", new android.util.Size(1080, 2400));
        hashMap.put("220233L2I", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1600));
        hashMap.put("V2149", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1600));
        hashMap.put("VIVO 1920", new android.util.Size(1080, 2340));
        hashMap.put("CPH2223", new android.util.Size(1080, 2400));
        hashMap.put("V2029", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1600));
        hashMap.put("CPH1901", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, com.tencent.mm.minigame.download.mmdownloader.g.CTRL_INDEX));
        hashMap.put("REDMI Y3", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, com.tencent.mm.minigame.download.mmdownloader.g.CTRL_INDEX));
        hashMap.put("SM-A045M", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1600));
        hashMap.put("SM-A146U", new android.util.Size(1080, 2408));
        hashMap.put("CPH1909", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, com.tencent.mm.minigame.download.mmdownloader.g.CTRL_INDEX));
        hashMap.put("NOKIA 4.2", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, com.tencent.mm.minigame.download.mmdownloader.g.CTRL_INDEX));
        hashMap.put("SM-G960U1", new android.util.Size(1440, 2960));
        hashMap.put("SM-A137F", new android.util.Size(1080, 2408));
        hashMap.put("VIVO 1816", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, com.tencent.mm.minigame.download.mmdownloader.g.CTRL_INDEX));
        hashMap.put("INFINIX X6817", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1612));
        hashMap.put("SM-A037F", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1600));
        hashMap.put("NOKIA 2.4", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1600));
        hashMap.put("SM-A125M", new android.util.Size(com.tencent.tavkit.component.TAVExporter.VIDEO_EXPORT_WIDTH, 1600));
        hashMap.put("INFINIX X670", new android.util.Size(1080, 2400));
    }

    public static boolean load() {
        return MODEL_TO_DISPLAY_SIZE_MAP.containsKey(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }

    public android.util.Size getDisplaySize() {
        return MODEL_TO_DISPLAY_SIZE_MAP.get(android.os.Build.MODEL.toUpperCase(java.util.Locale.US));
    }
}
