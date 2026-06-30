package vz5;

/* loaded from: classes14.dex */
public final class j extends kz5.c {

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayDeque f523327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vz5.l f523328g;

    public j(vz5.l lVar) {
        this.f523328g = lVar;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.f523327f = arrayDeque;
        if (lVar.f523330a.isDirectory()) {
            arrayDeque.push(c(lVar.f523330a));
        } else if (lVar.f523330a.isFile()) {
            arrayDeque.push(new vz5.h(this, lVar.f523330a));
        } else {
            this.f395495d = 2;
        }
    }

    @Override // kz5.c
    public void b() {
        java.io.File file;
        java.io.File a17;
        while (true) {
            java.util.ArrayDeque arrayDeque = this.f523327f;
            vz5.k kVar = (vz5.k) arrayDeque.peek();
            if (kVar == null) {
                file = null;
                break;
            }
            a17 = kVar.a();
            if (a17 == null) {
                arrayDeque.pop();
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, kVar.f523329a) || !a17.isDirectory() || arrayDeque.size() >= this.f523328g.f523332c) {
                break;
            } else {
                arrayDeque.push(c(a17));
            }
        }
        file = a17;
        if (file == null) {
            this.f395495d = 2;
        } else {
            this.f395496e = file;
            this.f395495d = 1;
        }
    }

    public final vz5.f c(java.io.File file) {
        int ordinal = this.f523328g.f523331b.ordinal();
        if (ordinal == 0) {
            return new vz5.i(this, file);
        }
        if (ordinal == 1) {
            return new vz5.g(this, file);
        }
        throw new jz5.j();
    }
}
