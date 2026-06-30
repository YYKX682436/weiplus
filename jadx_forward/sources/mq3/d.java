package mq3;

/* loaded from: classes12.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final kq3.h f412309a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f412310b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f412311c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f412312d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 f412313e;

    public d(kq3.h hVar) {
        this.f412309a = hVar;
        if (hVar.e(49L, 0L) != 5) {
            if (hVar.g("C2CChatUsage")) {
                hVar.b("C2CChatUsage");
            }
            hVar.c(java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (chat TEXT, date INTEGER, chattype INTEGER DEFAULT 0, opencount INTEGER DEFAULT 0, sendmsgcount INTEGER DEFAULT 0, staytime INTEGER DEFAULT 0, consumemsgcount INTEGER DEFAULT 0, PRIMARY KEY(chat, date));", "C2CChatUsage"));
            hVar.i(49L, 5L);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Priority.C2CChatUsageStorage", "Exist Table %s Count %d", "C2CChatUsage", java.lang.Integer.valueOf(hVar.f("C2CChatUsage")));
        }
        this.f412310b = hVar.a(java.lang.String.format("INSERT OR IGNORE INTO %s (chat, date, chattype) VALUES (?,?,?)", "C2CChatUsage"));
        this.f412311c = hVar.a(java.lang.String.format("UPDATE %s SET opencount = opencount + 1, staytime = staytime + ? WHERE chat = ? AND date = ?", "C2CChatUsage"));
        this.f412312d = hVar.a(java.lang.String.format("UPDATE %s SET sendmsgcount = sendmsgcount + 1 WHERE chat = ? AND date = ?", "C2CChatUsage"));
        this.f412313e = hVar.a(java.lang.String.format("UPDATE %s SET consumemsgcount = consumemsgcount + 1 WHERE chat = ? AND date = ?", "C2CChatUsage"));
    }

    public boolean a(java.lang.String str, long j17, long j18) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26970x63d6eaa3 c26970x63d6eaa3 = this.f412310b;
        c26970x63d6eaa3.m107801x35198eae(1, str);
        c26970x63d6eaa3.m107799x37fbf859(2, j17);
        c26970x63d6eaa3.m107799x37fbf859(3, j18);
        return c26970x63d6eaa3.m107869x22927a8e() >= 0;
    }
}
