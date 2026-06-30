package com.facebook.yoga;

/* loaded from: classes15.dex */
public class YogaValue {
    public final com.facebook.yoga.YogaUnit unit;
    public final float value;
    static final com.facebook.yoga.YogaValue UNDEFINED = new com.facebook.yoga.YogaValue(Float.NaN, com.facebook.yoga.YogaUnit.UNDEFINED);
    static final com.facebook.yoga.YogaValue ZERO = new com.facebook.yoga.YogaValue(0.0f, com.facebook.yoga.YogaUnit.POINT);
    static final com.facebook.yoga.YogaValue AUTO = new com.facebook.yoga.YogaValue(Float.NaN, com.facebook.yoga.YogaUnit.AUTO);

    /* renamed from: com.facebook.yoga.YogaValue$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaUnit;

        static {
            int[] iArr = new int[com.facebook.yoga.YogaUnit.values().length];
            $SwitchMap$com$facebook$yoga$YogaUnit = iArr;
            try {
                iArr[com.facebook.yoga.YogaUnit.UNDEFINED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[com.facebook.yoga.YogaUnit.POINT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[com.facebook.yoga.YogaUnit.PERCENT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaUnit[com.facebook.yoga.YogaUnit.AUTO.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public YogaValue(float f17, com.facebook.yoga.YogaUnit yogaUnit) {
        this.value = f17;
        this.unit = yogaUnit;
    }

    public static com.facebook.yoga.YogaValue parse(java.lang.String str) {
        if (str == null) {
            return null;
        }
        return "undefined".equals(str) ? UNDEFINED : "auto".equals(str) ? AUTO : str.endsWith("%") ? new com.facebook.yoga.YogaValue(java.lang.Float.parseFloat(str.substring(0, str.length() - 1)), com.facebook.yoga.YogaUnit.PERCENT) : new com.facebook.yoga.YogaValue(java.lang.Float.parseFloat(str), com.facebook.yoga.YogaUnit.POINT);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.facebook.yoga.YogaValue)) {
            return false;
        }
        com.facebook.yoga.YogaValue yogaValue = (com.facebook.yoga.YogaValue) obj;
        com.facebook.yoga.YogaUnit yogaUnit = this.unit;
        if (yogaUnit == yogaValue.unit) {
            return yogaUnit == com.facebook.yoga.YogaUnit.UNDEFINED || yogaUnit == com.facebook.yoga.YogaUnit.AUTO || java.lang.Float.compare(this.value, yogaValue.value) == 0;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Float.floatToIntBits(this.value) + this.unit.intValue();
    }

    public java.lang.String toString() {
        int i17 = com.facebook.yoga.YogaValue.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaUnit[this.unit.ordinal()];
        if (i17 == 1) {
            return "undefined";
        }
        if (i17 == 2) {
            return java.lang.Float.toString(this.value);
        }
        if (i17 != 3) {
            if (i17 == 4) {
                return "auto";
            }
            throw new java.lang.IllegalStateException();
        }
        return this.value + "%";
    }

    public YogaValue(float f17, int i17) {
        this(f17, com.facebook.yoga.YogaUnit.fromInt(i17));
    }
}
