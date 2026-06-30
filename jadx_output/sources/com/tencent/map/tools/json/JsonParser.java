package com.tencent.map.tools.json;

/* loaded from: classes13.dex */
public interface JsonParser {

    /* loaded from: classes13.dex */
    public interface Deserializer<T> {
        T deserialize(java.lang.Object obj, java.lang.String str, java.lang.Object obj2);
    }

    void parse(org.json.JSONObject jSONObject);
}
