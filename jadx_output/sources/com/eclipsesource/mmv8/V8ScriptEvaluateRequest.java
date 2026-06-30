package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public class V8ScriptEvaluateRequest {
    public static final int SCRIPT_TYPE_FD = 1;
    public static final int SCRIPT_TYPE_TEXT = 3;
    public static final int SCRIPT_TYPE_WXA_FD = 2;
    public java.lang.String cacheCategory;
    public java.lang.String cacheKey;
    public int cacheType;
    public int lineNumber;
    public com.eclipsesource.mmv8.V8ScriptFileDescriptor scriptFd;
    public java.lang.String scriptName;
    public java.lang.String scriptText;
    public int scriptType;
    public com.eclipsesource.mmv8.V8ScriptWxaFileDescriptor scriptWxaFd;
}
