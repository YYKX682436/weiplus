package hz4;

/* loaded from: classes12.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.bq0 f367971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hz4.p f367972e;

    public m(hz4.p pVar, r45.bq0 bq0Var) {
        this.f367972e = pVar;
        this.f367971d = bq0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        hz4.p.r(this.f367972e, this.f367971d, true, 1);
    }

    /* renamed from: toString */
    public java.lang.String m134298x9616526c() {
        return super.toString() + "|dealWNoteInfo";
    }
}
