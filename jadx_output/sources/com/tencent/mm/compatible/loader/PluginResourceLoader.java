package com.tencent.mm.compatible.loader;

/* loaded from: classes13.dex */
public class PluginResourceLoader extends android.content.res.Resources {
    public final android.graphics.drawable.Drawable a(android.util.TypedValue typedValue, int i17) {
        try {
            try {
                throw null;
            } catch (java.lang.Exception unused) {
                throw null;
            }
        } catch (java.lang.Exception unused2) {
            java.lang.CharSequence charSequence = typedValue.string;
            if (charSequence == null) {
                throw null;
            }
            if (!charSequence.toString().endsWith(".xml")) {
                throw null;
            }
            typedValue.string.toString();
            try {
                throw null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.PluginResourceLoader", e17, "", new java.lang.Object[0]);
                android.graphics.drawable.Drawable.createFromXml(this, null);
                throw null;
            }
        }
    }

    public android.graphics.drawable.Drawable loadDrawable(android.util.TypedValue typedValue, int i17) {
        a(typedValue, i17);
        throw null;
    }

    @Override // android.content.res.Resources
    public java.io.InputStream openRawResource(int i17, android.util.TypedValue typedValue) {
        java.io.InputStream inputStream;
        getValue(i17, typedValue, true);
        try {
            inputStream = super.openRawResource(i17, typedValue);
        } catch (java.lang.Exception unused) {
            inputStream = null;
        }
        if (inputStream != null) {
            return inputStream;
        }
        throw null;
    }

    public android.graphics.drawable.Drawable loadDrawable(android.util.TypedValue typedValue, int i17, boolean z17) {
        a(typedValue, i17);
        throw null;
    }
}
