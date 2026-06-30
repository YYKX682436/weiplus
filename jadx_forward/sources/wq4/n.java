package wq4;

/* loaded from: classes13.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public boolean f530214a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f530215b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f530216c;

    /* renamed from: d, reason: collision with root package name */
    public wq4.m f530217d;

    public n(wq4.d dVar) {
    }

    public synchronized void a(javax.microedition.khronos.opengles.GL10 gl10) {
        if (!this.f530215b) {
            if (!this.f530214a) {
                this.f530214a = true;
            }
            this.f530216c = !gl10.glGetString(7937).startsWith("Q3Dimension MSM7500 ");
            notifyAll();
            this.f530215b = true;
        }
    }

    public synchronized void b(wq4.m mVar) {
        mVar.getId();
        mVar.f530198e = true;
        if (this.f530217d == mVar) {
            this.f530217d = null;
        }
        notifyAll();
    }
}
