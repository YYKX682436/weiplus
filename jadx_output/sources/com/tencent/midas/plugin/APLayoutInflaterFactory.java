package com.tencent.midas.plugin;

/* loaded from: classes13.dex */
public class APLayoutInflaterFactory implements android.view.LayoutInflater.Factory2 {
    private final java.util.HashMap<java.lang.String, java.lang.reflect.Constructor<? extends android.view.View>> constructorMap = new java.util.HashMap<>();
    private final java.lang.Class<?>[] constructorSign = {android.content.Context.class, android.util.AttributeSet.class};
    private final java.lang.Object[] constructorArgs = new java.lang.Object[2];

    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[Catch: all -> 0x0066, TryCatch #4 {all -> 0x0066, blocks: (B:35:0x002f, B:38:0x003d, B:13:0x0052, B:28:0x006b, B:31:0x0085, B:32:0x0092, B:33:0x0081, B:24:0x0094, B:25:0x00b4, B:21:0x00b6, B:22:0x00d6, B:18:0x00d8, B:19:0x00f6), top: B:9:0x002d, inners: #6, #7 }] */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View onCreateView(android.view.View r8, java.lang.String r9, android.content.Context r10, android.util.AttributeSet r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APLayoutInflaterFactory.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public android.view.View onCreateView(java.lang.String str, android.content.Context context, android.util.AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
