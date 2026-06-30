package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public class c7 implements com.tencent.mm.plugin.appbrand.launching.l7 {
    public final java.lang.String a(com.tencent.mm.plugin.appbrand.launching.k9 k9Var) {
        if (k9Var == null) {
            return "NULL";
        }
        try {
            return java.lang.String.format(java.util.Locale.US, "bytes[%d]", java.lang.Integer.valueOf(k9Var.field_jsapiInfo.f370425d.f192156a.length));
        } catch (java.lang.Exception e17) {
            return java.lang.String.format(java.util.Locale.US, "Exception[%s]", e17);
        }
    }
}
