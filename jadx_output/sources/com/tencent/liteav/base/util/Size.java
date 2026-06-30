package com.tencent.liteav.base.util;

@com.tencent.liteav.base.annotations.JNINamespace("liteav")
/* loaded from: classes14.dex */
public class Size {
    public int height;
    public int width;

    public Size() {
        this.width = 0;
        this.height = 0;
    }

    public double aspectRatio() {
        return (this.width * 1.0d) / this.height;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.liteav.base.util.Size)) {
            return false;
        }
        com.tencent.liteav.base.util.Size size = (com.tencent.liteav.base.util.Size) obj;
        return size.width == this.width && size.height == this.height;
    }

    public int getArea() {
        if (isValid()) {
            return this.width * this.height;
        }
        return 0;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 32713) + this.height;
    }

    public boolean isValid() {
        return this.width > 0 && this.height > 0;
    }

    public void set(com.tencent.liteav.base.util.Size size) {
        if (size != null) {
            this.width = size.width;
            this.height = size.height;
        } else {
            this.width = 0;
            this.height = 0;
        }
    }

    public void swap() {
        int i17 = this.width;
        this.width = this.height;
        this.height = i17;
    }

    public java.lang.String toString() {
        return "Size(" + this.width + ", " + this.height + ")";
    }

    public Size(int i17, int i18) {
        this.width = i17;
        this.height = i18;
    }

    public void set(int i17, int i18) {
        this.width = i17;
        this.height = i18;
    }

    public Size(com.tencent.liteav.base.util.Size size) {
        this.width = 0;
        this.height = 0;
        set(size);
    }
}
