package com.eclipsesource.mmv8.debug;

/* loaded from: classes7.dex */
public class DebugHandler implements com.eclipsesource.mmv8.Releasable {
    private static final java.lang.String CHANGE_BREAK_POINT_CONDITION = "changeBreakPointCondition";
    private static final java.lang.String CLEAR_BREAK_POINT = "clearBreakPoint";
    private static final java.lang.String DEBUG_BREAK_HANDLER = "__j2v8_debug_handler";
    public static java.lang.String DEBUG_OBJECT_NAME = "__j2v8_Debug";
    private static final java.lang.String DISABLE_ALL_BREAK_POINTS = "disableAllBreakPoints";
    private static final java.lang.String DISABLE_SCRIPT_BREAK_POINT = "disableScriptBreakPoint";
    private static final java.lang.String ENABLE_SCRIPT_BREAK_POINT = "enableScriptBreakPoint";
    private static final java.lang.String FIND_SCRIPT_BREAK_POINT = "findScriptBreakPoint";
    private static final java.lang.String NUMBER = "number";
    private static final java.lang.String SCRIPT_BREAK_POINTS = "scriptBreakPoints";
    private static final java.lang.String SET_BREAK_POINT = "setBreakPoint";
    private static final java.lang.String SET_LISTENER = "setListener";
    private static final java.lang.String SET_SCRIPT_BREAK_POINT_BY_NAME = "setScriptBreakPointByName";
    private static final java.lang.String V8_DEBUG_OBJECT = "Debug";
    private java.util.List<com.eclipsesource.mmv8.debug.BreakHandler> breakHandlers = new java.util.ArrayList();
    private com.eclipsesource.mmv8.V8Object debugObject;
    private com.eclipsesource.mmv8.V8 runtime;

    /* renamed from: com.eclipsesource.mmv8.debug.DebugHandler$1, reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$eclipsesource$mmv8$debug$DebugHandler$DebugEvent;

        static {
            int[] iArr = new int[com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent.values().length];
            $SwitchMap$com$eclipsesource$mmv8$debug$DebugHandler$DebugEvent = iArr;
            try {
                iArr[com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent.Break.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$eclipsesource$mmv8$debug$DebugHandler$DebugEvent[com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent.BeforeCompile.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$eclipsesource$mmv8$debug$DebugHandler$DebugEvent[com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent.AfterCompile.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$eclipsesource$mmv8$debug$DebugHandler$DebugEvent[com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent.Exception.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes7.dex */
    public class BreakpointHandler implements com.eclipsesource.mmv8.JavaVoidCallback {
        private BreakpointHandler() {
        }

        private com.eclipsesource.mmv8.debug.EventData createDebugEvent(com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent debugEvent, com.eclipsesource.mmv8.V8Object v8Object) {
            int i17 = com.eclipsesource.mmv8.debug.DebugHandler.AnonymousClass1.$SwitchMap$com$eclipsesource$mmv8$debug$DebugHandler$DebugEvent[debugEvent.ordinal()];
            if (i17 == 1) {
                return new com.eclipsesource.mmv8.debug.BreakEvent(v8Object);
            }
            if (i17 != 2 && i17 != 3) {
                return i17 != 4 ? new com.eclipsesource.mmv8.debug.EventData(v8Object) : new com.eclipsesource.mmv8.debug.ExceptionEvent(v8Object);
            }
            return new com.eclipsesource.mmv8.debug.CompileEvent(v8Object);
        }

