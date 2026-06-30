package com.eclipsesource.mmv8.debug.mirror;

/* loaded from: classes7.dex */
public class PropertyMirror extends com.eclipsesource.mmv8.debug.mirror.Mirror {
    public PropertyMirror(com.eclipsesource.mmv8.V8Object v8Object) {
        super(v8Object);
    }

    public java.lang.String getName() {
        return this.v8Object.executeStringFunction(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, null);
    }

    public com.eclipsesource.mmv8.debug.mirror.Mirror getValue() {
        com.eclipsesource.mmv8.V8Object executeObjectFunction = this.v8Object.executeObjectFunction("value", null);
        try {
            return com.eclipsesource.mmv8.debug.mirror.Mirror.createMirror(executeObjectFunction);
        } finally {
            executeObjectFunction.release();
        }
    }

    @Override // com.eclipsesource.mmv8.debug.mirror.Mirror
    public boolean isProperty() {
        return true;
    }
}
