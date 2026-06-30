package io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb;

/* renamed from: io.flutter.plugin.common.MethodCall */
/* loaded from: classes13.dex */
public final class C28687x4bb242ff {

    /* renamed from: arguments */
    public final java.lang.Object f71609x86ac7956;

    /* renamed from: method */
    public final java.lang.String f71610xbfc5d0e1;

    public C28687x4bb242ff(java.lang.String str, java.lang.Object obj) {
        this.f71610xbfc5d0e1 = str;
        this.f71609x86ac7956 = obj;
    }

    /* renamed from: argument */
    public <T> T m138433xa13f5ebd(java.lang.String str) {
        java.lang.Object obj = this.f71609x86ac7956;
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.util.Map) {
            return (T) ((java.util.Map) obj).get(str);
        }
        if (obj instanceof org.json.JSONObject) {
            return (T) ((org.json.JSONObject) obj).opt(str);
        }
        throw new java.lang.ClassCastException();
    }

    /* renamed from: arguments */
    public <T> T m138434x86ac7956() {
        return (T) this.f71609x86ac7956;
    }

    /* renamed from: hasArgument */
    public boolean m138435x4c941b77(java.lang.String str) {
        java.lang.Object obj = this.f71609x86ac7956;
        if (obj == null) {
            return false;
        }
        if (obj instanceof java.util.Map) {
            return ((java.util.Map) obj).containsKey(str);
        }
        if (obj instanceof org.json.JSONObject) {
            return ((org.json.JSONObject) obj).has(str);
        }
        throw new java.lang.ClassCastException();
    }
}
