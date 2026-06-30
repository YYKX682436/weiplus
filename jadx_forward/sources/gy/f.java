package gy;

/* loaded from: classes14.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gy.g f359012d;

    public f(gy.g gVar) {
        this.f359012d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Thread.currentThread().setPriority(8);
        while (this.f359012d.f359016d) {
            try {
                gy.g gVar = this.f359012d;
                android.media.AudioRecord audioRecord = gVar.f359013a;
                if (audioRecord != null) {
                    audioRecord.read(gVar.f359018f.array(), 0, 640);
                }
                this.f359012d.f359019g.clear();
                gy.g gVar2 = this.f359012d;
                gVar2.f359019g.put(gVar2.f359018f.array(), 0, 640);
                this.f359012d.f359019g.flip();
                gy.g gVar3 = this.f359012d;
                java.nio.ByteBuffer byteBuffer = gVar3.f359019g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteBuffer, "access$getFrameBuffer$p(...)");
                gy.g.b(gVar3, byteBuffer, 640);
                java.lang.Thread.sleep(20L);
            } catch (java.lang.InterruptedException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBot.SMCAudioManager", "the recording thread is interrupted normally");
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChatBot.SMCAudioManager", "recording thread exception：" + e17.getMessage(), e17);
                java.lang.Thread.sleep(10L);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatBot.SMCAudioManager", "the recording thread has stopped");
    }
}
