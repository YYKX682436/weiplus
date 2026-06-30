package com.p314xaae8f345.mm.p661xcdc6dad4.p663xbe953013;

/* renamed from: com.tencent.mm.compatible.loader.PluginResourceLoader */
/* loaded from: classes13.dex */
public class C10400x483577f4 extends android.content.res.Resources {
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.PluginResourceLoader", e17, "", new java.lang.Object[0]);
                android.graphics.drawable.Drawable.createFromXml(this, null);
                throw null;
            }
        }
    }

    /* renamed from: loadDrawable */
    public android.graphics.drawable.Drawable m43585x1b4163a4(android.util.TypedValue typedValue, int i17) {
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

    /* renamed from: loadDrawable */
    public android.graphics.drawable.Drawable m43586x1b4163a4(android.util.TypedValue typedValue, int i17, boolean z17) {
        a(typedValue, i17);
        throw null;
    }
}
