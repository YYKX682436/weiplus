package fc3;

/* loaded from: classes9.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc3.e f342549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f342550e;

    public c(fc3.e eVar, java.lang.String str) {
        this.f342549d = eVar;
        this.f342550e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fc3.e eVar = this.f342549d;
        if (eVar.f342567k) {
            java.lang.String word = this.f342550e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(word, "$word");
            eVar.d(word);
        }
    }
}
