package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class jb implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f166238d;

    public jb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.kb kbVar, java.util.Set set) {
        this.f166238d = set;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (obj instanceof org.json.JSONObject) {
            java.lang.String optString = ((org.json.JSONObject) obj).optString("plugin_id");
            if (!android.text.TextUtils.isEmpty(optString)) {
                this.f166238d.add(optString);
            }
        }
        return jz5.f0.f384359a;
    }
}
