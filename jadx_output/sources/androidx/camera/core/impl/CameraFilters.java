package androidx.camera.core.impl;

/* loaded from: classes16.dex */
public class CameraFilters {
    public static final androidx.camera.core.CameraFilter ANY = new androidx.camera.core.impl.CameraFilters$$a();
    public static final androidx.camera.core.CameraFilter NONE = new androidx.camera.core.impl.CameraFilters$$b();

    private CameraFilters() {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InlineMethods
        jadx.core.utils.exceptions.JadxRuntimeException: Failed to process method for inline: androidx.camera.core.impl.CameraFilters.lambda$static$1(java.util.List):java.util.List
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:74)
        	at jadx.core.dex.visitors.InlineMethods.visit(InlineMethods.java:49)
        Caused by: java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4916)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:103)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.InlineMethods.processInvokeInsn(InlineMethods.java:63)
        	... 1 more
        */
    public static /* synthetic */ java.util.List b(java.util.List r0) {
        /*
            java.util.List r0 = lambda$static$1(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.CameraFilters.b(java.util.List):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.util.List lambda$static$0(java.util.List list) {
        return list;
    }

    private static /* synthetic */ java.util.List lambda$static$1(java.util.List list) {
        return java.util.Collections.emptyList();
    }
}
