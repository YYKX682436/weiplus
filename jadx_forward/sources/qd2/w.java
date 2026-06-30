package qd2;

/* loaded from: classes8.dex */
public final class w implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f443380a;

    public w(p3325xe03a0797.p3326xc267989b.q qVar) {
        this.f443380a = qVar;
    }

    @Override // fp0.p
    public void a(fp0.d task, fp0.u status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        mv2.r0 r0Var = (mv2.r0) task;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderModifyFeedHelper", "[uploadCover] onLoaderFin status:" + status + " url:" + r0Var.f413159h);
        fp0.u uVar = fp0.u.f346823f;
        p3325xe03a0797.p3326xc267989b.q qVar = this.f443380a;
        if (status != uVar || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r0Var.f413159h)) {
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(""));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            qVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r0Var.f413159h));
        }
    }
}
