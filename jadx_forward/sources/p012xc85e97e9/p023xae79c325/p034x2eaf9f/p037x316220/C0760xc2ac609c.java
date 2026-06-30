package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.TagBundle */
/* loaded from: classes14.dex */
public class C0760xc2ac609c {

    /* renamed from: CAMERAX_USER_TAG_PREFIX */
    private static final java.lang.String f1811xe210957f = "android.hardware.camera2.CaptureRequest.setTag.CX";

    /* renamed from: EMPTY_TAGBUNDLE */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c f1812xc9c617ea = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c(new android.util.ArrayMap());

    /* renamed from: USER_TAG_PREFIX */
    private static final java.lang.String f1813xdd5d17eb = "android.hardware.camera2.CaptureRequest.setTag.";

    /* renamed from: mTagMap */
    protected final java.util.Map<java.lang.String, java.lang.Object> f1814x1ae5362f;

    public C0760xc2ac609c(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.f1814x1ae5362f = map;
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c m5700xaf65a0fc(android.util.Pair<java.lang.String, java.lang.Object> pair) {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        arrayMap.put((java.lang.String) pair.first, pair.second);
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c(arrayMap);
    }

    /* renamed from: emptyBundle */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c m5701x298eb42f() {
        return f1812xc9c617ea;
    }

    /* renamed from: from */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c m5702x3017aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c) {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        for (java.lang.String str : c0760xc2ac609c.m5704x5030d3b2()) {
            arrayMap.put(str, c0760xc2ac609c.m5703xb5887064(str));
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c(arrayMap);
    }

    /* renamed from: getTag */
    public java.lang.Object m5703xb5887064(java.lang.String str) {
        return this.f1814x1ae5362f.get(str);
    }

    /* renamed from: listKeys */
    public java.util.Set<java.lang.String> m5704x5030d3b2() {
        return this.f1814x1ae5362f.keySet();
    }

    /* renamed from: toString */
    public final java.lang.String m5705x9616526c() {
        return f1811xe210957f;
    }
}
