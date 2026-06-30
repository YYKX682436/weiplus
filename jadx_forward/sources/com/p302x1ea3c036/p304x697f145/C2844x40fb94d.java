package com.p302x1ea3c036.p304x697f145;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006$"}, d2 = {"Lcom/luggage/trace/Frame;", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "", "category", "startTime", "", "endTime", "thread", "(Ljava/lang/String;Ljava/lang/String;DDLjava/lang/String;)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getEndTime", "()D", "setEndTime", "(D)V", "getName", "setName", "getStartTime", "setStartTime", "getThread", "setThread", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "trace_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: com.luggage.trace.Frame */
/* loaded from: classes7.dex */
public final /* data */ class C2844x40fb94d {
    private java.lang.String category;
    private double endTime;
    private java.lang.String name;
    private double startTime;
    private java.lang.String thread;

    public C2844x40fb94d(java.lang.String name, java.lang.String category, double d17, double d18, java.lang.String thread) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
        this.name = name;
        this.category = category;
        this.startTime = d17;
        this.endTime = d18;
        this.thread = thread;
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p302x1ea3c036.p304x697f145.C2844x40fb94d m21101x75149012(com.p302x1ea3c036.p304x697f145.C2844x40fb94d c2844x40fb94d, java.lang.String str, java.lang.String str2, double d17, double d18, java.lang.String str3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = c2844x40fb94d.name;
        }
        if ((i17 & 2) != 0) {
            str2 = c2844x40fb94d.category;
        }
        java.lang.String str4 = str2;
        if ((i17 & 4) != 0) {
            d17 = c2844x40fb94d.startTime;
        }
        double d19 = d17;
        if ((i17 & 8) != 0) {
            d18 = c2844x40fb94d.endTime;
        }
        double d27 = d18;
        if ((i17 & 16) != 0) {
            str3 = c2844x40fb94d.thread;
        }
        return c2844x40fb94d.m21107x2eaf75(str, str4, d19, d27, str3);
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
    public final double getEndTime() {
        return this.endTime;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getThread() {
        return this.thread;
    }

    /* renamed from: copy */
    public final com.p302x1ea3c036.p304x697f145.C2844x40fb94d m21107x2eaf75(java.lang.String name, java.lang.String category, double startTime, double endTime, java.lang.String thread) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(category, "category");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thread, "thread");
        return new com.p302x1ea3c036.p304x697f145.C2844x40fb94d(name, category, startTime, endTime, thread);
    }

    /* renamed from: equals */
    public boolean m21108xb2c87fbf(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.p302x1ea3c036.p304x697f145.C2844x40fb94d)) {
            return false;
        }
        com.p302x1ea3c036.p304x697f145.C2844x40fb94d c2844x40fb94d = (com.p302x1ea3c036.p304x697f145.C2844x40fb94d) other;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.name, c2844x40fb94d.name) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.category, c2844x40fb94d.category) && java.lang.Double.compare(this.startTime, c2844x40fb94d.startTime) == 0 && java.lang.Double.compare(this.endTime, c2844x40fb94d.endTime) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.thread, c2844x40fb94d.thread);
    }

    /* renamed from: getCategory */
    public final java.lang.String m21109x7edcfa74() {
        return this.category;
    }

    /* renamed from: getEndTime */
    public final double m21110xde00a612() {
        return this.endTime;
    }

    /* renamed from: getName */
    public final java.lang.String m21111xfb82e301() {
        return this.name;
    }

    /* renamed from: getStartTime */
    public final double m21112x8082fb99() {
        return this.startTime;
    }

    /* renamed from: getThread */
    public final java.lang.String m21113x30f83100() {
        return this.thread;
    }

    /* renamed from: hashCode */
    public int m21114x8cdac1b() {
        return (((((((this.name.hashCode() * 31) + this.category.hashCode()) * 31) + java.lang.Double.hashCode(this.startTime)) * 31) + java.lang.Double.hashCode(this.endTime)) * 31) + this.thread.hashCode();
    }

    /* renamed from: setCategory */
    public final void m21115x79955b80(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.category = str;
    }

    /* renamed from: setEndTime */
    public final void m21116x5171f386(double d17) {
        this.endTime = d17;
    }

    /* renamed from: setName */
    public final void m21117x764daa0d(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.name = str;
    }

    /* renamed from: setStartTime */
    public final void m21118xdcd6bc0d(double d17) {
        this.startTime = d17;
    }

    /* renamed from: setThread */
    public final void m21119x242d650c(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.thread = str;
    }

    /* renamed from: toString */
    public java.lang.String m21120x9616526c() {
        return "Frame(name=" + this.name + ", category=" + this.category + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ", thread=" + this.thread + ')';
    }
}
