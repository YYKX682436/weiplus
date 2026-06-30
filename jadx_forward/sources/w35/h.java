package w35;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lw35/h;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "<init>", "()V", "ui-appchooser_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class h implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle data = (android.os.Bundle) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.ArrayList<? extends android.os.Parcelable> wi6 = ((gb0.i) ((j30.m) i95.n0.c(j30.m.class))).wi(data.getLong("msgId"), data.getString("msgTalker"));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("deviceList", wi6);
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
