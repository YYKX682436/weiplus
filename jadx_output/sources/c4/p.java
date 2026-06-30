package c4;

/* loaded from: classes15.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.support.v4.media.session.MediaSessionCompat$Token f38331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c4.s f38332e;

    public p(c4.s sVar, android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f38332e = sVar;
        this.f38331d = mediaSessionCompat$Token;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.support.v4.media.session.f fVar;
        c4.s sVar = this.f38332e;
        java.util.ArrayList arrayList = (java.util.ArrayList) sVar.f38338a;
        boolean isEmpty = arrayList.isEmpty();
        android.support.v4.media.session.MediaSessionCompat$Token mediaSessionCompat$Token = this.f38331d;
        if (!isEmpty) {
            synchronized (mediaSessionCompat$Token.f8943d) {
                fVar = mediaSessionCompat$Token.f8945f;
            }
            if (fVar != null) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    j3.e.b((android.os.Bundle) it.next(), "extra_session_binder", fVar.asBinder());
                }
            }
            arrayList.clear();
        }
        sVar.f38339b.setSessionToken((android.media.session.MediaSession.Token) mediaSessionCompat$Token.f8944e);
    }
}
