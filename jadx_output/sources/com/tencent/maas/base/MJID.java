package com.tencent.maas.base;

/* loaded from: classes5.dex */
public final class MJID {
    private final java.lang.String value;

    private MJID(java.lang.String str) {
        this.value = str;
    }

    public static com.tencent.maas.base.MJID of(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return new com.tencent.maas.base.MJID(str);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.tencent.maas.base.MJID.class != obj.getClass()) {
            return false;
        }
        return java.util.Objects.equals(this.value, ((com.tencent.maas.base.MJID) obj).value);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.value);
    }

    public java.lang.String toString() {
        return "MJID{value='" + this.value + "'}";
    }

    public java.lang.String value() {
        return this.value;
    }
}
