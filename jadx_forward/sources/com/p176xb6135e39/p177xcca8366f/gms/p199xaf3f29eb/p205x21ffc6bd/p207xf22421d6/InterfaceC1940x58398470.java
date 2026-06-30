package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6;

/* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable */
/* loaded from: classes6.dex */
public interface InterfaceC1940x58398470 extends android.os.Parcelable {

    /* renamed from: NULL */
    public static final java.lang.String f5956x24bd87 = "SAFE_PARCELABLE_NULL_STRING";

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class */
    /* loaded from: classes6.dex */
    public @interface Class {
        /* renamed from: creator */
        java.lang.String m18362x3d4e802c();

        /* renamed from: creatorIsFinal */
        boolean m18363x1e053ca0() default true;

        /* renamed from: doNotParcelTypeDefaultValues */
        boolean m18364x57353d38() default false;

        /* renamed from: validate */
        boolean m18365xab491916() default false;
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor */
    /* loaded from: classes6.dex */
    public @interface Constructor {
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field */
    /* loaded from: classes6.dex */
    public @interface Field {
        /* renamed from: defaultValue */
        java.lang.String m18366xd8b68bb0() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: defaultValueUnchecked */
        java.lang.String m18367x70ac8d1e() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: getter */
        java.lang.String m18368xb588e90b() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        /* renamed from: type */
        java.lang.String m18369x368f3a() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$Indicator */
    /* loaded from: classes6.dex */
    public @interface Indicator {
        /* renamed from: getter */
        java.lang.String m18370xb588e90b() default "SAFE_PARCELABLE_NULL_STRING";
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param */
    /* loaded from: classes6.dex */
    public @interface Param {
        int id();
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$RemovedParam */
    /* loaded from: classes6.dex */
    public @interface RemovedParam {
        /* renamed from: defaultValue */
        java.lang.String m18371xd8b68bb0() default "SAFE_PARCELABLE_NULL_STRING";

        /* renamed from: defaultValueUnchecked */
        java.lang.String m18372x70ac8d1e() default "SAFE_PARCELABLE_NULL_STRING";

        int id();
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$Reserved */
    /* loaded from: classes6.dex */
    public @interface Reserved {
        /* renamed from: value */
        int[] m18373x6ac9171();
    }

    /* renamed from: com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField */
    /* loaded from: classes6.dex */
    public @interface VersionField {
        /* renamed from: getter */
        java.lang.String m18374xb588e90b() default "SAFE_PARCELABLE_NULL_STRING";

        int id();

        /* renamed from: type */
        java.lang.String m18375x368f3a() default "SAFE_PARCELABLE_NULL_STRING";
    }
}
