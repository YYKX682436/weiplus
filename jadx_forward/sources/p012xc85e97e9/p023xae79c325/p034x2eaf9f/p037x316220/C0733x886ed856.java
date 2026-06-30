package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.MutableTagBundle */
/* loaded from: classes14.dex */
public class C0733x886ed856 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c {
    private C0733x886ed856(java.util.Map<java.lang.String, java.lang.Object> map) {
        super(map);
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0733x886ed856 m5530xaf65a0fc() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0733x886ed856(new android.util.ArrayMap());
    }

    /* renamed from: from */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0733x886ed856 m5531x3017aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c) {
        android.util.ArrayMap arrayMap = new android.util.ArrayMap();
        for (java.lang.String str : c0760xc2ac609c.m5704x5030d3b2()) {
            arrayMap.put(str, c0760xc2ac609c.m5703xb5887064(str));
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0733x886ed856(arrayMap);
    }

    /* renamed from: addTagBundle */
    public void m5532x43020d1b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c) {
        java.util.Map<java.lang.String, java.lang.Object> map;
        java.util.Map<java.lang.String, java.lang.Object> map2 = this.f1814x1ae5362f;
        if (map2 == null || (map = c0760xc2ac609c.f1814x1ae5362f) == null) {
            return;
        }
        map2.putAll(map);
    }

    /* renamed from: putTag */
    public void m5533xc5c5860b(java.lang.String str, java.lang.Object obj) {
        this.f1814x1ae5362f.put(str, obj);
    }
}
