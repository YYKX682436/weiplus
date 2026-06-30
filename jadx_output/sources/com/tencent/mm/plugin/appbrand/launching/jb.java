package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class jb implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f84705d;

    public jb(com.tencent.mm.plugin.appbrand.launching.kb kbVar, java.util.Set set) {
        this.f84705d = set;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (obj instanceof org.json.JSONObject) {
            java.lang.String optString = ((org.json.JSONObject) obj).optString("plugin_id");
            if (!android.text.TextUtils.isEmpty(optString)) {
                this.f84705d.add(optString);
            }
        }
        return jz5.f0.f302826a;
    }
}
