package com.jg;

@java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
/* loaded from: classes6.dex */
public @interface JgClassChecked {
    int author();

    java.lang.String fComment();

    java.lang.String lastDate();

    int level() default 1;

    int reviewer();

    com.jg.EType[] vComment();
}
