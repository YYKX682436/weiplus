package jf;

/* loaded from: classes7.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f380872d;

    public m(android.content.Context context) {
        this.f380872d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj1.b bVar;
        sj1.l.i("", "Native", "Finish");
        sj1.l.b("");
        java.io.File externalFilesDir = this.f380872d.getExternalFilesDir("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(externalFilesDir);
        java.lang.String filePath = externalFilesDir.getAbsolutePath() + java.io.File.separator + "test.trace";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filePath, "filePath");
        if (!sj1.l.f489905b || (bVar = (sj1.b) sj1.l.f489906c.get("")) == null) {
            return;
        }
        bVar.e(filePath);
    }
}
