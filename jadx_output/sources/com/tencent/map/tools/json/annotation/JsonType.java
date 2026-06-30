package com.tencent.map.tools.json.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes13.dex */
public @interface JsonType {
    boolean allowEmpty() default true;

    java.lang.Class<? extends com.tencent.map.tools.json.JsonParser.Deserializer> deserializer() default com.tencent.map.tools.json.JsonParser.Deserializer.class;

    java.lang.String fieldNamePrefix() default "";

    com.tencent.map.tools.json.FieldNameStyle fieldNameStyle() default com.tencent.map.tools.json.FieldNameStyle.HUMP;
}
