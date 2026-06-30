package com.eclipsesource.mmv8;

/* loaded from: classes7.dex */
public interface IV8Tracer {
    public static final com.eclipsesource.mmv8.IV8Tracer DUMMY = new com.eclipsesource.mmv8.IV8Tracer() { // from class: com.eclipsesource.mmv8.IV8Tracer.1
        @Override // com.eclipsesource.mmv8.IV8Tracer
        public void beginSection(java.lang.String str) {
        }

        @Override // com.eclipsesource.mmv8.IV8Tracer
        public void endSection() {
        }
    };

    void beginSection(java.lang.String str);

    void endSection();
}
