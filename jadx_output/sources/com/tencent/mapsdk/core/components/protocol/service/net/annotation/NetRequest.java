package com.tencent.mapsdk.core.components.protocol.service.net.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes13.dex */
public @interface NetRequest {
    java.lang.String authority() default "";

    java.lang.String constQuery() default "";

    com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetHead head() default @com.tencent.mapsdk.core.components.protocol.service.net.annotation.NetHead;

    com.tencent.map.tools.net.NetMethod method();

    java.lang.String path() default "";

    java.lang.String[] queryKeys() default {};

    int retry() default 1;

    boolean useExtraQuery() default true;

    java.lang.String userAgent() default "androidsdk";
}
