package vz5;

/* loaded from: classes14.dex */
public final class g extends vz5.f {

    /* renamed from: b, reason: collision with root package name */
    public boolean f523317b;

    /* renamed from: c, reason: collision with root package name */
    public java.io.File[] f523318c;

    /* renamed from: d, reason: collision with root package name */
    public int f523319d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f523320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vz5.j f523321f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vz5.j jVar, java.io.File rootDir) {
        super(rootDir);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootDir, "rootDir");
        this.f523321f = jVar;
    }

    @Override // vz5.k
    public java.io.File a() {
        boolean z17 = this.f523320e;
        java.io.File file = this.f523329a;
        vz5.j jVar = this.f523321f;
        if (!z17 && this.f523318c == null) {
            jVar.f523328g.getClass();
            java.io.File[] listFiles = file.listFiles();
            this.f523318c = listFiles;
            if (listFiles == null) {
                jVar.f523328g.getClass();
                this.f523320e = true;
            }
        }
        java.io.File[] fileArr = this.f523318c;
        if (fileArr != null) {
            int i17 = this.f523319d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fileArr);
            if (i17 < fileArr.length) {
                java.io.File[] fileArr2 = this.f523318c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(fileArr2);
                int i18 = this.f523319d;
                this.f523319d = i18 + 1;
                return fileArr2[i18];
            }
        }
        if (this.f523317b) {
            jVar.f523328g.getClass();
            return null;
        }
        this.f523317b = true;
        return file;
    }
}
