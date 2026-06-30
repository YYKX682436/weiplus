package com.tencent.cloud.component.common.ai.json;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Documented
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface WeJsonSerializedName {
    java.lang.String[] alternate() default {};

    java.lang.String value();
}
