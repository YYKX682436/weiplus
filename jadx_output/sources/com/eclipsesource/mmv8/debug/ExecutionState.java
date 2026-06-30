package com.eclipsesource.mmv8.debug;

/* loaded from: classes7.dex */
public class ExecutionState implements com.eclipsesource.mmv8.Releasable {
    private static final java.lang.String FRAME = "frame";
    private static final java.lang.String FRAME_COUNT = "frameCount";
    private static final java.lang.String PREPARE_STEP = "prepareStep";
    private com.eclipsesource.mmv8.V8Object v8Object;

    public ExecutionState(com.eclipsesource.mmv8.V8Object v8Object) {
        this.v8Object = v8Object.twin();
    }

    public com.eclipsesource.mmv8.debug.mirror.Frame getFrame(int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(i17);
        com.eclipsesource.mmv8.V8Object v8Object = null;
        try {
            v8Object = this.v8Object.executeObjectFunction(FRAME, v8Array);
            return new com.eclipsesource.mmv8.debug.mirror.Frame(v8Object);
        } finally {
            v8Array.release();
            if (v8Object != null) {
                v8Object.release();
            }
        }
    }

    public int getFrameCount() {
        return this.v8Object.executeIntegerFunction(FRAME_COUNT, null);
    }

    public void prepareStep(com.eclipsesource.mmv8.debug.StepAction stepAction) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.v8Object.getRuntime());
        v8Array.push(stepAction.index);
        try {
            this.v8Object.executeVoidFunction(PREPARE_STEP, v8Array);
        } finally {
            v8Array.release();
        }
    }

    @Override // com.eclipsesource.mmv8.Releasable
    public void release() {
        com.eclipsesource.mmv8.V8Object v8Object = this.v8Object;
        if (v8Object == null || v8Object.isReleased()) {
            return;
        }
        this.v8Object.release();
        this.v8Object = null;
    }
}
