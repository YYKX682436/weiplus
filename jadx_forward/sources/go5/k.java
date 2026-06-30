package go5;

/* loaded from: classes14.dex */
public final class k implements go5.f {

    /* renamed from: a, reason: collision with root package name */
    public tl.w f355673a;

    /* renamed from: b, reason: collision with root package name */
    public java.nio.ByteBuffer f355674b;

    public k() {
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(allocateDirect, "allocateDirect(...)");
        this.f355674b = allocateDirect;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPAudioCapturer", "release");
        tl.w wVar = this.f355673a;
        if (wVar != null) {
            wVar.l();
        }
        this.f355673a = null;
        this.f355674b.clear();
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(allocateDirect, "allocateDirect(...)");
        this.f355674b = allocateDirect;
    }
}
