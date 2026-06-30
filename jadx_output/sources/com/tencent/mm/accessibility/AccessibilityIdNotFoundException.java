package com.tencent.mm.accessibility;

/* loaded from: classes14.dex */
public class AccessibilityIdNotFoundException extends com.tencent.mm.accessibility.AccessibilityCaptureNotSupportException {
    public AccessibilityIdNotFoundException() {
        super("Unable to find accessibility id");
    }

    public AccessibilityIdNotFoundException(java.lang.String str) {
        super(str);
    }

    public AccessibilityIdNotFoundException(java.lang.Throwable th6) {
        super("Unable to find accessibility id", th6);
    }

    public AccessibilityIdNotFoundException(java.lang.String str, java.lang.Throwable th6) {
        super(str, th6);
    }
}
