package ru5;

/* loaded from: classes10.dex */
public class e implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ru5.a f481328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ru5.g f481329e;

    public e(ru5.g gVar, ru5.a aVar) {
        this.f481329e = gVar;
        this.f481328d = aVar;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return this.f481328d.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f481329e.f481337e.f481333a = this.f481328d.a(this.f481329e.f481333a);
            this.f481329e.f481337e.c(this.f481329e.f481337e.f481335c);
            this.f481329e.a();
        } catch (java.lang.Throwable th6) {
            try {
                ru5.a d17 = this.f481329e.d();
                if (d17 == null) {
                    throw th6;
                }
                java.lang.Object a17 = d17.a(th6);
                ru5.g gVar = this.f481329e;
                while (gVar.f481337e != null) {
                    gVar = gVar.f481337e;
                }
                gVar.f481333a = a17;
            } finally {
                ru5.g gVar2 = this.f481329e;
                gVar2.getClass();
                while (gVar2 != null) {
                    gVar2.a();
                    gVar2 = gVar2.f481337e;
                }
                this.f481329e.f481337e = null;
                this.f481329e.f481336d = null;
                this.f481329e.f481335c = null;
                this.f481329e.getClass();
            }
        }
    }
}
