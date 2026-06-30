package xp3;

/* loaded from: classes5.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f537456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16793x5e82fb2a f537457e;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16793x5e82fb2a c16793x5e82fb2a, android.content.Context context) {
        this.f537457e = c16793x5e82fb2a;
        this.f537456d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16793x5e82fb2a c16793x5e82fb2a = this.f537457e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ElfCheckResponse", "call this response %s", c16793x5e82fb2a.m67527x9616526c());
        android.content.Context context = this.f537456d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16791xed69d07.class);
        intent.setAction(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.elf.C16791xed69d07.class.getName());
        android.os.Bundle bundle = c16793x5e82fb2a.f234509o;
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        context.sendBroadcast(intent);
    }
}
