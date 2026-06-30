package com.tencent.matrix.battery.accumulate.persist;

@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0005\f\r\u000e\u000f\u0010B\u001c\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b8\u0006¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty;", "", "", ya.b.INDEX, "()I", "", "workProc", "()Ljava/lang/String;", "Lf06/d;", "type", "()Ljava/lang/Class;", "Companion", "mh/q", "FlattType", "TypedList", "TypedMap", "TypedPair", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public @interface FlattProperty {
    public static final mh.q Companion = mh.q.f326279a;
    public static final java.lang.String PROC_ALL = "all";
    public static final java.lang.String PROC_MM = "main";
    public static final java.lang.String PROC_PUSH = "push";

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$FlattType;", "", "plugin-report_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes12.dex */
    public interface FlattType {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$TypedList;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$FlattType;", "Lf06/d;", "itemType", "<init>", "()V", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes12.dex */
    public static abstract class TypedList implements com.tencent.matrix.battery.accumulate.persist.FlattProperty.FlattType {
        public abstract f06.d itemType();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&J\f\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$TypedMap;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$FlattType;", "Lf06/d;", "keyType", "valueType", "<init>", "()V", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes12.dex */
    public static abstract class TypedMap implements com.tencent.matrix.battery.accumulate.persist.FlattProperty.FlattType {
        public abstract f06.d keyType();

        public abstract f06.d valueType();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\f\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&J\f\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$TypedPair;", "Lcom/tencent/matrix/battery/accumulate/persist/FlattProperty$FlattType;", "Lf06/d;", "firstType", "secondType", "<init>", "()V", "plugin-report_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes12.dex */
    public static abstract class TypedPair implements com.tencent.matrix.battery.accumulate.persist.FlattProperty.FlattType {
        public abstract f06.d firstType();

        public abstract f06.d secondType();
    }

    int index();

    java.lang.Class<?> type();

    java.lang.String workProc();
}
