package com.tencent.mapsdk.core.components.protocol.service.net.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.ANNOTATION_TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface NetHead {
    java.lang.String[] keys() default {};

    java.lang.String[] values() default {};
}
