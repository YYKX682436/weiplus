package hz4;

/* loaded from: classes12.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625 f367973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hz4.p f367974e;

    public n(hz4.p pVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5773x64e6b625 c5773x64e6b625) {
        this.f367974e = pVar;
        this.f367973d = c5773x64e6b625;
    }

    @Override // java.lang.Runnable
    public void run() {
        hz4.p.r(this.f367974e, this.f367973d.f136087g.f55x5ab01132, true, 5);
    }

    /* renamed from: toString */
    public java.lang.String m134299x9616526c() {
        return super.toString() + "|dealWNoteInfo";
    }
}
