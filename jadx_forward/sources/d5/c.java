package d5;

/* loaded from: classes13.dex */
public abstract class c extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f308007a = a5.a0.e("ConstraintProxy");

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        a5.a0.c().a(f308007a, java.lang.String.format("onReceive : %s", intent), new java.lang.Throwable[0]);
        java.lang.String str = d5.b.f308003g;
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.ServiceC1273x1138b13.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
