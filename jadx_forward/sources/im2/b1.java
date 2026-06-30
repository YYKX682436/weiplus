package im2;

/* loaded from: classes3.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373787d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(im2.z3 z3Var) {
        super(0);
        this.f373787d = z3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        im2.z3 z3Var = this.f373787d;
        if (z3Var.o7()) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTimeInMillis(c01.id.c());
            calendar.set(5, calendar.get(5) + 8);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(z3Var.f374168d, "refreshInOneWeekTime: after one week, date=" + calendar.getTime() + ", timeInMills=" + calendar.getTimeInMillis());
            z3Var.M1 = (int) (calendar.getTimeInMillis() / ((long) 1000));
            z3Var.h7().setText(z3Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mq8, android.text.format.DateFormat.format(z3Var.m158354x19263085().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), calendar.getTimeInMillis())));
        }
        im2.z3.t7(this.f373787d, 1, 12, 0, null, null, 24, null);
        return jz5.f0.f384359a;
    }
}
