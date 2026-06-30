package com.google.android.gms.common.images;

/* loaded from: classes.dex */
public final class Size {
    private final int zaa;
    private final int zab;

    public Size(int i17, int i18) {
        this.zaa = i17;
        this.zab = i18;
    }

    public static com.google.android.gms.common.images.Size parseSize(java.lang.String str) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException("string must not be null");
        }
        int indexOf = str.indexOf(42);
        if (indexOf < 0) {
            indexOf = str.indexOf(120);
        }
        if (indexOf < 0) {
            throw zaa(str);
        }
        try {
            return new com.google.android.gms.common.images.Size(java.lang.Integer.parseInt(str.substring(0, indexOf)), java.lang.Integer.parseInt(str.substring(indexOf + 1)));
        } catch (java.lang.NumberFormatException unused) {
            throw zaa(str);
        }
    }

    private static java.lang.NumberFormatException zaa(java.lang.String str) {
        throw new java.lang.NumberFormatException("Invalid Size: \"" + str + "\"");
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.common.images.Size) {
            com.google.android.gms.common.images.Size size = (com.google.android.gms.common.images.Size) obj;
            if (this.zaa == size.zaa && this.zab == size.zab) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zab;
    }

    public int getWidth() {
        return this.zaa;
    }

    public int hashCode() {
        int i17 = this.zaa;
        return ((i17 >>> 16) | (i17 << 16)) ^ this.zab;
    }

    public java.lang.String toString() {
        return this.zaa + "x" + this.zab;
    }
}
