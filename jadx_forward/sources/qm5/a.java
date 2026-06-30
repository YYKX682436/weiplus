package qm5;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f446321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f446322e;

    public a(qm5.c cVar, int i17, int i18) {
        this.f446321d = i17;
        this.f446322e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.opengl.GLES20.glUniform1i(this.f446321d, this.f446322e);
    }
}
