package c4;

/* loaded from: classes15.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 f119864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4.s f119865e;

    public p(c4.s sVar, p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c0047xab30f989) {
        this.f119865e = sVar;
        this.f119864d = c0047xab30f989;
    }

    @Override // java.lang.Runnable
    public void run() {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f fVar;
        c4.s sVar = this.f119865e;
        java.util.ArrayList arrayList = (java.util.ArrayList) sVar.f119871a;
        boolean isEmpty = arrayList.isEmpty();
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.C0047xab30f989 c0047xab30f989 = this.f119864d;
        if (!isEmpty) {
            synchronized (c0047xab30f989.f90476d) {
                fVar = c0047xab30f989.f90478f;
            }
            if (fVar != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j3.e.b((android.os.Bundle) it.next(), "extra_session_binder", fVar.asBinder());
                }
            }
            arrayList.clear();
        }
        sVar.f119872b.setSessionToken((android.media.session.MediaSession.Token) c0047xab30f989.f90477e);
    }
}
