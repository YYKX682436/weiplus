package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public interface V8Context {
    com.eclipsesource.mmv8.V8Object add(java.lang.String str, double d17);

    com.eclipsesource.mmv8.V8Object add(java.lang.String str, int i17);

    com.eclipsesource.mmv8.V8Object add(java.lang.String str, com.eclipsesource.mmv8.V8Value v8Value);

    com.eclipsesource.mmv8.V8Object add(java.lang.String str, java.lang.String str2);

    com.eclipsesource.mmv8.V8Object add(java.lang.String str, boolean z17);

    com.eclipsesource.mmv8.V8Object addNull(java.lang.String str);

    com.eclipsesource.mmv8.V8Object addUndefined(java.lang.String str);

    void batchCompileAndGenCodeCacheForScripts(java.util.ArrayList<com.eclipsesource.mmv8.V8ScriptEvaluateRequest> arrayList, java.lang.String str);

    java.lang.Object batchExecuteScripts(java.util.ArrayList<com.eclipsesource.mmv8.V8ScriptEvaluateRequest> arrayList, java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    boolean contains(java.lang.String str);

    com.eclipsesource.mmv8.V8Array executeArrayFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array);

    com.eclipsesource.mmv8.V8Array executeArrayScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    com.eclipsesource.mmv8.V8Array executeArrayScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    com.eclipsesource.mmv8.V8Array executeArrayScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    boolean executeBooleanFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array);

    boolean executeBooleanScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    boolean executeBooleanScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    boolean executeBooleanScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    java.lang.String executeDebugScript(java.lang.String str, java.lang.String str2);

    double executeDoubleFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array);

    double executeDoubleScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    double executeDoubleScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    double executeDoubleScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    java.lang.Object executeFileScript(com.eclipsesource.mmv8.V8ScriptFileDescriptor v8ScriptFileDescriptor, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    java.lang.Object executeFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array);

    int executeIntegerFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array);

    int executeIntegerScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    int executeIntegerScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    int executeIntegerScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    java.lang.Object executeJSFunction(java.lang.String str);

    java.lang.Object executeJSFunction(java.lang.String str, java.lang.Object... objArr);

    com.eclipsesource.mmv8.V8Object executeObjectFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array);

    com.eclipsesource.mmv8.V8Object executeObjectScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    com.eclipsesource.mmv8.V8Object executeObjectScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    com.eclipsesource.mmv8.V8Object executeObjectScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    java.lang.Object executeScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    java.lang.Object executeScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    java.lang.Object executeScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    java.lang.String executeStringFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array);

    java.lang.String executeStringScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    java.lang.String executeStringScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    java.lang.String executeStringScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    void executeVoidFunction(java.lang.String str, com.eclipsesource.mmv8.V8Array v8Array);

    void executeVoidScript(java.lang.String str, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    void executeVoidScript(java.lang.String str, java.lang.String str2, int i17, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    void executeVoidScript(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, int i18, com.eclipsesource.mmv8.ExecuteDetails executeDetails);

    java.lang.Object get(java.lang.String str);

    com.eclipsesource.mmv8.V8Array getArray(java.lang.String str);

    boolean getBoolean(java.lang.String str);

    double getDouble(java.lang.String str);

    com.eclipsesource.mmv8.V8Object getGlobalObject();

    int getInteger(java.lang.String str);

    java.lang.String[] getKeys();

    com.eclipsesource.mmv8.V8Object getObject(java.lang.String str);

    long getPtr();

    java.lang.String getString(java.lang.String str);

    int getType(java.lang.String str);

    boolean isReleased();

    com.eclipsesource.mmv8.SharedV8ArrayBuffer newSharedV8ArrayBuffer(com.eclipsesource.mmv8.InSandboxByteBuffer inSandboxByteBuffer);

    com.eclipsesource.mmv8.SharedV8ArrayBuffer newSharedV8ArrayBuffer(com.eclipsesource.mmv8.V8ArrayBuffer v8ArrayBuffer);

    com.eclipsesource.mmv8.V8Array newV8Array();

    com.eclipsesource.mmv8.V8ArrayBuffer newV8ArrayBuffer(int i17);

    com.eclipsesource.mmv8.V8ArrayBuffer newV8ArrayBuffer(java.nio.ByteBuffer byteBuffer);

    com.eclipsesource.mmv8.V8Function newV8Function(com.eclipsesource.mmv8.JavaCallback javaCallback);

    com.eclipsesource.mmv8.V8Object newV8Object();

    com.eclipsesource.mmv8.V8TypedArray newV8TypedArray(com.eclipsesource.mmv8.V8ArrayBuffer v8ArrayBuffer, int i17, int i18, int i19);

    void precompile(java.lang.String str, java.lang.String str2);

    com.eclipsesource.mmv8.V8Object registerJavaMethod(com.eclipsesource.mmv8.JavaCallback javaCallback, java.lang.String str);

    com.eclipsesource.mmv8.V8Object registerJavaMethod(com.eclipsesource.mmv8.JavaVoidCallback javaVoidCallback, java.lang.String str);

    com.eclipsesource.mmv8.V8Object registerJavaMethod(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Class<?>[] clsArr);

    com.eclipsesource.mmv8.V8Object registerJavaMethod(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Class<?>[] clsArr, boolean z17);

    void release();

    void saveEntryPagePathToCachePath();

    void shareObject(java.lang.String str, com.eclipsesource.mmv8.V8Context v8Context);

    void shareObject(java.lang.String str, com.eclipsesource.mmv8.V8Context v8Context, java.lang.String str2);
}
