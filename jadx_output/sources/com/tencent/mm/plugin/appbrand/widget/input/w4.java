package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public abstract class w4 {
    /* JADX WARN: Multi-variable type inference failed */
    public static com.tencent.mm.plugin.appbrand.widget.input.x4 a(android.content.Context context) {
        android.content.Context baseContext;
        if (context == 0) {
            return null;
        }
        if (context instanceof com.tencent.mm.plugin.appbrand.widget.input.x4) {
            return (com.tencent.mm.plugin.appbrand.widget.input.x4) context;
        }
        if (!(context instanceof android.content.ContextWrapper) || (baseContext = ((android.content.ContextWrapper) context).getBaseContext()) == context) {
            return null;
        }
        return a(baseContext);
    }
}
