package i4;

/* loaded from: classes10.dex */
public class e extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i4.h f369871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i4.f f369872b;

    public e(i4.f fVar, i4.h hVar) {
        this.f369872b = fVar;
        this.f369871a = hVar;
    }

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        try {
            return this.f369872b.b();
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(java.lang.Object obj) {
        this.f369871a.a((i4.j) obj);
    }
}
