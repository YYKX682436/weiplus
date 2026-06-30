package jk5;

/* loaded from: classes13.dex */
public class d extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk5.j f381694a;

    public d(jk5.j jVar) {
        this.f381694a = jVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        int i17 = message.what;
        jk5.c cVar = jk5.c.Failed;
        jk5.j jVar = this.f381694a;
        if (i17 == 1000) {
            java.lang.String str = (java.lang.String) message.obj;
            if (str != null) {
                android.content.Context context = jVar.f381708h;
                if (context.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
                    android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(context);
                    builder.setTitle("Error");
                    builder.setMessage("Application requires permission to access the Internet");
                    builder.create().show();
                } else {
                    new jk5.o(context, str, jVar).show();
                }
            } else {
                jVar.a(cVar);
            }
        }
        if (message.what == 1010) {
            jk5.c cVar2 = (jk5.c) message.obj;
            jVar.f381705e = false;
            if (cVar2 == cVar) {
                jVar.f381703c = null;
                jVar.e(null);
            }
            jk5.a aVar = jVar.f381707g;
            if (aVar != null) {
                aVar.V2(cVar2);
            }
        }
    }
}
