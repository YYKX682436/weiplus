package com.eclipsesource.mmv8;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class V8ContextSessionMgr {
    private com.eclipsesource.mmv8.V8ContextWrapper currentContext;

    /* renamed from: v8, reason: collision with root package name */
    private final com.eclipsesource.mmv8.V8 f43994v8;

    public V8ContextSessionMgr(com.eclipsesource.mmv8.V8 v86) {
        this.f43994v8 = v86;
    }

    public void enterContext(com.eclipsesource.mmv8.V8ContextWrapper v8ContextWrapper) {
        if (v8ContextWrapper == null || v8ContextWrapper.equals(this.currentContext)) {
            return;
        }
        this.f43994v8.switchV8Context(v8ContextWrapper.getPtr());
        this.currentContext = v8ContextWrapper;
    }

    public void releaseContext(com.eclipsesource.mmv8.V8ContextWrapper v8ContextWrapper) {
        if (v8ContextWrapper == null) {
            return;
        }
        this.f43994v8.releaseV8Context(v8ContextWrapper.getPtr());
    }
}
