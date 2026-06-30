package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002;

/* renamed from: com.google.android.gms.common.util.JsonUtils */
/* loaded from: classes13.dex */
public final class C2002x365c2489 {
    private static final java.util.regex.Pattern zza = java.util.regex.Pattern.compile("\\\\.");
    private static final java.util.regex.Pattern zzb = java.util.regex.Pattern.compile("[\\\\\"/\b\f\n\r\t]");

    private C2002x365c2489() {
    }

    /* renamed from: areJsonValuesEquivalent */
    public static boolean m18588x88e866a8(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null && obj2 == null) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        if ((obj instanceof org.json.JSONObject) && (obj2 instanceof org.json.JSONObject)) {
            org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
            org.json.JSONObject jSONObject2 = (org.json.JSONObject) obj2;
            if (jSONObject.length() != jSONObject2.length()) {
                return false;
            }
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                if (!jSONObject2.has(next)) {
                    return false;
                }
                try {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(next);
                } catch (org.json.JSONException unused) {
                }
                if (!m18588x88e866a8(jSONObject.get(next), jSONObject2.get(next))) {
                    return false;
                }
            }
            return true;
        }
        if (!(obj instanceof org.json.JSONArray) || !(obj2 instanceof org.json.JSONArray)) {
            return obj.equals(obj2);
        }
        org.json.JSONArray jSONArray = (org.json.JSONArray) obj;
        org.json.JSONArray jSONArray2 = (org.json.JSONArray) obj2;
        if (jSONArray.length() != jSONArray2.length()) {
            return false;
        }
        for (int i17 = 0; i17 < jSONArray.length(); i17++) {
            if (!m18588x88e866a8(jSONArray.get(i17), jSONArray2.get(i17))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: escapeString */
    public static java.lang.String m18589x77baa7f2(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.util.regex.Matcher matcher = zzb.matcher(str);
        java.lang.StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new java.lang.StringBuffer();
            }
            char charAt = matcher.group().charAt(0);
            if (charAt == '\f') {
                matcher.appendReplacement(stringBuffer, "\\\\f");
            } else if (charAt == '\r') {
                matcher.appendReplacement(stringBuffer, "\\\\r");
            } else if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\\\\\\\"");
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, "\\\\/");
            } else if (charAt != '\\') {
                switch (charAt) {
                    case '\b':
                        matcher.appendReplacement(stringBuffer, "\\\\b");
                        break;
                    case '\t':
                        matcher.appendReplacement(stringBuffer, "\\\\t");
                        break;
                    case '\n':
                        matcher.appendReplacement(stringBuffer, "\\\\n");
                        break;
                }
            } else {
                matcher.appendReplacement(stringBuffer, "\\\\\\\\");
            }
        }
        if (stringBuffer == null) {
            return str;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: unescapeString */
    public static java.lang.String m18590x2e64990b(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        java.lang.String zza2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.zzc.zza(str);
        java.util.regex.Matcher matcher = zza.matcher(zza2);
        java.lang.StringBuffer stringBuffer = null;
        while (matcher.find()) {
            if (stringBuffer == null) {
                stringBuffer = new java.lang.StringBuffer();
            }
            char charAt = matcher.group().charAt(1);
            if (charAt == '\"') {
                matcher.appendReplacement(stringBuffer, "\"");
            } else if (charAt == '/') {
                matcher.appendReplacement(stringBuffer, "/");
            } else if (charAt == '\\') {
                matcher.appendReplacement(stringBuffer, "\\\\");
            } else if (charAt == 'b') {
                matcher.appendReplacement(stringBuffer, "\b");
            } else if (charAt == 'f') {
                matcher.appendReplacement(stringBuffer, "\f");
            } else if (charAt == 'n') {
                matcher.appendReplacement(stringBuffer, "\n");
            } else if (charAt == 'r') {
                matcher.appendReplacement(stringBuffer, "\r");
            } else {
                if (charAt != 't') {
                    throw new java.lang.IllegalStateException("Found an escaped character that should never be.");
                }
                matcher.appendReplacement(stringBuffer, "\t");
            }
        }
        if (stringBuffer == null) {
            return zza2;
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
