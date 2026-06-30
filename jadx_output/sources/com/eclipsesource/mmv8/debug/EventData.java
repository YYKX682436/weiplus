package com.eclipsesource.mmv8.debug;

/* loaded from: classes7.dex */
public class EventData implements com.eclipsesource.mmv8.Releasable {
    protected com.eclipsesource.mmv8.V8Object v8Object;

    public EventData(com.eclipsesource.mmv8.V8Object v8Object) {
        this.v8Object = v8Object.twin();
    }

    @Override // com.eclipsesource.mmv8.Releasable
    public void release() {
        if (this.v8Object.isReleased()) {
            return;
        }
        this.v8Object.release();
    }
}
