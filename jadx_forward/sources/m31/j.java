package m31;

/* loaded from: classes9.dex */
public final class j implements i31.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7 f404688a;

    public j(com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7 activityC11164x65f4bfb7) {
        this.f404688a = activityC11164x65f4bfb7;
    }

    public void a(com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSubscribeMsgManagerUI", "getSubscribeMsgList onSuccess");
        com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7 activityC11164x65f4bfb7 = this.f404688a;
        activityC11164x65f4bfb7.runOnUiThread(new m31.i(activityC11164x65f4bfb7, data));
    }
}