        private void invokeHandler(com.eclipsesource.mmv8.V8Array v8Array, int i17, com.eclipsesource.mmv8.debug.BreakHandler breakHandler) {
            com.eclipsesource.mmv8.V8Object v8Object;
            com.eclipsesource.mmv8.debug.ExecutionState executionState;
            com.eclipsesource.mmv8.V8Object v8Object2;
            com.eclipsesource.mmv8.debug.ExecutionState executionState2;
            com.eclipsesource.mmv8.V8Object v8Object3 = null;
            com.eclipsesource.mmv8.debug.EventData eventData = null;
            try {
                com.eclipsesource.mmv8.V8Object object = v8Array.getObject(1);
                try {
                    v8Object2 = v8Array.getObject(2);
                    try {
                        v8Object = v8Array.getObject(3);
                        try {
                            executionState2 = new com.eclipsesource.mmv8.debug.ExecutionState(object);
                            try {
                                com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent debugEvent = com.eclipsesource.mmv8.debug.DebugHandler.DebugEvent.values()[i17];
                                eventData = createDebugEvent(debugEvent, v8Object2);
                                breakHandler.onBreak(debugEvent, executionState2, eventData, v8Object);
                                safeRelease(object);
                                safeRelease(v8Object2);
                                safeRelease(v8Object);
                                safeRelease(executionState2);
                                safeRelease(eventData);
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                executionState = eventData;
                                v8Object3 = object;
                                safeRelease(v8Object3);
                                safeRelease(v8Object2);
                                safeRelease(v8Object);
                                safeRelease(executionState2);
                                safeRelease(executionState);
                                throw th;
                            }
                        } catch (java.lang.Throwable th7) {
                            th = th7;
                            executionState = null;
                            executionState2 = executionState;
                            v8Object3 = object;
                            safeRelease(v8Object3);
                            safeRelease(v8Object2);
                            safeRelease(v8Object);
                            safeRelease(executionState2);
                            safeRelease(executionState);
                            throw th;
                        }
                    } catch (java.lang.Throwable th8) {
                        th = th8;
                        v8Object = null;
                        executionState = null;
                    }
                } catch (java.lang.Throwable th9) {
                    th = th9;
                    v8Object = null;
                    executionState = null;
                    v8Object2 = null;
                    executionState2 = null;
                }
            } catch (java.lang.Throwable th10) {
                th = th10;
                v8Object = null;
                executionState = null;
                v8Object2 = null;
                executionState2 = null;
            }
        }

        private void safeRelease(com.eclipsesource.mmv8.Releasable releasable) {
            if (releasable != null) {
                releasable.release();
            }
        }

        @Override // com.eclipsesource.mmv8.JavaVoidCallback
        public void invoke(com.eclipsesource.mmv8.V8Object v8Object, com.eclipsesource.mmv8.V8Array v8Array) {
            if (v8Array == null || v8Array.isUndefined()) {
                return;
            }
            int integer = v8Array.getInteger(0);
            java.util.Iterator it = com.eclipsesource.mmv8.debug.DebugHandler.this.breakHandlers.iterator();
            while (it.hasNext()) {
                invokeHandler(v8Array, integer, (com.eclipsesource.mmv8.debug.BreakHandler) it.next());
            }
        }

        public /* synthetic */ BreakpointHandler(com.eclipsesource.mmv8.debug.DebugHandler debugHandler, com.eclipsesource.mmv8.debug.DebugHandler.AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* loaded from: classes7.dex */
    public enum DebugEvent {
        Undefined(0),
        Break(1),
        Exception(2),
        NewFunction(3),
        BeforeCompile(4),
        AfterCompile(5),
        CompileError(6),
        PromiseError(7),
        AsyncTaskEvent(8);

        int index;

        DebugEvent(int i17) {
            this.index = i17;
        }
    }

    public DebugHandler(com.eclipsesource.mmv8.V8 v86) {
        this.runtime = v86;
        setupDebugObject(v86);
        setupBreakpointHandler();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.eclipsesource.mmv8.debug.DebugHandler$1] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.eclipsesource.mmv8.V8Value] */
    /* JADX WARN: Type inference failed for: r1v4 */
    private void setupBreakpointHandler() {
        com.eclipsesource.mmv8.V8Array v8Array;
        com.eclipsesource.mmv8.V8Function v8Function;
        ?? r17 = 0;
        com.eclipsesource.mmv8.V8Array v8Array2 = null;
        this.debugObject.registerJavaMethod(new com.eclipsesource.mmv8.debug.DebugHandler.BreakpointHandler(this, r17), DEBUG_BREAK_HANDLER);
        try {
            v8Function = (com.eclipsesource.mmv8.V8Function) this.debugObject.getObject(DEBUG_BREAK_HANDLER);
        } catch (java.lang.Throwable th6) {
            th = th6;
            v8Array = null;
        }
        try {
            v8Array2 = new com.eclipsesource.mmv8.V8Array(this.runtime).push((com.eclipsesource.mmv8.V8Value) v8Function);
            this.debugObject.executeFunction(SET_LISTENER, v8Array2);
            if (v8Function != null && !v8Function.isReleased()) {
                v8Function.release();
            }
            if (v8Array2 == null || v8Array2.isReleased()) {
                return;
            }
            v8Array2.release();
        } catch (java.lang.Throwable th7) {
            th = th7;
            com.eclipsesource.mmv8.V8Array v8Array3 = v8Array2;
            r17 = v8Function;
            v8Array = v8Array3;
            if (r17 != 0 && !r17.isReleased()) {
                r17.release();
            }
            if (v8Array != null && !v8Array.isReleased()) {
                v8Array.release();
            }
            throw th;
        }
    }

