package com.tencent.maas.model;

/* loaded from: classes5.dex */
public class MJLocation {

    /* renamed from: a, reason: collision with root package name */
    public final float f48265a;

    /* renamed from: b, reason: collision with root package name */
    public final float f48266b;

    public MJLocation(float f17, float f18) {
        this.f48265a = f17;
        this.f48266b = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.tencent.maas.model.MJLocation mJLocation = (com.tencent.maas.model.MJLocation) obj;
        return java.lang.Float.compare(mJLocation.f48265a, this.f48265a) == 0 && java.lang.Float.compare(mJLocation.f48266b, this.f48266b) == 0;
    }

    public float getLatitude() {
        return this.f48266b;
    }

    public float getLongitude() {
        return this.f48265a;
    }

    public int hashCode() {
        return java.util.Objects.hash(java.lang.Integer.valueOf((int) (this.f48265a * 100.0f)), java.lang.Integer.valueOf((int) (this.f48266b * 10.0f)));
    }
}
