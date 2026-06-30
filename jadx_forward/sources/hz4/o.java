package hz4;

/* loaded from: classes12.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hz4.j f367975d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hz4.p f367976e;

    public o(hz4.p pVar, hz4.j jVar) {
        this.f367976e = pVar;
        this.f367975d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hz4.p.r(this.f367976e, this.f367975d.f367968h, false, 2);
    }

    /* renamed from: toString */
    public java.lang.String m134300x9616526c() {
        return super.toString() + "|dealWNoteInfo";
    }
}
