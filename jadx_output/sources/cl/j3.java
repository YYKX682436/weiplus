package cl;

/* loaded from: classes7.dex */
public class j3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f42668a;

    /* renamed from: b, reason: collision with root package name */
    public final com.eclipsesource.mmv8.V8ScriptEvaluateRequest f42669b;

    public j3(java.lang.String str, java.lang.String str2) {
        this(str, str2, "", "");
    }

    public boolean a() {
        com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest = this.f42669b;
        if (v8ScriptEvaluateRequest == null) {
            return false;
        }
        return (3 == v8ScriptEvaluateRequest.scriptType && android.text.TextUtils.isEmpty(v8ScriptEvaluateRequest.scriptText)) ? false : true;
    }

    public j3(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.f42668a = str;
        com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest = new com.eclipsesource.mmv8.V8ScriptEvaluateRequest();
        this.f42669b = v8ScriptEvaluateRequest;
        v8ScriptEvaluateRequest.scriptType = 3;
        v8ScriptEvaluateRequest.scriptText = str2;
        v8ScriptEvaluateRequest.cacheCategory = str3;
        v8ScriptEvaluateRequest.cacheKey = str4;
    }

    public j3(java.lang.String str, com.eclipsesource.mmv8.V8ScriptEvaluateRequest v8ScriptEvaluateRequest) {
        this.f42668a = str;
        this.f42669b = v8ScriptEvaluateRequest;
    }
}
