package com.luggage.trace;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006 "}, d2 = {"Lcom/luggage/trace/Event;", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "", "category", "startTime", "", "thread", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getName", "setName", "getStartTime", "()D", "setStartTime", "(D)V", "getThread", "setThread", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "trace_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Event {
    private java.lang.String category;
    private java.lang.String name;
    private double startTime;
    private java.lang.String thread;

    public Event(java.lang.String name, java.lang.String category, double d17, java.lang.String thread) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(thread, "thread");
        this.name = name;
        this.category = category;
        this.startTime = d17;
        this.thread = thread;
    }

    public static /* synthetic */ com.luggage.trace.Event copy$default(com.luggage.trace.Event event, java.lang.String str, java.lang.String str2, double d17, java.lang.String str3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = event.name;
        }
        if ((i17 & 2) != 0) {
            str2 = event.category;
        }
        java.lang.String str4 = str2;
        if ((i17 & 4) != 0) {
            d17 = event.startTime;
        }
        double d18 = d17;
        if ((i17 & 8) != 0) {
            str3 = event.thread;
        }
        return event.copy(str, str4, d18, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getCategory() {
        return this.category;
    }

    /* renamed from: component3, reason: from getter */
    public final double getStartTime() {
        return this.startTime;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getThread() {
        return this.thread;
    }

    public final com.luggage.trace.Event copy(java.lang.String name, java.lang.String category, double startTime, java.lang.String thread) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(category, "category");
        kotlin.jvm.internal.o.g(thread, "thread");
        return new com.luggage.trace.Event(name, category, startTime, thread);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.luggage.trace.Event)) {
            return false;
        }
        com.luggage.trace.Event event = (com.luggage.trace.Event) other;
        return kotlin.jvm.internal.o.b(this.name, event.name) && kotlin.jvm.internal.o.b(this.category, event.category) && java.lang.Double.compare(this.startTime, event.startTime) == 0 && kotlin.jvm.internal.o.b(this.thread, event.thread);
    }

    public final java.lang.String getCategory() {
        return this.category;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final double getStartTime() {
        return this.startTime;
    }

    public final java.lang.String getThread() {
        return this.thread;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.category.hashCode()) * 31) + java.lang.Double.hashCode(this.startTime)) * 31) + this.thread.hashCode();
    }

    public final void setCategory(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.category = str;
    }

    public final void setName(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.name = str;
    }

    public final void setStartTime(double d17) {
        this.startTime = d17;
    }

    public final void setThread(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.thread = str;
    }

    public java.lang.String toString() {
        return "Event(name=" + this.name + ", category=" + this.category + ", startTime=" + this.startTime + ", thread=" + this.thread + ')';
    }
}
