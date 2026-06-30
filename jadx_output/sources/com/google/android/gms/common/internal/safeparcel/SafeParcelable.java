package com.google.android.gms.common.internal.safeparcel;

/* loaded from: classes6.dex */
public interface SafeParcelable extends android.os.Parcelable {
    public static final java.lang.String NULL = "SAFE_PARCELABLE_NULL_STRING";

    /* loaded from: classes6.dex */
    public @interface Class {
        java.lang.String creator();

        boolean creatorIsFinal() default true;

        boolean doNotParcelTypeDefaultValues() default false;

        boolean validate() default false;
    }

    /* loaded from: classes6.dex */
    public @interface Constructor {
    }

    /* loaded from: classes6.dex */
    public @interface Field {
        java.lang.String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        java.lang.String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        java.lang.String type() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* loaded from: classes6.dex */
    public @interface Indicator {
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* loaded from: classes6.dex */
    public @interface Param {
        int id();
    }

    /* loaded from: classes6.dex */
    public @interface RemovedParam {
        java.lang.String defaultValue() default "SAFE_PARCELABLE_NULL_STRING";

        java.lang.String defaultValueUnchecked() default "SAFE_PARCELABLE_NULL_STRING";

        int id();
    }

    /* loaded from: classes6.dex */
    public @interface Reserved {
        int[] value();
    }

    /* loaded from: classes6.dex */
    public @interface VersionField {
        java.lang.String getter() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        java.lang.String type() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
