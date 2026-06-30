package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class gb {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mapsdk.internal.gc f49560a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mapsdk.internal.gc[] f49561b;

    /* renamed from: c, reason: collision with root package name */
    public float f49562c;

    public gb(com.tencent.mapsdk.internal.gc gcVar, com.tencent.mapsdk.internal.gc[] gcVarArr, float f17) {
        this.f49560a = gcVar;
        this.f49561b = gcVarArr;
        this.f49562c = f17;
    }

    private com.tencent.mapsdk.internal.gc b() {
        return this.f49560a;
    }

    private com.tencent.mapsdk.internal.gc[] c() {
        return this.f49561b;
    }

    private float d() {
        return this.f49562c;
    }

    public final void a(com.tencent.mapsdk.internal.gc gcVar, com.tencent.mapsdk.internal.gc[] gcVarArr, float f17) {
        this.f49560a = gcVar;
        this.f49561b = gcVarArr;
        this.f49562c = f17;
    }

    public final boolean a(com.tencent.mapsdk.internal.gb gbVar) {
        com.tencent.mapsdk.internal.gc[] gcVarArr;
        com.tencent.mapsdk.internal.gc gcVar;
        if (gbVar == null || java.lang.Float.compare(gbVar.f49562c, this.f49562c) > 0) {
            return true;
        }
        com.tencent.mapsdk.internal.gc gcVar2 = this.f49560a;
        if (gcVar2 != null && (gcVar = gbVar.f49560a) != null && com.tencent.mapsdk.internal.li.a(gcVar2, gcVar) > 50.0d) {
            return true;
        }
        com.tencent.mapsdk.internal.gc[] gcVarArr2 = this.f49561b;
        if (gcVarArr2 != null && (gcVarArr = gbVar.f49561b) != null && gcVarArr2.length == gcVarArr.length) {
            int i17 = 0;
            while (true) {
                com.tencent.mapsdk.internal.gc[] gcVarArr3 = this.f49561b;
                if (i17 >= gcVarArr3.length) {
                    break;
                }
                if (com.tencent.mapsdk.internal.li.a(gcVarArr3[i17], gbVar.f49561b[i17]) > 50.0d) {
                    return true;
                }
                i17++;
            }
        }
        return false;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final com.tencent.mapsdk.internal.gb clone() {
        return new com.tencent.mapsdk.internal.gb(this.f49560a, this.f49561b, this.f49562c);
    }
}
