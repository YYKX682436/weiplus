package w65;

/* loaded from: classes12.dex */
public final class l extends w65.p {

    /* renamed from: e, reason: collision with root package name */
    public boolean f524894e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w65.q status, w65.m task) {
        super(status, task);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
    }

    @Override // w65.p
    /* renamed from: toString */
    public java.lang.String mo173287x9616526c() {
        return "fileWeTaskEvent id:" + this.f524896b.id() + " status:" + this.f524895a + " ret:" + this.f524897c + " taskPercent:" + this.f524898d + " isAutoDownload:" + this.f524894e;
    }
}
