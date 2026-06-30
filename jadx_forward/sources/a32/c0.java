package a32;

/* loaded from: classes10.dex */
public final class c0 implements fp0.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 f82540a;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5) {
        this.f82540a = c13394xa8c361b5;
    }

    @Override // fp0.p
    public void a(fp0.d dVar, fp0.u status) {
        u85.o task = (u85.o) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        java.lang.String str = task.f507252f.f275223e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13394xa8c361b5 c13394xa8c361b5 = this.f82540a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c13394xa8c361b5.f180212t)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13394xa8c361b5.f180199d, "onLoaderFin: " + status);
            c13394xa8c361b5.c(status);
        }
    }
}
