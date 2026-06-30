package androidx.camera.core.impl.utils;

/* loaded from: classes13.dex */
class ExifTag {
    public final java.lang.String name;
    public final int number;
    public final int primaryFormat;
    public final int secondaryFormat;

    public ExifTag(java.lang.String str, int i17, int i18) {
        this.name = str;
        this.number = i17;
        this.primaryFormat = i18;
        this.secondaryFormat = -1;
    }

    public boolean isFormatCompatible(int i17) {
        int i18;
        int i19 = this.primaryFormat;
        if (i19 == 7 || i17 == 7 || i19 == i17 || (i18 = this.secondaryFormat) == i17) {
            return true;
        }
        if ((i19 == 4 || i18 == 4) && i17 == 3) {
            return true;
        }
        if ((i19 == 9 || i18 == 9) && i17 == 8) {
            return true;
        }
        return (i19 == 12 || i18 == 12) && i17 == 11;
    }

    public ExifTag(java.lang.String str, int i17, int i18, int i19) {
        this.name = str;
        this.number = i17;
        this.primaryFormat = i18;
        this.secondaryFormat = i19;
    }
}