    private void setupDebugObject(com.eclipsesource.mmv8.V8 v86) {
        com.eclipsesource.mmv8.V8Object object = v86.getObject(DEBUG_OBJECT_NAME);
        try {
            this.debugObject = object.getObject(V8_DEBUG_OBJECT);
        } finally {
            object.release();
        }
    }

    public void addBreakHandler(com.eclipsesource.mmv8.debug.BreakHandler breakHandler) {
        this.runtime.getLocker().checkThread();
        this.breakHandlers.add(breakHandler);
    }

    public void changeBreakPointCondition(int i17, java.lang.String str) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.runtime);
        v8Array.push(i17);
        v8Array.push(str);
        try {
            this.debugObject.executeVoidFunction(CHANGE_BREAK_POINT_CONDITION, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void clearBreakPoint(int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.runtime);
        v8Array.push(i17);
        try {
            this.debugObject.executeVoidFunction(CLEAR_BREAK_POINT, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void disableAllBreakPoints() {
        this.debugObject.executeVoidFunction(DISABLE_ALL_BREAK_POINTS, null);
    }

    public void disableScriptBreakPoint(int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.runtime);
        v8Array.push(i17);
        try {
            this.debugObject.executeVoidFunction(DISABLE_SCRIPT_BREAK_POINT, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public void enableScriptBreakPoint(int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.runtime);
        v8Array.push(i17);
        try {
            this.debugObject.executeVoidFunction(ENABLE_SCRIPT_BREAK_POINT, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public com.eclipsesource.mmv8.debug.ScriptBreakPoint getScriptBreakPoint(int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.runtime);
        v8Array.push(i17);
        v8Array.push(false);
        com.eclipsesource.mmv8.V8Object v8Object = null;
        try {
            v8Object = this.debugObject.executeObjectFunction(FIND_SCRIPT_BREAK_POINT, v8Array);
            return new com.eclipsesource.mmv8.debug.ScriptBreakPoint(v8Object);
        } finally {
            v8Array.release();
            if (v8Object != null) {
                v8Object.release();
            }
        }
    }

    public int getScriptBreakPointCount() {
        com.eclipsesource.mmv8.V8Array executeArrayFunction = this.debugObject.executeArrayFunction(SCRIPT_BREAK_POINTS, null);
        try {
            return executeArrayFunction.length();
        } finally {
            executeArrayFunction.release();
        }
    }

    public int[] getScriptBreakPointIDs() {
        com.eclipsesource.mmv8.V8Array executeArrayFunction = this.debugObject.executeArrayFunction(SCRIPT_BREAK_POINTS, null);
        try {
            int[] iArr = new int[executeArrayFunction.length()];
            for (int i17 = 0; i17 < executeArrayFunction.length(); i17++) {
                com.eclipsesource.mmv8.V8Object object = executeArrayFunction.getObject(i17);
                try {
                    iArr[i17] = object.executeIntegerFunction(NUMBER, null);
                    object.release();
                } finally {
                }
            }
            return iArr;
        } finally {
            executeArrayFunction.release();
        }
    }

    @Override // com.eclipsesource.mmv8.Releasable
    public void release() {
        this.debugObject.release();
    }

    public void removeBreakHandler(com.eclipsesource.mmv8.debug.BreakHandler breakHandler) {
        this.runtime.getLocker().checkThread();
        this.breakHandlers.remove(breakHandler);
    }

    public int setBreakpoint(com.eclipsesource.mmv8.V8Function v8Function) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.runtime);
        v8Array.push((com.eclipsesource.mmv8.V8Value) v8Function);
        try {
            return this.debugObject.executeIntegerFunction(SET_BREAK_POINT, v8Array);
        } finally {
            v8Array.release();
        }
    }

    public int setScriptBreakpoint(java.lang.String str, int i17) {
        com.eclipsesource.mmv8.V8Array v8Array = new com.eclipsesource.mmv8.V8Array(this.runtime);
        v8Array.push(str);
        v8Array.push(i17);
        try {
            return this.debugObject.executeIntegerFunction(SET_SCRIPT_BREAK_POINT_BY_NAME, v8Array);
        } finally {
            v8Array.release();
        }
    }
}
