package rd3;

/* loaded from: classes7.dex */
public final class h implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd3.j f475776d;

    public h(rd3.j jVar) {
        this.f475776d = jVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiShowModal", "cancel!");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("confirm", java.lang.Boolean.FALSE);
        hashMap.put("cancel", java.lang.Boolean.TRUE);
        rd3.j jVar = this.f475776d;
        jVar.s().mo146xb9724478(jVar.l(hashMap));
    }
}
