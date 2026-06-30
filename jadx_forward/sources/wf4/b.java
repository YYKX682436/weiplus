package wf4;

/* loaded from: classes12.dex */
public class b implements wf4.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wf4.g f527169a;

    public b(wf4.g gVar) {
        this.f527169a = gVar;
    }

    public void a(final int i17, final int i18, final java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExtTranslateVoiceEventListener", "ilink check result: error, errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        ik1.h0.b(new java.lang.Runnable() { // from class: wf4.b$$c
            @Override // java.lang.Runnable
            public final void run() {
                wf4.b bVar = wf4.b.this;
                int i19 = i18;
                int i27 = i17;
                java.lang.String str2 = str;
                if (bVar.f527169a.f527212n) {
                    return;
                }
                wf4.g gVar = bVar.f527169a;
                wf4.f fVar = wf4.f.SERVER_ERROR;
                r45.pv pvVar = new r45.pv();
                pvVar.f464945d = i19;
                pvVar.f464946e = i27;
                pvVar.f464947f = str2;
                gVar.f(fVar, pvVar);
            }
        });
    }
}
