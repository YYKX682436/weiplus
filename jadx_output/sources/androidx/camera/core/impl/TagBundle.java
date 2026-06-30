package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public class TagBundle {
    private static final java.lang.String CAMERAX_USER_TAG_PREFIX = "android.hardware.camera2.CaptureRequest.setTag.CX";
    private static final androidx.camera.core.impl.TagBundle EMPTY_TAGBUNDLE = new androidx.camera.core.impl.TagBundle(new android.util.ArrayMap());
    private static final java.lang.String USER_TAG_PREFIX = "android.hardware.camera2.CaptureRequest.setTag.";
    protected final java.util.Map<java.lang.String, java.lang.Object> mTagMap;

    public TagBundle(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.mTagMap = map;
    }

    public static androidx.camera.core.impl.TagBundle create(android.util.Pair<java.lang.String, java.lang.Object> pair) {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put((java.lang.String) pair.first, pair.second);
        return new androidx.camera.core.impl.TagBundle(arrayMap);
    }

    public static androidx.camera.core.impl.TagBundle emptyBundle() {
        return EMPTY_TAGBUNDLE;
    }

    public static androidx.camera.core.impl.TagBundle from(androidx.camera.core.impl.TagBundle tagBundle) {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        for (java.lang.String str : tagBundle.listKeys()) {
            arrayMap.put(str, tagBundle.getTag(str));
        }
        return new androidx.camera.core.impl.TagBundle(arrayMap);
    }

    public java.lang.Object getTag(java.lang.String str) {
        return this.mTagMap.get(str);
    }

    public java.util.Set<java.lang.String> listKeys() {
        return this.mTagMap.keySet();
    }

    public final java.lang.String toString() {
        return CAMERAX_USER_TAG_PREFIX;
    }
}
