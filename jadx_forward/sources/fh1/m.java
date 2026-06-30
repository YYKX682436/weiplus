package fh1;

/* loaded from: classes7.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f344098d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f344099e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f344100f;

    public m(fh1.z zVar, p3325xe03a0797.p3326xc267989b.q qVar, yz5.a aVar) {
        this.f344098d = zVar;
        this.f344099e = qVar;
        this.f344100f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f344098d.f344167h.get()) {
            this.f344100f.mo152xb9724478();
            return;
        }
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        this.f344099e.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE));
    }
}
