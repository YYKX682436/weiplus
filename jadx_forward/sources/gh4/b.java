package gh4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgh4/b;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "plugin-taskbar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    public b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBar.DeleteTaskInfoTask", "create delete task info");
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        java.lang.String string;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (!gm0.j1.a() || bundle == null || (string = bundle.getString(dm.i4.f66865x76d1ec5a)) == null) {
            return;
        }
        ((gh4.e0) i95.n0.c(gh4.e0.class)).Ui(string, true, bundle.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811));
    }
}
