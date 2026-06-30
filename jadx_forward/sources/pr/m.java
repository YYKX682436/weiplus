package pr;

/* loaded from: classes10.dex */
public final class m implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pr.o f439279a;

    public m(pr.o oVar) {
        this.f439279a = oVar;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        pr.f task = (pr.f) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPackSyncManager", "onLoaderFin: " + task.f439236f + ", " + status);
        pr.o oVar = this.f439279a;
        int i17 = oVar.f439286c + 1;
        oVar.f439286c = i17;
        if (i17 >= oVar.f439285b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPackSyncManager", "onDesignerEnd: ");
            int i18 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            gr.v vVar = gr.v.f356229a;
            vVar.a(false);
            vVar.b().putInt("designer_sync_time", i18);
            pr.o oVar2 = pr.o.f439283e;
            if (oVar2 != null) {
                fp0.o oVar3 = oVar2.f439284a;
                oVar3.getClass();
                pm0.v.X(new fp0.i(oVar3));
                pr.m callback = oVar2.f439287d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
                pm0.v.X(new fp0.n(oVar3, callback));
            }
            pr.o.f439283e = null;
        }
    }
}
