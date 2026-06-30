package gh4;

/* loaded from: classes.dex */
public final class d0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public static final gh4.d0 f353451d = new gh4.d0();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoker callback result:");
        sb6.append(bundle != null ? bundle.getBoolean("result") : false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBar.PluginTaskBar", sb6.toString());
    }
}
