package xp3;

/* loaded from: classes5.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f537462d;

    public m(xp3.n nVar, android.content.Context context) {
        this.f537462d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f537462d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16791xed69d07.class);
        intent.setAction(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16791xed69d07.class.getName());
        context.sendBroadcast(intent);
    }
}
