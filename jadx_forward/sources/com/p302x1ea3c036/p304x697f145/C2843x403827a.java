package com.p302x1ea3c036.p304x697f145;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\f¨\u0006 "}, d2 = {"Lcom/luggage/trace/Event;", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "", "category", "startTime", "", "thread", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getName", "setName", "getStartTime", "()D", "setStartTime", "(D)V", "getThread", "setThread", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "trace_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.luggage.trace.Event */
/* loaded from: classes7.dex */
public final /* data */ class C2843x403827a {
    private java.lang.String category;
    private java.lang.String name;
    private double startTime;
    private java.lang.String thread;

    public C2843x403827a(java.lang.String name, java.lang.String category, double d17, java.lang.String thread) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
        this.name = name;
        this.category = category;
        this.startTime = d17;
        this.thread = thread;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p302x1ea3c036.p304x697f145.C2843x403827a m21084x75149012(com.p302x1ea3c036.p304x697f145.C2843x403827a c2843x403827a, java.lang.String str, java.lang.String str2, double d17, java.lang.String str3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = c2843x403827a.name;
        }
        if ((i17 & 2) != 0) {
            str2 = c2843x403827a.category;
        }
        java.lang.String str4 = str2;
        if ((i17 & 4) != 0) {
            d17 = c2843x403827a.startTime;
        }
        double d18 = d17;
        if ((i17 & 8) != 0) {
            str3 = c2843x403827a.thread;
        }
        return c2843x403827a.m21089x2eaf75(str, str4, d18, str3);
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

    /* renamed from: copy */
    public final com.p302x1ea3c036.p304x697f145.C2843x403827a m21089x2eaf75(java.lang.String name, java.lang.String category, double startTime, java.lang.String thread) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
        return new com.p302x1ea3c036.p304x697f145.C2843x403827a(name, category, startTime, thread);
    }

    /* renamed from: equals */
    public boolean m21090xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p302x1ea3c036.p304x697f145.C2843x403827a)) {
            return false;
        }
        com.p302x1ea3c036.p304x697f145.C2843x403827a c2843x403827a = (com.p302x1ea3c036.p304x697f145.C2843x403827a) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.name, c2843x403827a.name) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.category, c2843x403827a.category) && java.lang.Double.compare(this.startTime, c2843x403827a.startTime) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.thread, c2843x403827a.thread);
    }

    /* renamed from: getCategory */
    public final java.lang.String m21091x7edcfa74() {
        return this.category;
    }

    /* renamed from: getName */
    public final java.lang.String m21092xfb82e301() {
        return this.name;
    }

    /* renamed from: getStartTime */
    public final double m21093x8082fb99() {
        return this.startTime;
    }

    /* renamed from: getThread */
    public final java.lang.String m21094x30f83100() {
        return this.thread;
    }

    /* renamed from: hashCode */
    public int m21095x8cdac1b() {
        return (((((this.name.hashCode() * 31) + this.category.hashCode()) * 31) + java.lang.Double.hashCode(this.startTime)) * 31) + this.thread.hashCode();
    }

    /* renamed from: setCategory */
    public final void m21096x79955b80(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.category = str;
    }

    /* renamed from: setName */
    public final void m21097x764daa0d(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.name = str;
    }

    /* renamed from: setStartTime */
    public final void m21098xdcd6bc0d(double d17) {
        this.startTime = d17;
    }

    /* renamed from: setThread */
    public final void m21099x242d650c(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.thread = str;
    }

    /* renamed from: toString */
    public java.lang.String m21100x9616526c() {
        return "Event(name=" + this.name + ", category=" + this.category + ", startTime=" + this.startTime + ", thread=" + this.thread + ')';
    }
}
