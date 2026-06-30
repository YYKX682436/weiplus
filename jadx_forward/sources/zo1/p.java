package zo1;

/* loaded from: classes4.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Calendar f556257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Calendar f556258e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f556259f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.util.Calendar calendar, java.util.Calendar calendar2, boolean z17) {
        super(1);
        this.f556257d = calendar;
        this.f556258e = calendar2;
        this.f556259f = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.Calendar date = (java.util.Calendar) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(date, "date");
        long timeInMillis = date.getTimeInMillis();
        java.util.Calendar calendar = this.f556257d;
        if (timeInMillis < calendar.getTimeInMillis()) {
            date.setTimeInMillis(calendar.getTimeInMillis());
        }
        long timeInMillis2 = date.getTimeInMillis();
        java.util.Calendar calendar2 = this.f556258e;
        if (timeInMillis2 > calendar2.getTimeInMillis()) {
            date.setTimeInMillis(calendar2.getTimeInMillis());
        }
        if (this.f556259f) {
            date.set(11, 0);
            date.set(12, 0);
            date.set(13, 0);
            date.set(14, 0);
        } else {
            date.set(11, 23);
            date.set(12, 59);
            date.set(13, 59);
            date.set(14, 999);
        }
        return jz5.f0.f384359a;
    }
}
