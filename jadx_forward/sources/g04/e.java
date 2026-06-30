package g04;

/* loaded from: classes15.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g04.l f348990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15 f348991f;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15 c17351x2827be15, java.lang.String str, g04.l lVar) {
        this.f348991f = c17351x2827be15;
        this.f348989d = str;
        this.f348990e = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f348991f.f241550e.mo523x53d8522f(new android.util.Pair(this.f348989d, this.f348990e));
    }
}
