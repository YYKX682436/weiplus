package com.google.firebase.components;

/* loaded from: classes13.dex */
public class DependencyCycleException extends com.google.firebase.components.DependencyException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DependencyCycleException(java.util.List<com.google.firebase.components.Component<?>> r3) {
        /*
            r2 = this;
            java.lang.Object[] r3 = r3.toArray()
            java.lang.String r3 = java.util.Arrays.toString(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "Dependency cycle detected: "
            if (r0 == 0) goto L19
            java.lang.String r3 = r1.concat(r3)
            goto L1e
        L19:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L1e:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.components.DependencyCycleException.<init>(java.util.List):void");
    }
}
