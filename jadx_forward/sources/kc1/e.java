package kc1;

/* loaded from: classes14.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f387819a;

    /* renamed from: b, reason: collision with root package name */
    public final float f387820b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f387821c;

    /* renamed from: d, reason: collision with root package name */
    public final kc1.d f387822d;

    /* renamed from: e, reason: collision with root package name */
    public final kc1.b f387823e;

    /* renamed from: f, reason: collision with root package name */
    public final kc1.a f387824f;

    public e(kc1.f fVar, float f17, float f18, kc1.d dVar, java.util.ArrayList arrayList, kc1.b bVar, kc1.a aVar) {
        this.f387819a = -1.0f;
        this.f387820b = -1.0f;
        this.f387821c = null;
        this.f387822d = null;
        this.f387823e = null;
        this.f387824f = null;
        this.f387819a = f17;
        this.f387820b = f18;
        this.f387821c = arrayList;
        this.f387822d = dVar;
        this.f387823e = bVar;
        this.f387824f = aVar;
    }

    public java.util.HashMap a() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("x", java.lang.Float.valueOf(this.f387819a));
        hashMap.put("y", java.lang.Float.valueOf(this.f387820b));
        kc1.d dVar = this.f387822d;
        if (dVar != null) {
            dVar.getClass();
            java.util.HashMap hashMap2 = new java.util.HashMap(4);
            hashMap2.put("originX", java.lang.Float.valueOf(dVar.f387815a));
            hashMap2.put("originY", java.lang.Float.valueOf(dVar.f387816b));
            hashMap2.put("width", java.lang.Float.valueOf(dVar.f387817c));
            hashMap2.put("height", java.lang.Float.valueOf(dVar.f387818d));
            hashMap.put("detectRect", hashMap2);
        }
        java.util.ArrayList arrayList = this.f387821c;
        if (arrayList != null) {
            hashMap.put("pointArray", arrayList);
        }
        kc1.b bVar = this.f387823e;
        if (bVar != null) {
            bVar.getClass();
            java.util.HashMap hashMap3 = new java.util.HashMap(5);
            hashMap3.put("global", java.lang.Float.valueOf(bVar.f387803a));
            hashMap3.put("leftEye", java.lang.Float.valueOf(bVar.f387804b));
            hashMap3.put("rightEye", java.lang.Float.valueOf(bVar.f387805c));
            hashMap3.put("mouth", java.lang.Float.valueOf(bVar.f387806d));
            hashMap3.put("nose", java.lang.Float.valueOf(bVar.f387807e));
            hashMap.put("confArray", hashMap3);
        }
        kc1.a aVar = this.f387824f;
        if (aVar != null) {
            aVar.getClass();
            java.util.HashMap hashMap4 = new java.util.HashMap(3);
            hashMap4.put("pitch", java.lang.Float.valueOf(aVar.f387800a));
            hashMap4.put("roll", java.lang.Float.valueOf(aVar.f387801b));
            hashMap4.put("yaw", java.lang.Float.valueOf(aVar.f387802c));
            hashMap.put("angleArray", hashMap4);
        }
        return hashMap;
    }
}
