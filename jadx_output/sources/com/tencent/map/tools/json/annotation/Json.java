package com.tencent.map.tools.json.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes13.dex */
public @interface Json {
    java.lang.Class<? extends com.tencent.map.tools.json.JsonParser.Deserializer> deserializer() default com.tencent.map.tools.json.JsonParser.Deserializer.class;

    boolean ignore() default false;

    java.lang.String name() default "";
}
