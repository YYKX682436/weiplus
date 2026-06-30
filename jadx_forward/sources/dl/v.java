package dl;

/* loaded from: classes10.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dl.u f316678e;

    public v(dl.u uVar, java.lang.String str) {
        this.f316678e = uVar;
        this.f316677d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        dl.u uVar = this.f316678e;
        if (uVar.l() != null && (str = this.f316677d) != null) {
            hk0.c c17 = uVar.l().f363351i.c(str);
            if (c17 != null) {
                if (c17.f363238c == hk0.h.f363274f) {
                    xk0.d dVar = c17.f363239d;
                    if (dVar != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoodleArtist", "undoEraser single");
                        dVar.f536477m = false;
                        uVar.d().add(dVar);
                        uVar.E(false);
                    } else {
                        java.util.ArrayList arrayList = c17.f363240e;
                        if (arrayList != null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DoodleArtist", "undoEraser list");
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                xk0.d dVar2 = (xk0.d) it.next();
                                dVar2.f536477m = false;
                                uVar.d().add(dVar2);
                            }
                            uVar.E(true);
                        }
                    }
                }
            }
            if (c17 != null) {
                if (c17.f363238c == hk0.h.f363273e) {
                    xk0.d dVar3 = c17.f363239d;
                    if (dVar3 != null) {
                        ((um.e) uVar.d()).a(dVar3);
                    }
                    uVar.E(true);
                }
            }
        }
        uVar.r();
        uVar.f316581j = null;
    }
}
