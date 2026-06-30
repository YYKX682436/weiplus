package fv4;

/* loaded from: classes8.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fv4.f f348519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f348520e;

    public d(fv4.f fVar, java.util.Map map) {
        this.f348519d = fVar;
        this.f348520e = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ev4.d dVar;
        fv4.i iVar = this.f348519d.f348538a;
        if (iVar == null || (dVar = iVar.f348545f) == null) {
            return;
        }
        java.util.Map args = this.f348520e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = dVar.f338476a;
        if (c28688xe8dbe4c2 != null) {
            c28688xe8dbe4c2.m138438xd8c5c779("onWebViewSizeChanged", args);
        }
    }
}
