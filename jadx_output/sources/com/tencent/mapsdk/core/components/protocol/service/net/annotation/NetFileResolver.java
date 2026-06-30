package com.tencent.mapsdk.core.components.protocol.service.net.annotation;

@java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
/* loaded from: classes6.dex */
public @interface NetFileResolver {
    java.lang.String outFile();

    int[] queryRange();
}
