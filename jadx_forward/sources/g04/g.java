package g04;

/* loaded from: classes15.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g04.l f348995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15 f348996f;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15 c17351x2827be15, java.lang.String str, g04.l lVar) {
        this.f348996f = c17351x2827be15;
        this.f348994d = str;
        this.f348995e = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f348996f.f241552g.remove(this.f348994d);
        if (arrayList == null) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g04.h hVar = (g04.h) it.next();
            ((ku5.t0) ku5.t0.f394148d).B(new g04.f(this, hVar));
        }
    }
}
