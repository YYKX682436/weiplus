package mm2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f410267a;

    /* renamed from: b, reason: collision with root package name */
    public long f410268b;

    /* renamed from: c, reason: collision with root package name */
    public long f410269c;

    public a(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f410267a = "ActionDurationModel_".concat(source);
    }

    public static /* synthetic */ void b(mm2.a aVar, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        aVar.a(z17);
    }

    public final void a(boolean z17) {
        boolean z18 = this.f410269c > 0;
        java.lang.String str = this.f410267a;
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tickEnd startTime: " + this.f410269c);
        } else {
            if (z17) {
                this.f410268b = 0L;
                return;
            }
            long c17 = c01.id.c() - this.f410269c;
            this.f410268b += c17;
            this.f410269c = 0L;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "tickEnd duration: " + c17 + " totalDuration: " + this.f410268b);
        }
    }

    public final void c() {
        this.f410269c = c01.id.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f410267a, "tickStart totalDuration: " + this.f410268b);
    }
}
