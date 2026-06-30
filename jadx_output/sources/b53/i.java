package b53;

/* loaded from: classes8.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask f18089d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.e0 f18090e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f18091f;

    public i(b53.j jVar, com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask addShortcutTask, com.tencent.mm.plugin.webview.luggage.e0 e0Var, android.content.Context context) {
        this.f18089d = addShortcutTask;
        this.f18090e = e0Var;
        this.f18091f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.luggage.ipc.AddShortcutTask addShortcutTask = this.f18089d;
        addShortcutTask.x();
        this.f18090e.f406655i.c(new b53.g(this));
        boolean z17 = addShortcutTask.f139568h;
        android.content.Context context = this.f18091f;
        if (z17) {
            db5.e1.o(context, com.tencent.mm.R.string.la9, com.tencent.mm.R.string.f490573yv, false, new b53.h(this));
        } else {
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.la8), 0).show();
        }
    }
}
