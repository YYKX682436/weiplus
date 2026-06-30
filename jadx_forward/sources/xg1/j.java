package xg1;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f535908a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Intent f535909b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 f535910c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f535911d;

    public j(android.content.Context ctx, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 statObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statObject, "statObject");
        this.f535908a = ctx;
        this.f535909b = intent;
        this.f535910c = initConfig;
        this.f535911d = statObject;
    }

    /* renamed from: equals */
    public boolean m175483xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg1.j)) {
            return false;
        }
        xg1.j jVar = (xg1.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535908a, jVar.f535908a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535909b, jVar.f535909b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535910c, jVar.f535910c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f535911d, jVar.f535911d);
    }

    /* renamed from: hashCode */
    public int m175484x8cdac1b() {
        return (((((this.f535908a.hashCode() * 31) + this.f535909b.hashCode()) * 31) + this.f535910c.hashCode()) * 31) + this.f535911d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m175485x9616526c() {
        return "PendingIntentTask(ctx=" + this.f535908a + ", intent=" + this.f535909b + ", initConfig=" + this.f535910c + ", statObject=" + this.f535911d + ')';
    }
}
