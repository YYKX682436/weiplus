package kz5;

/* loaded from: classes12.dex */
public final class u extends kz5.h implements java.util.RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float[] f395547e;

    public u(float[] fArr) {
        this.f395547e = fArr;
    }

    @Override // kz5.b, java.util.Collection
    public final boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return false;
        }
        float floatValue = ((java.lang.Number) obj).floatValue();
        for (float f17 : this.f395547e) {
            if (java.lang.Float.floatToIntBits(f17) == java.lang.Float.floatToIntBits(floatValue)) {
                return true;
            }
        }
        return false;
    }

    @Override // kz5.b
    public int d() {
        return this.f395547e.length;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        return java.lang.Float.valueOf(this.f395547e[i17]);
    }

    @Override // kz5.h, java.util.List
    public final int indexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return -1;
        }
        float floatValue = ((java.lang.Number) obj).floatValue();
        float[] fArr = this.f395547e;
        int length = fArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            if (java.lang.Float.floatToIntBits(fArr[i17]) == java.lang.Float.floatToIntBits(floatValue)) {
                return i17;
            }
        }
        return -1;
    }

    @Override // kz5.b, java.util.Collection
    public boolean isEmpty() {
        return this.f395547e.length == 0;
    }

    @Override // kz5.h, java.util.List
    public final int lastIndexOf(java.lang.Object obj) {
        if (!(obj instanceof java.lang.Float)) {
            return -1;
        }
        float floatValue = ((java.lang.Number) obj).floatValue();
        float[] fArr = this.f395547e;
        int length = fArr.length - 1;
        if (length < 0) {
            return -1;
        }
        while (true) {
            int i17 = length - 1;
            if (java.lang.Float.floatToIntBits(fArr[length]) == java.lang.Float.floatToIntBits(floatValue)) {
                return length;
            }
            if (i17 < 0) {
                return -1;
            }
            length = i17;
        }
    }
}
