package gh4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgh4/a;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-taskbar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f353445d = "MicroMsg.TaskBar.AddTaskInfoTask";

    public a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBar.AddTaskInfoTask", "create add task info");
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (gm0.j1.a() && bundle != null) {
            java.lang.String string = bundle.getString(dm.i4.f66865x76d1ec5a);
            int i17 = bundle.getInt("type");
            byte[] byteArray = bundle.getByteArray("showData");
            int i18 = bundle.getInt("addType");
            boolean z17 = bundle.getBoolean("updateBitmapOnly");
            if (string == null || byteArray == null) {
                return;
            }
            r45.lr4 lr4Var = new r45.lr4();
            try {
                lr4Var.mo11468x92b714fd(byteArray);
            } catch (java.lang.Exception unused) {
            }
            java.lang.String string2 = bundle.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
            if (string2 == null) {
                string2 = "";
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
                gh4.l0 l0Var = gh4.l0.f353471a;
                java.lang.String c17 = l0Var.c(string);
                if (com.p314xaae8f345.mm.vfs.w6.j(c17)) {
                    com.p314xaae8f345.mm.vfs.w6.h(c17);
                }
                java.lang.String str = gh4.m0.f353472a + string;
                if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
                    com.p314xaae8f345.mm.vfs.w6.h(str);
                }
                com.p314xaae8f345.mm.vfs.w6.w(string2, c17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f353445d, "move tempPath:" + string2 + " to path:" + c17);
                if (lh4.n.f400252e.b(i17)) {
                    o11.g SNAPSHOT_LOADER_OPTION = gh4.j0.f353467b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(SNAPSHOT_LOADER_OPTION, "SNAPSHOT_LOADER_OPTION");
                    n11.a.b().p(l0Var.b(c17, SNAPSHOT_LOADER_OPTION));
                }
            }
            if (i18 == 1) {
                ((gh4.e0) i95.n0.c(gh4.e0.class)).wi(string, i17, lr4Var, bundle.getByteArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306));
            } else {
                if (i18 != 2) {
                    return;
                }
                ((gh4.e0) i95.n0.c(gh4.e0.class)).Zi(string, i17, lr4Var, bundle.getByteArray(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306), z17);
            }
        }
    }
}
