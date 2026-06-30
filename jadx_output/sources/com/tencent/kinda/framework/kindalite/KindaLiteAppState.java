package com.tencent.kinda.framework.kindalite;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/KindaLiteAppState;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "Idle", "Starting", "Running", "Paying", "PaySucceeded", "PendingStop", "Stopping", "Stopped", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class KindaLiteAppState {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.kinda.framework.kindalite.KindaLiteAppState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.kinda.framework.kindalite.KindaLiteAppState.Companion INSTANCE;
    private final int code;
    public static final com.tencent.kinda.framework.kindalite.KindaLiteAppState Idle = new com.tencent.kinda.framework.kindalite.KindaLiteAppState("Idle", 0, 0);
    public static final com.tencent.kinda.framework.kindalite.KindaLiteAppState Starting = new com.tencent.kinda.framework.kindalite.KindaLiteAppState("Starting", 1, 1);
    public static final com.tencent.kinda.framework.kindalite.KindaLiteAppState Running = new com.tencent.kinda.framework.kindalite.KindaLiteAppState("Running", 2, 2);
    public static final com.tencent.kinda.framework.kindalite.KindaLiteAppState Paying = new com.tencent.kinda.framework.kindalite.KindaLiteAppState("Paying", 3, 3);
    public static final com.tencent.kinda.framework.kindalite.KindaLiteAppState PaySucceeded = new com.tencent.kinda.framework.kindalite.KindaLiteAppState("PaySucceeded", 4, 4);
    public static final com.tencent.kinda.framework.kindalite.KindaLiteAppState PendingStop = new com.tencent.kinda.framework.kindalite.KindaLiteAppState("PendingStop", 5, 5);
    public static final com.tencent.kinda.framework.kindalite.KindaLiteAppState Stopping = new com.tencent.kinda.framework.kindalite.KindaLiteAppState("Stopping", 6, 6);
    public static final com.tencent.kinda.framework.kindalite.KindaLiteAppState Stopped = new com.tencent.kinda.framework.kindalite.KindaLiteAppState("Stopped", 7, 7);

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/kinda/framework/kindalite/KindaLiteAppState$Companion;", "", "()V", "fromCode", "Lcom/tencent/kinda/framework/kindalite/KindaLiteAppState;", "code", "", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.kinda.framework.kindalite.KindaLiteAppState fromCode(int code) {
            java.lang.Object obj;
            java.util.Iterator<E> it = com.tencent.kinda.framework.kindalite.KindaLiteAppState.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((com.tencent.kinda.framework.kindalite.KindaLiteAppState) obj).getCode() == code) {
                    break;
                }
            }
            return (com.tencent.kinda.framework.kindalite.KindaLiteAppState) obj;
        }
    }

    private static final /* synthetic */ com.tencent.kinda.framework.kindalite.KindaLiteAppState[] $values() {
        return new com.tencent.kinda.framework.kindalite.KindaLiteAppState[]{Idle, Starting, Running, Paying, PaySucceeded, PendingStop, Stopping, Stopped};
    }

    static {
        com.tencent.kinda.framework.kindalite.KindaLiteAppState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
        INSTANCE = new com.tencent.kinda.framework.kindalite.KindaLiteAppState.Companion(null);
    }

    private KindaLiteAppState(java.lang.String str, int i17, int i18) {
        this.code = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.kinda.framework.kindalite.KindaLiteAppState valueOf(java.lang.String str) {
        return (com.tencent.kinda.framework.kindalite.KindaLiteAppState) java.lang.Enum.valueOf(com.tencent.kinda.framework.kindalite.KindaLiteAppState.class, str);
    }

    public static com.tencent.kinda.framework.kindalite.KindaLiteAppState[] values() {
        return (com.tencent.kinda.framework.kindalite.KindaLiteAppState[]) $VALUES.clone();
    }

    public final int getCode() {
        return this.code;
    }
}
