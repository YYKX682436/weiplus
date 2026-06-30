package com.tencent.map.tools.net.http;

@java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.LOCAL_VARIABLE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface HttpRetryMethod {
    public static final int HTTP_ALWAYS_RETYR = 5;
    public static final int HTTP_NOMARL_RETYR = 3;
    public static final int HTTP_NONE_RETRY = 0;
    public static final int HTTP_ONCE_RETRY = 2;
    public static final int HTTP_SPEED_FIRST_RETRY = 1;
    public static final int HTTP_SUCCESS_FIRST_RETRY = 4;
}
