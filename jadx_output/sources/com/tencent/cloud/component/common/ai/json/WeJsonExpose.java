package com.tencent.cloud.component.common.ai.json;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface WeJsonExpose {
    boolean deserialize() default true;

    boolean serialize() default true;
}
